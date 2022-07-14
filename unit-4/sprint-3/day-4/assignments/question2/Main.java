package question2;

public class Main {
    public static void main(String[] args) {
        Shape shape=new Area();

        int circleArea=shape.circleArea(10);
        System.out.println("The are of the circle is : "+circleArea);

        int rectangleArea=shape.rectangleArea(17,14);
        System.out.println("The are of the rectangle is : "+rectangleArea);

        int squareArea=shape.squareArea(12);
        System.out.println("The are of the square is : "+squareArea);
    }
}
