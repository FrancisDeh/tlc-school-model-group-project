package com.company.project;

import javax.lang.model.type.NullType;
import java.util.*;
import java.util.stream.Collectors;

public class Register {
    private List<? extends Student> nameables = new ArrayList<>();

    public Register(List<? extends Student> students){
        this.nameables = students;
    }

    public List<String> getRegister(){
//        List<String> names = new ArrayList<>();
//        for (Nameable nameable: this.nameables) {
//            names.add(nameable.getName());
//        }
//        return names;

       return this.nameables.stream()
               .map(Student::getName)
               .collect(Collectors.toList());
    }

    public Map<Level, List<Student>> getRegisterByLevel(Level level) {
        List<Student> students = new ArrayList<>();

//        for (Student student: this.nameables) {
//            if(student.getLevel().equals(level)) {
//                students.add(student);
//            }
//        }
        students = this.nameables.stream()
                .filter(student -> student.getLevel().equals(level))
                .collect(Collectors.toList());

        //{
        // ONE: [Student1, Student2..]
        // }
        Map<Level, List<Student>> studentMap = new HashMap<>();
        studentMap.put(level, students);
        return studentMap;
    }

    public String printReport() {
        Map<Level, List<Student>> levelOneStudentMap = getRegisterByLevel(Level.ONE);
        List<Student> levelOneStudents = levelOneStudentMap.get(Level.ONE);

        Map<Level, List<Student>> levelTwoStudentMap = getRegisterByLevel(Level.TWO);
        List<Student> levelTwoStudents = levelOneStudentMap.get(Level.TWO);

        //Level One
        // -- John
        // -- Jane
        //Level Two
        // -- xyz
        StringBuilder builder = new StringBuilder();
        builder.append("Level One\n");
//        for (Student student: levelOneStudents) {
//            builder.append(student.getName().concat("\n"));
//        }
        levelOneStudents.forEach(student -> builder.append(student.getName().concat("\n")));
        builder.append("\nLevel Two\n");
//        for (Student student: levelTwoStudents) {
//            builder.append(student.getName().concat("\n"));
//        }
        levelTwoStudents.forEach(student -> builder.append(student.getName().concat("\n")));
        return builder.toString();
    }

    public List<? extends Student> sort(Comparator<Student> comparator) {
        Collections.sort(this.nameables, comparator);
        return this.nameables;
    }

    public Student getStudentByName(String name) throws StudentNotFoundException  {
//        Student student = new Student();
//        boolean studentIsFound = false;

//        for (Student s: this.nameables) {
//            if(s.getName().equals(name)) {
//                student = s;
//                studentIsFound = true;
//                break;
//            }
//        }

       List<Student> foundStudents = this.nameables.stream().
               filter(s -> s.getName().equals(name))
               .collect(Collectors.toList());

        if(foundStudents.isEmpty()) {
            throw new StudentNotFoundException("Student ".concat(name).concat(" not found"));
        }

        return foundStudents.get(0);
    }
}
