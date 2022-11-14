package com.company;

import java.util.Random;

public class Homework3 {
//    7.	Найти среднее арифметическое элементов массива.
    public static void avgArr(){
        Random random = new Random();

        int[] numbers = new int[20];
        int summ=0;
        // Создаем массив случайных чисел от 0 до 99
        for(int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100);
            summ=summ+numbers[i];
            System.out.print(numbers[i] + " ");
        }
        double avgAr=summ/(numbers.length-1);
        System.out.printf("\n AVG = %.2f", avgAr); // просто перенос строки
    }
}
