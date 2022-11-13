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
        System.out.println("enter second number");
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
        if (numb<0){
            System.out.println("Entered wrong number");
        }
        else if (numb=0){
            System.out.println("Factorial of 0 = 0");
        }
    }
}
