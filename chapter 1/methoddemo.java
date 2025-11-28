class computer { // creating a class name computer
    public void playMusic(){
        // here void is defining this method is not returning anything 
        // public >> type of access I want to give for using method playMusic()
        System.out.println("Music Playing ......");
    }
    public String getmeAPen(int cost){  // we can create multiple numbers of variables and method in a class
        // one thing to notice here we are returning the String a return value so while declaring method 
        // it is public String getmeAPen()
        // int cost is a parameter 
        if(cost>=10)
            return "here is your PEN!";  
        else
            return "Nothing";
    }
}
class methoddemo {
    public static void main(String a[]){ // By default main() is a method , which is a start of execution
        int rs = 15;
        computer variable = new computer();
        variable.playMusic();
        String str = variable.getmeAPen(rs);
        System.out.println(str);
    }
}