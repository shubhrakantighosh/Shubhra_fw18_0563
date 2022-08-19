package question2;

import java.util.Scanner;

public class Insurance {

    public float calculateAverage(int[] age){

        float averageAge=0;
        for (int i : age) {
            averageAge += i;
        }
        return averageAge/age.length;
    }

    public static void main(String[] args) {

        Insurance insurance=new Insurance();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter total no.of employees:");

        try {

            int noOfEmployee=scanner.nextInt();

            scanner.nextLine();

            if(noOfEmployee>1){

                System.out.println("Enter the age for "+ noOfEmployee +" employees:");
                int[] array=new int[noOfEmployee];

                for(int i=0;i<noOfEmployee;i++){

                    array[i]=scanner.nextInt();
                }
                float averageAge=insurance.calculateAverage(array);
                System.out.println("The average age is "+averageAge);

            }else System.out.println("Please enter a valid employee count");

        }catch (Exception e){

            System.out.println("Invalid Input");

        }

    }
}
