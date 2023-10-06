package Ex1.Main;

public class GradeProcessor {
    public int[] insufficientGrades(int[] grades) {
        int[] insufficientGradesArray = new int[0];

        for (int grade : grades) {
            if (round(grade) < 40) {
                insufficientGradesArray = addToArray(insufficientGradesArray, round(grade));
            }
        }

        return insufficientGradesArray;
    }

    public int[] sufficientGrades(int[] grades) {
        int[] sufficientGradesArray = new int[0];

        for (int grade : grades) {
            if (round(grade) >= 40) {
                sufficientGradesArray = addToArray(sufficientGradesArray, round(grade));
            }
        }

        return sufficientGradesArray;
    }

    public double average(int[] grades) {
        int sum = 0;

        for (int grade : grades) {
            sum += grade;
        }

        return (double) sum / grades.length;
    }

    public int[] roundAllGrades(int[] grades) {
        int[] roundedGrades = new int[grades.length];

        for (int i = 0; i < grades.length; i++) {
            roundedGrades[i] = round(grades[i]);
        }

        return roundedGrades;
    }

    public int round(int grade) {
        if (grade < 38) {
            return grade;
        }
        if (grade % 5 > 2) {
            return grade - grade % 5 + 5;
        }
        return grade;
    }

    public int[] addToArray(int[] oldArray, int newValue) {
        int[] newArray = new int[oldArray.length + 1];

        for (int i = 0; i < oldArray.length; i++) {
            newArray[i] = oldArray[i];
        }
        newArray[oldArray.length] = newValue;

        return newArray;
    }

    public int maxGrade(int[] grades) {
        int max = 0;

        for (int grade : roundAllGrades(grades)) {
            if (grade > max) {
                max = grade;
            }
        }

        return max;
    }
}
