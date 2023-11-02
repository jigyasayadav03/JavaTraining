package com.spring.orm;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.orm.Dao.StudentDao;
import com.spring.orm.entities.Student;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("./config.xml");
		StudentDao studentdao = context.getBean("studentDao", StudentDao.class);
		Scanner sc = new Scanner(System.in);
		System.out.println("--------------welcome----------------");
		System.out.println("press 1 for insert----------------");
		System.out.println("press 2 for update----------------");
		System.out.println("press 3 for delete----------------");
		System.out.println("press 4 for read----------------");
		System.out.println("press 5 for reading all----------------");
		System.out.println("enter id");
		int id = sc.nextInt();
		System.out.println("enter name");
		String name = sc.next();
		System.out.println("enter address");
		String address = sc.next();
		Student student=new Student(id,name,address);
		int n = sc.nextInt();
		switch (n) {
		case 1:studentdao.insert(student);
		break;
		case 2: studentdao.update(student);
		break;
		case 3: studentdao.delete(id);
		break;
		case 4: studentdao.getStudent(id);
		break;
		case 5:
		studentdao.getAllStudent(id);
		break;
		default: System.out.println("enter valid number");
		break;
		}
	}
}
