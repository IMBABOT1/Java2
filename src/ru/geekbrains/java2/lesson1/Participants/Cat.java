package ru.geekbrains.java2.lesson1.Participants;

import ru.geekbrains.java2.lesson1.Interfaces.Participants;

public class Cat implements Participants {

    private String name;
    private int maxDistance;
    private int maxHeight;

    private boolean isCapable;

    public Cat(String name, int maxDistance, int maxHeight){
        this.name = name;
        this.maxDistance = maxDistance;
        this.maxHeight = maxHeight;
        isCapable = true;
    }

    @Override
    public void run(int distance) {
        boolean isSuccess = false;
        if (isCapable == true && maxDistance >= distance) {
            isSuccess = maxDistance >= distance;
            isCapable = true;
            System.out.println(name + " " + "run " + isSuccess);
        }else if (isCapable == true && maxDistance < distance){
            isSuccess = maxDistance < distance;
            isCapable = false;
            System.out.println(name + " " + "leave distance");
        }
    }

    @Override
    public void jump(int height) {
        boolean isSuccess = false;
        if (isCapable == true && maxHeight >= height) {
            isSuccess = maxHeight >= height;
            isCapable = true;
            System.out.println(name + " " + "jump " + isSuccess);
        }else if (isCapable == true && maxHeight < height){
            isSuccess = maxDistance < height;
            isCapable = false;
            System.out.println(name + " " + "leave distance");
        }
    }
}