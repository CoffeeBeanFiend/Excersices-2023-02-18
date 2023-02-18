package dev.prtjohanson.exc_2023_02_18.exc9;

import dev.prtjohanson.exc_2023_02_18.exc7.Employee;
import dev.prtjohanson.exc_2023_02_18.exc7.EmployeeListBuilder;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        final ArrayList<Employee> employees = new EmployeeListBuilder(10).getEmployees();
        Optional<Employee> maxSalaryEmployee = employees.stream().max(Comparator.comparing(Employee::getSalary));

        if (maxSalaryEmployee.isPresent()) {
            System.out.println(maxSalaryEmployee);
        } else {
            System.out.println("No salary employee with max salary found!");
        }
    }
}
