package Ex1.Tests;

import Ex1.Main.GradeProcessor;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GradeProcessorTest {

    public static final String SHOULD_BE_EQUAL = "Should be equal";
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
        assertThrows(RuntimeException.class, () -> gradeProcessor.round(-13));
        assertThrows(RuntimeException.class, () -> gradeProcessor.round(202));
    }

    @Test
    public void addToArrayTest() {
        int[] grades = new int[]{10, 20};
        int newGrade = 30;

        int[] result = gradeProcessor.addToArray(grades, newGrade);

        assertArrayEquals(new int[]{10, 20, 30}, result, SHOULD_BE_EQUAL);
        assertThrows(RuntimeException.class, ()-> gradeProcessor.addToArray(grades, -10));
    }

    @Test
    public void insufficientGradesTest() {
        int[] result = gradeProcessor.insufficientGrades(new int[]{10, 31, 53, 12, 60});
        assertArrayEquals(new int[]{10, 31, 12}, result, SHOULD_BE_EQUAL);
        assertThrows(RuntimeException.class, () -> gradeProcessor.insufficientGrades(new int[] {31, 53, 12, 1010}));
    }

    @Test
    public void sufficientGradesTest() {
        int[] result = gradeProcessor.sufficientGrades(new int[]{10, 31, 53, 12, 60});
        assertArrayEquals(new int[]{55, 60}, result, SHOULD_BE_EQUAL);
        assertThrows(RuntimeException.class, () -> gradeProcessor.sufficientGrades(new int[] {31, -53, 12, 1010}));
    }

    @Test
    public void averageTest() {
        double result = gradeProcessor.average(new int[]{50, 80, 50});
        assertEquals(60, result, SHOULD_BE_EQUAL);
        assertThrows(RuntimeException.class, () -> gradeProcessor.average(new int[] {31, -53, 12, 1010}));
        assertThrows(RuntimeException.class, () -> gradeProcessor.average(new int[0]));
    }

    @Test
    public void roundAllGradesTest() {
        int[] result = gradeProcessor.roundAllGrades(new int[]{10, 31, 53, 72, 60});
        assertArrayEquals(new int[]{10, 31, 55, 72, 60}, result, SHOULD_BE_EQUAL);
        assertThrows(RuntimeException.class, () -> gradeProcessor.roundAllGrades(new int[] {31, -53, 12, 1010}));
    }

    @Test
    public void maxGradeTest() {
        int result = gradeProcessor.maxGrade(new int[]{10, 31, 53, 72, 60});
        assertEquals(72, result, SHOULD_BE_EQUAL);
        assertThrows(RuntimeException.class, () -> gradeProcessor.maxGrade(new int[] {31, -53, 12, 1010}));
        assertThrows(RuntimeException.class, () -> gradeProcessor.maxGrade(new int[0]));
    }
}
