public class TimeCalculate {
    public static void main(String[] args) {
        Time t1 = new Time(5, 6, 70);
        Time t2 = new Time(1, 30, 30);

        Time addtime = t1.addTime(t2);
        Time subTime = t1.subTime(t2);

        System.out.print("Addition : ");
        addtime.display();

        System.out.print("Subtraction : ");
        subTime.display();
    }
}

class Time {
    int hours;
    int minutes;
    int seconds;

    Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public void display() {
        System.out.println(hours + " : " + minutes + " : " + seconds);
    }

    public Time addTime(Time ref) {
        int totalSeconds = this.seconds + ref.seconds;
        int extraMinutes = totalSeconds / 60;
        int finalSeconds = totalSeconds % 60;

        int totalMinutes = this.minutes + ref.minutes + extraMinutes;
        int extraHours = totalMinutes / 60;
        int finalMinutes = totalMinutes % 60;

        int finalHours = this.hours + ref.hours + extraHours;

        return new Time(finalHours, finalMinutes, finalSeconds);
    }

    public Time subTime(Time ref) {
        // Convert both times to total seconds
        int totalSec1 = this.hours * 3600 + this.minutes * 60 + this.seconds;
        int totalSec2 = ref.hours * 3600 + ref.minutes * 60 + ref.seconds;

        int diffSeconds = totalSec1 - totalSec2;

        // If result is negative, set to zero (simple handling)
        if (diffSeconds < 0) diffSeconds = 0;

        int finalHours = diffSeconds / 3600;
        int remaining = diffSeconds % 3600;
        int finalMinutes = remaining / 60;
        int finalSeconds = remaining % 60;

        return new Time(finalHours, finalMinutes, finalSeconds);
    }
}