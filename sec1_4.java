package day2;

public class sec1_4 {
    public static void main(String[] args) {
        int[] mynumbers = {10, 20, 30, 40, 50};
        printarray(mynumbers);
    }
    public static void printarray(int[] arr){
        System.out.println("array elements: ");
        for (int num : arr){
            System.out.println(num + " ");
        }
    }
    
}
