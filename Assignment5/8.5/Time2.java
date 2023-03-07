//Exercise 8.5
public class Time2 {
    private int timeInSeconds; // time represented as number of seconds since midnight
    
    // Time2 no-argument constructor: initializes timeInSeconds to zero
    public Time2() {
        this(0); // invoke constructor with one argument
    }
    
    // Time2 constructor: timeInSeconds supplied
    public Time2(int timeInSeconds) {
        setTime(timeInSeconds);
    }
    
    // Set Methods
    // set a new time value using universal time;
    // validate the data
    public void setTime(int hours, int minutes, int seconds) {
        if (hours < 0 || hours >= 24 || minutes < 0 || minutes >= 60 || seconds < 0 || seconds >= 60) {
            throw new IllegalArgumentException("Invalid time");
        }
        
        timeInSeconds = hours * 3600 + minutes * 60 + seconds;
    }
    
    public void setTime(int timeInSeconds) {
        if (timeInSeconds < 0 || timeInSeconds >= 86400) {
            throw new IllegalArgumentException("Invalid time");
        }
        
        this.timeInSeconds = timeInSeconds;
    }
    
    // Get Methods
    // get hour value
    public int getHour() {
        return timeInSeconds / 3600;
    }
    
    // get minute value
    public int getMinute() {
        return (timeInSeconds % 3600) / 60;
    }
    
    // get second value
    public int getSecond() {
        return timeInSeconds % 60;
    }
    
    // convert to String in universal-time format (HH:MM:SS)
    public String toUniversalString() {
        return String.format("%02d:%02d:%02d", getHour(), getMinute(), getSecond());
    }
    
    // convert to String in standard-time format (H:MM:SS AM or PM)
    public String toString() {
        int hour = getHour() % 12 == 0 ? 12 : getHour() % 12;
        String amPm = getHour() < 12 ? "AM" : "PM";
        return String.format("%d:%02d:%02d %s", hour, getMinute(), getSecond(), amPm);
    }
}
