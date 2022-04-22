package com.company;

public class Course {
    String name;
    Object[] obstacles;

    public Course(String name, Object[] obstacles){
        this.name = name;
        this.obstacles = obstacles;
    }
    public void trial(Team team){
        System.out.println("Let the " + name + " begin!!!");
        Object [] participantsArray = team.getParticipants();
        Object [] obstacleArray = obstacles;
        boolean[] result = new boolean[participantsArray.length];
        for(int i = 0; i < participantsArray.length; i++) {
            int j = 0;
            while(true) {
                if(obstacleArray[j] instanceof Treadmill){
                    Treadmill treadmill = (Treadmill)obstacleArray[j];
                    if (!running(participantsArray[i], treadmill)){
                        break;
                    }
                }
                else{
                    Wall wall = (Wall)obstacleArray[j];
                    if (!jumping(participantsArray[i], wall)){
                        break;
                    }
                }
                j++;
                if(j == obstacleArray.length) {
                    result[i] = true;
                    break;
                }
                else{
                    result[i] = false;
                }
            }
        }
        team.showResults(result,participantsArray);
    }
    public static boolean running(Object participant, Treadmill treadmill){
        if (participant instanceof Human) {
            Human human = (Human)participant;
            if(human.running(treadmill)){
                return true;
            }
        }
        if (participant instanceof Cat) {
            Cat cat = (Cat)participant;
            if(cat.running(treadmill)){
                return true;
            }
        }
        if (participant instanceof Robot) {
            Robot robot = (Robot)participant;
            if(robot.running(treadmill)){
                return true;
            }
        }
        return false;
    }
    public static boolean jumping(Object participant, Wall wall){
        if (participant instanceof Human) {
            Human human = (Human)participant;
            if(human.jumping(wall)){
                return true;
            }
        }
        if (participant instanceof Cat) {
            Cat cat = (Cat)participant;
            if(cat.jumping(wall)){
                return true;
            }
        }
        if (participant instanceof Robot) {
            Robot robot = (Robot)participant;
            if(robot.jumping(wall)){
                return true;
            }
        }
        return false;
    }
}

