import java.util.ArrayList;
import java.util.List;

public class _UpperBoundedWildcards {

    public static void main(String[] args) {
        List<Integer>integerList=new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        integerList.add(4);

        int total=SumOfListOfArray(integerList);
        System.out.println(total);
    }
     public static int SumOfListOfArray(List<? extends Number>List){
        int total=0;
         for (Number i:List) {
             total+=i.intValue();
         }
        return total;
     }

}
