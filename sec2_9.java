package day2;

class ATM {
    private double balance;

    ATM(double balance) {
        this.balance = balance;
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful. New balance: " + balance);
        } else {
            System.out.println("Insufficient balance");
        }
    }
}

public class sec2_9 {
    public static void main(String[] args) {
        ATM myAtm = new ATM(1000);
        myAtm.withdraw(500);
        myAtm.withdraw(600);
    }
}