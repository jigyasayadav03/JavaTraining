package com.microservice.userservice.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "user_micro")
public class User {
    @Id
    private String id;
    private String name;
    private String email;
    private String contact;
    @Transient
    //this annotation makes that it will not store the collumn in the db
    private List<Rating> rating=new ArrayList<>();
}
