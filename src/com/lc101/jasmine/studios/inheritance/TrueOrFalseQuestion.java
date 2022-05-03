package com.lc101.jasmine.studios.inheritance;

public class TrueOrFalseQuestion extends Question {

    public TrueOrFalseQuestion(String theQuestion, String theAnswer) {
        super(theQuestion, theAnswer);
    }

    @Override
    public boolean checkTheAnswers(String theAnswer) {
        if(theAnswer.toLowerCase().equals(getTheAnswer().toLowerCase())) {
            return true;
        }
        return false;
    }
}
