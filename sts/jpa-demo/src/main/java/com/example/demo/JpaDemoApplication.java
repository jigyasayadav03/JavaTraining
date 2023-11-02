package com.example.demo;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.demo.model.User;
import com.example.demo.model.UserRepository;

@SpringBootApplication
public class JpaDemoApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(JpaDemoApplication.class, args);
		UserRepository userRepository = context.getBean(UserRepository.class);

        User user = new User();
        user.setAddress("Indore");
        user.setName("Jigyasa");
        user.setContact("23467");

        User user1 = new User();
        user1.setAddress("Indore");
        user1.setName("Roshan Patidar");
        user1.setContact("56789");

        // Save users to the database
//        userRepository.save(user);
//        userRepository.save(user1);
List<User> users= List.of(user,user1);
userRepository.saveAll(users); 
////

		// Retrieve all users and print them
		//Iterable<User> itr = userRepository.findAll();
//        Iterator<User> iterator =itr.iterator();
//        while(iterator.hasNext()) {
//        User user= iterator.next();
//        System.out.println(user);
// 
//        }
////         
//        itr.forEach(new Consumer<User>() {
//
//			@Override
//			public void accept(User t) {
//				// TODO Auto-generated method stub
//				System.out.println(t);
//			}
//        	
//        });
		// priting using lambada function
//		itr.forEach(user -> {
//			System.out.println(user);
//		});

        // Retrieve a user by name and print them
//        System.out.println("User by Name :");
//       List<User> user= (List<User>) userRepository.findByName("Jigyasa");
//       System.out.println(user);
//////      updating user
//        Optional<User> optional=userRepository.findById(303);
//        User user =optional.get();
//        user.setAddress("maheshwar");
//        userRepository.save(user);
//        // Retrieve and print the updated user
//        User updatedUser = userRepository.findById(user.getId()).orElse(null);
//        if (updatedUser != null) {
//            System.out.println("Updated User:");
//            System.out.println(updatedUser);
//        } else {
//            System.out.println("User not found.");
//     deleting 
//		Optional<User> alluser = userRepository.findById(303);
//		userRepository.deleteById(303);
//		System.out.println("deleted ");
	
       List<User> usersWithAddress = (List<User>) userRepository.findByAddress("Indore");
System.out.println(usersWithAddress);
List<User> usersByName = userRepository.findByName("Jigyasa");
System.out.println(usersByName);

	}

}