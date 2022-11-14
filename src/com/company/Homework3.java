package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Homework3 {
//    7.	Найти среднее арифметическое элементов массива.
    public static void avgArr(){
        Random random = new Random();
        System.out.println("7. Найти среднее арифметическое элементов массива.");
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
//    8.	Найти в массиве число, которое повторяется наибольшее количество раз.
    public static void maxRepeated(){
        Random random = new Random();
        System.out.println("\n8. Найти в массиве число, которое повторяется наибольшее количество раз.");
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
        int maxNumber=-1;
        int maxNumberSum=0;
        String severalNumbers="";
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
                if(maxNumberSum<countNumber && (maxNumber!=currentNumber || maxNumber==-1)){
                System.out.println(currentNumber+" "+countNumber);
                maxNumberSum=countNumber;
                maxNumber=currentNumber;
                severalNumbers=""+maxNumber;
                }
                else if (maxNumberSum==countNumber && maxNumber!=currentNumber) {
                    System.out.println(currentNumber+" "+countNumber);
                    maxNumberSum=countNumber;
                    maxNumber=currentNumber;
                    severalNumbers=severalNumbers+", "+maxNumber;

                } else {
                    System.out.println(currentNumber+" "+countNumber);
                }
            }
            else if (i==numbers.length-1 && numbers[i]!=currentNumber) {
                countNumber=1;
                currentNumber=numbers[i];
                if(maxNumberSum<countNumber && (maxNumber!=currentNumber || maxNumber==-1)){
                    System.out.println(currentNumber+" "+countNumber);
                    maxNumberSum=countNumber;
                    maxNumber=currentNumber;
                    severalNumbers=""+maxNumber;
                }
                else if (maxNumberSum==countNumber && maxNumber!=currentNumber) {
                    System.out.println(currentNumber+" "+countNumber);
                    maxNumberSum=countNumber;
                    maxNumber=currentNumber;
                    severalNumbers=severalNumbers+", "+maxNumber;

                }
                else {
                    System.out.println(currentNumber+" "+countNumber);
                }
            }
            else if(currentNumber!=numbers[numbers.length-1]){
                System.out.println(currentNumber+" "+countNumber);
                if(maxNumberSum<countNumber && (maxNumber!=currentNumber || maxNumber==-1)){
                    maxNumberSum=countNumber;
                    maxNumber=currentNumber;
                    severalNumbers=""+maxNumber;
                    currentNumber=numbers[i];
                    countNumber=1;
                }
                else if (maxNumberSum==countNumber && maxNumber!=currentNumber) {

                    maxNumberSum=countNumber;
                    maxNumber=currentNumber;
                    severalNumbers=severalNumbers+", "+maxNumber;
                    currentNumber=numbers[i];
                    countNumber=1;
                }
                 else {
                    currentNumber=numbers[i];
                    countNumber=1;
                }
            }
        }

        System.out.println("\n Max repeated number is "+severalNumbers+" = "+maxNumberSum); // просто перенос строки
    }
//9.	Создать второй массив из четных элементов первого массива.
    public static void countedArr(){
        System.out.println("9. Создать второй массив из четных элементов первого массива.");
        int[] numbers=new int[20];
        ArrayList<Integer> num = new ArrayList();
//        int[] num=new int[];
        Random random=new Random();
        for(int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(10);
            System.out.print(numbers[i] + " ");
        }
        for(int i = 0; i < numbers.length; i++) {
            if(numbers[i]%2==0){
                num.add(numbers[i]);
            }
            else{
                continue;
            }
        }
        System.out.println();
        for(int i = 0; i < num.size(); i++) {
        System.out.print(num.get(i)+" ");
        }
    }
}
