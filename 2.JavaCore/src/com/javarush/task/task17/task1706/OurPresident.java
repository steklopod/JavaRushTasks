package com.javarush.task.task17.task1706;

public class OurPresident {
    private static OurPresident president;

    private OurPresident() {
    }
    static {
        OurPresident ourPresident = new OurPresident();
        synchronized (OurPresident.class){
            getOurPresident();
        }
    }
    public static OurPresident getOurPresident() {
        return president;
    }
}
