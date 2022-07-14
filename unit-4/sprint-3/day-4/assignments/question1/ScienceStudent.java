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
     public void getPercentage() {

        int agv=(this.chemistryMarks+this.mathsMarks+this.phisicsMarks)/3;

        if(agv<=100){

//            return agv;
            System.out.println(name);
            System.out.println(address);
            System.out.println(agv);
        }
//        else return 0;
        else System.out.println("Wrong Input");

    }
}
