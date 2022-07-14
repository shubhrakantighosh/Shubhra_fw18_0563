package question1;

abstract public class Student {
    String name;
    String address;

    abstract void getPercentage( );

    public Student(String name, String address) {
        this.name = name;
        this.address = address;
    }
}
