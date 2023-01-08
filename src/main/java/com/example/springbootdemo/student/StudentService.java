package com.example.springbootdemo.student;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
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
