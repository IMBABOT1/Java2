package ru.geekbrains.java2.lesson2;

import java.util.Arrays;

public class MainApp {

    private static int convertString(String[][] arr) throws MyArrayDataException, MyArraySizeException{
        int result = 0;
        if (arr.length != 4) {
            throw new MyArraySizeException(arr);
        }
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr[i].length ; j++) {
                if (arr[i].length != 4){
                    throw new MyArraySizeException(arr);
                }
            }
        }

        for (int i = 0; i <  arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (!arr[i][j].matches("[0-9]+")){
                    throw new MyArrayDataException("[" + String.valueOf(i) + "]" + "[" +  String.valueOf(j) + "]");
                }else {
                    result += Integer.parseInt(arr[i][j]);
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String[][] arr = new String[4][4];
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr[i].length ; j++) {
                arr[i][j] = "1";
            }
        }


        try {
            System.out.println(convertString(arr));
        }catch (MyArrayDataException e){
            e.printStackTrace();
        }catch (MyArraySizeException e){
            e.printStackTrace();
        }



        System.out.println(Arrays.deepToString(arr));
    }
}

