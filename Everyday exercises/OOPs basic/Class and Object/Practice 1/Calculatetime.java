 class HoursMinuteSecond{
    int hour;
    int minute;
    int second;
    public HoursMinuteSecond(){// default constructor

    }
    public HoursMinuteSecond(int h, int m, int s){// parameterized constructor
        hour = h;
        minute = m;
        second = s;
    }
    public HoursMinuteSecond addDistance( HoursMinuteSecond t){
        HoursMinuteSecond temp = new HoursMinuteSecond();
        // Add seconds
    temp.second = this.second + t.second;
    temp.minute = temp.second / 60;
    temp.second = temp.second % 60;

    // Add minutes
    temp.minute = temp.minute + this.minute + t.minute;
    temp.hour = temp.minute / 60;
    temp.minute = temp.minute % 60;

    // Add hours
    temp.hour = temp.hour + this.hour + t.hour;
        if( temp.hour > 12){// for 12 hour format 
            temp.hour %= 12;
        } 
        return temp;    
    }
    public void displayTime(){
        System.out.println(hour+" Hours : "+minute+" Minute : "+second+" Second : ");
    }
 }   
public class Calculatetime{
    public static void main(String [] args){
        HoursMinuteSecond T1 = new HoursMinuteSecond(10, 15, 40);
        HoursMinuteSecond T2 = new HoursMinuteSecond(8, 2, 0);
        T1.displayTime();
        T2.displayTime();
        System.out.println("Addition : ");
        HoursMinuteSecond T3 = new HoursMinuteSecond();
        T3 = T1.addDistance(T2);// storing value in new object calling from one and passing another object
        T3.displayTime();
    }
}
/**
 * public HoursMinuteSecond addDistance( HoursMinuteSecond t){
        int sum_hour = hour + t.hour;
        int sum_minute = minute + t.minute;
        int sum_second = second + t.second;
        sum_second = (sum_second%60);
        sum_minute = sum_minute + (sum_second/60);
        sum_minute = (sum_minute%60);
        sum_hour = sum_hour + (sum_minute/60);
        if( sum_hour > 12){// for 12 hour format 
            sum_hour %= 12;
        } 
        return new HoursMinuteSecond(sum_hour, sum_minute, sum_second);    
    }
 */