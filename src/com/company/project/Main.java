package com.company.project;

import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Student student = new Student();
        student.setGrade(45.0);
        student.setGrade(35.0);

        //[45.0, 35.0]
        List<Double> grades = student.getGrades();

        for (Double grade : grades) {
            System.out.println(grade);
        }

        System.out.println("Average " + student.getAverageGrade());
    }
}
