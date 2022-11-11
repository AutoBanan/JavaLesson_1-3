package com.company;

import java.util.Scanner;

public class Lesson1_Conditions {
    // Создать программу, вычисляющую длину и площадь окружности. Радиус вводит пользователь
    public static void workWithCircles() {
        System.out.println("Welcome to 'Work with circle application'!");
        System.out.println("Please, insert the radius");
        Scanner in = new Scanner(System.in);
        int radius = in.nextInt();

        final double pi = 3.14159;
        double square = pi * radius * radius;
        double length = 2 * pi * radius;

        System.out.println("Circle square is " + square + ".\nCircle length is " + length + ".");
    }

    // Создать программу, выводящую на экран ближайшее к 10 из двух чисел, записанных в переменные m и n.
    // Например, среди чисел 8,5 и 11,45 ближайшее к десяти 11,45.
    public static void getNearestNumber() {
        int number = 10;
        double firstNumber = 8.5;
        double secondNumber = 11.45;

        double firstDiff = firstNumber - number;
        firstDiff = firstDiff < 0 ? -firstDiff : firstDiff;

        double secondDiff = secondNumber - number;
        secondDiff = secondDiff < 0 ? -secondDiff : secondDiff;

        if (firstDiff < secondDiff)
            System.out.println(firstNumber);
        else
            System.out.println(secondNumber);
    }

    // Создать программу для конвертации валюты в гривну
    public static void workWithDollarsEuroPounds() {
        System.out.println("Select currency: 1 - dollars, 2 - euro, 3 - pounds");
        Scanner in = new Scanner(System.in);
        int currencyType = in.nextInt();
        System.out.println(("Enter sum to transform"));
        double sum = in.nextDouble();
        switch (currencyType) {
            case 1:
                System.out.println("Your sum is " + sum * 26.3 + " gryvna");
                break;
            case 2:
                System.out.println("Your sum is " + sum * 32.5 + " gryvna");
                break;
            case 3:
                System.out.println("Your sum is " + sum * 36.6 + " gryvna");
                break;
            default:
                System.out.println("You enter wrong currency type!");
        }
    }
}
