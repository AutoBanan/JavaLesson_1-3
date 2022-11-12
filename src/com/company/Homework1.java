package com.company;

import java.util.Scanner;

public class Homework1 {
    public static void pairNumber(){
        System.out.println("Введите число");
        Scanner in = new Scanner(System.in);
        int numb = in.nextInt();
        if ( numb % 2 == 0){
            System.out.println("Число парное");
        }
        else {
            System.out.println("Число непарное");
        }
    }

    public static void sumNumbers(){
        int number=1984;
        System.out.println("количество символов в числе");
        String strNumb=Integer.toString(number);
        System.out.println(strNumb.length());

        int sum=0;
        int i=0;
        while(i<strNumb.length()){
            int currentNumb=Integer.parseInt(String.valueOf(strNumb.charAt(i)));
            sum=sum+currentNumb;
            i++;
        }
        System.out.println("Final sum "+sum);
    }

    // 3.	Известно, что 1 дюйм равен 2,54 см. Напишите программу, переводящую сантиметры в дюймы и наоборот. Диалог с пользователем организовать через консоль.
    public static void changeLengthValues() {
        System.out.println("enter value: 1 - cm, 2 - dm");
        Scanner in = new Scanner(System.in);
        int lenType = in.nextInt();
        System.out.println(("Enter ltngth to transform"));
        double sum = in.nextDouble();
        switch (lenType) {
            case 1:
                System.out.println("Your sum is cm " +sum+ " to " + sum * 0.393701 + " dm");
                break;
            case 2:
                System.out.println("Your sum is dm "+sum+ " to " + sum * 2.54 + " cm");
                break;
            default:
                System.out.println("You enter wrong length type!");
        }
    }
}
