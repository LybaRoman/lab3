package command;
import pvpCommands.PvpCommand;
import pvpCommands.PvpCommand3v3;

import java.io.IOException;
import java.util.Map;
import java.util.LinkedHashMap;
public class MainMenu
{
    private final Map<String, MenuItem> menuItems;


    public  MainMenu()
    {
        menuItems=new LinkedHashMap<>();
        menuItems.put("Charakteristik",new CharakteristikCommand());
        menuItems.put("Exit",new ExitCommand());
        menuItems.put("Pvp1v1",new PvpCommand());
        menuItems.put("Pvp3v3",new PvpCommand3v3());

    }

    /**
     *
     * @param in
     * @throws IOException
     */
    public void execute(String in) throws IOException {
        menuItems.get(in).execute();
    }

}
