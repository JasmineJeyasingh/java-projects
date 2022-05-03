package com.lc101.jasmine.studios.inheritance;

public class QuizRunner {
    public static void main(String[] args) {
        Quiz run = new Quiz();

        MultipleChoiceQuestion ques1 = new MultipleChoiceQuestion("Who is the president of USA? \n A: Joe Biden\n B: Trump", "Joe Biden");
        run.addQuestion(ques1);

        CheckBoxQuestion ques2 = new CheckBoxQuestion("Choose perennial flowers only \n 1: Zinnia\n 2: Cone flower\n 3: peony", "2,3");
        run.addQuestion(ques2);

        TrueOrFalseQuestion ques3 = new TrueOrFalseQuestion("Zinnia is Perennial flower. \n 1: True \n 2: False", "False");
        run.addQuestion(ques3);

        run.runQuiz();
    }
}
