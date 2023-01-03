package com.example.springbootdemo;

import java.time.LocalDate;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.springbootdemo.student.Student;

@SpringBootApplication
@RestController
public class SpringbootdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootdemoApplication.class, args);
	}

	// @GetMapping("/hello")
	// public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
	// 	return String.format("Hello %s!", name);
	// }

	@GetMapping("/")
	public List<Student> home() {
		return List.of(
			new Student (
				1L,
				"Maryll",
				21,
				LocalDate.of(2001, 12, 20),
				"maryll@gmail.com"
			)
		);
	}


}
