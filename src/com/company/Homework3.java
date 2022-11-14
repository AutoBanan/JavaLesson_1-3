package com.company;

import java.util.Random;

public class Homework3 {
//    7.	Найти среднее арифметическое элементов массива.
    public static void avgArr(){
        int[] numbers = new int[20];

        // Создаем массив случайных чисел от 0 до 99
        for(int i = 0; i < numbers.length; i++) {
            Random random;
            numbers[i] = random.nextInt(10);
            System.out.print(numbers[i] + " ");
        }
    }
}
