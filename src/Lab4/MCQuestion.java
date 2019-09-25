package Lab4;

import java.util.ArrayList;

public class MCQuestion extends Question implements Display {
    private ArrayList<String> choices;

    public MCQuestion()
    {
        choices = new ArrayList<String>();
    }


    public void addChoice(String Choice, Boolean Answer)
    {
        choices.add(Choice);

        if(Answer)
        {
            //Convert array size to a string and save in Answer
            String choiceString = "" + choices.size();
            setAnswer(choiceString);
        }
    }

    public void display()
    {
        super.display();

        //display choices in array list
        for(int i=0; i < choices.size(); i++)
        {
            System.out.println(i+1 + " " + choices.get(i));
        }
    }
}
