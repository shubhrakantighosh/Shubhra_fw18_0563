package question3;

public class Person {
    String name;
    String gender;
    Address address=new Address();

    @Override
    public String toString() {
        return  "Person{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", address=" + address +
                '}' + address.toString();
    }
}
