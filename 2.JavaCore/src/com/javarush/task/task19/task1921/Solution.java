package com.javarush.task.task19.task1921;

import java.io.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

/* 
Хуан Хуанович
*/
public class Solution {
    public static final List<Person> PEOPLE = new ArrayList<Person>();

    public static void main(String[] args) throws IOException
    {
        ArrayList<String> fileList = new ArrayList<String>();
        BufferedReader fileReader = new BufferedReader(new FileReader(args[0]));
        while (fileReader.ready())
            fileList.add(fileReader.readLine());
        fileReader.close();


        for (String aFileList : fileList)
        {
            String[] stringArray = aFileList.split(" ");
            String name = new String();
            for (int i = 0; i < stringArray.length-3; i++) {
                if (i == stringArray.length-4)
                    name = name+stringArray[i];
                else
                    name = name+stringArray[i]+" ";
            }
            int year = Integer.parseInt(stringArray[stringArray.length-1]);
            int month = Integer.parseInt(stringArray[stringArray.length-2])-1;
            int day = Integer.parseInt(stringArray[stringArray.length-3]);
            Date birthDay = new GregorianCalendar(year, month, day).getTime();
            PEOPLE.add(new Person(name, birthDay));
        }
    }
}