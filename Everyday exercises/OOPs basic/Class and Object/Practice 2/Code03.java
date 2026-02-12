/*
* Problem 3: Restaurant Menu System 🍽️
Topics: Constructor Overloading, Method Overloading, Object Array, Data Display
Task: Create a MenuItem class with:

Attributes: dishName, itemCode, price, category (e.g., "Starter", "Main Course", "Dessert"), isVegetarian (boolean), preparationTime (in minutes)
Constructors:

Constructor with dishName, price, category (other fields default)
Constructor with all parameters


Overloaded Methods:

calculateTotal(int quantity) - returns total price for given quantity
calculateTotal(int quantity, double discount) - returns total price after discount
displayMenuItem() - shows complete item details


Main Task:

Create 6 menu items (mix of starters, main course, desserts)
Display complete menu
Display only vegetarian items
Display only items with preparation time < 20 minutes (quick items)
Display items by category (all Starters, all Main Course, all Desserts)
Calculate bill for: 2 items of one dish, with 15% discount*/
public class Code03 {
    public static void main(String[] args) {
        MenuItem[] menuItems = new MenuItem[6];

        menuItems[0] = new MenuItem("Truffle Arancini", 101, 12.50,
                "Starter", true, 18);
        menuItems[1] = new MenuItem("Crispy Calamari", 102, 14.00,
                "Starter", false, 15);
        menuItems[2] = new MenuItem("Grilled Salmon with Herb Butter", 201, 28.50,
                "Main Course", false, 25);
        menuItems[3] = new MenuItem("Mushroom Risotto", 20.2, "Main Course");
        menuItems[4] = new MenuItem("Molten Chocolate Lava Cake", 301, 11.00,
                "Dessert", true, 14);
        menuItems[5] = new MenuItem("Classic Tiramisu",10.50, "Dessert");
        System.out.println("Complete menu :");
        for(MenuItem m : menuItems){
            m.displayMenuItem();
        }
        System.out.println("=== Vegetarian Options ===");
        for(MenuItem m : menuItems){
            if(m.isVegetarian) {
                m.displayMenuItem();
            }
        }
        System.out.println("=== Quick Items (< 20 min) ===");
        for(MenuItem m : menuItems){
            if(m.preparationTime<20) {
                m.displayMenuItem();
            }
        }
        System.out.println("=== Starters ===");
        for(MenuItem m : menuItems){
            if(m.category.equals("Starter")) {
                m.displayMenuItem();
            }
        }
        System.out.println("=== Main Course ===");
        for(MenuItem m : menuItems){
            if(m.category.equals("Main Course")) {
                m.displayMenuItem();
            }
        }
        System.out.println("=== Desserts ===");
        for(MenuItem m : menuItems){
            if(m.category.equals("Dessert")) {
                m.displayMenuItem();
            }
        }
        System.out.println("=== Bill Calculation for first item ===");
        int quantity = 2;
        int discountpercent = 15;
        MenuItem orderedItem = menuItems[0];
        double subtotal = orderedItem.calculateTotal(quantity);
        double total = orderedItem.calculateTotal(quantity, discountpercent);
        double discountAmount = subtotal - total;
                            //double final_total = menuItems[0].calculateTotal(quantity,15);
                            //double total_without_discount = menuItems[0].calculateTotal(quantity);
        System.out.println("Item : "+menuItems[0].dishName+"\n"+
                "Quantity : "+quantity+"\n"+
                "Price per item : "+menuItems[0].price+"\n"+
                "Total without discount : "+subtotal+"\n"+
                "Discount : "+discountAmount+"\n"+
                "Final total : "+total);
    }
}
class MenuItem{
    String dishName;
    int itemCode;
    double price;
    String category;
    boolean isVegetarian;
    int preparationTime;
    // constructor
    MenuItem(String dishName, int itemCode, double price, String category, boolean isVegetarian, int preparationTime){
        this.dishName = dishName;
        this.itemCode = itemCode;
        this.price = price;
        this.category = category;
        this.isVegetarian = isVegetarian;
        this.preparationTime = preparationTime;
    }
    MenuItem(String dishName, double price, String category){
        this.dishName = dishName;
        this.itemCode = 0;
        this.price = price;
        this.category = category;
        this.isVegetarian = false;
        this.preparationTime = 0;
    }
    public void displayMenuItem(){
        System.out.println("Dish : "+this.dishName+"\n"+"Item code : "+this.itemCode+"\n"+
                "Price : "+this.price+"\n"+"Category : "+this.category+"\n"+" Veg :"+this.isVegetarian+"\n"+
                "Preparation time : "+this.preparationTime+" minutes");
    }
    public double calculateTotal(int quantity){
        return (this.price * quantity);
    }
    public double calculateTotal(int quantity, double discount){
        return ((this.price * quantity) - (discount/100.0*this.price*quantity));
    }
}
/*
* public double calculateTotal(int quantity, double discountPercent) {
    double subtotal = this.price * quantity;
    double discountAmount = subtotal * (discountPercent / 100);
    return subtotal - discountAmount;  // Self-documenting
}
* */