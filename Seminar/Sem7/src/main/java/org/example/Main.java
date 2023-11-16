package org.example;

import org.example.ex1.Calculator;
import org.example.ex1.Employee;
import org.example.ex2.Statistics;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        ex1();
        ex2();
    }

    public static void ex1() {
        List<Employee> employeeList = List.of(
                new Employee("Bob", 100),
                new Employee("Dob", 50),
                new Employee("Zob", 20));

        try {
            Calculator.employeeStatistics(employeeList);
        } catch (InterruptedException e) {
            System.out.println("Nuh uh");
        }
    }

    public static void ex2() {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 1, 42, 14, 41, 4, 5, 52, 199, 9);
        try {
            System.out.println("Sum: " + Statistics.computeSum(numbers));
            System.out.println("Max: " + Statistics.computeMax(numbers));
        } catch (InterruptedException e) {
            System.out.println("Nuh uh");
        }
    }
}