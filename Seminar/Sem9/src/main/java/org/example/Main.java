package org.example;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6);

        int sumOfOddNumbers = sumOfOddNumbers(numbers);
        System.out.println("Sum of all odd numbers: " + sumOfOddNumbers);

        long productPowerNumbers = productPowerNumbers(numbers);
        System.out.println("Product of the power of numbers: " + productPowerNumbers);

        List<Integer> perfectNumbers = List.of(6, 28, 496, 8128, 33550336);
        int maxPerfectNumber = maxPerfectNumbers(perfectNumbers);
        System.out.println("Max perfect number: " + maxPerfectNumber);

        Student bob = new Student("Bob", "UBB");
        Student dob = new Student("Dob", "UBB");
        Student zob = new Student("Zob", "UTCN");
        Student cob = new Student("Cob", "UBB");

        List<Pair<Student, Integer>> studentGrades = List.of(
                new Pair<>(bob, 10),
                new Pair<>(dob, 6),
                new Pair<>(zob, 10),
                new Pair<>(cob, 8));
        List<Student> studentsWithMaxGrade = studentMaxGrade(studentGrades);
        System.out.println("Students with max grade: " + studentsWithMaxGrade);

        List<Student> studentList = List.of(bob, dob, zob, cob);
        Map<String, Long> studentsByUni = countStudentsByUni(studentList);
        System.out.println("Students by university: " + studentsByUni);

        bob = new Student("Bob", "UBB", List.of(
                new Pair<>("Math", 10),
                new Pair<>("Chemistry", 8)));
        dob = new Student("Dob", "UBB", List.of(
                new Pair<>("Math", 4),
                new Pair<>("Physics", 9)));
        zob = new Student("Zob", "UTCN", List.of(
                new Pair<>("Math", 10),
                new Pair<>("Physics", 6),
                new Pair<>("Chemistry", 4)));
        cob = new Student("Cob", "UBB", List.of(
                new Pair<>("Physics", 9),
                new Pair<>("Chemistry", 6)));

        studentList = List.of(bob, dob, zob, cob);
        Map<String, Double> averageGradeByCourse = averageGradeByCourse(studentList);
        System.out.println("Average grade by course: " + averageGradeByCourse);
    }

    public static int sumOfOddNumbers(List<Integer> list) {
        return list
                .stream()
                .filter(i -> i % 2 != 0)
                .mapToInt(Integer::intValue)  // method 1
//                .mapToInt(n -> Integer.valueOf(n))  // method 2
                .sum();
    }

    public static long productPowerNumbers(List<Integer> numbers) {
        return numbers
                .stream()
                .map(n -> n * n)
                .reduce(1, (a, b) -> a * b);
    }

    public static int maxPerfectNumbers(List<Integer> numbers) {
        return numbers
                .stream()
//                .filter(Main::isPerfectNumber)  // method 1
                .filter(num -> (
                        num == IntStream.rangeClosed(1, num / 2)
                                .filter(div -> num % div == 0)
                                .sum()))  // method 2
                .max(Integer::compareTo)
                .orElse(-1);
    }

    public static boolean isPerfectNumber(int number) {
        int sum = 0;
        for (int i = 1; i <= number / 2; ++i) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum == number;
    }

    public static List<Student> studentMaxGrade(List<Pair<Student, Integer>> studentGrades) {
        return studentGrades
                .stream()
                .filter(studentGrade ->
                        studentGrade.getSecond().equals(studentGrades
                                .stream()
                                .map(Pair::getSecond)
                                .max(Integer::compareTo)
                                .orElse(-1)))
                .map(Pair::getFirst)
                .toList();
    }

    public static Map<String, Long> countStudentsByUni(List<Student> studentsList) {
        return studentsList
                .stream()
                .collect(Collectors.groupingBy(Student::getUniversity, Collectors.counting()));
    }

    public static Map<String, Double> averageGradeByCourse(List<Student> studentsList) {
        return studentsList
                .stream()
                .flatMap(student -> student.getCourse().stream())
                .collect(Collectors.groupingBy(Pair::getFirst, Collectors.averagingDouble(Pair::getSecond)));
    }
}