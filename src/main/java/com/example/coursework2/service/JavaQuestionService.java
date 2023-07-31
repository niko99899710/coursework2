package com.example.coursework2.service;

import com.example.coursework2.model.Question;
import com.example.coursework2.repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;

@Service
public class JavaQuestionService implements QuestionService {

    private final QuestionRepository questionRepositoryImpl;
    private  final Random random;
    @Autowired
    public JavaQuestionService(QuestionRepository questionRepositoryImpl) {
        this.questionRepositoryImpl = questionRepositoryImpl;
        this.random =  new Random();
    }

    public JavaQuestionService(QuestionRepository questionRepositoryImpl, Random random) {
        this.questionRepositoryImpl = questionRepositoryImpl;
        this.random =  random;
    }

    @Override
    public Question addQuestion(Question question) {
        return questionRepositoryImpl.addQuestion(question);
    }

    @Override
    public Question removeQuestion(Question question) {
        return questionRepositoryImpl.removeQuestion(question);
    }

    @Override
    public Collection<Question> getAllQuestion() {
        return questionRepositoryImpl.getAllQuestion();
    }

    @Override
    public Question getRandomQuestion () {
        List<Question> questions = new ArrayList<>(questionRepositoryImpl.getAllQuestion());
        return questions.get(random.nextInt(questions.size()));
    }

}
