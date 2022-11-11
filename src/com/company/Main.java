package com.company;

public class Main {

    public static void main(String[] args) {
        Lesson1_Conditions lesson1 = new Lesson1_Conditions();
        lesson1.workWithCircles();
        lesson1.getNearestNumber();
        lesson1.workWithDollarsEuroPounds();

        Lesson2_Arrays_Loops lesson2 = new Lesson2_Arrays_Loops();
        lesson2.createArrayOfArrays();
        lesson2.getMaxAndMinFromArray();
        lesson2.calculator();
        lesson2.exceptionsCatching();

        Lesson3_Arrays_Loops lesson3 = new Lesson3_Arrays_Loops();
        lesson3.getAverageFromArray();
        lesson3.findAverage();
    }
}
