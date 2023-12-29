package com.crudapp.repository;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.crudapp.Document.Person;

@Repository
public interface PersonRepostiory extends MongoRepository<Person, ObjectId> {

	List<Person> findByName(String name);

	// this is used to create something that has our customization and also we can
	// use feild attribute so that we fetch the required field from the document
	// only
	@Query(value = "{ 'age' : { $gt : ?0, $lt : ?1}}", fields = "{addresses:  0}")
	List<Person> findPersonByAgeBetween(Integer min, Integer max);

}
