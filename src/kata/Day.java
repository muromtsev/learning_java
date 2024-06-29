package kata;

public enum Day {
    MONDAY("Понедельник"),
    TUESDAY("Вторник"),
    WEDNESDAY("Среда"),
    THURSDAY("Четверг"),
    FRIDAY("Пятница"),
    SATURDAY("Суббота"),
    SUNDAY("Воскресенье");

    private String day;

    Day(String day) {
        this.day = day;
    }

    public boolean isWeekend() {
        return (day.equals("Суббота") || day.equals("Воскресенье"))
                ? true
                : false;
    }

    public String getRusName() {
        return day;
    }
}

