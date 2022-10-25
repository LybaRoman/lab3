package pvpCommands;
import Pvp.Pvp1v1;
import command.MenuItem;
import droids.Droids;
import droids.Killer;
import droids.Monster;
import droids.Robbin;

import java.io.IOException;
import java.util.Scanner;

public class PvpCommand implements MenuItem
{
    private Droids our, enemy;


    public void execute() throws IOException {
        System.out.println("""
                There is tree type of Droids
                -Killer
                -Robbin
                -Monster
                Which of them you want to choose""");

        setTwoFighters();

        Pvp1v1 pvp = new Pvp1v1(our, enemy);
        Droids winner = pvp.fight();
        pvp.printWinner(winner);
    }


     void setTwoFighters()
    {
        Scanner in = new Scanner(System.in);
        String command = in.next();

        switch (command) {
            case "Killer" -> {
                our = new Killer("Killer", 44, 500, 6, false);
                System.out.println("You droid is Killer\nChoose you enemy\n-Robbin\n-Monster");
                String enemy1 = in.next();
                switch (enemy1) {
                    case "Robbin" -> {
                        enemy = new Robbin("Robbin", 24, 700, 7, true);
                        System.out.println("Your enemy is Robbin");
                    }
                    case "Monster" -> {
                        enemy = new Monster("Monster", 56, 500, 8, true);
                        System.out.println("Your  enemy is Monster");
                    }
                    default -> enemy = null;
                }
            }
            case "Robbin" -> {
                our = new Robbin("Robbin", 24, 700, 7, false);
                System.out.println("You droid is Robbin\nChoose you enemy\n-Killer\n-Monster");
                String enemy2 = in.next();
                switch (enemy2) {
                    case "Killer" -> {
                        enemy = new Killer("Killer", 44, 500, 6, false);
                        System.out.println("Your  enemy is Killer");
                    }
                    case "Monster" -> {
                        enemy = new Monster("Monster", 56, 500, 8, true);
                        System.out.println("Your  enemy is Monster");
                    }
                    default -> enemy = null;
                }
            }
            case "Monster" -> {
                our = new Monster("Monster", 56, 500, 8, true);
                System.out.println("You droid is Monster\nChoose you enemy\n-Robbin\n-Killer");
                String enemy3 = in.next();
                switch (enemy3) {
                    case "Robbin" -> {
                        enemy = new Robbin("Robbin", 24, 700, 7, true);
                        System.out.println("Your enemy is Robbin");
                    }
                    case "Killer" -> {
                        enemy = new Killer("Killer", 44, 500, 6, false);
                        System.out.println("Your  enemy is Killer");
                    }
                    default -> enemy = null;
                }
            }
            default -> {
                our = null;
                enemy = null;
            }
        }
    }
}
