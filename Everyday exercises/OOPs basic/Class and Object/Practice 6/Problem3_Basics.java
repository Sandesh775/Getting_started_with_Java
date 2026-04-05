/*
* Problem 3: Create a Book class with title, author, price, applyDiscount(), displayInfo()

Find the most expensive book

Pattern to learn: Comparing objects*/
public class Problem3_Basics {
    public static void main(String[] args) {
        Book b1 = new Book();
        Book b2 = new Book("That one mf!","Robin Gays",537.9);
        Book b3 = new Book("Stupid Bitch in the town!","Dickinson Gays",400.5);
        Book b4 = new Book("Rabbit Holes in Mind!","Unknown",877.5);
        Book b5 = new Book("Sick and Drowning ","Hemingway",395.5);

        Book[] books = {b1,b2,b3,b4,b5};
        // comparing the expensive one !
        int index = 0;
        double largest = books[0].getPrice();
        for( int i = 1; i < books.length; i++){
            double price = books[i].getPrice();
            if(price > largest){
                largest = price;
                index = i;
            }
        }
        System.out.println("Most expensive book : ");
        books[index].displayInfo();
        // passing an arrya of object in method to find expensive one
        // int index = b1.findExpensive(books);
//        System.out.println("Most expensive book : ");
//        books[index].displayInfo();
    }
}
class Book{
    private String title;
    private String author;
    private double price;
    public double getPrice(){
        return price;
    }
    Book(){
        this.title = "null";
        this.author = "null";
        this.price = 0;
    }
    Book(String title, String author, double price){
        this.title = title;
        this.author = author;
        this.price = price;
    }
    public double applyDiscount(){
        return (price - (10.0/100.0*price));
    }
    public void displayInfo(){
        System.out.println("Title : "+title+"\n"+
                           "Author : "+author+"\n"+
                           "Original Price : "+price+"\n"+
                           "Discounted price : "+applyDiscount());
    }
    // what if i want separate method for finding expensive one ?
    // comparing the expensive one ! in method
//    public int findExpensive(Book[] books){
//    int index = 0;
//    double largest = books[0].getPrice();
//        for( int i = 1; i < books.length; i++){
//        double price = books[i].getPrice();
//        if(price > largest){
//            largest = price;
//            index = i;
//        }
//    }
//  return index;
// }
}
//public double calculateDiscountedPrice(double discountPercent) {
//    if(discountPercent < 0 || discountPercent > 100) {
//        throw new IllegalArgumentException("Discount must be between 0-100");
//    }
//    return price - (discountPercent / 100 * price);
//}
//
// Display with any discount
//public void displayInfoWithDiscount(double discountPercent) {
//    System.out.println("Title : " + title);
//    System.out.println("Author: " + author);
//    System.out.println("MRP   : ₹" + price);
//    System.out.println("Discount: " + discountPercent + "%");
//    System.out.println("Final : ₹" + calculateDiscountedPrice(discountPercent));
//}
// Find and display most expensive book
//Book mostExpensive = Book.findMostExpensive(books);
//        if(mostExpensive != null) {
//        System.out.println("💰 MOST EXPENSIVE BOOK:");
//            mostExpensive.displayInfo();
//        }
//public static Book findMostExpensive(Book[] books) {
//    if(books == null || books.length == 0) {
//        System.out.println("No books to compare!");
//        return null;
//    }
//
//    Book mostExpensive = books[0];
//    for(int i = 1; i < books.length; i++) {
//        if(books[i].getPrice() > mostExpensive.getPrice()) {
//            mostExpensive = books[i];
//        }
//    }
//    return mostExpensive;
//}