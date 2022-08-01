package question2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;


public class Mobile {

    HashMap<String, ArrayList<String>> mobiles = new HashMap<>();

    public String addMobile(String company, String model){
        String box="Mobile added successfully";

        mobiles.forEach(mobiles-> {
            if (mobiles.equals(model)) {
                box=model+"added to the existing list";

            }
        });

        ArrayList arrayList=new ArrayList(Collections.singleton(model));
        mobiles.put(company,arrayList);

        return box;
    }
}
