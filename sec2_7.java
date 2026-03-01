package day2;


class Laptop {
    String brand;
    int ram;
    double price;

    Laptop(String brand, int ram, double price) {
        this.brand = brand;
        this.ram = ram;
        this.price = price;
    }

    void displayDetails() {
        System.out.println("Brand: " + brand + ", RAM: " + ram + "GB, Price: $" + price);
    }
}

public class sec2_7 {
    public static void main(String[] args) {
        Laptop lap = new Laptop("Dell", 16, 800.0);
        lap.displayDetails();
    }
}