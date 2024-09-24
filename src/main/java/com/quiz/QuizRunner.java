package com.quiz;

import java.util.List;

public class QuizRunner {

    public static void main(String[] args) {
        Question question1 = buildSingleChoiceQuestion("What is the current year ?", List.of("2021", "2022", "2023", "2024"), "2024");
        Question question2 = buildSingleChoiceQuestion("Where is LaunchCode HQ located ?", List.of("Kansas City", "St Louis", "New York", "Seattle"), "St Louis");
        Question question3 = buildMultiChoiceQuestion("Which of the following are valid Java access modifiers?", List.of("public", "restricted", "static", "private"), List.of("public", "private"));
        Question question4 = buildTrueOrFalseQuestion("Is Java an object oriented programming language?", List.of("true", "false"), true);

        Quiz quiz = new Quiz();
        quiz.addQuestion(question1);
        quiz.addQuestion(question2);
        quiz.addQuestion(question3);
        quiz.addQuestion(question4);

        quiz.runQuiz();
    }

    public static Question buildMultiChoiceQuestion(String question, List<String> answerOptions, List<String> correctAnswers) {
        MultiChoiceQuestion q = new MultiChoiceQuestion();
        q.setQuestion(question);
        q.setAnswerOptions(answerOptions);
        q.setCorrectAnswers(correctAnswers);
        return q;
    }

    public static Question buildSingleChoiceQuestion(String question, List<String> answerOptions, String correctAnswer) {
        SingleChoiceQuestion q = new SingleChoiceQuestion();
        q.setQuestion(question);
        q.setAnswerOptions(answerOptions);
        q.setCorrectAnswer(correctAnswer);
        return q;
    }

    public static Question buildTrueOrFalseQuestion(String question, List<String> answerOptions, boolean correctAnswer) {
        TrueOrFalseQuestion q = new TrueOrFalseQuestion();
        q.setQuestion(question);
        q.setAnswerOptions(answerOptions);
        q.setCorrectAnswer(correctAnswer);
        return q;
    }
}
