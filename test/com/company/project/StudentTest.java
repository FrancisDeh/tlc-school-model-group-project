package com.company.project;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    public void studentAverageGradeCalculationIsValid() {
        Student student = new Student();
        student.setGrade(45.0);
        student.setGrade(35.0);

        assertEquals(40.0, student.getAverageGrade(),"Grade average is not accurate");
    }
}