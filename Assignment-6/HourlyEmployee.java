// HourlyEmployee.java
// HourlyEmployee class derived from Employee

public class HourlyEmployee extends Employee {
    private double wage; // wage per hour
    private double hours; // hours worked for the week

    // constructor
    public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber, double wage, double hours) {
        super(firstName, lastName, socialSecurityNumber);

        // validate wage
        if (wage < 0.0) {
            throw new IllegalArgumentException("Hourly wage must be >= 0.0");
        }

        // validate hours
        if (hours < 0.0 || hours > 168.0) {
            throw new IllegalArgumentException("Hours worked must be between 0.0 and 168.0");
        }

        this.wage = wage;
        this.hours = hours;
    }

    // set wage
    public void setWage(double wage) {
        if (wage < 0.0) {
            throw new IllegalArgumentException("Hourly wage must be >= 0.0");
        }

        this.wage = wage;
    }

    // return wage
    public double getWage() {
        return wage;
    }

    // set hours worked
    public void setHours(double hours) {
        if (hours < 0.0 || hours > 168.0) {
            throw new IllegalArgumentException("Hours worked must be between 0.0 and 168.0");
        }

        this.hours = hours;
    }

    // return hours worked
    public double getHours() {
        return hours;
    }

    // calculate earnings; override abstract method earnings in Employee
    @Override
    public double earnings() {
        if (hours <= 40) { // no overtime
            return wage * hours;
        } else { // overtime is paid at time-and-a-half
            return wage * 40 + (wage * 1.5 * (hours - 40));
        }
    }

    // return String representation of HourlyEmployee object
    @Override
    public String toString() {
        return String.format("hourly employee: %s%n%s: $%,.2f; %s: %,.2f hours",
                super.toString(), "hourly wage", getWage(), "hours worked", getHours());
    }
}
