package com.example.learningwebsite.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.learningwebsite.entity.Course;
import com.example.learningwebsite.entity.Note;
import com.example.learningwebsite.entity.User;

public interface NoteRepository extends JpaRepository<Note, Long> {
    List<Note> findByUserAndCourse(User user, Course course);
}
