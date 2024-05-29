/*
 * Name: Lianne Campbell
 * Project: Java QAP 2
 * Date: 5/28/2024
 * The MyPoint class to calculate point
 */
public class MyPoint {
    private int x, y;

    // Constructor
    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Getter and Setter for x
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    // Getter and Setter for y
    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    // Method to set both x and y
    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Method to get both x and y
    public int[] getXY() {
        return new int[] { x, y };
    }

    // Calculate distance between this point and another point
    public double distance(int x, int y) {
        int xDiff = this.x - x;
        int yDiff = this.y - y;
        return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }

    // Calculate distance between this point and another MyPoint
    public double distance(MyPoint another) {
        return distance(another.x, another.y);
    }

    @Override
    public String toString() {
        return "MyPoint(" + x + "," + y + ")";
    }
}