package question1;

public class ICICIBank extends Bank{

    double rateOfInterest;
    @Override
    public void displayDetails(){

        System.out.println("ICICIBank{" +
                "rateOfInterest=" + rateOfInterest +
                ", branchName='" + branchName + '\'' +
                ", ifscCode='" + ifscCode + '\'' +
                '}');

    }

    @Override
    public String toString() {
        return "ICICIBank{" +
                "rateOfInterest=" + rateOfInterest +
                ", branchName='" + branchName + '\'' +
                ", ifscCode='" + ifscCode + '\'' +
                '}';
    }
}
