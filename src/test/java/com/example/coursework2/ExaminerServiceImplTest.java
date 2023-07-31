package com.example.coursework2;

import com.example.coursework2.exception.ExceptionBADREQUEST;
import com.example.coursework2.model.Question;
import com.example.coursework2.repository.QuestionRepository;
import com.example.coursework2.service.ExaminerService;
import com.example.coursework2.service.JavaQuestionService;
import com.example.coursework2.service.QuestionService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.List;
import java.util.Random;

import static org.mockito.Mockito.when;

public class ExaminerServiceImplTest {
    private ExaminerService examinerService;
    private QuestionService questionService;

    @BeforeEach
    public void init(){
        questionService = Mockito.mock(QuestionService.class);
        examinerService = Mockito.mock(ExaminerService.class);
    }
    @Test
    public void exceptionDoNotWorry (){
        Question question1 = new Question("клубника будешь?", "да");
        Question question2 = new Question("вишня будешь?", "нет");
        Question question3 = new Question("дыня будешь?", "подумаю");
        Question question4 = new Question("киви будешь?", "может быть");
        when(questionService.getAllQuestion()).thenReturn(List.of(question1,question2,question3,question4));
        Assertions.assertThrows(ExceptionBADREQUEST.class, () -> examinerService.getQuestions(23));
    }
}
