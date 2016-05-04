package Day2;
import java.util.*;
/**
 * Created by student on 04-May-16.
 */
public class Registration {

  // private ArrayList<Person> ListofPerson = new ArrayList<>();
   static  ArrayList<Person> ListofPerson = new ArrayList<>();
   static Person PClass = new Person();

    public static void main(String[] args)
    {
       // AddressBOOKBOOK();
        PeopleInformation();
        Registration();
        DisplayPerson();
    }

    static void PeopleInformation()
    {

        // create an array list
        ListofPerson.add(new Person("Swati" , "Patel","Female" , 27 , 25,"No"));
        ListofPerson.add(new Person("John" , "Dont Know","Male" , 28 , 25,"No"));


    }
       static void Registration()
        {
            Scanner kb = new Scanner(System.in);
            System.out.println("Enter a First Name:");
            String fname = kb.nextLine();
            System.out.println("Enter a Last Name:");
            String lname = kb.nextLine();
            System.out.println("Enter a Gender :");
            String gender = kb.nextLine();
            System.out.println("Enter a Age:");
            int Age = kb.nextInt();
            System.out.println("Enter a Weight:");
            int Weight = kb.nextInt();
            System.out.println("Are you Smoking");
            String Smoking = kb.nextLine();
          //  System.out.println("Are you Available");
          //  String Available = kb.nextLine();

            PClass.setname(fname,lname,gender,Age,Weight,Smoking);
            ListofPerson.add(new Person(fname,lname,gender,Age,Weight,Smoking));
        }
    static void DisplayPerson()
    {
        for (int i = 0; i < ListofPerson.size(); i++)
        {
            System.out.println(ListofPerson.get(i).toString());
        }
    }



}
