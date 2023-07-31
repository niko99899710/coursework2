package com.example.coursework2.service;

import com.example.coursework2.exception.ExceptionBADREQUEST;
import com.example.coursework2.model.Question;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class ExaminerServiceImpl implements ExaminerService{
    private final QuestionService questionService;

    public ExaminerServiceImpl(QuestionService questionService) {
        this.questionService = questionService;
    }


    @Override
    public Collection<Question> getQuestions(int amount) {
        Set<Question> questionSet = new HashSet<>();
        if (amount > questionService.getAllQuestion().size()){
            throw new ExceptionBADREQUEST("BAD_REQUEST");
        }
        while ((questionSet.size() < amount)){
            questionSet.add(questionService.getRandomQuestion());
        }
        return questionSet;
    }
}
