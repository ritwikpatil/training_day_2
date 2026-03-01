package day2;

public class sec1_5 {
    public static void main(String[] args) {
        Student s1 = new Student();

        s1.name = "ritwik";
        s1.rollno = 101;
        s1.marks = 98.98;
        s1.display();

    }
    
}
class Student {
    String name;
    int rollno;
    double marks;

    void display(){
        System.out.println(name);
        System.out.println(rollno);
        System.out.println(marks);
    }
}
