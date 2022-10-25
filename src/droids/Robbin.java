package droids;

public class Robbin extends Droids
{
    /**
     * Конструктор з параметрами
     * @param name
     * @param damage
     * @param health
     * @param timer
     * @param enemy
     */
    public Robbin(String name,int damage,int health, int timer, boolean enemy){
        super(name,damage,health, timer, enemy);
    }
    public void charakteristik(){
        //System.out.println("Chsrskteristik of you droid");
        System.out.println("Name:"+super.Name);
        System.out.println("Damage:"+super.Damage);
        System.out.println("Health:"+super.Health);
    }

}
