package Lab4;

import java.util.Scanner;

public class Quiz2 {

    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        MCQuestion q1 = new MCQuestion();

        q1.setText("What is the capital of Italy? (Answer in numbers)");
        q1.addChoice("Dublin", false);
        q1.addChoice("Paris", false);
        q1.addChoice("Rome", true);
        q1.addChoice("London", false);
        q1.display();

        System.out.print("Your answer: ");
        String response = in.nextLine();

        q1.checkAnswer(response);


    }

}
