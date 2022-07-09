public class Main extends Parrot {
    public static void main(String[] args){
        Bird b1 = new Parrot();
//with this b1 reference call the fly method of
        b1.fly();
//        Parrot
//and after downcasting this b1 reference to the
//        Parrot class object, call the sing method also
        Parrot b2=new Main();
        b2.sing();
    }
}