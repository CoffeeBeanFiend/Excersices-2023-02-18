package dev.prtjohanson.exc_2023_02_18.exc7;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.stream.IntStream;

public class EmployeeListBuilder {
    final private int numberOfEmployeesToGenerate;
    final private ArrayList<Employee> employees;

    final private String[] names = {
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

    public EmployeeListBuilder(int numberOfEmployeesToGenerate) {
        this.numberOfEmployeesToGenerate = numberOfEmployeesToGenerate;
        this.employees = new ArrayList(numberOfEmployeesToGenerate);

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
    }

    public ArrayList<Employee> getEmployees() {
        return this.employees;
    }
}
