package com.javarush.test.level04.lesson06.task01;

/* Минимум двух чисел
Ввести с клавиатуры два числа, и вывести на экран минимальное из них.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //Напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String sNumberOne = reader.readLine();
        int nNumberOne = Integer.parseInt(sNumberOne);

        String sNumberTwo = reader.readLine();
        int nNumberTwo = Integer.parseInt(sNumberTwo);

        if (nNumberOne < nNumberTwo)
            System.out.print(nNumberOne);
        else
            System.out.print(nNumberTwo);
    }
}
