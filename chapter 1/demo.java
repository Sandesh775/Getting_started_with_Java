// this is alternative code of below commented  code 
// solution is why to create two different method for one same function 
// then java gives us solution we can create same method with same name  but differnet parameters
// and here the method is only one created with name add(), it brings more reliability , readability 

class calculator2{
    public static int add(int n1, int n2, int n3){ // same method for adding 3 values with 3 parameters
        return n1+n2+n3;
    }
    public static int add(int n1, int n2){// same method for adding 2 values with 2 parameters
        return n1+n2;
    }
     public static double add(double n1, int n2){// same method for adding 2 values with 2 parameters but different data types
        return n1+n2;
    }
}
class demo {
    public static void main(String a[]){
        calculator2 obj = new calculator2();
        int result1 = obj.add(3,4,5);
        int result2 = obj.add(3,4);
       System.out.println("3+4+5 = "+result1);
       System.out.println("3+4 = "+result2);
    }
}
/*
class calculator2{
    public static int add(int n1, int n2, int n3){ // this method for adding 3 values
        return n1+n2+n3;
    }
    public static int add1(int n1, int 2){// this method for adding 2 values in case you need !
        return n1+n2;
    }
}
class demo {
    public static void main(){
        calculator2 obj = new calculator();
        int result1 = obj.add(3,4,5);
        int result2 = obj.add1(3,4);
       System.out.println("3+4+5 = "+result1);
       System.out.println("3+4 = "+result2);
    }
}
 */