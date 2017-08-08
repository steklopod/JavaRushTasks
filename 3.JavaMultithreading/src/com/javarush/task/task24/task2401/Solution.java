package com.javarush.task.task24.task2401;

/* 
Создание своего интерфейса-маркера
*/
public class Solution {

    interface SelfInterfaceMarker{

    }

    interface SelfInterfaceMarkerImpl extends SelfInterfaceMarker{
        public void fuck();
        public void fuckYou();

    }
    class UnsupportedInterfaceMarkerException extends Exception{

    }


    public static void main(String[] args) throws UnsupportedInterfaceMarkerException {
        SelfInterfaceMarkerImpl obj = new SelfInterfaceMarkerImpl() {
            @Override
            public void fuck() {

            }

            @Override
            public void fuckYou() {

            }
        };
//        Util.testClass(obj);
    }

}
