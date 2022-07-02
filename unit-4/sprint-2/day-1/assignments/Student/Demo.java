public class Demo {
    public static void main(String[] args) {
        Student details1=new Student(27,"Shubhra","Kolkata","NIT");
        details1.getStudent(true);
        System.out.println(details1.roll);
        System.out.println(details1.name);
        System.out.println(details1.address);
        System.out.println(details1.collageName);

        System.out.println("------------------");

        Student details2=new Student(45,"Chirag","Durgapur");
        details2.getStudent(false);
        System.out.println(details2.roll);
        System.out.println(details2.name);
        System.out.println(details2.address);
    }
}
