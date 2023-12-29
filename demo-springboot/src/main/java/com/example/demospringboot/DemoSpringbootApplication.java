package com.example.demospringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoSpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoSpringbootApplication.class, args);
	}

	@GetMapping("hello")
	public String hello() {
		return "Hello Software Engineers";
	}

	
	@GetMapping("get-student")
	public Student getStudent() {
		College college = new College("JSS", "Mysore");
		Student student = new Student("S01", "Good Student", college);
		return student;
	}
	@PostMapping("send-student")
	public String sendStudent(@RequestBody Student student) {
		System.out.println(student);
		return "Success";
	}
}
