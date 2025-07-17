package com.example.learningwebsite.repository;

import com.example.learningwebsite.entity.Progress;
import com.example.learningwebsite.entity.User;
import com.example.learningwebsite.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ProgressRepository extends JpaRepository<Progress, Long> {
    Optional<Progress> findByUserAndCourse(User user, Course course);
}
