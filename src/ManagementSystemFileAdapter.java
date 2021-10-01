/**
 * The ManagementSystemFileAdapter writes and reads file about the management system.
 * @author Bianca Militaru
 * @version 1.0
 */

import java.io.FileNotFoundException;
import java.io.IOException;

public class ManagementSystemFileAdapter
{
    private MyFileIO myFileIO;
    private String fileName;

    /**
     * The one argument constructor initialize the private fields.
     * @param fileName is the name of the file
     */

    public ManagementSystemFileAdapter(String fileName)
    {
        myFileIO = new MyFileIO();
        this.fileName = fileName;
    }

    /**
     * The saveManagementSystem method takes one argument and writes it in the file.
     * @param managementSystem is a ManagementSystem object
     */

    public void saveManagementSystem(ManagementSystem managementSystem)
    {
        try
        {
            myFileIO.writeToFile(fileName, managementSystem);
        }
        catch (FileNotFoundException e)
        {
            System.out.println("File not found.");
        }
        catch (IOException e)
        {
            System.out.println("IO Error writing to file.");
        }
    }

    /**
     * The loadManagementSystem method reads a ManagementSystem object from the file.
     * @return a ManagementSystem object which contains all the information from the file
     */

    public ManagementSystem loadManagementSystem()
    {
        ManagementSystem managementSystem = new ManagementSystem();

        try
        {
            managementSystem = (ManagementSystem) myFileIO.readObjectFromFile(fileName);
        }
        catch (FileNotFoundException e)
        {
            System.out.println("File not found.");
        }
        catch (IOException e)
        {
            System.out.println("IO Error reading from file.");
        }
        catch (ClassNotFoundException e)
        {
            System.out.println("Class not found");
        }

        return managementSystem;
    }
}
