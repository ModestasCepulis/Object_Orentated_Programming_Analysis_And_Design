import javax.swing.*;

public class Game {


    public static void main(String[] args) {

        //create 2 dice objects
        Dice die1 = new Dice();
        die1.roll();
        Dice die2 = new Dice();
        die2.roll();

        int totalValue = die1.getFaceValue() + die2.getFaceValue();
        String text = "The value of dice 1 is: " + die1.getFaceValue()
                +"\nThe value of dice 2 is: " + die2.getFaceValue()
                +"\nThe total value is: " + totalValue;

        if(totalValue == 7)
        {
            System.out.println(text
                                +"\n\nYou won!!");
        }
        else
        {
            System.out.println(text
                    +"\n\nYou lost!!");
        }


    }

}
