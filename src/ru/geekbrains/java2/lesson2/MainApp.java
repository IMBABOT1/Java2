package ru.geekbrains.java2.lesson2;

import java.util.Arrays;

public class MainApp {

    private static void convertString(String[][] arr) {
        if (arr.length != 4 || arr[0].length != 4) {
            throw new MyArraySizeException(arr);
        }
    }

    public static void main(String[] args) {
        String[][] arr = new String[4][3];

        System.out.println(arr.length);

        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr[i].length ; j++) {
                arr[i][j] = "1";
            }
        }

        convertString(arr);

        System.out.println(Arrays.deepToString(arr));
    }
}

