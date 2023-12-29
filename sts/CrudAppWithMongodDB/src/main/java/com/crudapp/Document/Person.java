package com.crudapp.Document;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Builder;
import lombok.Data;


@Data
@Builder
@Document(collection="Person")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Person {
	@Id
    private ObjectId _id;
private String name;
private int age;
private List<Address> address;


}
