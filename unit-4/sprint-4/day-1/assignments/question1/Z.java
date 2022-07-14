package question1;

public interface Z extends X, Y {

    @Override
    default void funA() {

        System.out.println("funA in Interface of Z");

    }

    @Override
    default void funC() {
        System.out.println("funC in Interface of Z");
    }

    public void funD();

}
