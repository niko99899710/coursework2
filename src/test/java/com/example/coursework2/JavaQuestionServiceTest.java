package com.example.coursework2;

import com.example.coursework2.model.Question;
import com.example.coursework2.repository.QuestionRepository;
import com.example.coursework2.service.JavaQuestionService;
import com.example.coursework2.service.QuestionService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.List;
import java.util.Random;

import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.when;

public class JavaQuestionServiceTest {
    private QuestionService javaQuestionService;
    private QuestionRepository questionRepository;

    private Random random;
    @BeforeEach
    public void init(){
        questionRepository = Mockito.mock(QuestionRepository.class);
        javaQuestionService = new JavaQuestionService(questionRepository, random);
        random = Mockito.mock(Random.class);
    }
     @Test
    public void getRandomQuestionTest(){
        Question question1 = new Question("конфеку будешь?", "да");
        Question question2 = new Question("пирог будешь?", "нет");
        Question question3 = new Question("шашлык будешь?", "подумаю");
        Question question4 = new Question("булочку будешь?", "может быть");

        when(questionRepository.getAllQuestion()).thenReturn(List.of(question1,question2,question3,question4));
        when(random.nextInt(anyInt())).thenReturn(0);

        System.out.println(javaQuestionService.getRandomQuestion());

      //  Question justFirst = javaQuestionService.getRandomQuestion();
      //  Assertions.assertEquals(question1, justFirst);

    }

}
