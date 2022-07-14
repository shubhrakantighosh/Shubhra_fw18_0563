package question1;

public class Demo {


    public X funReturn(){

        return new ZImpl();

    }

    public static void main(String[] args) {

        ZImpl zimpl=new ZImpl();
//        zimpl.funA();
//        zimpl.funC();
//        zimpl.funD();

        Demo demo=new Demo();

        Object object=demo.funReturn();
        X x1=(X)object;
//        x1.funA();
//        x1.funC();

        ZImpl x2=(ZImpl)object;
        x2.funA();
        x2.funC();
        x2.funD();
    }

}
