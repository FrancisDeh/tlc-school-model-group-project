package com.company.project;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Student student = new Student();
        student.setGrade(45.0);
        student.setGrade(35.0);


        Student student2 = new Student();
        student2.setGrade(70.0);
        student2.setGrade(85.0);

        List<Student> students = List.of(student, student2);
        System.out.println(students.stream().map(Student::getGrades)
                .flatMap(Collection::stream)
//                .mapToDouble(Double::doubleValue)
                .filter(d -> d > 60)
                .collect(Collectors.toList())
        );


    }
}
