package com.quiz;

import java.util.List;
import java.util.Scanner;

public abstract class Question {

    private String question;

    private List<String> answerOptions;

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public List<String> getAnswerOptions() {
        return answerOptions;
    }

    public void setAnswerOptions(List<String> answerOptions) {
        this.answerOptions = answerOptions;
    }

    public void promptQuestion() {
        System.out.println(question);
        for (int i = 0; i < answerOptions.size(); i++) {
            System.out.println((i + 1) + "." + answerOptions.get(i));
        }
        System.out.print("Your Answer: ");
    }

    public abstract boolean checkAnswer(String actualAnswer);

    @Override
    public String toString() {
        return "Question{" +
                "question='" + question + '\'' +
                ", answerOptions=" + answerOptions +
                '}';
    }
}
