package com.company.project;

import java.util.ArrayList;
import java.util.List;

public class Student {

    //list of grades
    private List<Double> gradesList = new ArrayList<>();

    public void setGrade(Double grade) {
        this.gradesList.add(grade);
    }

    public List<Double> getGrades() {
        return this.gradesList;
    }

    public Double getAverageGrade() {
        Double total = 0.0;
        for (Double grade : this.gradesList) {
           // total = total + grade;
            total += grade;
        }

        return (total / this.gradesList.size());
    }

}
