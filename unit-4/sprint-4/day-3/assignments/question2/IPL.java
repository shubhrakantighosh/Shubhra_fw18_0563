package question2;

import java.util.Objects;

public class IPL {

    public void homeTeamStadium(Stadium stadium) {

        Stadium stadium1=Stadium.EDEN_GARDENS_STADIUM;
        Stadium stadium2=Stadium.WANKHEDE_STADIUM;
        Stadium stadium3=Stadium.CHIDAMBARAM_STADIUM;
        Stadium stadium4=Stadium.M_CHINNASWAMY_STADIUM;

        String s1=stadium1.toString();
        String s2=stadium2.toString();
        String s3=stadium3.toString();
        String s4=stadium4.toString();


        if(Objects.equals(s1, "EDEN_GARDENS_STADIUM"))
        {
            System.out.println("This is the home ground of KKR");
        } else if (Objects.equals(s2, "WANKEL_STADIUM")) {
            System.out.println("This is the home ground of Mumbai Indians");
        }else if (Objects.equals(s3, "CHIDAMBARAM_STADIUM")) {
            System.out.println("This is the home ground of CSK");
        }else if (Objects.equals(s4, "M_CHINNASWAMY_STADIUM")) {
            System.out.println("This is the home ground of RCB");
        }
        else System.out.println("Wrong Input");

    }

}
