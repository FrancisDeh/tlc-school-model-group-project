package com.company.project;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.DoubleStream;

public class Student implements Nameable, HasLevel {

    //list of grades
    private List<Double> gradesList = new ArrayList<>();
    private String name;
    private Level level;

    public Student() {
    }

    public Student(String name) {
        this.name = name;
    }

    public Student(Level level) {
        this.level = level;
    }

    public Student(String name, Level level) {
        this.level = level;
        this.name = name;
    }

    public void setGrade(Double grade) {
        this.gradesList.add(grade);
    }
    public void setName(String name){
        this.name = name;
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

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public Level getLevel() {
        return this.level;
    }

    public DoubleStream grades() {
        return this.gradesList
                .stream()
                .mapToDouble(d -> d);
    }
}
