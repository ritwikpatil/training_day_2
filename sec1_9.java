package day2;

public class sec1_9 {
    public static void main(String[] args) {
        
        Car c1 = new Car();

        c1.setSpeed(100);
        System.out.println("car speed is " + c1.getSpeed());
    }

    
}
class Car {
    private int speed; 

    public void setSpeed(int s) {
        if (s >= 0) {
            this.speed = s;
            System.out.println("Speed set to: " + s + " km/h");
        } else {
            System.out.println("Speed cannot be negative");
        }
    }

    public int getSpeed() {
        return this.speed;
    }
}