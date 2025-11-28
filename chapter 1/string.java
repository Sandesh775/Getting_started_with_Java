class string {
    public static void main(String a[]){
        String s1 = "sharma";
        s1 = "sandesh";
        String s2 = "sandesh";
        String name1 = new String("sandesh");
        String name2 = new String("sandesh");
        System.out.println(s1 == s2);// true
        System.out.println(s4 == s3);// false
    }
}