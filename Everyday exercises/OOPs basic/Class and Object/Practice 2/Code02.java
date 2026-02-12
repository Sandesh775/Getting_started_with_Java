/*
* Problem 2: Product Inventory System 📦
Topics: Class with Multiple Attributes, Object Creation, Filtering Data, Method Overloading
Task: Create a Product class with:
Attributes (at least 6):
productName
productId
price
quantity
category (e.g., "Electronics", "Clothing", "Food")
inStock (boolean)

Methods:
displayProductInfo() - shows all product details
Overloaded applyDiscount() methods:

applyDiscount(int percentage) - reduces price by percentage
applyDiscount(double flatAmount) - reduces price by flat amount

Main Task:
Create 5 product objects with different data
Display all products
Display only products that are in stock (inStock = true)
Display only products that are out of stock (inStock = false)
Display products with price > 500 and in stock
Apply discount to one product and display updated price*/
public class Code02 {
    public static void main(String[] args) {
        // creating array of objects and passing values while intitalizing each
        Product [] products = {
                new Product("Laptop",1001, 80000, 15, "Electronics", true),
                new Product("Stove",1002, 10000, 15, "Electronics", false),
                new Product("Towel",1003, 350, 5, "Clothing", true),
                new Product("Apple",1004, 30, 100, "Food", true),
                new Product("Utensils",1005, 750, 12, "Utility", false)
        };
        System.out.println("=== All Products ===");
        for( Product p : products){
            p.displayProductInfo();
        }
        System.out.println("=== In Stock Products ===");
        for( Product p : products){
            if(p.inStock) {
                p.displayProductInfo();
            }
        }
        System.out.println("=== Out of  Stock Products ===");
        for( Product p : products){
            if(!p.inStock) {
                p.displayProductInfo();
            }
        }
        System.out.println("=== Expensive In-Stock Products (Price > 500) ===");
        for( Product p : products){
            if(p.price > 500 && p.inStock) {
                p.displayProductInfo();
            }
        }
        System.out.println("=== After Applying 10% Discount on Product 1 ===");
        products[0].applyDiscount(10);// passing percentage discount
        System.out.println("=== After Applying Rs.5000 as flat Discount on Product 2 ===");
        products[1].applyDiscount(5000.0);// passing amount as discount
    }
}
class Product{
    String productName;
    int productId;
    double price;
    int quantity;
    String category;
    boolean inStock;
    Product(String productName, int productId, double price, int quantity, String category, boolean inStock ){
        this.productName = productName;
        this.productId = productId;
        this.price = price;
        this.quantity = quantity;
        this.category= category;
        this.inStock = inStock;
    }
    public void displayProductInfo(){
        System.out.println("Product name : "+this.productName+"\n"+"Product id : "+this.productId+"\n"+"Price : "+this.price+"\n"+"Quantity :"+this.quantity+"\n"+
                "Category : "+this.category+"\n"+"Avaibility : "+this.inStock);
    }
    // method overloading
    public void applyDiscount(int percentage){
        System.out.println("=== After Applying "+percentage+"% Discount on Product : "+this.productName+"===");
        System.out.println("Original price : "+this.price);
        System.out.println("New price : "+(this.price - (percentage/100.0*this.price)));
    }
    public void applyDiscount(double flatAmount){
        System.out.println("=== After Applying  Discount on Product amount of "+flatAmount+" : "+this.productName+"===");
        System.out.println("Original price : "+this.price);
        System.out.println("New price : "+(this.price - flatAmount));
    }
}