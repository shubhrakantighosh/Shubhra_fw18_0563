public class MultiFunctions {
    int sum=1;
    void FactorialNumbers(int number){
        String string=Integer.toString(number);
        int length=string.length();
        switch (length){
            case  (1) :
                for (int i=number;i>=1;i--) {
                    sum *=i;
                }
                System.out.println("The factorial of that number is : "+sum);
                break;
            case (2) :
                String[] arr = string.split("");
                int firstNumber=Integer.parseInt(arr[0]);
                int lastNumber=Integer.parseInt(arr[1]);
                int diff=Math.abs(firstNumber-lastNumber);
                for (int j=diff;j>=1;j--) {
                    sum *=j;
                }
                System.out.println("The factorial of that number is : "+sum);
                break;
            default:
                System.out.println("Error Input");
        }

    }
    public static void main(String[] args) {
        MultiFunctions number=new MultiFunctions();
        number.FactorialNumbers(5);
        number.FactorialNumbers(53);
        number.FactorialNumbers(698);
    }
}