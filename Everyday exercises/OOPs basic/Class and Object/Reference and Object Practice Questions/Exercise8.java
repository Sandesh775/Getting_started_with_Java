//Exercise 8: Building a Simple Chain Manually
//Create three nodes with values 100, 200, and 300. Connect them manually so that:
//        •	First node points to second node
//•	Second node points to third node
//•	Third node points to nothing
//Without writing code, answer:
//        •	What is the data in the first node? : 100
//        •	What is the data in the node that the first node points to? : 200
//        •	What is the data in the node that the second node points to? : 300
//        •	What does the third node point to? : by default null
//        •	If you start at the first node and follow the chain, how many nodes do you visit? : 2
public class Exercise8 {
    public static void main(String[] args) {
        node n1 = new node(100);
        node n2 = new node(200);
        node n3 = new node(300);

        n1.next = n2;
        n2.next = n3;
        n3.next = null;
    }
}
class node{
    int value;
    node next;
    node(int value){
        this.value = value;
    }
}