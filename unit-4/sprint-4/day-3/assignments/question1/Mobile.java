package question1;

import java.util.Objects;

public class Mobile {

    String[] outdatedModels = {"note4","note5","note6","note7"};

    public void searchOutdatedModel(String mobileModelNo){
        boolean flag=true;

        for (String outdatedModel : outdatedModels) {
            if (Objects.equals(outdatedModel, mobileModelNo)) {
                flag = false;
                System.out.println(mobileModelNo + "_" + "OUTDATED");
            }
        }

        if (flag)
        {
            System.out.println("New Model Mobile");
        }

    }
}
