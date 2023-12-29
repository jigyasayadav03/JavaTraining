package com.crudapp.controller;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.crudapp.Document.Person;
import com.crudapp.service.PersonService;

@RestController
@RequestMapping("/person")
public class PersonController {
	@Autowired
	private PersonService personService;

	@PostMapping
	public Person save(@RequestBody Person person) {
		return personService.save(person);
	}

	@GetMapping
	public List<Person> get(@RequestParam("name") String name) {
		return personService.get();
	}

	@DeleteMapping
	public void delete(@RequestParam("id") ObjectId id) {
		personService.delete(id);
	}

	@GetMapping("/age")
	public List<Person> getByPersonAge(@RequestParam Integer minAge, @RequestParam Integer maxAge) {
		return personService.getByPersonAge(minAge, maxAge);
	}

	@GetMapping("/search")
	public Page<Person> searchPerson(@RequestParam(required = false) String name,
			@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "5") Integer size) {
		Pageable pageable = PageRequest.of(page, size);
		return personService.search(name, pageable);

	}
}