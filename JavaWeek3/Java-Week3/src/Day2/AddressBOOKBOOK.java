package Day2;

import org.w3c.dom.css.Counter;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

/**
 * Created by student on 04-May-16.
 */
public class AddressBOOKBOOK extends Person {

    private Contact[] Contacts = new Contact[100];
    private int counter;

    public void PrintAllContacy()
    {
        for( int i =0 ; i< counter ; i++)
        {
            System.out.println(Contacts[i]);
        }
    }
    public void sortBylastName()
    {
        for (int i = 0 ; i< counter - 1 ; i++ )
        {
            String temp1 = Contacts[i].getLasttname();
             for(int j = i+1 ; j < counter ; j++)
             {
                 String temp2 = Contacts[j].getLasttname();
                 if(temp1.compareToIgnoreCase(temp2) > 0 )
                 {
                     Contact tempContact = Contacts[i];
                     Contacts[i] = Contacts[j];
                     Contacts[j] = tempContact;
                 }
             }

        }
    }
    public Contact SearchContactLastName(String Lastname)
    {
        Contact Resultcontact = null;
        for(int i = 0; i < Contacts.length ; i++)
        {
            Contact p = Contacts[i];
            if(p.getLasttname().equalsIgnoreCase(Lastname));
            Resultcontact = p;
            break;
        }

        return Resultcontact;
    }

    public void LoadContactsFile(File file) throws FileNotFoundException
    {
        Scanner fileReader = new Scanner(file);
        while (fileReader.hasNext())
        {
            String line = fileReader.nextLine();
            String[] Data = line.split(",");
            Contact contact = new Contact(Data[0],Data[1],Data[2], new AddressBook(Data[3], Data[4],Data[5],Data[6]),Data[7],Data[8],Data[9]);
            Contacts[counter++] = contact;
        }
        fileReader.close();

    }
}

