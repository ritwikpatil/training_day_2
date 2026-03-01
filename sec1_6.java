package day2;

public class sec1_6 {
    public static void main(String[] args) {
        rectangle r1 = new rectangle();

        r1.length = 100;
        r1.breadth = 40;
        r1.display();
    }
}

class rectangle{
    int length;
    int breadth;

    void display(){
        System.out.println(length*breadth);
    }
}