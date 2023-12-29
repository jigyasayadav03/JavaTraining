package com.crudapp.service;

import java.util.ArrayList;
import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.support.PageableExecutionUtils;
import org.springframework.stereotype.Service;

import com.crudapp.Document.Person;
import com.crudapp.repository.PersonRepostiory;

@Service

public class PersonServiceImpl implements PersonService {

	@Autowired
	private PersonRepostiory personRepository;
	@Autowired
	private MongoTemplate mongoTemplate;

	@Override
	public Person save(Person person) {
		// TODO Auto-generated method stub
		return personRepository.save(person);

	}

	public List<Person> get(String name) {
		// TODO Auto-generated method stub
		return personRepository.findByName(name);
	}

	@Override
	public List<Person> get() {
		// TODO Auto-generated method stub
		return personRepository.findAll();
	}

	@Override
	public List<Person> getByPersonAge(Integer minAge, Integer maxAge) {
		return personRepository.findPersonByAgeBetween(minAge, maxAge);
	}

	@Override
	public Page<Person> search(String name, Pageable pageable) {
		// TODO Auto-generated method stub
		Query query = new Query().with(pageable);
		List<Criteria> criteria = new ArrayList<>();
		if (name != null && !name.isEmpty()) {
			criteria.add(Criteria.where("name").regex(name, "i"));
		}
		if (!criteria.isEmpty()) {
			query.addCriteria(new Criteria().andOperator(criteria.toArray(new Criteria[0])));
		}

		Page<Person> people = PageableExecutionUtils.getPage(mongoTemplate.find(query, Person.class), pageable,
				() -> mongoTemplate.count(query.skip(0).limit(0), Person.class));
		return people;
	}

	@Override
	public void delete(ObjectId Id) {
		// TODO Auto-generated method stub
		personRepository.deleteById(Id);

	}

}
