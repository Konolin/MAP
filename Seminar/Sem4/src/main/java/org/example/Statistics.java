package org.example;

import java.util.ArrayList;
import java.util.List;

public class Statistics {
    public static List<Student> studentByUni(List<Student> students, String uni) {
        List<Student> studentsUni = new ArrayList<>();
        for (Student student : students) {
            if (student.getUni().equals(uni)) {
                studentsUni.add(student);
            }
        }
        return studentsUni;
    }
}
