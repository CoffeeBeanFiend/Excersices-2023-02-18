package dev.prtjohanson.exc_2023_02_18.exc7;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Optional;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList();

        BigDecimal salaryThreshold = new BigDecimal(30000);

        IntStream.range(0, 4).forEach(
                (int i) -> employees.add(
                        new Employee(
                                "" + i ,
                                "Employee " + i,
                                new BigDecimal(100 + i * 10000)
                        )
                )
        );

        Optional<Employee> firstFoundEmployee =
                employees.stream()
                .filter(
                        (employee -> employee != null && employee.getSalary().compareTo(salaryThreshold) >= 0)
                ).findFirst();

        if (firstFoundEmployee.isEmpty()) {
            throw new RuntimeException("No non-null employee found with salary >= " + salaryThreshold);
        } else {
            System.out.println("Found Employee: " + firstFoundEmployee.get());
        }
    }
}
