package Day2;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        int number=10;
        if(number>0) {
            NaturalNumber(number);
        }
    }
    public static void NaturalNumber(int number){
        int sum = (number * (number + 1)) / 2;
        System.out.println("The sum of the first " + number + " natural numbers is :" + sum);
    }
}
