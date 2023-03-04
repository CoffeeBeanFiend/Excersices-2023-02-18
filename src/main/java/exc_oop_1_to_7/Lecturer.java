package exc_oop_1_to_7;

public class Lecturer extends Person{
    private String specialization;
    private double salary;

    public Lecturer(String name, String address, String specialization, double salary) {
        super(name, address);
        this.specialization = specialization;
        this.salary = salary;
    }

    public String getSpecialization() {
        return specialization;
    }

    public Lecturer setSpecialization(String specialization) {
        this.specialization = specialization;
        return this;
    }

    public double getSalary() {
        return salary;
    }

    public Lecturer setSalary(double salary) {
        this.salary = salary;
        return this;
    }

    @Override
    public String toString() {
        return "Lecturer{" +
                "specialization='" + specialization + '\'' +
                ", salary=" + salary +
                '}';
    }
}
