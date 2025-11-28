class enhanceloop {
    public static void main( String a[]){
        int nums[] = new int[5];
        // usually for printing we use printing loop
        // for(int i=0; i<nums.legth;i++)
        // now let's do something similar with echance loop
        for(int i= 0; i<nums.length;i++){
            System.out.println(nums[i]);
        }
        System.out.println("Now printing using enchance loop");
        System.out.println();
        for(int n : nums){
            System.out.println(n);
        }
    }
}