package com.lc101.jasmine.studios.inheritance;

public abstract class Question {
    private String theQuestion;
    private String theAnswer;

    public Question(String theQuestion, String theAnswer) {
        this.theQuestion = theQuestion;
        this.theAnswer = theAnswer;
    }

    public String getTheQuestion() {
        return theQuestion;
    }

    public String getTheAnswer() {
        return theAnswer;
    }

    public abstract boolean checkTheAnswers(String theAnswer);
}
