package com.example.learningwebsite.repository;

import com.example.learningwebsite.entity.Course;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {
}
