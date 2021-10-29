package ru.geekbrains.java2.lesson2;

import java.io.IOException;

public class MyArrayDataException extends Exception {

    public MyArrayDataException(String temp) {
        super(String.format("Not correct values in %s", temp));
    }
}
