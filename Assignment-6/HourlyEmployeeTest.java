public class HourlyEmployeeTest {
    public static void main(String[] args) {
        HourlyEmployee employee = new HourlyEmployee("John", "Doe", "123-45-6789", 15.0, 40.0);
        
        // Output employee information
        System.out.println("Employee information:");
        System.out.println(employee);
        
        // Change hours worked and wage
        employee.setHours(50);
        employee.setWage(20);
        
        // Output updated employee information
        System.out.println("\nUpdated employee information:");
        System.out.println(employee);
        
        // Calculate and output earnings
        System.out.printf("\nEarned $%.2f this week.%n", employee.earnings());
    }
}
