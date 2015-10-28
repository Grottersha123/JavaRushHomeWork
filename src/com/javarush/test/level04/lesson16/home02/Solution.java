package com.javarush.test.level04.lesson16.home02;

/* Среднее такое среднее
Ввести с клавиатуры три числа, вывести на экран среднее из них. Т.е. не самое большое и не самое маленькое.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String a = bufferedReader.readLine();
        String b = bufferedReader.readLine();
        String c = bufferedReader.readLine();
        int a1 = Integer.parseInt(a);
        int a2 = Integer.parseInt(b);
        int a3 = Integer.parseInt(c);
        if (a1>a2 && a2 >a3 || a3>a2 && a2>a1){
            System.out.println(a2);}
        if (a2>a3 && a3>a1 || a1>a3 && a3>a2){
            System.out.println(a3);}
        if (a3>a1 && a1>a2 || a2>a1 && a1>a3){
            System.out.println(a1);}
    }
}
