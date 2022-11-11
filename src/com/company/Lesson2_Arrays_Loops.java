package com.company;

import java.util.Random;
import java.util.Scanner;

public class Lesson2_Arrays_Loops {

    // Инициализировать двумерный массив и вывести на экран
    public void createArrayOfArrays() {
        Random random = new Random();

        int[][] numbers = new int[10][5];

        // Инициализируем массив случайными числами от 0 до 9
        for(int i = 0; i < numbers.length; i++) {
            numbers[i] = new int[numbers[i].length];
            for (int j = 0; j < numbers[i].length; j++) {
                numbers[i][j] = random.nextInt(10);
            }
        }

        // Выводим созданный массив на экран
        for(int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Написать метод, который выводит минимальное (и максимальное - сделать самим по аналогии) число в массиве
    public void getMaxAndMinFromArray() {
        Random random = new Random();

        int[] numbers = new int[10];

        // Создаем массив случайных чисел от 0 до 99
        for(int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100);
            System.out.print(numbers[i] + " ");
        }
        System.out.println(); // просто перенос строки

        // Назначим минимальным число первый элемент массива
        int min = numbers[0];

        // Теперь проверим остальные числа массива. Если какое-то число в массиве меньше текущего минимального,
        // то присваиваем его значение минимальному
        for(int i = 0; i < numbers.length; i++) {
            if(numbers[i] < min)
                min = numbers[i];
        }

        // Выводим минимально число на экран
        System.out.println("Минимальное число в массиве: " + min);

        for (int arr : numbers)
            System.out.print(arr + " ");
    }


    // Написать простой калькулятор. Описано только сложение. Дописать остальные самим
    public void calculator() {
        Scanner scanner = new Scanner(System.in);
        double result;
        char wantToContinue;

        do {
            System.out.println("Enter number 1: ");
            double number1 = scanner.nextDouble();

            System.out.println("Enter number 2: ");
            double number2 = scanner.nextDouble();

            System.out.println("Select action: 1 - summarize, 2 - subtract, 3 - divide, 4 - multiply");
            int sign = scanner.nextInt();

            switch (sign) {
                case 1:
                    result = number1 + number2;
                    System.out.println(number1 + " + " + number2 + " = " + result);
                    break;
                default:
                    System.out.println("You selected wrong sign!");
            }

            System.out.println("Do you want to continue? y - Yes, n - No");
            wantToContinue = scanner.next().charAt(0);
        }
        while (wantToContinue == 'y' || wantToContinue == 'Y');

        System.out.println("Thank you for coming!");
    }


    // Работа с исключениями
    public void exceptionsCatching() {
        String text = "bb";

        try {
            int number = Integer.parseInt(text);
            System.out.println("Number is " + number);
        }
        catch (NumberFormatException ex) {
            System.out.println("Cannot parse text to int!");
            System.out.println(ex.toString());
        }
        finally {
            System.out.println("End of the programm");
        }
    }
}
