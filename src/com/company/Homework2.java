package com.company;

import java.util.Scanner;

public class Homework2 {

    //    1.	Написать программу, которая выводит содержимое массива наоборот. Пример: массив 23 11 6 8 превращается в 8 6 11 23
    public static void reverceArray(){
        int[] numbers = {23, 11, 6, 8};
        int i=(numbers.length)-1;
//        System.out.println(i);
        while(i>=0)
        {
            System.out.print(numbers[i]+" \n");
            i-=1;
        }
    }

//    2.	Написать программу, которая выводит сумму всех целых нечетных чисел в диапазоне, указанном пользователем
    public static void naturalSum(){
        System.out.println("Enter first number");
        Scanner in = new Scanner(System.in);
        int numbFirst = in.nextInt();
        System.out.println("Enter second number");
        int numbSecond = in.nextInt();
        System.out.println(numbFirst+" "+numbSecond);
        int summ=0;
        for( int i=numbFirst; i<=numbSecond; i++){
            if(i%2!=0){
                summ = summ + i;
            }
            else
            {
                summ=summ;
            }
        }
        System.out.println(summ);
    }

//    3.	Дано натурально число n. Написать программу, которая вычисляет факториал неотрицательных чисел n (т.е. число целое и больше n). Формула вычисления факториала приведена ниже:
//    n! = 1*2*3*...*n, (формула вычисления факториала числа n)
//            0! = 1. (факториал 0 равен 1).
    public static void factorial(){
        System.out.println("Enter the number");
        Scanner in = new Scanner(System.in);
        int numb = in.nextInt();
        double fact=1;
        if (numb<0){
            System.out.println("Entered wrong number");
        }
        else if (numb==0){
            System.out.println("Factorial of 0 = 0");
        }
        else if (numb>0){
            int i=1;
            while(i<=numb){
                fact=fact*i;
                i+=1;
            }
            System.out.printf("Factorial of %d = %.0f \n",numb, fact);
        }
    }
//    4.	Пользователь вводит с клавиатуры число. Программа должна показать, сколько в числе цифр. Число вводится целиком в одну переменную. Например, пользователь ввел число 12345. Программа вывела на экран сообщение о том, что в числе 5 цифр.
    public static void numCount(){
        System.out.println("Enter the number");
        Scanner in=new Scanner(System.in);
        int number=in.nextInt();
        String strNumb=Integer.toString(number);
        System.out.println("количество символов в числе "+strNumb.length());

        int sum=0;
        int i=0;
        while(i<strNumb.length()){
            int currentNumb=Integer.parseInt(String.valueOf(strNumb.charAt(i)));
            sum=sum+currentNumb;
            i++;
        }
        System.out.println("Final sum "+sum+"\n");
    }

//    5.	Пользователь вводит с клавиатуры число. Необходимо перевернуть его и вывести на экран.
//    Например, пользователь ввел 12345, программа должна вывести на экран 54321
    public static void reverseNumber(){
        System.out.println("Enter number to reverse");
        Scanner in=new Scanner(System.in);
        int num=in.nextInt();
        String strNum=Integer.toString(num);
        String reverseNum="";
        int i=strNum.length()-1;
        while(i>=0){
            reverseNum+=strNum.charAt(i);
            i-=1;
        }
        int newNum=Integer.parseInt(reverseNum);
        System.out.println(newNum);
    }
}


