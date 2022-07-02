import java.util.Arrays;
public class Main1{
    public int[] findAndReturnPrimeNumbers(int[] inputArray){
        int i=0;
        int[] primeArray=new int[inputArray.length];
        int a=0;
        for (int k : inputArray) {
            int count = 0;
            for (int j = 1; j <= k; j++) {
                if (k % j == 0) {
                    count++;
                }
            }
            if (count == 2) {
                primeArray[i]=k;
                i++;
                a++;
            }
        }
        int[] finalArray=new int[a];
        for(int l=0;l<a;l++){
            finalArray[l]=primeArray[l];
        }
        return finalArray;
    }
    public static void main(String[] args){
        Main1 object=new Main1();
        int[] arr = {10,12,5,50,11,14,15};
        int[] primeArray=object.findAndReturnPrimeNumbers(arr);
        System.out.println(Arrays.toString(primeArray));
    }
}