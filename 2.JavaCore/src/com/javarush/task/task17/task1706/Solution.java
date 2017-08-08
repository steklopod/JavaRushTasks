package com.javarush.task.task17.task1706;

/* 
Синхронизированный президент
*/

public class Solution {
    public static class OurPresident {

        private static OurPresident president;

        private OurPresident() {
        }

        public static OurPresident getOurPresident() {
            synchronized (OurPresident.class){
                return president;
            }
        }
    }
}