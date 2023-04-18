public class PayrollSystemTest {
    public static void main(String[] args) {
        // create employees
        Employee[] employees = {
                new SalariedEmployee("John", "Smith", "111-11-1111", new Date(1, 27, 2000), 800.00),
                new HourlyEmployee("Karen", "Price", "222-22-2222", new Date(2, 27, 2000), 16.75, 40),
                new CommissionEmployee("Sue", "Jones", "333-33-3333", new Date(3, 27, 2000), 10000, .06),
                new BasePlusCommissionEmployee("Bob", "Lewis", "444-44-4444", new Date(4, 27, 2000), 5000, .04, 300)
        };

        int currentMonth = 1;
        System.out.printf("Payroll -> Month %d:%n%n", currentMonth);

        // process each employee
        for (Employee employee : employees) {
            System.out.println(employee); // invokes toString

            if (employee instanceof BasePlusCommissionEmployee) {
                // cast to BasePlusCommissionEmployee and update base salary
                BasePlusCommissionEmployee bpce = (BasePlusCommissionEmployee) employee;
                bpce.setBaseSalary(1.10 * bpce.getBaseSalary());
                System.out.printf("new base salary with 10%% increase is: $%,.2f%n", bpce.getBaseSalary());
            }

            if (employee.getBirthDate().getMonth() == currentMonth) {
                // add birthday bonus
                System.out.printf("earned $%,.2f - with a $100.00 bonus. Happy birthday%n%n",
                        employee.earnings() + 100);
            } else {
                System.out.printf("earned $%,.2f%n%n", employee.earnings());
            }
        }

        // print type of each employee
        for (int i = 0; i < employees.length; i++) {
            System.out.printf("Employee %d is a %s%n", i, employees[i].getClass().getSimpleName());
        }
    }
}
