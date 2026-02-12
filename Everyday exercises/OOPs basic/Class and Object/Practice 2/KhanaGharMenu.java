/*
* Create KhanaGharMenu.java for a restaurant menu system with attributes: itemName, price, category, isVegetarian, isAvailable. Implement:

A formatted menu display

Show only vegetarian items

Show only non-vegetarian items

Show non-vegetarian items priced > Rs.100 and available

Show vegetarian items priced < Rs.50 and available

Example items:

Dal-Bhat Set (Rs.120)

Masala Chiya (Rs.15)

Dharane Kalo Bangur (Rs.400)

Sekuwa (Rs.200)*/
public class KhanaGharMenu {
    String itemname;
    int price;
    String category;
    boolean isVeg;
    boolean isavailable;

    KhanaGharMenu(String itemname, int price, String category, boolean isVeg, boolean isavailable) {
        this.itemname = itemname;
        this.price = price;
        this.category = category;
        this.isVeg = isVeg;
        this.isavailable = isavailable;
    }

    public static void main(String[] args) {
        KhanaGharMenu item1 = new KhanaGharMenu("DalBhat Set", 120, "Dal-Bhat", true, true);
        KhanaGharMenu item2 = new KhanaGharMenu("Sekuwa", 200, "Grilled", false, true);
        KhanaGharMenu item3 = new KhanaGharMenu("Aloo Tama", 180, "Curry", true, true);
        KhanaGharMenu item4 = new KhanaGharMenu("Buff Choila", 250, "Appetizer", false, true);
        KhanaGharMenu item5 = new KhanaGharMenu("Sel Roti", 50, "Chiya-Nasta", true, true);
        // formated output obviously it only shows item and price alongside
        KhanaGharMenu[] khanaharu = {item1,item2,item3,item4,item5};
        System.out.println("Menu :");
        for(KhanaGharMenu k: khanaharu){
            System.out.println(k.itemname+"\t\t"+k.price);
        }
        System.out.println("Showing only vegetarian items");
        for(KhanaGharMenu k: khanaharu){
            if(k.isVeg){
                System.out.println(k.itemname+"\t\t"+k.price);
            }
        }
        System.out.println("Showing only non-vegetarian items");
        for(KhanaGharMenu k: khanaharu){
            if(!k.isVeg){
                System.out.println(k.itemname+"\t\t"+k.price);
            }
        }
        System.out.println("Showing non-vegetarian items priced > Rs.100 and available");
        for(KhanaGharMenu k: khanaharu){
            if(!k.isVeg && k.price>100 && k.isavailable){
                System.out.println(k.itemname+"\t\t"+k.price);
            }
        }
        System.out.println("Show vegetarian items priced < Rs.50 and available");
        for(KhanaGharMenu k: khanaharu){
            if(k.isVeg && k.price<50 && k.isavailable){
                System.out.println(k.itemname+"\t\t"+k.price);
            }
        }
    }
}
/*
* // Step 1: Declare empty array of size 4
KhanaGharMenu[] menu = new KhanaGharMenu[4];

// Step 2: Fill it one by one
menu[0] = new KhanaGharMenu("Dal-Bhat Set", 120, "Dal-Bhat", true, true);
menu[1] = new KhanaGharMenu("Sekuwa", 200, "Grilled", false, true);
menu[2] = new KhanaGharMenu("Masala Chiya", 15, "Chiya-Nasta", true, true);
menu[3] = new KhanaGharMenu("Dharane Kalo Bangur", 400, "Curry", false, true);*/
/*
* KhanaGharMenu[] menu = {
    new KhanaGharMenu("Dal-Bhat Set", 120, "Dal-Bhat", true, true),
    new KhanaGharMenu("Sekuwa", 200, "Grilled", false, true),
    new KhanaGharMenu("Masala Chiya", 15, "Chiya-Nasta", true, true),
    // ...
};*/