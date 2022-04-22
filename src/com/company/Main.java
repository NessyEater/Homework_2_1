package com.company;

public class Main {
    public interface Actions{
        boolean running (Treadmill treadmill);
        boolean jumping(Wall wall);
    }
    public static void main(String[] args) {
        Object[] participantsArray = new Object[4];
        participantsArray[0] = new Human(200, 1, "Лорд Вейдер");
        participantsArray[1] = new Human(333, 4, "Усаин Болт");
        participantsArray[2] = new Cat  (100, 2, "Мурзик");
        participantsArray[3] = new Robot(1000,4, "Робонатор");
        Team team17 = new Team("Team17", participantsArray);

        Object[] obstacleArray = new Object[6];
        obstacleArray[0] = new Treadmill(100);
        obstacleArray[1] = new Treadmill(200);
        obstacleArray[2] = new Wall(1);
        obstacleArray[3] = new Wall(2);
        obstacleArray[4] = new Treadmill(323);
        obstacleArray[5] = new Wall(3);
        Course course = new Course("trialOfFire", obstacleArray);

        team17.teamInfo();

        course.trial(team17);
    }
}
