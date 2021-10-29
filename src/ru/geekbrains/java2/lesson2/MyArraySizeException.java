package ru.geekbrains.java2.lesson2;

public class MyArraySizeException extends Exception {

    public MyArraySizeException(String[][] arr) {
        super(String.format("Array must be 4x4, but %dx%d ", arr.length, arr[0].length));
    }
}
