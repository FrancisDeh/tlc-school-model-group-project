package com.company.project;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LectureTest {
    @Test
    public void lectureHighestAverageGradeIsValid() {
        Student student = new Student();
        student.setGrade(45.0);
        student.setGrade(35.0);


        Student student2 = new Student();
        student2.setGrade(70.0);
        student2.setGrade(85.0);

        Lecture lecture = new Lecture();
        lecture.enter(student);
        lecture.enter(student2);

        assertEquals(77.5,lecture.getHighestAverageGrade(), "highest average grade is not valid");
    }


}