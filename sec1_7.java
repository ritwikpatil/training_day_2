package day2;

public class sec1_7 {
    public static void main(String[] args) {

        BankAccount b1 = new BankAccount("ritwik", 1000);

        b1.displayBalance();
        b1.deposit(1000);
        b1.displayBalance();
        b1.withdraw(50);
        b1.displayBalance();
    }
}
class BankAccount{
    String holderName;
    double balance;

    BankAccount(String name, double initialBalance){
        holderName = name;
        balance = initialBalance;
    }

    void deposit(double amount){
        if (amount > 0){
            balance = balance + amount;
            System.out.println(amount + " is deposited");
        }
    }
    
    void withdraw(double amount){
        if (amount > 0 && amount <= balance){
            balance = balance - amount;
            System.out.println("You have been withdraw a amount of  " +amount);

        }else{
            System.out.println("invalid withdraw: insufficient balance");
        }
    }

    void displayBalance(){
        System.out.println("current blance is " + balance);
    }

}
