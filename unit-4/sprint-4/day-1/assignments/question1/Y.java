package question1;

public interface Y {

    void funD();

    static void funE() {
        System.out.println("funB in Interface of Y");
    }
    default void funF(){
        System.out.println("funC in Interface of Y");
    };

}
