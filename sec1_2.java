package day2;

public class sec1_2 {
    public static void main(String[] args) {
        int res = max(10, 20);
        System.out.println(res);
    }
    static int max(int a, int b){
        if (a > b){
            return a;
        }else{
            return b;
        }
    }
    
}
