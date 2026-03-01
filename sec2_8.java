package day2;

class Person {
    private int age;

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("Invalid age");
        }
    }

    public int getAge() {
        return age;
    }
}

public class sec2_8 {
    public static void main(String[] args) {
        Person p = new Person();
        p.setAge(25);
        System.out.println("Age: " + p.getAge());
    }
}