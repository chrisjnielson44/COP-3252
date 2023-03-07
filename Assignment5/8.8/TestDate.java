//Exercise 8.8
public class TestDate {
    public static void main(String[] args) {
        Date date1 = new Date(2, 28, 2023);
        for (int i = 1; i <= 5; i++) {
            date1.nextDay();
            System.out.println(date1);
        }

        Date date2 = new Date(12, 31, 2023);
        for (int i = 1; i <= 5; i++) {
            date2.nextDay();
            System.out.println(date2);
        }
    }
}
