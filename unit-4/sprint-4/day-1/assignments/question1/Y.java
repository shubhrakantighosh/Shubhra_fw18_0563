package question1;

public interface Y {

    void funA();

    static void funB() {
        System.out.println("funB in Interface of Y");
    }

    default void funC(){
        System.out.println("funC in Interface of Y");
    };

}
