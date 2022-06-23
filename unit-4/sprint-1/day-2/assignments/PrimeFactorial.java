package Day2;

public class PrimeFactorial {
    public static void main(String[] args) {
        byte number = 78;

        if(number>=2 & number<=100){
           PrimeFactors(number);
        }
        else{
            System.out.println("Invalid number");
        }
    }
    public static void PrimeFactors(int number){
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
