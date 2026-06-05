package org.example;

import lombok.Data;

@Data
public class Student{
    private String name;
    private double marks;
    private String subject;

    Student(String name,double marks, String subject){
        this.name = name;
        this.marks = marks;
        this.subject = subject;
    }
}