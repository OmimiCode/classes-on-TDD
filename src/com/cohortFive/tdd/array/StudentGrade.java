package com.cohortFive.tdd.array;

public class StudentGrade {
    public int calculateSum(int[] studentScoresArray) {
        int sum = 0;
        for (int elementPosition = 0; elementPosition < studentScoresArray.length; elementPosition++) {
            sum += studentScoresArray[elementPosition];
        }


        return sum;
    }

    public double calculateScoreAverage(int[] studentScoresArray) {
        return calculateSum(studentScoresArray) / (studentScoresArray.length * 1.0);
    }
}