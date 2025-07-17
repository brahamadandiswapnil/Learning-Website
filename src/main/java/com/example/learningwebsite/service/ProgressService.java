package com.example.learningwebsite.service;

import org.springframework.stereotype.Service;

import com.example.learningwebsite.entity.Course;
import com.example.learningwebsite.entity.Progress;
import com.example.learningwebsite.entity.User;
import com.example.learningwebsite.repository.ProgressRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ProgressService {
    private final ProgressRepository progressRepository;

	public Progress getProgress(User user, Course course) {
        return progressRepository.findByUserAndCourse(user, course).orElse(null);
    }

    public Progress saveProgress(Progress progress) {
        return progressRepository.save(progress);
    }
}
