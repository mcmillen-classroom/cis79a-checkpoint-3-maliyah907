package demc.checkpoint3;

import java.util.Scanner;

public class QuizOOPMain
{
    // this is where the app starts
    public static void main(String[] args)
    {
        String[] q3Options = {"A key hook", "A coat hook", "A cap","A yellow picture frame"};
        String[] q4Options = {"Phoebe Neeby", "Ursula Buffay","Regina Falange","Elaine Benes"};

        Question[] questions = new Question[5];
        questions[0] = new TrueFalseQuestion("Phoebe is the oldest friend", true);
        questions[1] = new TrueFalseQuestion("Emily Ross\'s second was nationality was Australian", false);
        questions[2] = new FillTheBlankQuestion("Name one designer Rachel works for", "Bloomingdales", "Fortuna Fashions", "Ralph Lauren");
        questions[3] = new MultipleChoiceQuestion ("What hangs on Monica\'s purple door?", q3Options, 3);
        questions[4] = new MultipleChoiceQuestion("What is the name of Phoebe\'s alter ego?", q4Options, 2);
        int index = 0;
        int score = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to the quiz! Good luck!");

        while (index < questions.length)
        {
            System.out.println(questions[index].getText());

            if (questions[index].readInputAndCheckAnswer(input))
            {
                System.out.println("You are correct!");
            }
            else
            {
                System.out.println("You are incorrect!");
            }

            index++;
        }
    }
}
