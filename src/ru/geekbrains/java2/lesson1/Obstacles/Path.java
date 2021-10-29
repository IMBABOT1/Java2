package ru.geekbrains.java2.lesson1.Obstacles;

import ru.geekbrains.java2.lesson1.Interfaces.Obstacles;
import ru.geekbrains.java2.lesson1.Interfaces.Participants;

public class Path implements Obstacles {

    private int length;

    public Path(int length){
        this.length = length;
    }

    public void doIt(Participants participants){
        participants.run(length);

    }
}
