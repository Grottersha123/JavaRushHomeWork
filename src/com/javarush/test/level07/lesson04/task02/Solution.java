package com.javarush.test.level07.lesson04.task02;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Массив из строчек в обратном порядке
1. Создать массив на 10 строчек.
2. Ввести с клавиатуры 8 строчек и сохранить их в массив.
3. Вывести содержимое всего массива (10 элементов) на экран в обратном порядке. Каждый элемент - с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //Напишите тут ваш код
        BufferedReader red = new BufferedReader(new InputStreamReader(System.in));
        String[] lol = new String[10];
        for(int i = 0; i < lol.length-2;i++){
            lol[i]= red.readLine();
        }
        for(int i = lol.length; i != 0; i--){
            System.out.println(lol[i-1]);
        }


    }
}