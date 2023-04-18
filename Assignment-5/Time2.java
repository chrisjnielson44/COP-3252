//Exercise 8.7
public class Time2 {
    private int hour; // 0 - 23
    private int minute; // 0 - 59
    private int second; // 0 - 59
  
    // constructors and other methods omitted for brevity
  
    // increment the time by one second
    public void tick() {
      if (second < 59) {
        second++;
      } else {
        second = 0;
        if (minute < 59) {
          minute++;
        } else {
          minute = 0;
          if (hour < 23) {
            hour++;
          } else {
            hour = 0;
          }
        }
      }
    }
  
    // increment the minute by one
    public void incrementMinute() {
      if (minute < 59) {
        minute++;
      } else {
        minute = 0;
        if (hour < 23) {
          hour++;
        } else {
          hour = 0;
        }
      }
    }
  
    // increment the hour by one
    public void incrementHour() {
      if (hour < 23) {
        hour++;
      } else {
        hour = 0;
      }
    }
  }