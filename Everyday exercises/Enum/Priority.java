public enum Priority {
    LOW,MEDIUM,HIGH;

    public int getWaitTime(Priority p) {
        return switch (p) {
            case LOW -> 5;
            case MEDIUM -> 3;
            case HIGH -> 1;
        };
    }
    /*
    * public int getWaitTime(Priority p) {
    switch (p) {
        case LOW -> { return 5; }
        case MEDIUM -> { return 3; }
        case HIGH -> { return 1; }
        }
    }
* */
}
