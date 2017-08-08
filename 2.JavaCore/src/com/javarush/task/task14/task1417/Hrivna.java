package com.javarush.task.task14.task1417;



public class Hrivna extends Money {
    String hrivna;

    public Hrivna(double amount) {
        super(amount);
    }


    @Override
    public String getCurrencyName() {
        return "HRN";
    }
}
