package com.javarush.task.task37.task3702;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Solution {
    public static void main(String[] args) throws SQLException {
               AbstractFactory factory = FactoryProducer.getFactory(FactoryProducer.HumanFactoryType.FEMALE);
        useFactory(factory);

        factory = FactoryProducer.getFactory(FactoryProducer.HumanFactoryType.MALE);
        useFactory(factory);
    }

    public static void useFactory(AbstractFactory factory) {
        System.out.println(factory.getPerson(99));
        System.out.println(factory.getPerson(4));
        System.out.println(factory.getPerson(15));
    }

}
