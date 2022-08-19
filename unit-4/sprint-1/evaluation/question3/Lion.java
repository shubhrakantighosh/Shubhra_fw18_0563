package question3;

public class Lion {

    String name;
    boolean isHungry;
    int age;
    static int totalDeaths;


    public static void printKillings(){

        System.out.println("Total killings by lions in jungle = "+totalDeaths);

    }

    public void thinking(){

        if (!this.isHungry){

            System.out.println("LionName is sleeping");

        } else if (this.isHungry && this.age>12) {

            System.out.println(this.name+" has eaten two animal");

            totalDeaths +=2;

        } else if (this.isHungry && this.age >= 2) {

            System.out.println(this.name+" has eaten one animal");

            totalDeaths +=1;

        } else if (this.isHungry && this.age<=2) {

            System.out.println(this.name+" is calling Mom;");

        }

    }

    public static void main(String[] args) {
        Lion lion=new Lion();

        lion.name="lion1";
        lion.age=17;
        lion.isHungry=true;
        lion.thinking();

        lion.age=10;
        lion.isHungry=true;
        lion.name="lion2";
        lion.thinking();

        lion.isHungry=false;
        lion.name="lion3";
        lion.thinking();

        printKillings();

    }
}
