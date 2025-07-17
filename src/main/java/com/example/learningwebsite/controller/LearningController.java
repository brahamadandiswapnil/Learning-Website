package com.example.learningwebsite.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.learningwebsite.service.*;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class LearningController {
    private final CourseService courseService;
   
	private static  Logger log = LoggerFactory.getLogger(LearningController.class);

    @GetMapping("/learning/{courseId}")
    public String learningPage(@PathVariable Long courseId, Model model) {
        var course = courseService.getCourseById(courseId);
        log.debug("Loading course: {}", courseId);
        model.addAttribute("course", course);
        return "learning";
    }
}
