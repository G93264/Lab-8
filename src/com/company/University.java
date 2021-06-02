package com.company;

import java.util.ArrayList;

public class University {
    private ArrayList<Person> people = new ArrayList<>();
    private ArrayList<Course> courses = new ArrayList<>();
    private String name;

    public University(String name) {
        this.name = name;
    }

    public ArrayList<Person> getPeople() {
        return people;
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }

    public String getName() {
        return name;
    }

//    OTHERS

    public void addPerson(Person person){
        people.add(person);
    }

    public void addCourse (Course course){
        courses.add(course);
    }

    public int getNumPeople(){
        return people.size();
    }

    public int getNumCourses(){
        return courses.size();
    }
}
