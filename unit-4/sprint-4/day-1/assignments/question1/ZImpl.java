package question1;


public class ZImpl implements Z{


    @Override
    public void funA() {
        System.out.println("funA in class of ZImpl");
    }

    @Override
    public void funC() {
        Z.super.funC();
    }

    @Override
    public void funD() {
        System.out.println("funD in class of ZImpl");
    }

    @Override
    public void funF() {
        Z.super.funF();
    }

    @Override
    public void funG() {
        System.out.println("funG in class of ZImpl");
    }
}
