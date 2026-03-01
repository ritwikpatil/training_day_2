package day2;

public class sec1_10 {
    public static void main(String[] args) {
        product p1 = new product("book", 1000 );
        
        p1.displayProducts();

        // p1.setProductPrice(89999);
        // p1.displayProducts();
    }
    
}
 
class product{
    private String productName;
    private double productPrice;
    
    public product (String Name, double price){
        this.productName = Name;
        setProductPrice(price);
    }

    public void setprductname(String productName){
        this.productName = productName;
    }

    public void setProductPrice(double price){
        if (price >= 0){
            this.productPrice = price;
        }else{
            System.out.println("price cannot be negative");
        }
    }

    public String getProductName(){
        return productName;
    }

    public double getProductPrice(){
        return productPrice;
    }

    public void displayProducts(){
        System.out.println("product " + productName + " | price is " + productPrice);
    }
}