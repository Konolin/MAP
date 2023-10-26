package org.example;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            StudentParser parser = new StudentParser();
            List<Student> students = parser.parse("data.json");
            System.out.println(students);
        } catch (IOException ex) {
            System.out.println("error...");
        }
    }
}