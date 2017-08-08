package com.javarush.task.task29.task2909.human;

/**
 * Created by Asus on 013 13.07.17.
 */
public class UniversityPerson extends Human {

    private University university;


//    public UniversityPerson(String name, int age) {
//        super(name, age);
//    }

    public UniversityPerson(String name, int age) {
        super(name, age);

    }

    public University getUniversity() {
        return university;
    }

    public void setUniversity(University university) {
        this.university = university;
    }

}
