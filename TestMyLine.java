public class TestMyLine {
    public static void main(String[] args) {
        // Test constructors and toString()
        MyLine line1 = new MyLine(1, 2, 3, 4);
        System.out.println(line1); // MyLine[begin=(1,2),end=(3,4)]

        MyPoint p1 = new MyPoint(5, 6);
        MyPoint p2 = new MyPoint(7, 8);
        MyLine line2 = new MyLine(p1, p2);
        System.out.println(line2); // MyLine[begin=(5,6),end=(7,8)]

        // Test getter and setter methods
        line1.setBegin(new MyPoint(0, 0));
        line1.setEnd(new MyPoint(10, 10));
        System.out.println(line1); // MyLine[begin=(0,0),end=(10,10)]

        System.out.println("Begin X: " + line1.getBeginX()); // Begin X: 0
        System.out.println("Begin Y: " + line1.getBeginY()); // Begin Y: 0
        System.out.println("End X: " + line1.getEndX()); // End X: 10
        System.out.println("End Y: " + line1.getEndY()); // End Y: 10

        // Test getLength() and getGradient()
        System.out.println("Length: " + line1.getLength()); // Length: 14.142135623730951
        System.out.println("Gradient: " + line1.getGradient()); // Gradient: 0.7853981633974483 (45 degrees in radians)
    }
}