package Arrays;

import java.util.Scanner;

/**
 * Created by student on 03-May-16.
 */
public class Infinateloop {
    public static void main(String[] aregs) {

        Pyramid();
        WhilteLoopInfinite();
    }

    static void WhilteLoopInfinite() {
        Scanner scan = new Scanner(System.in);

        System.out.println("enter a number to check for Infinate Loop: ");
        int num = scan.nextInt();

        int counter = 0;
        while (num != 20) {
            System.out.println("enter a number : ");
            num = scan.nextInt();
            counter++;
        }
        System.out.println("Number is 20 : ");

    }

    static void Pyramid() {
        System.out.println("Enter a number");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();

        for (int i = 1; i <= 5; i++) {
            for (int s = 5; s > i; s--) {
                System.out.print(" ");
            }
            for (int j = 1; j < i; j++) {
                System.out.print(i);
            }
            for (int j = 1; j < i; j++) {
                System.out.print(i);
            }
            System.out.println("");
        }
    }
}


