package question3;

public class CodingEvaluation extends Evaluation{

    protected CodingEvaluation(int numberOfQuestions) {
        super(numberOfQuestions);
    }

    @Override
    void evaluationTiming() {
        System.out.println("Evaluation timing is 2:00 to 3:30");
    }
}
