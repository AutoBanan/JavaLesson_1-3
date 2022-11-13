package com.company;

import java.util.Random;
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
//    4.	Напишите программу, реализующую популярную телевизионную игру “Кто хочет стать миллионером”.
    public static void victorine(){
        System.out.println("Enter 1 if you want to start");
        Scanner in = new Scanner(System.in);
        int num=in.nextInt();
        int summ=0;
        int i=1;
        int unfiredsum=0;
        if (num==1){
            switch (i){
                case 1:
                    System.out. println("Who is the first president of Ukraine?\n 1. Mikhailo Grushevskiy\n 2.Leonid Kuchma\n 3.Leonid Kravshuuk\n 4.Viktor Ushenko");
                    int ans1= in.nextInt();
                    if (ans1==1){
                        summ=summ+100;
                        System.out.println("Correct answer you won "+summ);
                    }
                    else{
                        System.out.println("Game over");
                        break;
                    }
                case 2:
                    System.out. println("President of Russia\n 1.Baiden \n 2.Putin\n 3.Zelenski\n 4. Viktor Ushenko");
                    ans1= in.nextInt();
                    if (ans1==2){
                        summ=summ+100;
                        System.out.println("Correct answer you won "+summ);
                    }
                    else{
                        System.out.println("Game over");
                        break;
                    }
                case 3:
                    System.out. println("Biggest mount\n 1.Elbrus \n 2.Goverla\n 3.Everest\n 4. K2");
                    ans1= in.nextInt();
                    if (ans1==3){
                        summ=summ+100;
                        unfiredsum=unfiredsum+summ;
                        System.out.println("Correct answer you won "+summ);
                    }
                    else{
                        System.out.println("Game over");
                        break;
                    }
                case 4:
                    System.out. println("Biggest Sea \n 1.Atlantic \n 2.North\n 3.Silent\n 4. indian");
                    ans1= in.nextInt();
                    if (ans1==3){
                        summ=summ+100;
                        System.out.println("Correct answer you won "+summ);
                    }
                    else{
                        System.out.println("Game over but you won " + unfiredsum);
                        break;
                    }
            }
        }
        else{
            System.out.println("You wont start");
        }

    }
//    5.	Соревнование по фигурному катанию. 8 судей судят. И выставляют оценки от 1 до 10 рандомно.
//    Подсчитать среднюю оценку с округлением до 2-х знаков после запятой.
//    Стандартной библиотекой (Math) не пользоваться
    public static void guryAvg(){
        Random rand = new Random();
        int grade; // rand.nextInt(10) +1;
        double gradeSumm= 0.0D;
        for (int i=0;i<8; i++){
            grade = rand.nextInt(10) +1;
            gradeSumm=gradeSumm+grade;
        }
//        DecimalFormat df = new DecimalFormat("###.##");
        double avgGrade=gradeSumm/8;
//        System.out.printf("%.2f", divide);
        System.out.printf("\n %.2f", avgGrade);
//        System.out.printf("\n %.3f", avgGrade);
//        System.out.println("\n "+(df.format(avgGrade)));
    }
}
