package com.mapping.manytomany;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/persons")
public class PersonController {
	@Autowired
	private PersonRepository personRepository;

	@GetMapping
	public List<Person> getAllPersons() {
		return personRepository.findAll();
	}

	@GetMapping("/{id}")
	public Person getPersonById(@PathVariable int id) {
		return personRepository.findById(id).orElse(null);
	}

	@PostMapping
	public Person createPerson(@RequestBody Person person) {
		return personRepository.save(person);
	}

	@PutMapping("/{id}")
	public Person updatePerson(@PathVariable int id, @RequestBody Person person) {
		person.setId(id);
		return personRepository.save(person);
	}

	@DeleteMapping("/{id}")
	public void deletePerson(@PathVariable int id) {
		personRepository.deleteById(id);
	}
}
