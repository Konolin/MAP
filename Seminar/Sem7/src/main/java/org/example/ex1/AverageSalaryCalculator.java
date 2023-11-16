package org.example.ex1;

import java.util.List;

public class AverageSalaryCalculator extends Thread {
    private List<Employee> employeeList;
    private float averageSalary;

    public AverageSalaryCalculator(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    @Override
    public void run() {
        float sum = 0;
        for (Employee employee : this.employeeList) {
            sum += employee.getSalary();
        }
        averageSalary = sum / employeeList.size();
    }

    public float getAverageSalary() {
        return averageSalary;
    }
}
