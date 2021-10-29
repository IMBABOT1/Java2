package ru.geekbrains.java2.lesson1.Participants;

import ru.geekbrains.java2.lesson1.Interfaces.Participants;

public class Cat implements Participants {

    private String name;
    private int maxDistance;
    public int maxHeight;

    public Cat(String name, int maxDistance, int maxHeight){
        this.name = name;
        this.maxDistance = maxDistance;
        this.maxHeight = maxHeight;
    }

    @Override
    public void run(int distance) {
        boolean isSuccess = maxDistance >= distance;
        System.out.println(name + " " + "run " + isSuccess);
    }

    @Override
    public void jump(int height) {
        boolean isSuccess = maxHeight >= height;
        System.out.println(name + " " + "jump " + isSuccess);
    }
}
