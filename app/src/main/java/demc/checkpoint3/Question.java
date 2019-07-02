package demc.checkpoint3;

import java.util.Scanner;

public class Question
{
    private String mText;
    // 0 = read in boolean, 1 = read in string, 2 = read in number
    private int mAnswerType;

    public Question(String text)
    {
        mText = text;
    }

    // stub method - intentionally does nothing
    // only applies to true false question
    public boolean checkAnswer(boolean boolResponse)
    {
        return false;
    }

    // stub method
    // only applies to fill the blank question
    public boolean checkAnswer(String userAnswer)
    {
        return false;
    }

    public int getAnswerType()
    {
        return mAnswerType;
    }

    public String getText()
    {
        return mText;
    }

    public void setText(String text)
    {
        mText = text;
    }

    // stub
    public boolean readInputAndCheckAnswer(Scanner input)
    {
        return false;
    }

    public boolean isTrueFalseQuestion()
    {
        return false;
    }

    public boolean isFillInTheBlankQuestion()
    {
        return false;
    }

    public boolean isMultipleChoiceQuestion()
    {
        return false;
    }
}
