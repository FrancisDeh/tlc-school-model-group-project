package com.company.project;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lecture {
    private List<Student> studentsList = new ArrayList<>();

    public void enter(Student student){
        this.studentsList.add(student);
    }

    public Double getHighestAverageGrade(){
    //[45.0, 12.5, 10.0, 50.5]
    //[10.0, 12.5, 45.0, 50.5]
        List<Double> grades = new ArrayList<>();

        for (Student student:this.studentsList) {
            grades.add(student.getAverageGrade());
        }

        Collections.sort(grades);
       // int size = this.studentsList.size();
       //int lastIndex= this.studentsList.size() - 1;
       //return grades.get(lastIndex);
        return grades.get(this.studentsList.size()-1);
    }
}
