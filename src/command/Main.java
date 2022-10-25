package command;
import java.io.IOException;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        MainMenu mainMenu=new MainMenu();

        while (true)
        {
            System.out.println("""
                    Menu of command
                    -Charakteristik
                    -Exit
                    -Pvp1v1
                    -Pvp3v3
                    Input your command:""");
            String command=in.next();
            mainMenu.execute(command);
        }
    }
}