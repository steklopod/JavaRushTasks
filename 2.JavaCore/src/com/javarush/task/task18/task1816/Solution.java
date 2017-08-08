package com.javarush.task.task18.task1816;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigInteger;

public class Solution {
    public static void main(String[] args) {
        BigInteger integer = BigInteger.ZERO;
        int count = 0;
        try
        {
            BufferedReader fileReader = new BufferedReader(new FileReader(args[0]));
            while (fileReader.ready()) {
                String s = fileReader.readLine().toLowerCase();
                char[] array = s.toCharArray();
                for (int i = 0 ; i < array.length; i++)
                {
                    //if (array[i]==('a'|'b'|'c'|'d'|'e'|'f'|'g'|'h'|'i'|'j'|'k'|'l'|'m'|'n'|'o'|'p'|'q'|'r'|'s'|'t'|'u'|'v'|'w'|'x'|'y'|'z' )) {
                    if (array[i] >= 'a' && array[i]<='z') {
                        integer.add(BigInteger.ONE);
                        count ++;
                    }
                }
            }
            fileReader.close();
            System.out.println(count);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}