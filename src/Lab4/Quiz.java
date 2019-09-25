package Lab4;

import java.util.Scanner;

public class Quiz {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Question firstQuestion = new Question();

        firstQuestion.setText("What is the capital of france?");
        firstQuestion.display();

        System.out.print("Your answer: ");
        String response = in.nextLine();

        firstQuestion.setAnswer("Paris");
        firstQuestion.checkAnswer(response);



    }

}
