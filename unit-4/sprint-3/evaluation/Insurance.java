import java.util.Scanner;

public class Insurance {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter total no.of employees:");
        int count=scanner.nextInt();
        int[] employee=new int[count];
        if(count>=2){
            for(int i=0;i<count;i++){
                int age=scanner.nextInt();
                employee[i]=age;
            }
            Insurance employeeAll=new Insurance();
            int[] agvAge=employeeAll.calculateAverage(employee);
            System.out.println("The average age is "+agvAge[0]);
        }
        else System.out.println("Please enter a valid employee count");

    }

    public int[] calculateAverage(int[] age){
        int sum=0;
        for (int j : age) {
            sum += j;
        }
        int avg=sum/age.length;
        int[] ageArr=new int[1];
        ageArr[0]=avg;
        return ageArr;
    }

}
