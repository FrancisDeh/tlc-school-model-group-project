package com.company.project;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RegisterTest {

    @Test
    public void getRegisterReturnsAListOfStudents(){
        List<Nameable> studentList = new ArrayList<>();
        studentList.add(new Student("Mike"));
        studentList.add(new Student("Raphael"));
        studentList.add(new Student("Bridget"));
        studentList.add(new Student("Francis"));

        Register register = new Register(studentList);

        assertEquals(studentList.size(), register.getRegister().size(), "Get register does not return a list of students");
    }

}