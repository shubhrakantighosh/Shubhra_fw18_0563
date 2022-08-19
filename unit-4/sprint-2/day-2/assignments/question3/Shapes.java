package question3;

public class Shapes {

    public void area(Circle circle){

        System.out.println("Area of the Circle is : "+(3.14*circle.radius));
    }

    public void area(Rectangle rectangle){

        System.out.println("Area of the Rectangle is : "+(rectangle.breadth*rectangle.length));
    }

    public void area(Square square){

        System.out.println("Area of the Square is : "+(square.side*square.side));
    }

}
