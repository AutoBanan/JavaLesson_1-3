package com.company;

import java.util.Random;
import java.util.Scanner;

public class Lesson3_Arrays_Loops {

    // Найти среднее арифметическое элементов в массиве
    public void getAverageFromArray() {
        Random random = new Random();
        int[] numbers = new int[10];
        int sum = 0;

        // Создаем массив случайных чисел от 0 до 99
        for(int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100);
            // Накапливаем элементы массива в сумме
            sum += numbers[i];
            System.out.print(numbers[i] + " ");
        }
        System.out.println(); // просто перенос строки

        System.out.println("Average is " + (double)sum/numbers.length);
    }


    // Организовать беспрерывный ввод чисел с клавиатуры, пока пользователь не введёт 0.
    // После ввода нуля, показать на экран количество чисел, которые были введены,
    // их общую сумму и среднее арифметическое
    public void findAverage() {
        Scanner scanner = new Scanner(System.in);
        int number;
        int sum = 0;
        int counter = 0;
        System.out.println("Enter numbers. After each number press \"Enter\".");
        while(true) {
            number = scanner.nextInt();
            if(number == 0)
                break;
            sum += number;
            counter++;
        }
        System.out.println("Average is " + (double)sum/counter + ". Sum = " + sum + ", counter = " + counter);
    }
}
