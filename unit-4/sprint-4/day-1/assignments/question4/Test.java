package question4;

public class Test implements Intr {

    @Override
    public int[] display(int p) {

        int[] tempArr=new int[p];
        int size=0;
        String str="";
        for(int i=1;i<=p;i++){
            int count=0;
            for(int j=1;j<=i;j++){
                if(i%j==0){
                    count++;
                }
            }
            if(count==2){
                str +=i +" ";
                tempArr[size]=i;
                size ++;
            }
        }

        int[] finalArray=new int[size];
        for (int k=0;k<size;k++){
            finalArray[k]=tempArr[k];
        }

        return finalArray;
    }
}
