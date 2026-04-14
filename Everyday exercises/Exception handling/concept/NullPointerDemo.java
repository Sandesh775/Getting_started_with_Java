public class NullPointerDemo {
    public static void main(String[] args) {
        //String str0;
        String str = null;//str ref variable points to nothing, or null object
        //String str = str0;
        try {
            System.out.println(str.length());  // ERROR! Can't get length of null object
        } catch (NullPointerException e) {
            System.out.println("Error: Cannot call method on null object!");
        }
    }
}