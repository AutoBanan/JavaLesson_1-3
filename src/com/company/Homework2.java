package com.company;

public class Homework2 {
    public static void reverceArray(){
        int[] numbers = {23, 11, 6, 8};
        int i=(numbers.length)-1;
//        System.out.println(i);
        while(i>=0)
        {
            System.out.print(numbers[i]+" ");
            i-=1;
        }
    }
}
