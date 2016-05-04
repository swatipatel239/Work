package Arrays;

import java.util.Scanner;

/**
 * Created by student on 03-May-16.
 */
public class BinarryApplication {

    public static void main(String[] aregs)
    {
        System.out.println("Enter a number");
        Scanner input = new Scanner(System.in);
        //get int of binary digits
        String binary = input.nextLine();

        BinaryConversion(binary);

    }
    static void BinaryConversion(String Binary)
    {
        int result =0 , mult = 1;
        for(int i = Binary.length() - 1 ; i>= 0 ; i-- )
        {
            if(Binary.charAt(i) == '1'){
                result += mult;
            }
            mult = mult * 2;
        };
        System.out.println("Decimal value: " + result);
        }
    }


