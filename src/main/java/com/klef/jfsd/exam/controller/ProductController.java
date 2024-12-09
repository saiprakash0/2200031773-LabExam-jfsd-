package com.klef.jfsd.exam.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;

import com.klef.jfsd.exam.model.Product;

public class ProductController {

	@GetMapping("/")
	public String home() {
		return "Spring Rest API project";
	}

	@PostMapping("add")
	public String addStudent(@RequestAttribute Product s) {
		return service.addstudent(s);
	}

	@GetMapping("viewall")
	public List<Product> viewallStudents() {
		return service.viewallstudents();
	}
}
