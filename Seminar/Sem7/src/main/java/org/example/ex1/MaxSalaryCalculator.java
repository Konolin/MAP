package org.example.ex1;

import org.example.ex1.Employee;

import java.util.List;

public class MaxSalaryCalculator extends Thread {
    private List<Employee> employeeList;
    private int maxSalary;

    public MaxSalaryCalculator(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    @Override
    public void run() {
        int max = 0;
        for (Employee employee : this.employeeList) {
            if (employee.getSalary() > max) {
                max = employee.getSalary();
            }
        }
        maxSalary = max;
    }

    public int getMaxSalary() {
        return maxSalary;
    }
}
