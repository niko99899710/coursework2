package com.example.coursework2.repository;
import com.example.coursework2.model.Question;
import org.springframework.stereotype.Repository;

import java.util.*;
@Repository
public class QuestionRepositoryImpl implements QuestionRepository {
    private final Set<Question> questionSet = new HashSet<>();

    @Override
    public Question addQuestion(Question question) {
        questionSet.add(question);
        return question;
    }

    @Override
    public Question removeQuestion(Question question) {
        questionSet.remove(question);
        return question;
    }

    @Override
    public Collection<Question> getAllQuestion() {
        return Collections.unmodifiableSet(questionSet);
    }

}
