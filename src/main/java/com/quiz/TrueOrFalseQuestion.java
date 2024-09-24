package com.quiz;

public class TrueOrFalseQuestion extends Question {

    private boolean correctAnswer;

    public boolean isCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(boolean correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    @Override
    public boolean checkAnswer(String actualAnswer) {
        return Boolean.parseBoolean(actualAnswer) == correctAnswer;
    }
}
