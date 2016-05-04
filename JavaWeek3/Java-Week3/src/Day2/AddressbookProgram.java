package Day2;
import java.io.File;
/**
 * Created by student on 04-May-16.
 */
public class AddressbookProgram
{
    public static void main(String[] args) {
        AddressBOOKBOOK Adb = new AddressBOOKBOOK();

        System.out.println(System.getProperty("user.dir"));
        try {
            Adb.LoadContactsFile(new File("ContactDetails.txt"));
        } catch (Exception e) {
            System.out.println("Failed");
        }
        Adb.PrintAllContacy();
        Adb.sortBylastName();
        Adb.PrintAllContacy();

        System.out.println();

    }
}
