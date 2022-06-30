public class Shapes {
    public void area(Circle circle){
        System.out.println("The area of the Circle is : "+3.14*(circle.radius*circle.radius));
    }
    public void area(Rectangle rectangle){
        System.out.println("The area of the Rectangle is : "+rectangle.length*rectangle.breadth);
    }
    public void area(Square square){
        System.out.println("The are of Square is : "+(square.side*square.side));
    }
    public static void main(String[] args) {
        Shapes area=new Shapes();
        Circle circle=new Circle();
        circle.radius=10;
        area.area(circle);

        Rectangle rectangle=new Rectangle();
        rectangle.length=10;
        rectangle.breadth=10;
        area.area(rectangle);

        Square square=new Square();
        square.side=10;
        area.area(square);
    }
}
