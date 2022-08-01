import java.util.ArrayList;
import java.util.List;

public class _LowerBoundedWildcards {

    public static void main(String[] args) {
        List<Number> integerList=new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        integerList.add(4);

        SuperClass(integerList);

    }
    public static void SuperClass(List<? super Number>List){
        System.out.println(List);
    }
}
