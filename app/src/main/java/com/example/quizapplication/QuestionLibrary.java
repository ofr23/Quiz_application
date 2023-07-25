package com.example.quizapplication;

public class QuestionLibrary {

    private String mQuestions [] = {
            "Which part of the plants holds it in the soil?",
            "This part of the plant absolute energy from the sun.",
            "This part of the plant attracts bees, butterflies anf hummingbirds.",
            "The _ holds the plant upright.",
    };

    private String mChoices [][] = {
            {"Roots","Steam","Flower"},
            {"Fruits","Leaves","Seeds"},
            {"Bark","Flower","Roots"},
            {"Fruits","Leaves","Seeds"}
    };

    private String mCorrectAnswers [] = {"Roots","Leaves","Flower","Seeds"};

    //Taking the question from the user
    public String getQuestion (int a){
        String question = mQuestions[a];
        return question;
    }



    // Finding the correct answer for each instance
    public String getChoice1(int a){
        String choice0 = mChoices[a][0];
        return choice0;
    }
    public String getChoice2(int a){
        String choice1 = mChoices[a][1];
        return choice1;
    }

    public String getChoice3(int a){
        String choice2 = mChoices[a][2];
        return choice2;
    }

    public String getCorrectAnswer(int a){
        String answer = mCorrectAnswers[a];
        return answer;
    }
}
