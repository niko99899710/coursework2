package com.example.coursework2.service;

import com.example.coursework2.model.Question;
import org.springframework.stereotype.Service;

import java.util.Collection;
@Service
public interface QuestionService {

    Question addQuestion(Question question);

    Question removeQuestion(Question question);

    Collection<Question> getAllQuestion();

    Question getRandomQuestion();
}
