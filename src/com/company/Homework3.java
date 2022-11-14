package com.company;

import java.util.Arrays;
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
        double avgAr=summ/(numbers.length);
        System.out.printf("\n AVG = %.2f", avgAr); // просто перенос строки
    }
    public static void maxRepeated(){
        Random random = new Random();

        int[] numbers = new int[20];

        // Создаем массив случайных чисел от 0 до 99
        for(int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(10);
            System.out.print(numbers[i] + " ");
        }
        System.out.println(); // просто перенос строки

        Arrays.sort(numbers);
        int currentNumber=numbers[0];
        int countNumber=0;
        System.out.println(); // просто перенос строки

        for(int i = 0; i < numbers.length; i++){
            System.out.print(numbers[i] + " ");
        }
        System.out.println("\n"); // просто перенос строки

        for(int i = 0; i < numbers.length; i++) {

            if(numbers[i]==currentNumber && i!=numbers.length-1){
                countNumber+=1;
            }
            else if(i==numbers.length-1 && numbers[i]==currentNumber){
                countNumber+=1;
                System.out.println(currentNumber+" "+countNumber);
            }
            else if (i==numbers.length-1 && numbers[i]!=currentNumber) {
                countNumber=1;
                currentNumber=numbers[i];
                System.out.println(currentNumber+" "+countNumber);
            }
            else if(currentNumber!=numbers[numbers.length-1]){
                System.out.println(currentNumber+" "+countNumber);
                currentNumber=numbers[i];
                countNumber=1;
            }
        }

        System.out.println(); // просто перенос строки
    }
}
