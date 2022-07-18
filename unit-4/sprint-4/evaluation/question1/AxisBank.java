package question1;

public class AxisBank extends Bank{

    double rateOfInterest;

    @Override
    public void displayDetails(){

        System.out.println("AxisBank{" +
                "rateOfInterest=" + rateOfInterest +
                ", branchName='" + branchName + '\'' +
                ", ifscCode='" + ifscCode + '\'' +
                '}');

    }

    public void getCreditCard(){

        System.out.println("Get the Credit Card from the Axis bank");

    }

    @Override
    public String toString() {
        return "AxisBank{" +
                "rateOfInterest=" + rateOfInterest +
                ", branchName='" + branchName + '\'' +
                ", ifscCode='" + ifscCode + '\'' +
                '}';
    }
}
