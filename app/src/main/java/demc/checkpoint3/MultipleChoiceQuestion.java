package demc.checkpoint3;

class MultipleChoiceQuestion extends Question {
    private String[] mOptions;
    private int mAnswer;

    public MultipleChoiceQuestion(String s, String[] options, int answer) {
        super(s);
        mOptions = options;
        mAnswer = answer;

    }
    @Override

    public boolean isMultipleChoiceQuestion()
    {
        return true;
    }
}

