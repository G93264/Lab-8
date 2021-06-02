package com.company;
import java.util.ArrayList;

public class Student extends Person {
    private ArrayList<Course> courses;
    private String major;


            public Student(String name, int id, String major) {
                super(name, id);
                this.major = major;
            }

public void addCourse (Course course){
    courses.add(course);
}

            public ArrayList <Course> getCourses() {
                return courses;
            }

            public String getMajor() {
                return major;
            }


}
