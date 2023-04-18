//Exercise 8.12
public class DateAndTime {
    private Date date;
    private Time2 time;

    public DateAndTime(int month, int day, int year, int hour, int minute, int second) {
        date = new Date(month, day, year);
        time = new Time2(hour, minute, second);
    }

    public void incrementHour() {
        time.incrementHour();
        if (time.getHour() == 0) {
            date.nextDay();
        }
    }

    public String toString() {
        return String.format("%s %s", date.toString(), time.toString());
    }

    public String toUniversalString() {
        return String.format("%s %s", date.toString(), time.toUniversalString());
    }
}
