package com.company;

public class Course {
    private String name;
    private int number;

//    CONSTRUCTOR
    public Course(String name, int number) {
        this.name = name;
        this.number = number;
    }

//    GETTER
    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }
}
