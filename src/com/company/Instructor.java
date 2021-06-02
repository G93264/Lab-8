package com.company;

public class Instructor extends Person {
    private Course course;

    public Instructor(String name, int id) {
        super(name, id);
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public Course getCourse() {
        return course;
    }
}
