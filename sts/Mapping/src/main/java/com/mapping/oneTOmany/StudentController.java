package com.mapping.oneTOmany;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/students")
public class StudentController {

	  	
	@Autowired
	private StudentRepository studentRepository;

	@GetMapping
	public List<Student> getAllStudents() {
		return studentRepository.findAll();
	}

	@GetMapping("/{id}")
	public Student getStudentById(@PathVariable int id) {
		return studentRepository.findById(id).orElse(null);
	}

	@PostMapping
	public Student createStudent(@RequestBody Student student) {
		return studentRepository.save(student);
	}

	@PutMapping("/{id}")
	public Student updateStudent(@PathVariable int id, @RequestBody Student updatedStudent) {
		return studentRepository.findById(id).map(student -> {
			student.setName(updatedStudent.getName());
			return studentRepository.save(student);
		}).orElse(null);
	}

	@DeleteMapping("/{id}")
	public void deleteStudent(@PathVariable int id) {
		studentRepository.deleteById(id);
	}
}
