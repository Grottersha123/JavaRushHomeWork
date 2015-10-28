package com.javarush.test.level06.lesson08.task04;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Класс ConsoleReader
Сделать класс ConsoleReader, у которого будут 4 статических метода:
String readString() – читает с клавиатуры строку
int readInt() – читает с клавиатуры число
double readDouble() – читает с клавиатуры дробное число
void readLn() – ждет нажатия enter [использовать readString()]
*/

public class ConsoleReader
{

    public static String readString() throws Exception
    {
        BufferedReader red = new BufferedReader(new InputStreamReader(System.in));
      String a = red.readLine();
        return a;
    }

    public static int readInt() throws Exception
    {
        //Напишите тут ваш код
        BufferedReader red = new BufferedReader(new InputStreamReader(System.in));
        int b = Integer.parseInt(red.readLine());
        return b;
    }

    public static double readDouble() throws Exception
    {
        //Напишите тут ваш код
        BufferedReader red = new BufferedReader(new InputStreamReader(System.in));
        double c = Double.parseDouble(red.readLine());
        return c;

    }

    public static void readLn() throws Exception
    {
        //Напишите тут ваш код
        while(("").equals(readString()))
        {
            ;
        }

    }
}
