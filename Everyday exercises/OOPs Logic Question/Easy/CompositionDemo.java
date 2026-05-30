import java.util.List;

public class CompositionDemo {
    public static void main(String[] args) {
        Customer c1 = new Customer("John","9887557830");
        Order order = new Order(101);
        MenuItem item = new MenuItem("Pizza",250);
        order.c = c1;
        order.addItem(item);
    }
}
class MenuItem{
    String name;
    double price;

    public MenuItem(String name, double price) {
        this.name = name;
        this.price = price;
    }
}
class Customer{
    String name;
    String phone;

    public Customer(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }
}
class Order {
    int orderId;
    List<MenuItem> items;// one order can have multiple items ordered
    Customer c;// order has relationship with one customer who made that particular order

    public Order(int orderId) {
        this.orderId = orderId;
    }

    public void addItem(MenuItem m){
        items.add(m);
    }
}