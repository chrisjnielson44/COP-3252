//Exercise 8.15
import java.time.LocalDate; // Import the LocalDate class from the java.time package
import java.time.format.DateTimeFormatter; // Import the DateTimeFormatter class from the java.time.format package

public class Date {
    private LocalDate date; // Declare a private instance variable of type LocalDate to store the date

    // Constructor 1: Takes month, day, and year as integers and initializes the date instance variable
    public Date(int month, int day, int year) {
        this.date = LocalDate.of(year, month, day); // Use the of() method of the LocalDate class to create a new LocalDate object
    }

    // Constructor 2: Takes month as a String, day, and year as integers, and initializes the date instance variable
    public Date(String month, int day, int year) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM d, yyyy"); // Create a DateTimeFormatter object to parse the date string
        this.date = LocalDate.parse(month + " " + day + ", " + year, formatter); // Use the parse() method of the LocalDate class to create a new LocalDate object from the date string
    }

    // Constructor 3: Takes dayOfYear and year as integers, and initializes the date instance variable
    public Date(int dayOfYear, int year) {
        this.date = LocalDate.ofYearDay(year, dayOfYear); // Use the ofYearDay() method of the LocalDate class to create a new LocalDate object
    }

    // Method to output the date in the format MM/DD/YYYY
    public void format1() {
        System.out.println(date.format(DateTimeFormatter.ofPattern("MM/dd/yyyy"))); // Use the format() method of the LocalDate class with a DateTimeFormatter object to format the date
    }

    // Method to output the date in the format June 14, 1992
    public void format2() {
        System.out.println(date.format(DateTimeFormatter.ofPattern("MMMM d, yyyy"))); // Use the format() method of the LocalDate class with a DateTimeFormatter object to format the date
    }

    // Method to output the date in the format DDD YYYY
    public void format3() {
        System.out.println(date.format(DateTimeFormatter.ofPattern("DDD yyyy"))); // Use the format() method of the LocalDate class with a DateTimeFormatter object to format the date
    }
}
