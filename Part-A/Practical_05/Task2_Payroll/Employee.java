public abstract class Employee {
    protected String name, id;

    public Employee(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public abstract double monthlySalary();

    public String getDetails() {
        return id + " - " + name;
    }
}

class FullTime extends Employee {
    private double fixedSalary;

    public FullTime(String n, String id, double s) {
        super(n, id);
        this.fixedSalary = s;
    }

    public double monthlySalary() {
        return fixedSalary;
    }
}

class PartTime extends Employee {
    private double hours, rate;

    public PartTime(String n, String id, double h, double r) {
        super(n, id);
        this.hours = h;
        this.rate = r;
    }

    public double monthlySalary() {
        return hours * rate;
    }
}

class Intern extends Employee {
    private double stipend;

    public Intern(String n, String id, double s) {
        super(n, id);
        this.stipend = s;
    }

    public double monthlySalary() {
        return stipend;
    }
}
