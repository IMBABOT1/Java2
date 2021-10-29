package ru.geekbrains.java2.lesson1.Participants;
import ru.geekbrains.java2.lesson1.Interfaces.Participants;

public class Human implements Participants {

    private String name;
    private int maxDistance;
    public int maxHeight;

    public Human(String name, int maxDistance, int maxHeight){
        this.maxDistance = maxDistance;
        this.maxHeight = maxHeight;
        this.name = name;
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
