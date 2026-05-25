public enum Season {
    WINTER,
    SPRING,
    SUMMER,
    FALL;

    public double getAverageTemp() {
        return switch (this) {
            case WINTER -> 2.5;
            case SPRING -> 12.0;
            case SUMMER -> 25.5;
            case FALL -> 13.5;
        };
    }
}