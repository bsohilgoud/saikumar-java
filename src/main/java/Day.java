public enum Day {
    MONDAY(1, "This is scary"),
    TUESDAY(2, "This is lazy"),
    WEDNESDAY(3, "This is middle"),
    THURSDAY(4, "This is work"),
    FRIDAY(5, "This is extra activity"),
    SATURDAY(6, "This is weekend"),
    SUNDAY(7, "This is happy");

    private final int dayNumber;
    private final String desc;

    Day(int dayNumber, String desc) {
        this.dayNumber = dayNumber;
        this.desc = desc;
    }

    public int getDayNumber() {
        return dayNumber;
    }

    public String getDesc() {
        return desc;
    }

    // Method to get Day by integer value
    public static Day fromValue(int value) {
        for (Day day : Day.values()) {
            if (day.getDayNumber() == value) {
                return day;
            }
        }
        throw new IllegalArgumentException("No Day with value " + value);
    }
}
