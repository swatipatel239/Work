package Arrays;

import java.util.Scanner;

/**
 * Created by student on 03-May-16.
 */
public class IceCream
{
    public static void main(String[] aregs)
    {
        IceCream();
    }
    static void IceCream()
    {
        System.out.println("Enter a Size of iceCream you want");
        Scanner Scan = new Scanner(System.in);

        String monthString;

        switch (Scan.toString()) {
            case "Small": monthString = "Small";
                break;
            case "Big":  monthString = "Big";
                break;
            case "Normal":  monthString = "Normal";
                break;
            case "Regualr":  monthString = "Regualr";
                break;

            default: monthString = "Dont want anything! thanks";
                break;
        }
        System.out.println(monthString);

    }
}