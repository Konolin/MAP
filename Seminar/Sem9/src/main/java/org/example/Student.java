package org.example;

import lombok.Data;

import java.util.List;

@Data
public class Student {
    private String name;
    private String university;
    private List<Pair<String, Integer>> course;

    public Student(String name, String university) {
        this.name = name;
        this.university = university;
    }

    public Student(String name, String university, List<Pair<String, Integer>> course) {
        this.name = name;
        this.university = university;
        this.course = course;
    }
}
