package com.company.project;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NaughtyStudentTest {

    @Test
    public void naughtyStudentIsAKindOfStudent(){
        Student naughtyStudent = new NaughtyStudent();
        assertTrue(naughtyStudent instanceof Student,"naughtyStudent is not a kind of Student");

    }
    @Test
    public void naughtyStudentAverageGradeIsHigher(){
        Student student3 = new NaughtyStudent();
        student3.setGrade(70.0);
        student3.setGrade(85.0);
        assertEquals(85.25,student3.getAverageGrade(),"naughty student average grade is not 10 percent higher!");
    }
    @Test
    public void naughtyStudentsScoresHigher(){
        Student naughtyStudent = new NaughtyStudent();
        naughtyStudent.setGrade(70.0);
        naughtyStudent.setGrade(85.0);

        Student student = new Student();
        student.setGrade(70.0);
        student.setGrade(85.0);

        Lecture lecture = new Lecture();
        lecture.enter(student);
        lecture.enter(naughtyStudent);


        assertEquals(naughtyStudent.getAverageGrade(), lecture.getHighestAverageGrade(), "naughty student did not score higher than other students");
    }
}

