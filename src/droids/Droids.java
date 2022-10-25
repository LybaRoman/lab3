package droids;

public class Droids
{

    public String Name ;
    public int Damage;
    public int Health;
    public int timer;
    public boolean isEnemy = false;

    /**
     *
     * @param n
     * @param d
     * @param h
     * @param timer
     * @param isEnemy
     */
    public Droids(String n,int d,int h, int timer,boolean isEnemy){
        Name=n;
        Damage = d;
        Health = h;
        this.isEnemy = isEnemy;
        this.timer = timer;
    }

    /**
     * Метод отримання здоров'я
     * @param Health
     */
    public void setHealth(int Health)
    {
        this.Health = Health;
    }

}

