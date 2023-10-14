package Ex1.Tests;

import Ex1.Main.GradeProcessor;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GradeProcessorTest {

    public static final String SHOULD_BE_EQUAL = "Should be equal";
    public static final String SHOULD_THROW_EXCEPTION = "Should throw exception";
    private GradeProcessor gradeProcessor;
    private int[] wrongGrades;
    private int[] grades;

    @BeforeEach
    public void setUp() {
        gradeProcessor = new GradeProcessor();
        wrongGrades = new int[]{31, 53, 12, 1010};
        grades = new int[]{10, 31, 53, 12, 60};
    }

    @Test
    public void roundTest() {
        assertEquals(13, gradeProcessor.round(13), SHOULD_BE_EQUAL);
        assertEquals(41, gradeProcessor.round(41), SHOULD_BE_EQUAL);
        assertEquals(75, gradeProcessor.round(73), SHOULD_BE_EQUAL);
        assertThrows(IllegalArgumentException.class, () -> gradeProcessor.round(-13), SHOULD_THROW_EXCEPTION);
        assertThrows(IllegalArgumentException.class, () -> gradeProcessor.round(202), SHOULD_THROW_EXCEPTION);
    }

    @Test
    public void addToArrayTest() {
        int[] expected = new int[]{10, 31, 53, 12, 60, 30};
        int newGrade = 30;
        int[] result = gradeProcessor.addToArray(grades, newGrade);

        assertArrayEquals(expected, result, SHOULD_BE_EQUAL);
        assertThrows(IllegalArgumentException.class, () -> gradeProcessor.addToArray(grades, -10), SHOULD_THROW_EXCEPTION);
    }

    @Test
    public void insufficientGradesTest() {
        int[] result = gradeProcessor.insufficientGrades(grades);
        int[] expected = new int[]{10, 31, 12};
        assertArrayEquals(expected, result, SHOULD_BE_EQUAL);
        assertThrows(IllegalArgumentException.class, () -> gradeProcessor.insufficientGrades(wrongGrades), SHOULD_THROW_EXCEPTION);
    }

    @Test
    public void sufficientGradesTest() {
        int[] result = gradeProcessor.sufficientGrades(grades);
        int[] expected = new int[]{55, 60};
        assertArrayEquals(expected, result, SHOULD_BE_EQUAL);
        assertThrows(IllegalArgumentException.class, () -> gradeProcessor.sufficientGrades(wrongGrades), SHOULD_THROW_EXCEPTION);
    }

    @Test
    public void averageTest() {
        double result = gradeProcessor.average(new int[]{50, 80, 50});
        assertEquals(60, result, SHOULD_BE_EQUAL);
        assertThrows(IllegalArgumentException.class, () -> gradeProcessor.average(wrongGrades), SHOULD_THROW_EXCEPTION);
        assertThrows(IllegalArgumentException.class, () -> gradeProcessor.average(new int[0]), SHOULD_THROW_EXCEPTION);
    }

    @Test
    public void roundAllGradesTest() {
        int[] result = gradeProcessor.roundAllGrades(grades);
        int[] expected = new int[]{10, 31, 55, 12, 60};
        assertArrayEquals(expected, result, SHOULD_BE_EQUAL);
        assertThrows(IllegalArgumentException.class, () -> gradeProcessor.roundAllGrades(wrongGrades), SHOULD_THROW_EXCEPTION);
    }

    @Test
    public void maxGradeTest() {
        int result = gradeProcessor.maxGrade(grades);
        assertEquals(60, result, SHOULD_BE_EQUAL);
        assertThrows(IllegalArgumentException.class, () -> gradeProcessor.maxGrade(wrongGrades), SHOULD_THROW_EXCEPTION);
        assertThrows(IllegalArgumentException.class, () -> gradeProcessor.maxGrade(new int[0]), SHOULD_THROW_EXCEPTION);
    }
}
