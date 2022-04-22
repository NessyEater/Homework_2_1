package com.company;

public class Team{
    String name;
    Object[] participants;

    public Team(String name, Object[] participants){
        this.name = name;
        this.participants = participants;
    }

    public Object[] getParticipants() {
        return participants;
    }

    public void teamInfo(){
        for(int i = 0; i < participants.length; i++){
            if(participants[i] instanceof Human){
                Human participant = (Human)participants[i];
                System.out.println("Участник  -" + i);
                System.out.println("Имя       -" + participant.getName());
                System.out.println("Дальность -" + participant.getRunningSkill());
                System.out.println("Высота    -" + participant.getJumpingSkill());
            }
            else if(participants[i] instanceof Cat){
                Cat participant = (Cat)participants[i];
                System.out.println("Участник  -" + i);
                System.out.println("Имя       -" + participant.getName());
                System.out.println("Дальность -" + participant.getRunningSkill());
                System.out.println("Высота    -" + participant.getJumpingSkill());
            }
            else if (participants[i] instanceof Robot){
                Robot participant = (Robot)participants[i];
                System.out.println("Участник  -" + i);
                System.out.println("Имя       -" + participant.getName());
                System.out.println("Дальность -" + participant.getRunningSkill());
                System.out.println("Высота    -" + participant.getJumpingSkill());
            }
        }
    }

    public void showResults(boolean[] result, Object[] participants){
        for(int i = 0; i < participants.length; i++){
            if(result[i]){
                if(participants[i] instanceof Human){
                    Human participant = (Human)participants[i];
                    System.out.println("Участник  -" + i);
                    System.out.println("Имя       -" + participant.getName());
                    System.out.println("Дальность -" + participant.getRunningSkill());
                    System.out.println("Высота    -" + participant.getJumpingSkill());
                }
                else if(participants[i] instanceof Cat){
                    Cat participant = (Cat)participants[i];
                    System.out.println("Участник  -" + i);
                    System.out.println("Имя       -" + participant.getName());
                    System.out.println("Дальность -" + participant.getRunningSkill());
                    System.out.println("Высота    -" + participant.getJumpingSkill());

                }
                else if (participants[i] instanceof Robot){
                    Robot participant = (Robot)participants[i];
                    System.out.println("Участник  -" + i);
                    System.out.println("Имя       -" + participant.getName());
                    System.out.println("Дальность -" + participant.getRunningSkill());
                    System.out.println("Высота    -" + participant.getJumpingSkill());

                }
            }
        }
    }
}

