package com.javarush.test.level04.lesson06.task03;

/* Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
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
        if ((a > b) && (a > c) && (b > c))
        {
            System.out.println(a + " " + b + " " + c);
        }
        if ((b > c) && (b > a) && (c > a))
        {
            System.out.println(b + " " + c + " " + a);
        }
        if ((c > a) && (c > b) && (a > b))
        {
            System.out.println(c + " " + a + " " + b);
        }
        if ((c > b) && (c > a) && (b > a))
        {
            System.out.println(c + " " + b + " " + a);
        }
        if ((b > a) && (b > c) && (a > c))
        {
            System.out.println(b + " " + a + " " + c);
        }
        if ((a > c) && (a > b) && (c > b))
        {
            System.out.println(a + " " + c + " " + b);
        }
    }
}
