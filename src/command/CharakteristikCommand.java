package command;

import droids.Killer;
import droids.Monster;
import droids.Robbin;

public class CharakteristikCommand implements MenuItem{

    public void execute(){
        System.out.println("Charakteristit of droid");
        Killer killer =new Killer("Killer",44,500, 6, false);
        killer.charakteristik();
        System.out.println("-----------");
        Robbin robbin=new Robbin ("Robbin",24,900,7,false);
        robbin.charakteristik();
        System.out.println("-----------");
        Monster monster=new Monster ("Monster",64,500,8,false);
        monster.charakteristik();
        System.out.println("-----------");
    }
}
