package com.javarush.task.task37.task3702;


import com.javarush.task.task37.task3702.female.FemaleFactory;
import com.javarush.task.task37.task3702.male.MaleFactory;

public class FactoryProducer {
    public static enum HumanFactoryType {MALE, FEMALE}
        public static AbstractFactory getFactory(HumanFactoryType hft){
        if(hft.equals(HumanFactoryType.FEMALE)){
            return new FemaleFactory();
        }
        if(hft.equals(HumanFactoryType.MALE)){
            return new MaleFactory();
        }
        return null;
        }
}
