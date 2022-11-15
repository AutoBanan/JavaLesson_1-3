package com.company;

import java.security.Principal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

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
//    10.	Организовать беспрерывный ввод чисел с клавиатуры, пока пользователь не введет 0.
//    После ввода нуля, показать на экран количество чисел, которые были введены, их общую сумму и
//    среднее арифметическое. //    Подсказка: необходимо объявить переменную-счетчик, которая будет считать количество
//    введенных чисел, и переменную, которая будет накапливать общую сумму чисел.
    public static void findAverage() {
        System.out.println("\n\n10. Организовать беспрерывный ввод чисел с клавиатуры, пока пользователь не\n" +
                " введет 0. После ввода нуля, показать на экран количество чисел, которые были введены, \n" +
                "их общую сумму и среднее арифметическое. Подсказка: необходимо объявить переменную-счетчик,\n" +
                " которая будет считать количество введенных чисел, и переменную,\n" +
                " которая будет накапливать общую сумму чисел.");
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
//    11.	Создать депозитный калькулятор. В него ввести сумму вклада и процент по депозиту. Какой будет сумма вклада через N лет.
    public static void depositeCalc(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the deposite amount");
        double amount= scanner.nextDouble();
        System.out.println("Enter percent");
        float percent=scanner.nextFloat()/100;
        System.out.println("Enter years");
        int years= scanner.nextInt();
        double depositAmount=0;
        System.out.println("Select 1 - without capitalisation, 2 - With capitalisation");
        int option=scanner.nextInt();
        if(option==1){
            depositAmount=amount+((amount*percent)*years);
            System.out.printf("Your deposit +%.2f", depositAmount);
        } else if(option==2)
        {

            for (int i=0;i<years; i++){
                amount=amount+(amount*percent);

            }
            System.out.printf("\n Your deposit +%.2f", amount);
        } else {
            System.out.println("Error- incorrect value");
        }

    }

//    12.	Имеется кусок ткани длиной M метров. От него последовательно отрезают куски равной длины.
//    Все данные по использованию ткани заносятся в компьютер. Компьютер должен выдать сообщение о том,
//    что материала не хватает, если будет затребован кусок ткани больше длины, чем имеется.

    public static void closeRulon(){
        System.out.println("\n12.Имеется кусок ткани длиной M метров. " +
                "От него последовательно отрезают куски равной длины.\n" +
                "Все данные по использованию ткани заносятся в компьютер. Компьютер должен выдать сообщение о том, \n" +
                "что материала не хватает, если будет затребован кусок ткани больше длины, чем имеется.");
    }
//
//    13.	Нарисовать треугольник из символов с числом рядов, определяемым пользователем (ввод с консоли).
    public static void triangle(){
        System.out.println("\n13.Нарисовать треугольник из символов с числом рядов, определяемым" +
                " пользователем (ввод с консоли).");
        System.out.println("Enter count of triangle rows");
        Scanner scanner=new Scanner(System.in);
        int iArrVol=scanner.nextInt();
        int jArrVol=(iArrVol*2);
        int countOfTriangle=0;
//        int cou=0;
//        String[] triangle=new String[iArrVol][jArrVol];
        for (int i=0; i<iArrVol; i++){
            for(int j=1; j<=jArrVol-1; j++){
                if(i==0 && j==(jArrVol/2)){

                    System.out.print("^");

                } else if (j>=(jArrVol-countOfTriangle)/2 && j<=countOfTriangle+1+((jArrVol-countOfTriangle)/2) && i!=0)
                {
//                    System.out.print(countOfTriangle+((jArrVol-countOfTriangle)/2)+" "+j+" ");
                    System.out.print("^");
//                    cou+=1;
                }
                else {
                    System.out.print(" ");
                    }

                }
            if(i==0){
                countOfTriangle=1;
            }
            else{
                countOfTriangle+=2;
            }
//            System.out.print(" "+countOfTriangle+" "+cou+" " +((jArrVol-countOfTriangle)/2) +
//                    " "+(countOfTriangle+1+((jArrVol-countOfTriangle)/2)));
//            cou=0;
            System.out.println();



        }

    }
}
