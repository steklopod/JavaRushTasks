package com.javarush.task.task29.task2909.human;

/**
 * Created by Asus on 013 13.07.17.
 */
public class Soldier extends Human {
    public Soldier(String name, int age) {
        super(name, age);
    }
//    public Soldier(boolean isSoldier) {
//        super(isSoldier);
//    }

    public void live() {
        fight();

    }

    public void fight() {
    }
}
