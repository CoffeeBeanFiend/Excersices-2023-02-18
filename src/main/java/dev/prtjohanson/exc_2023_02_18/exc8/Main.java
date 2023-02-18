package dev.prtjohanson.exc_2023_02_18.exc8;

import dev.prtjohanson.exc_2023_02_18.exc7.Employee;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        final ArrayList<Employee> employees = new ArrayList();

        final String[] names = {
                "Zanzibar",
                "Kalju",
                "Elmar",
                "Heinar",
                "William",
                "Jedediah",
                "Alice",
                "Bob",
                "Mati",
                "Priit",
                "Krõõt",
                "Elo",
                "Viiding",
                "Jakobson",
                "Carl",
                "Carly",
                "Hideki",
                "Tanaka",
                "Maiku-Miira",
                "Lin",
                "Li",
                "Chin",
                "Chan",
                "Wong",
                "Raddish",
                "Joel",
                "Zappa",
                "Briget",
        };

        final int nrOfNames = names.length;

        IntStream.range(0, 10).forEach(
                (int i) -> employees.add(
                        new Employee(
                                "" + i ,
                                names[i % nrOfNames] + " " + names[((i+1)*2) % nrOfNames],
                                new BigDecimal(100 + i * 10000)
                        )
                )
        );

        Object[] sortedEmployees = employees.stream().sorted(
                Comparator.comparing(Employee::getName)
        ).toArray();

        for(Object employee: sortedEmployees) {
            System.out.println(employee);
        }
    }
}
