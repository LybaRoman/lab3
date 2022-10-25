package Pvp;

import droids.Droids;

import java.io.IOException;

public class Pvp3v3
{
    final int count = 3;

    private Droids[] our = new Droids[count];
    private Droids[] enemy = new Droids[count];

    /**
     *
     * @param our
     * @param enemy
     */
    public Pvp3v3(Droids[] our, Droids[] enemy)
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
     * метод поєдинку 3 на 3
     * @throws IOException
     */
    public void fight() throws IOException {
        int ourCount = 0;
        int enemyCount = 0;
        Pvp1v1 first = new Pvp1v1();
        boolean flag = false;

        System.out.println("\nFight!!!");

        while (!flag)
        {
            first.changeFighters(our[ourCount], enemy[enemyCount]);
            Droids winner1 = first.fight();//Бються і переможець записується
            if(winner1 == null)
            {
                System.out.println("Draw!\n\n");
                enemyCount++;
                ourCount++;
            }
            else if(!winner1.isEnemy)
            {
                System.out.println("We win fight!\n\n");
                enemyCount++;
            }
            else
            {
                System.out.println("We lose fight!\n\n");
                ourCount++;
            }

            if(enemyCount == count)
            {
                flag = true;
                System.out.println("We Win!!!");
            }
            else if(ourCount == count)
            {
                flag = true;
                System.out.println("We Lose!!!");
            }
        }
        first.writer.closeF();
    }
}
