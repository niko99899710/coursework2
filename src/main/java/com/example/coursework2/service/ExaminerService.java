package com.example.coursework2.service;

import com.example.coursework2.model.Question;
import org.springframework.stereotype.Service;

import java.util.Collection;
@Service
public interface ExaminerService {
    Collection<Question> getQuestions(int amount);
}
