package AdvancedQuiz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Game {
    private ArrayList<Question> questionSet;

    public Game(){
        questionSet = new ArrayList<Question>();
        String q = "Where does the Sun rise?";
        String[]a = {"East", "South", "West", "North"};
        questionSet.add(new Question(q, a,"East"));
        q = "Who invented the telephone?";
        // variable mit String[] wiederverwenden
        a = new String[]{"Thomas Edison", "Michael Faraday", "James Watt", "Alexander Bell"};
        questionSet.add(new Question(q, a, "Alexander Bell"));
        q = "Where is the capital of Turkey";
        a = new String[]{"Beijing", "Berlin", "Ankara", "Istanbul"};
        questionSet.add(new Question(q,a,"Ankara"));

        // Reihenfolge verändern
        Collections.shuffle(questionSet, new Random());
    }

    public void start(){
        Scanner scanner = new Scanner(System.in);
        int numCorrect = 0;
        // question von questionSet anzeigen
        for (int i = 0; i < questionSet.size(); i++){
            System.out.println((i+1)+". Question");
            System.out.println(questionSet.get(i).getQuestion());
            int numChoices = questionSet.get(i).getChoices().size();
            // choices von questions in questionSet anzeigen
            for (int j = 0; j < numChoices; j++){
                System.out.println((j+1)+": "+
                        questionSet.get(i).getChoices().get(j));
            }

            int playerAnswer = scanner.nextInt();
            ArrayList<String> choiceSet = questionSet.get(i).getChoices();
            String correctAnswer = questionSet.get(i).getAnswer();
            int correctAnswerIndex = choiceSet.indexOf(correctAnswer);

            if (playerAnswer == correctAnswerIndex+1){
                numCorrect++;
            }else {
                System.out.println("False answer!\n");
            }
        }
        scanner.close();
        if (numCorrect > 1) {
            System.out.printf("You got %d correct answers", numCorrect);
        }else if (numCorrect == 1){
            System.out.printf("You got only %d correct answer", numCorrect);
        }else {
            System.out.println("Unfortunately you got no correct answer\nPush yourself harder!\n");
        }
    }
}
