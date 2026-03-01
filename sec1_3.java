package day2;

public class sec1_3 {
    public static void main(String[] args) {
        int num = 2;
        
        if (isPrime(num)){
            System.out.println( num + " is a prime number");
        }else{
            System.out.println( num + " is not a prime number");
        }
        

    }

    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;

        for (int i = 3; i <= n; i++){
            if(n % i ==0){
                return false;
            }
        }
    return true;

    }
}