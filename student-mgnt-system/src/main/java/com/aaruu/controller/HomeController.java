package com.aaruu.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String homePage() {
		System.out.println("controller here");

		return "home";
	}

	@RequestMapping("/studentForm")
	public String openForm() {
		return "studentFormData";

	}

	@RequestMapping("/saveStudent") // If request comes to /saveStudent, execute below method.
	public String saveStudent(HttpServletRequest request) {

		int id = Integer.parseInt(request.getParameter("id"));
		String name = request.getParameter("name");
		String course = request.getParameter("course");

		System.out.println(id);
		System.out.println(name);
		System.out.println(course);

		return "success";
	}
}