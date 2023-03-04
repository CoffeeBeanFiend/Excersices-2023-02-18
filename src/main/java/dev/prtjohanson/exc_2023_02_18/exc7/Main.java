package dev.prtjohanson.exc_2023_02_18.exc7;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Optional;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        final ArrayList<Employee> employees = new EmployeeListBuilder(10).getEmployees();

        final BigDecimal salaryThreshold = new BigDecimal(30000);

        System.out.println(employees);

        Optional<Employee> firstFoundEmployee =
                employees.stream()
                .filter(
                        (employee -> employee != null && employee.getSalary().compareTo(salaryThreshold) >= 0)
                ).findFirst();

        if (firstFoundEmployee.isEmpty()) {
            System.out.println("No non-null employee found with salary >= " + salaryThreshold);
        } else {
            System.out.println("Found Employee: " + firstFoundEmployee.get());
        }
    }
}
