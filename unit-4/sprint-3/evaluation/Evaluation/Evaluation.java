public abstract class Evaluation {
    protected Evaluation() {
    }
    abstract void evaluationTiming();
    void printNoOfQuestions(int numberOfQuestions) {
        System.out.println("No. of Questions in Evaluation is :" +numberOfQuestions);
    }
}
