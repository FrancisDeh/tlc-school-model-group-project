package com.company.project;

import java.util.ArrayList;
import java.util.List;

public class BagOfLectures {

    private List<Lecture> lectureList = new ArrayList<>();

    //add, remove, clear
    public void add(Lecture lecture) {
        this.lectureList.add(lecture);
    }

    public void remove(Lecture lecture) {
        this.lectureList.remove(lecture);
    }

    public void clear() {
        this.lectureList.clear();
    }
}
