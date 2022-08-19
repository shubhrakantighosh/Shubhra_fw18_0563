package question3;

abstract public class Evaluation {

    private final int numberOfQuestions;

    protected Evaluation(int numberOfQuestions) {
        this.numberOfQuestions = numberOfQuestions;
    }

    abstract void evaluationTiming();
    void printNoOfQuestions() {
        System.out.println("No. of Questions in Evaluation is :" +numberOfQuestions);
    }
}
