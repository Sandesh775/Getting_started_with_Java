// Class and Object Example no 4, program to find the sum of two distance into ft + inches format , and adjust sum accordingly !
class DistanceExample{
    int feet;
    int inch;
    public DistanceExample(){// default constructor

    }
    public DistanceExample(int ft, int in){// parameterized constructor
        feet = ft;
        inch = in;
    }    //return type : String
    public String addDistance(DistanceExample obj){//public DistanceExample addDistance(DistanceExample obj){
        int addFeet = feet + obj.feet;
        int addInch = inch + obj.inch;
        /**
         * full_feet = inches / 12 how many feet
           remaining_inches = inches % 12 leftover inches
         */// Convert inches to feet
        addFeet = addFeet + (addInch/12);
        addInch = addInch%12;
        //return  DistanceExample(addFeet, addInch);
        return  (addFeet + " feet " + addInch + " inches");// here passing two values as String ?
    }
    public void displayDistance(){
        System.out.println("Distance : "+feet+" ft "+inch+" inch");
    }
}
public class Distance{
    public static void main(String[] args){
        DistanceExample d1 = new DistanceExample(100,11);// this enable us to make object propert assigned while creating object instead doing it manually
        DistanceExample d2 = new DistanceExample(100,11);// passing values as parameters to special method known as constructor
        // One object hold it's property as feet and distance , so we are now adding two objects
        // So then we should pass objects as parameter !!!
        //int add = d1.addDistance(DistanceExample d2);
        //System.out.println("Distance : "+feet+" ft "+inch+" inch");
        System.out.println(d1.addDistance(d2));
    }
}
/**
 * for(int i = 0; i<check; i++){
            if(addInch>=12){
                if(addInch%12==0){
                addInch = addInch - 12;
                addFeet++;
                }
                else {
                addInch = addInch - 12;
                addFeet++;
                }
            }
        }
 */