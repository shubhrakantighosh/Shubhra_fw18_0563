package question1;

public interface X {

    void funA();

    static void funB() {
        System.out.println("funB in Interface of X");
    }

    default void funC(){
        System.out.println("funC in Interface of X");
    };

}
