package question1;

public class ScienceStudent extends Student{

    int phisicsMarks;
    int chemistryMarks;
    int mathsMarks;


    public ScienceStudent(String name, String address, int phisicsMarks, int chemistryMarks, int mathsMarks) {

        super(name, address);
        this.phisicsMarks = phisicsMarks;
        this.chemistryMarks = chemistryMarks;
        this.mathsMarks = mathsMarks;

    }

    @Override
     public float getPercentage() {

        return (float)(chemistryMarks+mathsMarks+phisicsMarks)/3;

    }
}
