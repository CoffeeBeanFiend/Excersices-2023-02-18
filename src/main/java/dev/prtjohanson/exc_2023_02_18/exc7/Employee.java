package dev.prtjohanson.exc_2023_02_18.exc7;

import java.math.BigDecimal;

public class Employee {
    private String id;
    private String name;
    private BigDecimal salary;

    public Employee(String id, String name, BigDecimal salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public String getId() {
        return id;
    }

    public Employee setId(String id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Employee setName(String name) {
        this.name = name;
        return this;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public Employee setSalary(BigDecimal salary) {
        this.salary = salary;
        return this;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                "}\n";
    }
}
