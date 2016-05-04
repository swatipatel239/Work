package Arrays;
import java.util.Scanner;

/**
 * Created by student on 03-May-16.
 */
public class ControlStatemnts {
    public static void main(String[] aregs)
    {
        System.out.println("Enter a number");
        Scanner scan = new Scanner(System.in);
        int number = scan.next().charAt(0);

        if(Character.isLetter(number) || Character.isDigit(number))
        {
            if(Character.isUpperCase(number))
                System.out.println("Your character is upper case");
            else if(Character.isLowerCase(number))
                System.out.println("Your character is Lower case");
            else if(Character.isDigit(number) && number > 5)
                System.out.println("Your character is digit and less then 5");
        }
        else
        {
            System.out.println("Your character is not a number or char");
        }
    }
    static void simpleIf()
    {
        //Check for characted of nymber if Characted check for upper case or lowercase or chack below
        // if number check weather its > 5 or not
        //if(number < 100 && number > 20)
        //    system.out.println("numner less then 100");
        // else if(number == 100)
        //     system.out.println("numner is 100");
        // else
        // system.out.println("numner more then 100");
    }
}
