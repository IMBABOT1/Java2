package ru.geekbrains.java2.lesson1;

import ru.geekbrains.java2.lesson1.Interfaces.Obstacles;
import ru.geekbrains.java2.lesson1.Interfaces.Participants;
import ru.geekbrains.java2.lesson1.Obstacles.Path;
import ru.geekbrains.java2.lesson1.Obstacles.Wall;
import ru.geekbrains.java2.lesson1.Participants.Cat;
import ru.geekbrains.java2.lesson1.Participants.Human;
import ru.geekbrains.java2.lesson1.Participants.Robot;

public class MainApp {

    public static void main(String[] args) {
        Obstacles[] obstacle = new Obstacles[3];
        obstacle[0] = new Path(210);
        obstacle[1] = new Wall(50);
        obstacle[2] = new Wall(150);


        Participants[] participants = new Participants[3];
        participants[0] = new Cat("Cat", 40, 10);
        participants[1] = new Human("Human", 1000, 50);
        participants[2] = new Robot("Robot", 500, 250);


        for (Obstacles o : obstacle){
            for (int i = 0; i < participants.length ; i++) {
                o.doIt(participants[i]);
            }
        }
    }

}
