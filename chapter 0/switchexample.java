class switchexample {
    public static void main (String[]args){
        int week = 1;
        switch (week){
            case 1:
                System.out.print("Today is Sunday !");
                break;
            case 2:
                System.out.print("Today is Monday !");
                break;
            case 3:
                System.out.print("Today is Tuesday !");
                break;
            case 4:
                System.out.print("Today is Wednesday !");
                break;
            case 5:
                System.out.print("Today is Thursday !");
                break;
            case 6:
                System.out.print("Today is Friday !");
                break;
            case 7:
                System.out.print("Today is Saturday !");
                break;
            default :
                System.out.println("Not a valid week number !");           
        }
    }
}