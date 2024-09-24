package com.quiz;

public class SingleChoiceQuestion extends Question {

    private String correctAnswer;

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    @Override
    public boolean checkAnswer(String actualAnswer) {
        return actualAnswer.equalsIgnoreCase(correctAnswer);
    }
}
