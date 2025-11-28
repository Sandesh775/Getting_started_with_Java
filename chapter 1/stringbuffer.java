class stringbuffer{
    public static void main(String a[]){
        StringBuffer sb = new StringBuffer();
        System.out.println("Stringbuffer capacity string1 "+sb.capacity());
        StringBuffer sb2 = new StringBuffer("Hello");
        System.out.println("Lenght of a string2 : "+sb2.length());
        System.out.println("Stringbuffer capacity with 5 characters word string2 "+sb2.capacity()); // character + 16 bytes more !!
        // append string, add data at the end of string
        sb2.append(" world");
        System.out.println(sb2);
        sb2.insert(5, "o"); // insert chacter or data at index 5
        sb2.deleteCharAt(5);// delete character of index 5
        sb.ensureCapacity(100);// minimum capacity 
    }
}