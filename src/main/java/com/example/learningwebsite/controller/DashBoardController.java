package com.example.learningwebsite.controller;

import com.example.learningwebsite.service.CourseService;
import com.example.learningwebsite.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.security.Principal;

@Controller
@RequiredArgsConstructor
public class DashBoardController {
	private final CourseService courseService;
	private final UserService userService;

	@GetMapping("/dashboard")
	public String dashboard(Model model, Principal principal) {
		model.addAttribute("username", principal.getName());
		model.addAttribute("courses", courseService.getAllCourses());
		return "dashboard";
	}

	public UserService getUserService() {
		return userService;
	}
}
