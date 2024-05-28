/**
 * The TestMyRectangle class is used to test the MyRectangle class.
 */
public class TestMyRectangle {
    public static void main(String[] args) {
        // Test constructors and toString()
        MyRectangle rect1 = new MyRectangle(1, 2, 3, 4);
        System.out.println(rect1); // MyRectangle[topLeft=(1,2),bottomRight=(3,4)]

        MyPoint p1 = new MyPoint(5, 6);
        MyPoint p2 = new MyPoint(7, 8);
        MyRectangle rect2 = new MyRectangle(p1, p2);
        System.out.println(rect2); // MyRectangle[topLeft=(5,6),bottomRight=(7,8)]

        // Test getter and setter methods
        rect1.setTopLeft(new MyPoint(0, 0));
        rect1.setBottomRight(new MyPoint(10, 10));
        System.out.println(rect1); // MyRectangle[topLeft=(0,0),bottomRight=(10,10)]

        System.out.println("Top-left: " + rect1.getTopLeft()); // Top-left: (0,0)
        System.out.println("Bottom-right: " + rect1.getBottomRight()); // Bottom-right: (10,10)

        // Test width, height, area, and perimeter
        System.out.println("Width: " + rect1.getWidth()); // Width: 10
        System.out.println("Height: " + rect1.getHeight()); // Height: 10
        System.out.println("Area: " + rect1.getArea()); // Area: 100
        System.out.println("Perimeter: " + rect1.getPerimeter());// Perimeter: 40
    }
}