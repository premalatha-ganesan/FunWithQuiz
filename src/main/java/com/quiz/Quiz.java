package com.quiz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Quiz {
    private static final int SCORE_PER_QUESTION = 10;

    private final Scanner scanner = new Scanner(System.in);

    private List<Question> questionList = new ArrayList<>();

    private int score;

    public void addQuestion(Question question) {
        this.questionList.add(question);
    }

    public void runQuiz() {
        for (Question question : questionList) {
            question.promptQuestion();
            String actualAnswer = scanner.nextLine();
            if (question.checkAnswer(actualAnswer)) {
                System.out.println("Good job, that's correct");
                score+= SCORE_PER_QUESTION;
            } else {
                System.out.println("Incorrect answer");
            }
        }

        System.out.println("Quiz Complete and your score is " + score);
    }
}
