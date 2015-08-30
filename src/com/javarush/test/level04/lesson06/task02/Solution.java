package com.javarush.test.level04.lesson06.task02;

/* Максимум четырех чисел
Ввести с клавиатуры четыре числа, и вывести максимальное из них.
*/

import java.io.*;
import java.util.Scanner;

public class Solution
{
    public static void main(String[] args) throws Exception
    {

        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();

        if ((a > b) && (a > c) && (a > d))
        {
            System.out.println(a);
        }
        if ((b > a) && (b > c) && (b > d))
        {
            System.out.println(b);
        }
        if ((c > a) && (c > b) && (c > d))

        {
            System.out.println(c);
        }
        if ((d > a) && (d > b) && (d > c))
        {
            System.out.println(d);
        }


    }
}
