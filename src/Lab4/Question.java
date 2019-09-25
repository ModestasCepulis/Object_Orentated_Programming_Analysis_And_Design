package Lab4;

import java.util.Scanner;

public class Question {

    String text = "";
    String answer = "";

    public static void main(String[] args) {

    }

    public void setText(String Text)
    {
        text = Text;

    }

    public void setAnswer(String Answer)
    {
        answer = Answer;
    }

    public void display()
    {
        System.out.println(text);
    }

    public boolean checkAnswer(String response)
    {
        if(response.equals(answer))
        {
            System.out.println("Your answer is correct!");
            return true;
        }
        else
        {
            System.out.println("Your answer is not correct! try again...");
            return false;
        }
    }

}
