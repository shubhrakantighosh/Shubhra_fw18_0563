package question2;

public class Main {

    public static void main(String[] args) {
        Mobile mobile=new Mobile();
        String mobileStatus=mobile.addMobile("Apple","iPhone 13 Pro");
        String mobileStatus1=mobile.addMobile("Apple","iPhone 13 Pro");
        System.out.println(mobileStatus);
        System.out.println(mobileStatus1);
    }

}
