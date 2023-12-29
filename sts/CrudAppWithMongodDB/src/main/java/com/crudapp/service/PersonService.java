package com.crudapp.service;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.crudapp.Document.Person;

@Service
public interface PersonService {

	Person save(Person person);

	List<Person> get();

	void delete(ObjectId Id);

	List<Person> getByPersonAge(Integer minAge, Integer maxAge);

	Page<Person> search(String name, Pageable pageable);

}
