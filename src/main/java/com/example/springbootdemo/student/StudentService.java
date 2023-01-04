package com.example.springbootdemo.student;

import java.time.LocalDate;
import java.util.List;

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
