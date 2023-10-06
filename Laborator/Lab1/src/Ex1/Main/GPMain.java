package Ex1.Main;

import java.util.Arrays;

public class GPMain {
    public static void main(String[] args) {
        GradeProcessor gradeProcessor = new GradeProcessor();

        int[] grades = new int[] { 10, 20, 30, 39, 47, 48, 60 };

        System.out.println(Arrays.toString(gradeProcessor.insufficientGrades(grades)));
    }
}
