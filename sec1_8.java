package day2;

public class sec1_8 {
    public static void main(String[] args) {
        employee e1 = new employee();

        e1.setSalary(3000);
        System.out.println(e1.getSalary());
        
        
    }
    
}
class employee{
    private double salary;

    public double getSalary(){
        return salary;
    }
    public void setSalary(double newSalary){
        if (newSalary > 0){
            this.salary = newSalary;
        }else{
            System.out.println("salary must me positive");
        }
    }

}