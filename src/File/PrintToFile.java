package File;

import java.io.FileWriter;
import java.io.IOException;

public class PrintToFile
{

    public final FileWriter writer;


    public PrintToFile() throws IOException
    {
        String fileName = "Log.txt";
        writer = new FileWriter(fileName, true);
    }

    /**
     * записування у файл
     * @param text
     * @throws IOException
     */
    public void print(String text) throws IOException
    {
        writer.write(text);
    }

    /**
     * закривання файлу
     * @throws IOException
     */
    public void closeF() throws IOException
    {
        writer.close();
    }

}