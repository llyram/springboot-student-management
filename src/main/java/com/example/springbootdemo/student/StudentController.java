package com.example.springbootdemo.student;

import java.time.LocalDate;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1/student")
public class StudentController {
    @GetMapping
	public List<Student> getStudents() {
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
