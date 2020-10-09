package com.company.project;

import java.util.ArrayList;
import java.util.List;

public class BagOfStudents {
    private List<Student> studentList = new ArrayList<>();

    //add, remove, clear
    public void add(Student student) {
        this.studentList.add(student);
    }

    public void remove(Student student) {
        this.studentList.remove(student);
    }

    public void clear() {
        this.studentList.clear();
    }
}
