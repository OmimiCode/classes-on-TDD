package com.cohortFive.tdd.array;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentGradeTest {
    StudentGrade studentGrade;
    @BeforeEach
    void setUp() {
        studentGrade = new StudentGrade();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testArrayCanCalculateSum(){
        int[] studentScoresArray = {1,4,2,1,2,9};
        int result = studentGrade.calculateSum(studentScoresArray);
        assertEquals(19,result );
    }
@Test
    void testStudentGradeAverageCanBeCalculated(){
        int[] studentScoresArray = {3,6,1,3};
        double result = studentGrade.calculateScoreAverage(studentScoresArray);
        assertEquals(3.25, result);
    }
}