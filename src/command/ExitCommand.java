package command;

public class ExitCommand implements MenuItem {
    public  void execute(){
        System.out.println("Good bye!");
        System.exit(0);
    }
}
