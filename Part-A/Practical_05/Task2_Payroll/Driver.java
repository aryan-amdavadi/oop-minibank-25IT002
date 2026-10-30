public class Driver {
    public static void main(String[] args) {
        Employee[] staff = {
            new FullTime("Aryan", "E101", 75000),
            new PartTime("Karan", "E102", 40, 500),
            new Intern("Rohan", "E103", 15000)
        };
        double totalPayroll = 0;
        for (Employee e : staff) {
            double sal = e.monthlySalary();
            totalPayroll += sal;
            String note = (e instanceof Intern) ? " [Academic Internship]" : "";
            System.out.printf("%s | Salary: Rs. %.2f%s\n", e.getDetails(), sal, note);
        }
        System.out.printf("Total Monthly Payroll: Rs. %.2f\n", totalPayroll);
    }
}
