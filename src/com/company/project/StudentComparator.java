package com.company.project;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getName().compareTo(o2.getName());
    }

    @Override
    public boolean equals(Object obj) {
        return false;
    }
}
