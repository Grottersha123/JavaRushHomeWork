package com.javarush.test.level05.lesson12.home05;

/* Вводить с клавиатуры числа и считать их сумму
Вводить с клавиатуры числа и считать их сумму, пока пользователь не введёт слово «сумма». Вывести на экран полученную сумму.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //Напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String string="", endString="сумма";
        int summ=0;
        while (!string.equals(endString))
        {
            //System.out.print("Enter a number: ");
            string = reader.readLine();
            if (string.equals(endString))
            {
                System.out.println(summ);
                break;
            }
            //int number = Integer.parseInt(string);
            summ += Integer.parseInt(string);
        }
    }
}


