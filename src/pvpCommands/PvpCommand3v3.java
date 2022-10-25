package pvpCommands;

import Pvp.Pvp3v3;
import command.MenuItem;
import droids.Droids;
import droids.Killer;
import droids.Monster;
import droids.Robbin;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;
public class PvpCommand3v3 implements MenuItem
{
    private Droids[] our = new Droids[3];
    Droids[] enemy = new Droids[3];


    public void execute() throws IOException {
        Random rand = new Random();
        setOurTeam();
        setEnemyTeam(rand);

        Pvp3v3 pvp = new Pvp3v3(our, enemy);
        pvp.fight();
    }

    /**
     * вибір нашої команди
     */
    void setOurTeam() {
        Scanner in = new Scanner(System.in);
        System.out.println("""
                Chose your first.There is tree type of Droids
                -1.Killer
                -2.Robbin
                -3.Monster
                Which of them you want to choose""");
        String first = in.next();
        switch (first) {
            case "Killer" -> {

                our[0] = new Killer("Killer", 44, 500, 6, false);
                System.out.println(""" 
                        Chose your second droid .There is tree type of Droids
                        -1.Killer
                        -2.Robbin
                        -3.Monster """);

                String second = in.next();//вводимо нахву 2 дрона
                switch (second) {
                    case "Killer" -> {
                        our[1] = new Killer("Killer", 44, 500, 6, false);
                        System.out.println(""" 
                                Chose your three droid .There is tree type of Droids
                                -1.Killer
                                -2.Robbin
                                -3.Monster """);
                        String three = in.next();
                        switch (three) {
                            case "Killer" -> {
                                our[2] = new Killer("Killer", 44, 500, 6, false);
                                System.out.println("You team is\n" + first + "\n" + second + "\n" + three);
                            }
                            case "Monster" -> {
                                our[2] = new Monster("Monster", 56, 500, 8, false);
                                System.out.println("You team is\n" + first + "\n" + second + "\n" + three);
                            }
                            case "Robbin" -> {
                                our[2] = new Robbin("Robbin", 24, 700, 7, false);
                                System.out.println("You team is\n" + first + "\n" + second + "\n" + three);
                            }
                        }
                    }

                    case "Monster" -> {
                        our[1] = new Monster("Monster", 56, 500, 8, false);
                        System.out.println(""" 
                                Chose your three droid .There is tree type of Droids
                                -1.Killer
                                -2.Robbin
                                -3.Monster """);
                        String three = in.next();
                        switch (three) {
                            case "Killer" -> {
                                our[2] = new Killer("Killer", 44, 500, 6, false);
                                System.out.println("You team is\n" + first + "\n" + second + "\n" + three);
                            }
                            case "Monster" -> {
                                our[2] = new Monster("Monster", 56, 500, 8, false);
                                System.out.println("You team is\n" + first + "\n" + second + "\n" + three);
                            }
                            case "Robbin" -> {
                                our[2] = new Robbin("Robbin", 24, 700, 7, false);
                                System.out.println("You team is\n" + first + "\n" + second + "\n" + three);
                            }
                        }
                    }
                    case "Robbin" -> {
                        our[1] = new Robbin("Robbin", 24, 700, 7, false);
                        System.out.println(""" 
                                 Chose your three droid .There is tree type of Droids
                                -1.Killer
                                -2.Robbin
                                -3.Monster """);
                        String three = in.next();
                        switch (three) {
                            case "Killer" -> {
                                our[2] = new Killer("Killer", 44, 500, 6, false);
                                System.out.println("You team is\n" + first + "\n" + second + "\n" + three);
                            }
                            case "Monster" -> {
                                our[2] = new Monster("Monster", 56, 500, 8, false);
                                System.out.println("You team is\n" + first + "\n" + second + "\n" + three);
                            }
                            case "Robbin" -> {
                                our[2] = new Robbin("Robbin", 24, 700, 7, false);
                                System.out.println("You team is\n" + first + "\n" + second + "\n" + three);
                            }

                        }
                    }
                }
            }
            case "Monster" -> {
                our[0] = new Monster("Monster", 56, 500, 8, false);
                System.out.println(""" 
                        Chose your second droid .There is tree type of Droids
                        -1.Killer
                        -2.Robbin
                        -3.Monster """);

                String second = in.next();//вводимо нахву 2 дрона
                switch (second) {
                    case "Killer" -> {
                        our[1] = new Killer("Killer", 44, 500, 6, false);
                        System.out.println(""" 
                                Chose your three droid .There is tree type of Droids
                                -1.Killer
                                -2.Robbin
                                -3.Monster """);
                        String three = in.next();
                        switch (three) {
                            case "Killer" -> {
                                our[2] = new Killer("Killer", 44, 500, 6, false);
                                System.out.println("You team is\n" + first + "\n" + second + "\n" + three);
                            }
                            case "Monster" -> {
                                our[2] = new Monster("Monster", 56, 500, 8, false);
                                System.out.println("You team is\n" + first + "\n" + second + "\n" + three);
                            }
                            case "Robbin" -> {
                                our[2] = new Robbin("Robbin", 24, 700, 7, false);
                                System.out.println("You team is\n" + first + "\n" + second + "\n" + three);
                            }
                        }
                    }

                    case "Monster" -> {
                        our[1] = new Monster("Monster", 56, 500, 8, false);
                        System.out.println(""" 
                                Chose your three droid .There is tree type of Droids
                                -1.Killer
                                -2.Robbin
                                -3.Monster """);
                        String three = in.next();
                        switch (three) {
                            case "Killer" -> {
                                our[2] = new Killer("Killer", 44, 500, 6, false);
                                System.out.println("System.out.println(\"You team is\"+first+\"\\n\"+second+\"\\n\"+three");
                            }
                            case "Monster" -> {
                                our[2] = new Monster("Monster", 56, 500, 8, false);
                                System.out.println("You team is\n" + first + "\n" + second + "\n" + three);
                            }
                            case "Robbin" -> {
                                our[2] = new Robbin("Robbin", 24, 700, 7, false);
                                System.out.println("You team is\n" + first + "\n" + second + "\n" + three);
                            }
                        }
                    }
                    case "Robbin" -> {
                        our[1] = new Robbin("Robbin", 24, 700, 7, false);
                        System.out.println(""" 
                                 Chose your three droid .There is tree type of Droids
                                -1.Killer
                                -2.Robbin
                                -3.Monster """);
                        String three = in.next();
                        switch (three) {
                            case "Killer" -> {
                                our[2] = new Killer("Killer", 44, 500, 6, false);
                                System.out.println("You team is\n" + first + "\n" + second + "\n" + three);
                            }
                            case "Monster" -> {
                                our[2] = new Monster("Monster", 56, 500, 8, false);
                                System.out.println("You team is\n" + first + "\n" + second + "\n" + three);
                            }
                            case "Robbin" -> {
                                our[2] = new Robbin("Robbin", 24, 700, 7, false);
                                System.out.println("You team is\n" + first + "\n" + second + "\n" + three);
                            }

                        }
                    }
                }
            }
            case "Robbin" -> {
                our[0] = new Robbin("Robbin", 24, 700, 7, false);
                System.out.println(""" 
                        Chose your second droid .There is tree type of Droids
                        -1.Killer
                        -2.Robbin
                        -3.Monster """);

                String second = in.next();//вводимо нахву 2 дрона
                switch (second) {
                    case "Killer" -> {
                        our[1] = new Killer("Killer", 44, 500, 6, false);
                        System.out.println(""" 
                                Chose your three droid .There is tree type of Droids
                                -1.Killer
                                -2.Robbin
                                -3.Monster """);
                        String three = in.next();
                        switch (three) {
                            case "Killer" -> {
                                our[2] = new Killer("Killer", 44, 500, 6, false);
                                System.out.println("You team is\n" + first + "\n" + second + "\n" + three);
                            }
                            case "Monster" -> {
                                our[2] = new Monster("Monster", 56, 500, 8, false);
                                System.out.println("You team is\n" + first + "\n" + second + "\n" + three);
                            }
                            case "Robbin" -> {
                                our[2] = new Robbin("Robbin", 24, 700, 7, false);
                                System.out.println("You team is\n" + first + "\n" + second + "\n" + three);
                            }
                        }
                    }

                    case "Monster" -> {
                        our[1] = new Monster("Monster", 56, 500, 8, false);
                        System.out.println(""" 
                                Chose your three droid .There is tree type of Droids
                                -1.Killer
                                -2.Robbin
                                -3.Monster """);
                        String three = in.next();
                        switch (three) {
                            case "Killer" -> {
                                our[2] = new Killer("Killer", 44, 500, 6, false);
                                System.out.println("You team is\n" + first + "\n" + second + "\n" + three);
                            }
                            case "Monster" -> {
                                our[2] = new Monster("Monster", 56, 500, 8, false);
                                System.out.println("You team is\n" + first + "\n" + second + "\n" + three);
                            }
                            case "Robbin" -> {
                                our[2] = new Robbin("Robbin", 24, 700, 7, false);
                                System.out.println("You team is\n" + first + "\n" + second + "\n" + three);
                            }
                        }
                    }
                    case "Robbin" -> {
                        our[1] = new Robbin("Robbin", 24, 700, 7, false);
                        System.out.println(""" 
                                 Chose your three droid .There is tree type of Droids
                                -1.Killer
                                -2.Robbin
                                -3.Monster """);
                        String three = in.next();
                        switch (three) {
                            case "Killer" -> {
                                our[2] = new Killer("Killer", 44, 500, 6, false);
                                System.out.println("You team is\n" + first + "\n" + second + "\n" + three);
                            }
                            case "Monster" -> {
                                our[2] = new Monster("Monster", 56, 500, 8, false);
                                System.out.println("You team is\n" + first + "\n" + second + "\n" + three);
                            }
                            case "Robbin" -> {
                                our[2] = new Robbin("Robbin", 24, 700, 7, false);
                                System.out.println("You team is\n" + first + "\n" + second + "\n" + three);
                            }
                        }
                    }
                }
            }
        }
    }

    /**
     * виьыр чужої команди
     * @param rand
     */
    void setEnemyTeam(Random rand)
    {
        System.out.println("\nEnemy team:");
        for(int i = 0; i < 3; i++)
        {
            int temp = rand.nextInt(3);
            switch (temp) {
                case (0) -> enemy[i] = new Killer("Killer", 44, 500, 6, true);
                case (1) -> enemy[i] = new Monster("Monster", 56, 500, 8, true);
                case (2) -> enemy[i] = new Robbin("Robbin", 24, 700, 7, true);
                default -> {
                }
            }
            System.out.println(enemy[i].Name);
        }
    }
}