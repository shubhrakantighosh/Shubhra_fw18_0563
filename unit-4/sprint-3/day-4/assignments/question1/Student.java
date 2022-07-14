package question1;

abstract public class Student {
    String name;
    String address;

    public abstract float getPercentage();

    public Student(String name, String address) {
        this.name = name;
        this.address = address;
    }

}
