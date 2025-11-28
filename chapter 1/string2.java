class string2{
    public static void main(String a[]){
        String name = "sandesh";
        name = name + " sharma"; // name value isn't changed but created a new object where new string value is sandesh sharma ?
        System.out.println("Hello "+name);
        String s1 = "Sandesh";  // s1 and s2 both are using same one object 
        String s2 = "Sandesh";
        System.out.println("s1==s1 :  "+(s1==s1));
    }
}