package question2;
import java.util.Arrays;
import java.util.Scanner;

public class Input {


    public static void main(String[] args) {

        try {
            Scanner scanner=new Scanner(System.in);
            System.out.println("Enter the number of elements in the array");
            int sizeOfArray=scanner.nextInt();
            int[] array=new int[sizeOfArray];
            System.out.println("Enter the elements in the array");
            for (int i=0;i<sizeOfArray;i++){

                array[i]=scanner.nextInt();

            }
            System.out.println("Enter the index of the array element you want to access");

            int find=array[scanner.nextInt()];
            System.out.println(find);

            System.out.println("The array element successfully accessed");


        }catch (Exception e){
            System.out.println(e);
        }

    }

}
