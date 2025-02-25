package ru.caranga;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // целые числа
        byte varByte = 1; // -128 .. 127
        short varShort = 1; // -32768 .. 32767
        int varInt = 1; //
        long varLong = 1L; //
        // числа с плавающей точкой
        float varFloat = 0.0f;
        double varDouble = 0.0d; // must have
        // логический
        boolean varBool = true;
        // символьный
        char varChar = 'a';

        String varStr = "abc"; //abc - строковый литерал

        //ОПЕРАТОРЫ
        //1. Присвоения
        int varInt0 = 0;

        //2. Математические + - * / % ++ --

        //3. Сравнения >, <, >=, <=, !=, ==

        //4. Логические &&, ||, !

        //5. Массивы
        int[] intArr = new int[] {1, 42, -100};
        int[] intArr0 = new int[5];
        intArr0[0] = 1;
        intArr0[1] = 42;
        intArr0[2] = -100;
        intArr0[3] = -101;
        intArr0[4] = 102;
        int[][] twoDimensionalArray = new int[][] {intArr, intArr0};

        for (int i = 0; i < intArr0.length; i++) {
            if (intArr0[i] == -100) {
                System.out.println("Found: " + intArr0[i]);
                break; //можно выйти из цикла через return
            }
            System.out.println("Next iteration");
        }

        for (int element : intArr0) {
            if (element == -101) {
                System.out.println("Found: " + element);
                break;
            }
        }

        int indexForLoop = 0;
        while (indexForLoop < intArr0.length) {
            indexForLoop++;
        }

        //Коллекции

        List<Integer> intList0 = List.of(1, 42, -100);
        List<Integer> intList1 = new ArrayList<>();
        intList1.add(1);
    }
}