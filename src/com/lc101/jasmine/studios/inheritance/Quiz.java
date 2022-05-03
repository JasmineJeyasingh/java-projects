package com.lc101.jasmine.studios.inheritance;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Quiz {
    private List<Question> listOfQuestions = new ArrayList<Question>();
    private Scanner input = new Scanner(System.in);
    private double noOfQuestionsCorrect = 0;

    public Quiz() {
    }

    public void addQuestion(Question question) {
        this.listOfQuestions.add(question);
    }

    public void runQuiz() {
        for(Question question : listOfQuestions) {
            System.out.println(question.getTheQuestion());
            String userAnswer = input.nextLine();
            boolean questionCorrect = question.checkTheAnswers(userAnswer);
            if(questionCorrect) {
                noOfQuestionsCorrect ++;
            }
        }
        double gradePercentage = (noOfQuestionsCorrect / listOfQuestions.size()) * 100;
        System.out.println("Grade: " + gradePercentage + "%");
    }

}
