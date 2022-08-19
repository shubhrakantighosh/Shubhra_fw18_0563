package question3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Shapes shapes=new Shapes();
        Circle circle=new Circle();
        Square square=new Square();
        Rectangle rectangle=new Rectangle();

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Circle radius : ");

        try {

            circle.radius=scanner.nextInt();

            scanner.nextLine();

            System.out.println("Enter Square side : ");
            square.side=scanner.nextInt();

            scanner.nextLine();

            System.out.println("Enter Rectangle length : ");
            rectangle.length=scanner.nextInt();

            scanner.nextLine();

            System.out.println("Enter Rectangle breadth : ");
            rectangle.breadth=scanner.nextInt();

            scanner.nextLine();

            shapes.area(circle);
            shapes.area(square);
            shapes.area(rectangle);

        }catch (Exception e){
            System.out.println("Invalid Input");
        }

    }
}
