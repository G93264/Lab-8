package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here



    University u1 = new University("Ryerson");

    Student Sam = new Student("Samuel", 111, "Artificial Intelligence");
    Student tom = new Student("Tom", 111, "Artificial Intelligence");
    Student jo = new Student("Joanne", 111, "Artificial Intelligence");
    Student jan = new Student("Jane", 111, "Artificial Intelligence");
    Student feb = new Student("Josh", 111, "Artificial Intelligence");

    Instructor aj = new Instructor("Anand", 555);

    u1.addPerson(Sam);
    u1.addPerson(tom);
    u1.addPerson(jo);
    u1.addPerson(jan);
    u1.addPerson(feb);
    u1.addPerson(aj);

        for (Person p: u1.getPeople())
            System.out.println(p.getId() + " " + p.getName());
        }
    }

