package org.example;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            JsonStudentParser parser = JsonStudentParser.getInstance();
            List<Student> students = parser.parse("data.json");
            System.out.println(students);

            System.out.println(Statistics.studentByUni(students, "UBB"));
        } catch (IOException ex) {
            System.out.println("error...");
        }
    }
}