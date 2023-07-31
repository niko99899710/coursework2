package com.example.coursework2.repository;

import com.example.coursework2.model.Question;

import java.util.Collection;

public interface QuestionRepository {
    Question addQuestion(Question question);

    Question removeQuestion(Question question);

    Collection<Question> getAllQuestion();
}
