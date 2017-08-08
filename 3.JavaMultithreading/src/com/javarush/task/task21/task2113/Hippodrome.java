package com.javarush.task.task21.task2113;

import java.util.ArrayList;
import java.util.List;


public class Hippodrome {
    private List<Horse> horses = new ArrayList<Horse>();
    public static Hippodrome game;

    public List<Horse> getHorses() {
        return horses;
    }

    public Hippodrome(List<Horse> horses) {
        this.horses = horses;
    }

    public Hippodrome() {
    }

    public void move() {
        for (Horse current : horses) current.move();
    }

    public void print() {
        for(Horse current : horses) current.print();
        for (int i = 0; i <10 ; i++) {
            System.out.println();

        }
    }


    public void run() throws InterruptedException {
        for (int i = 1; i <= 100; i++) {
            move();
            print();
            Thread.sleep(200);
        }
    }
    public Horse getWinner()
    {
        Horse winner = horses.get(0);
        double dis = horses.get(0).getDistance();
        for (Horse horse : horses)
            if (horse.getDistance() > dis)
            {
                dis = horse.getDistance();
                winner = horse;
            }
        return winner;
    }

    public void printWinner()
    {
        System.out.println("Winner is " + getWinner().getName() + "!");
    }

    public static void main(String[] args) throws InterruptedException {
        game = new Hippodrome(/*new ArrayList<Horse>()*/);

        Horse horse1 = new Horse("Kolya", 3.0, 0);
        Horse horse2 = new Horse("Vasya", 3.0, 0);
        Horse horse3 = new Horse("Petya", 3.0, 0);

        game.getHorses().add(horse1);
        game.getHorses().add(horse2);
        game.getHorses().add(horse3);
        game.run();
        game.printWinner();

    }
}
