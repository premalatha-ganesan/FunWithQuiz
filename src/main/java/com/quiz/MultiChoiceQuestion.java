package com.quiz;

import java.util.List;

public class MultiChoiceQuestion extends Question {

    private List<String> correctAnswers;

    public List<String> getCorrectAnswers() {
        return correctAnswers;
    }

    public void setCorrectAnswers(List<String> correctAnswers) {
        this.correctAnswers = correctAnswers;
    }

    @Override
    public boolean checkAnswer(String actualAnswer) {
        String[] actualAnswers = actualAnswer.split(",");
        for (String actualAns : actualAnswers) {
            if (!correctAnswers.contains(actualAns)) {
                return false;
            }
        }
        return true;
    }
}
