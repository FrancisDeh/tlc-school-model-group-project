package com.company.project;

import java.util.*;
import java.util.stream.Collectors;

public class Register {
    final private List<? extends Student> students;

    public Register(List<? extends Student> students) {
        this.students = students;
    }

    public List<String> getRegister() {
//        List<String> names = new ArrayList<>();
//        for (Nameable nameable: this.nameables) {
//            names.add(nameable.getName());
//        }
//        return names;

        return this.students.stream()
                .map(Student::getName)
                .collect(Collectors.toList());
    }

    public Map<Level, List<Student>> getRegisterByLevel(Level level) {
        List<Student> students;

//        for (Student student: this.nameables) {
//            if(student.getLevel().equals(level)) {
//                students.add(student);
//            }
//        }
        students = this.students.stream()
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
        Collections.sort(this.students, comparator);
        return this.students;
    }

    public Student getStudentByName(String name) throws StudentNotFoundException {
//        Student student = new Student();
//        boolean studentIsFound = false;

//        for (Student s: this.nameables) {
//            if(s.getName().equals(name)) {
//                student = s;
//                studentIsFound = true;
//                break;
//            }
//        }

        List<Student> foundStudents = this.students.stream().
                filter(s -> s.getName().equals(name))
                .collect(Collectors.toList());

        if (foundStudents.isEmpty()) {
            throw new StudentNotFoundException("Student ".concat(name).concat(" not found"));
        }

        return foundStudents.get(0);
    }

    public Optional<? extends Student> studentByName(String name) {
        return this.students.stream().
                filter(s -> s.getName().equals(name))
                .collect(Collectors.toList()).stream().findFirst();
    }

    public List<Student> getStudentsByNames(List<String> names) {
       return this.students.stream().
                filter(s -> names.contains(s.getName()))
                .collect(Collectors.toList());
    }

    public Double highestStudentGrade() {
//        return this.students.stream().map(Student::getGrades)
//                .flatMap(Collection::stream)
//                .max(Comparator.naturalOrder())
//                .orElse(0.0);

        return this.students.stream().map(Student::getGrades)
                .flatMap(Collection::stream)
                .mapToDouble(Double::doubleValue)
                .max()
                .orElse(0.0);
    }

    public Double averageStudentGrades() {
        return this.students.stream().map(Student::getGrades)
                .flatMap(Collection::stream)
                .mapToDouble(Double::doubleValue)
                .summaryStatistics().getAverage();
    }

    public List<Double> gradesAboveSixty() {
        return this.students.stream().map(Student::getGrades)
                .flatMap(Collection::stream)
                .filter(d -> d > 60)
                .collect(Collectors.toList());
    }
}
