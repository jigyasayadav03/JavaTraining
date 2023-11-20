package com.springboot.security;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.springboot.security.entity.Employee;
import com.springboot.security.repository.EmpRepository;

@SpringBootApplication
public class SpringSecurityApplication implements CommandLineRunner {

    @Autowired
    private EmpRepository empRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public static void main(String[] args) {
        SpringApplication.run(SpringSecurityApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Employee emp = new Employee();
        emp.setUsername("abhi");
        emp.setPassword(passwordEncoder.encode("123456"));
        emp.setRoles("ROLE_NORMAL");
        empRepository.save(emp);

        Employee emp1 = new Employee();
        emp1.setUsername("jigyasa");
        emp1.setPassword(passwordEncoder.encode("123456"));
        emp1.setRoles("ROLE_ADMIN");
        empRepository.save(emp1);
    }
}
