package com.company.project;

import java.util.ArrayList;
import java.util.List;

public class Register {
    private List<Nameable> nameables = new ArrayList<>();

    public Register(List<Nameable> nameables){
        this.nameables = nameables;
    }

    public List<String> getRegister(){
        List<String> names = new ArrayList<>();
        for (Nameable nameable: this.nameables) {
            names.add(nameable.getName());
        }
        return names;
    }
}
