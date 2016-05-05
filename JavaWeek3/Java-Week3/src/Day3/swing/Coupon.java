package Day3.swing;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Created by student on 05-May-16.
 */
public class Coupon {

    private String description;
    private double value;
    private Scanner filereader;

    public Coupon(double value, String description) {
        this.value = value;
        this.description = description;
    }

    public double getValue() {
        return value;
    }

    public String getDescription() {
        return description;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Coupon{" +
                "description='" + description + '\'' +
                ", value= £" + value +
                '}';
    }

    public void loadInfoFromFile() {
        filereader = new Scanner(getClass().getResourceAsStream("input.txt"));
    }
    public Scanner getFilereader()
    {
        return filereader;
    }
    public void saveToAFile(String filename) throws FileNotFoundException
    {

        File file = new File(filename);
        PrintWriter pw  = new PrintWriter(file);
        pw.println("Description : " + getDescription());
        pw.println("Value : " + getValue());
        pw.close();

    }
}
