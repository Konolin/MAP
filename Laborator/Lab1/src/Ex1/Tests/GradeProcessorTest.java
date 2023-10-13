package Ex1.Tests;

import Ex1.Main.GradeProcessor;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GradeProcessorTest {

    public static final String SHOULD_BE_EQUAL = "Should be equal";
    public static final String SHOULD_THROW_EXCEPTION = "Should throw exception";
    private GradeProcessor gradeProcessor;

    @BeforeEach
    public void setUp() {
        gradeProcessor = new GradeProcessor();
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
        int[] grades = new int[]{10, 20};
        int[] expected = new int[]{10, 20, 30};
        int newGrade = 30;
        int[] result = gradeProcessor.addToArray(grades, newGrade);

        assertArrayEquals(expected, result, SHOULD_BE_EQUAL);
        assertThrows(IllegalArgumentException.class, () -> gradeProcessor.addToArray(grades, -10), SHOULD_THROW_EXCEPTION);
    }

    @Test
    public void insufficientGradesTest() {
        int[] result = gradeProcessor.insufficientGrades(new int[]{10, 31, 53, 12, 60});
        assertArrayEquals(new int[]{10, 31, 12}, result, SHOULD_BE_EQUAL);
        assertThrows(IllegalArgumentException.class, () -> gradeProcessor.insufficientGrades(new int[]{31, 53, 12, 1010}), SHOULD_THROW_EXCEPTION);
    }

    @Test
    public void sufficientGradesTest() {
        int[] result = gradeProcessor.sufficientGrades(new int[]{10, 31, 53, 12, 60});
        assertArrayEquals(new int[]{55, 60}, result, SHOULD_BE_EQUAL);
        assertThrows(IllegalArgumentException.class, () -> gradeProcessor.sufficientGrades(new int[]{31, -53, 12, 1010}), SHOULD_THROW_EXCEPTION);
    }

    @Test
    public void averageTest() {
        double result = gradeProcessor.average(new int[]{50, 80, 50});
        assertEquals(60, result, SHOULD_BE_EQUAL);
        assertThrows(IllegalArgumentException.class, () -> gradeProcessor.average(new int[]{31, -53, 12, 1010}), SHOULD_THROW_EXCEPTION);
        assertThrows(IllegalArgumentException.class, () -> gradeProcessor.average(new int[0]), SHOULD_THROW_EXCEPTION);
    }

    @Test
    public void roundAllGradesTest() {
        int[] result = gradeProcessor.roundAllGrades(new int[]{10, 31, 53, 72, 60});
        assertArrayEquals(new int[]{10, 31, 55, 72, 60}, result, SHOULD_BE_EQUAL);
        assertThrows(IllegalArgumentException.class, () -> gradeProcessor.roundAllGrades(new int[]{31, -53, 12, 1010}), SHOULD_THROW_EXCEPTION);
    }

    @Test
    public void maxGradeTest() {
        int result = gradeProcessor.maxGrade(new int[]{10, 31, 53, 72, 60});
        assertEquals(72, result, SHOULD_BE_EQUAL);
        assertThrows(IllegalArgumentException.class, () -> gradeProcessor.maxGrade(new int[]{31, -53, 12, 1010}), SHOULD_THROW_EXCEPTION);
        assertThrows(IllegalArgumentException.class, () -> gradeProcessor.maxGrade(new int[0]), SHOULD_THROW_EXCEPTION);
    }
}
