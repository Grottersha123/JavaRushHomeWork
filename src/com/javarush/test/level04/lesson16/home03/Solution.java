package com.javarush.test.level04.lesson16.home03;

/* Посчитать сумму чисел
Вводить с клавиатуры числа и считать их сумму. Если пользователь ввел -1, вывести на экран сумму и завершить программу.  -1 должно учитываться в сумме.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        BufferedReader red = new BufferedReader(new InputStreamReader(System.in));
        int count = -1;
        int a = Integer.parseInt(red.readLine());
        while (a != -1){
            count += a;
            a = Integer.parseInt(red.readLine());

        }
        System.out.println(count);
    }
}
