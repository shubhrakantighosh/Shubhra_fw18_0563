package question1;

public class HistoryStudent extends Student{

    int historyMarks;
    int civicsMarks;


    public HistoryStudent(String name, String address, int historyMarks, int civicsMarks) {
        super(name, address);
        this.historyMarks = historyMarks;
        this.civicsMarks = civicsMarks;
    }

    @Override
    public float getPercentage() {

        return (float) (this.historyMarks+this.civicsMarks/2);
    }
}
