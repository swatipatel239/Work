package Day2;
import java.io.*;
import java.util.Scanner;
/**
 * Created by student on 04-May-16.
 */
public class InputOutput {
    public static void main(String[] args)
    {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");

        //read line input
        String str = input.nextLine();
        System.out.println("Using Scanner: " + str);

        //create a buffer reader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str2 = "";
        try {
            str2 = br.readLine();
        } catch (IOException e)
        {
            e.printStackTrace();
        }
        System.out.println("Using InputStreamReader: " + str2 );

        //Write to a file

        System.out.println(System.getProperty("user.dir"));

        String fileName = "test.txt";
        try
        {
            FileWriter fileW = new FileWriter(fileName);

            BufferedWriter bw = new BufferedWriter(fileW);
            bw.write(str2);
            bw.close();

        } catch (IOException ex)
        {
            System.out.println("Error writing to a file: " + fileName);
        }
    }
}
