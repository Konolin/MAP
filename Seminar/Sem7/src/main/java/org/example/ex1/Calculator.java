package org.example.ex1;

import java.util.List;

public class Calculator {
    public static void employeeStatistics(List<Employee> employeeList) throws InterruptedException {
        Thread maxSalaryCalculator = new MaxSalaryCalculator(employeeList);
        Thread averageSalaryCalculator = new AverageSalaryCalculator(employeeList);

        maxSalaryCalculator.start();
        averageSalaryCalculator.start();

        maxSalaryCalculator.join();
        averageSalaryCalculator.join();

        System.out.println("Max: " + ((MaxSalaryCalculator) maxSalaryCalculator).getMaxSalary());
        System.out.println("Average: " + ((AverageSalaryCalculator) averageSalaryCalculator).getAverageSalary());
    }
}
