class forloop{
    public static void main(String a[]){
        // incrememnt from i 0 to 4 , that means 5 times work 
        // 0,1,2,3,4 , n = 5
        for(int i = 0; i < 5; i++){// it also can be work with condition i<=4 too
            System.out.println("hi "+(i));
        }
        System.out.println("--------------------");
        // decrement from 5 to 1, now also make 5 times work 
        // 5,1,3,2,1   n = 5
        for(int j = 5;j>= 1 ;j--){
            System.out.println("hello"+(j));
        }
    }
}
// it is important to know index , and number of elements :
// value of i             0    1   2   3   4    (i<5) or (i<=4)
// value of i             1    2   3   4   5    (i<6) or (i<=5)
// number of element      1    2   3   4   5    
