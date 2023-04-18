//Exercise 8.7
public class Time2Test {
    public static void main(String[] args) {
      Time2 time = new Time2(11, 59, 30);
      System.out.println(time.toUniversalString()); // output: 11:59:30
      time.tick();
      System.out.println(time.toUniversalString()); // output: 11:59:31
      time.incrementMinute();
      System.out.println(time.toUniversalString()); // output: 12:00:31
      time.incrementHour();
      System.out.println(time.toUniversalString()); // output: 13:00:31
      time.incrementHour(); // incrementing into the next day
      System.out.println(time.toUniversalString()); // output: 00:00:31
    }
  }