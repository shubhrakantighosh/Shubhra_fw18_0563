package question3;

public class DsaEvaluation extends Evaluation{
    protected DsaEvaluation(int numberOfQuestions) {
        super(numberOfQuestions);
    }

    @Override
    void evaluationTiming() {
        System.out.println("Evaluation timing is 9:30 to 11:00");
    }
}
