enum DayOfWeek{
    Monday,Tuesday,Wednesday,Thursday,Friday,Saturday,Sunday
}
enum TrafficLight{
    RED, YELLOW, GREEN
}
public class EnumPractice {
    public static void main(String[] args) {
        // Basic usage
        DayOfWeek today = DayOfWeek.Tuesday;
        System.out.println("Today is : "+today);

        // switch with enum
        TrafficLight light = TrafficLight.GREEN;

        switch (light){
            case RED :
                System.out.println("Stop !");
                break;
            case GREEN:
                System.out.println("GO");
                break;
            case YELLOW:
                System.out.println("Slow Down");
                break;
        }

        // loop through all values
        System.out.println("All days : ");
        for (DayOfWeek d : DayOfWeek.values()){
            System.out.println(d);
        }

        // Enum with methods
        OrderStatus status = OrderStatus.SHIPPED;
        System.out.println(status.getDescription());
    }
}
enum OrderStatus{
    PENDING("Order is being processed"),
    SHIPPED("Order is on the way"),
    DELIVERED("Order has arrived");

    private String description;

    OrderStatus(String description){
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}