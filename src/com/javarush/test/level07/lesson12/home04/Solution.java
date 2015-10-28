package com.javarush.test.level07.lesson12.home04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* Вводить с клавиатуры строки, пока пользователь не введёт строку 'end'
Создать список строк.
Ввести строки с клавиатуры и добавить их в список.
Вводить с клавиатуры строки, пока пользователь не введёт строку "end".  "end" не учитывать.
Вывести строки на экран, каждую с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //Напишите тут ваш код
        ArrayList<String> list = new ArrayList<String>();
        int i = 0;

        list.add(reader.readLine());
        while(!list.get(i).equals("end")){
            list.add(reader.readLine());
            i++;
        }
        list.remove(i);
        printList(list);
    }
    public static void printList(List<String> list) {
        //add your code here
        for(String x:list){
            System.out.println(x);
        }
    }
}
