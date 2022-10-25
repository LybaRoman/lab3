package Pvp;

import File.PrintToFile;
import droids.Droids;

import java.io.IOException;

public class Pvp1v1
{
    Droids our;
    Droids enemy;
    PrintToFile writer = new PrintToFile();


    public Pvp1v1() throws IOException {
        our = null;
        enemy = null;
    }

    /**
     * конструктор
     * @param our
     * @param enemy
     * @throws IOException
     */
    public Pvp1v1(Droids our, Droids enemy) throws IOException {
        if(our == null)
        {
            System.out.println("Wrong droid");
            return;
        }
        else if(enemy == null)
        {
            System.out.println("Wrong droid");
            return;
        }
        this.our = our;
        this.enemy = enemy;
    }

    /**
     * метод зміни дронів
     * @param our
     * @param enemy
     */
    public void changeFighters(Droids our, Droids enemy)
    {
        if(our == null)
        {
            System.out.println("Wrong droid");
            return;
        }
        else if(enemy == null)
        {
            System.out.println("Wrong droid");
            return;
        }
        this.our = our;
        this.enemy = enemy;
    }

    /**
     * метод поєдинку
     * @return
     * @throws IOException
     */
    public Droids fight() throws IOException
    {
        for(int i = 0; true; i++)
        {
            if(i % our.timer == 0)
            {
                String text = enemy.Name + " : " + enemy.Health + " - " + our.Damage +
                        " = " + enemy.Health + "\n";
                System.out.print(text);
                enemy.setHealth(enemy.Health - our.Damage);
                writer.print(text);
            }
            if(i % enemy.timer == 0)
            {
                String text = our.Name + " : " + our.Health + " - " + enemy.Damage +
                        " = " + our.Health + "\n";
                System.out.print(text);
                our.setHealth(our.Health - enemy.Damage);
                writer.print(text);
            }
            if(enemy.Health <= 0 && our.Health <= 0)
            {
                return null;
            }
            else if(enemy.Health <= 0)
            {
                return our;
            }
            else if(our.Health <= 0)
            {
                return enemy;
            }
        }
    }

    /**
     *
     * @param winner
     * @throws IOException
     */
    public void printWinner(Droids winner) throws IOException {
        if(winner == null)
        {
            String temp = "Draw!";
            System.out.println(temp);
            writer.print(temp);
        }
        String temp = "Winner is: " + winner.Name+"\n";
        System.out.println(temp);
        writer.print(temp);
        writer.closeF();
    }
}

