package dev.prtjohanson.exc_2023_02_18.exc9;

import dev.prtjohanson.exc_2023_02_18.exc7.Employee;
import dev.prtjohanson.exc_2023_02_18.exc7.EmployeeListBuilder;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        final ArrayList<Employee> employees = new EmployeeListBuilder(10).getEmployees();
    }
}
