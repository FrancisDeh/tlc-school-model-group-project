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

    public List<String> getRegisterByLevel(Level level) {
        List<String> names = new ArrayList<>();

        for (Nameable nameable: this.nameables) {

            Student student = (Student) nameable;
            if(student.getLevel().equals(level)) {
                names.add(nameable.getName());
            }
        }
        return names;
    }

    public String printReport() {
        List<String> levelOneStudentNames = getRegisterByLevel(Level.ONE);
        List<String> levelTwoStudentNames = getRegisterByLevel(Level.TWO);

        //Level One
        // -- John
        // -- Jane
        //Level Two
        // -- xyz
        StringBuilder builder = new StringBuilder();
        builder.append("Level One\n");
        for (String name: levelOneStudentNames) {
            builder.append(name.concat("\n"));
        }

        builder.append("\nLevel Two\n");
        for (String name: levelTwoStudentNames) {
            builder.append(name.concat("\n"));
        }

        return builder.toString();
    }
}
