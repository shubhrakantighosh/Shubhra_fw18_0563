package question1;

import java.util.HashMap;

public class HashMapAssignment {

    public static void main(String[] args) {

        HashMap<String,String>hashMap=new HashMap<>();
        hashMap.put("West Bengal","Kolkata");
        hashMap.put("Madhya Pradesh","Bhopal");
        hashMap.put("Karnataka","Bangalore");
        hashMap.put("Delhi","Delhi");
        hashMap.put("Maharashtra","Mumbai");
        hashMap.put("Rajasthan","Jaipur");

        hashMap.forEach((state, capital) -> System.out.println("Capital of the "+state +" is "+capital));
    }
}
