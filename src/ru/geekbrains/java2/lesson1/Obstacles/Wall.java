package ru.geekbrains.java2.lesson1.Obstacles;

import ru.geekbrains.java2.lesson1.Interfaces.Obstacles;
import ru.geekbrains.java2.lesson1.Interfaces.Participants;

public class Wall implements Obstacles {

    private int height;

    public Wall(int height){
        this.height = height;
    }

    public void doIt(Participants participants){
        participants.jump(height);
    }
}
