package com.javarush.test.level07.lesson04.task03;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 2 массива
1. Создать массив на 10 строк.
2. Создать массив на 10 чисел.
3. Ввести с клавиатуры 10 строк, заполнить ими массив строк.
4. В каждую ячейку массива чисел записать длину строки из массива строк, индекс/номер ячейки которой совпадает с текущим индексом из массива чисел. Вывести содержимое массива чисел на экран, каждое значение выводить с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //Напишите тут ваш
        BufferedReader red = new BufferedReader(new InputStreamReader(System.in));
        String[] lol = new String[10];
        int[] dig = new int[10];
        for(int i = 0; i < lol.length;i++){
            lol[i]= red.readLine();
        }
        for(int i = 0; i < dig.length; i++){
            dig[i] = lol[i].length();
        }
        for(int i = 0; i < dig.length; i++){
            System.out.println(dig[i]);
        }

    }
}
