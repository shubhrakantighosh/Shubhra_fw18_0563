package question3;

public class Main {

    public void messageToStudents(Evaluation evaluation){

        if (evaluation instanceof DsaEvaluation){

            System.out.println("Its a DSA Evaluation");
            evaluation.printNoOfQuestions();
            evaluation.evaluationTiming();
            System.out.println("=====================");

        } else if (evaluation instanceof CodingEvaluation) {

            System.out.println("Its a Coding Evaluation");
            evaluation.printNoOfQuestions();
            evaluation.evaluationTiming();
            System.out.println("=====================");

        }

    }


    public static void main(String[] args){

        Main main=new Main();
        main.messageToStudents(new DsaEvaluation(5));
        main.messageToStudents(new CodingEvaluation(4));
    }

}
