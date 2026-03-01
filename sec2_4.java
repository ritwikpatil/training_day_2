package day2;

public class sec2_4 {
    public static int area(int side) {
        return side * side;
    }

    public static int area(int length, int breadth) {
        return length * breadth;
    }

    public static void main(String[] args) {
        System.out.println("Square Area: " + area(5));
        System.out.println("Rectangle Area: " + area(4, 6));
    }
}