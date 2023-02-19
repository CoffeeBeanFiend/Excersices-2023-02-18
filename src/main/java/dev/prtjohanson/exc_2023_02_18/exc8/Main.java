package dev.prtjohanson.exc_2023_02_18.exc8;

import dev.prtjohanson.exc_2023_02_18.exc7.Employee;
import dev.prtjohanson.exc_2023_02_18.exc7.EmployeeListBuilder;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        final ArrayList<Employee> employees = new EmployeeListBuilder(10).getEmployees();

        Employee sortedEmployees[] = employees.stream().sorted(
                Comparator.comparing(Employee::getName)
        ).toArray(Employee[]::new);

        for (Employee e: sortedEmployees) {
            System.out.println(e);
        }
    }
}
