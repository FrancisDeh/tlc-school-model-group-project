package com.company.project;

import java.util.ArrayList;
import java.util.List;

public class Bag<T> {
    private List<T> list = new ArrayList<>();

    //add, remove, clear
    public void add(T t) {
        this.list.add(t);
    }

    public void remove(T t) {
        this.list.remove(t);
    }

    public void clear() {
        this.list.clear();
    }
}
