public class Demo {
    public void Demo1(float f){
        System.out.println(f);
    }
    public void Demo1(int i){
        System.out.println(i);
    }
    public void Demo1(String s){
        System.out.println(s);
    }
    public static void main(String[] args) {
        Demo dataUser=new Demo();
        dataUser.Demo1("Shubhra");
        dataUser.Demo1(26);
        dataUser.Demo1(28.9f);
    }
}
