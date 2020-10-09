package com.company.project;

import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Student student = new Student();
        student.setGrade(45.0);
        student.setGrade(35.0);


        Student student2 = new Student();
        student2.setGrade(70.0);
        student2.setGrade(85.0);

        //[45.0, 35.0]
        List<Double> grades = student.getGrades();
        Collections.sort(grades);
        for (Double grade : grades) {
            System.out.println(grade);
        }

        System.out.println("Average " + student.getAverageGrade());

        Lecture lecture = new Lecture();
        lecture.enter(student);
        lecture.enter(student2);

        System.out.println(lecture.getHighestAverageGrade());

    }
}
