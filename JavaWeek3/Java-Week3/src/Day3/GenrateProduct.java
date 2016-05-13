package Day3;

import Day3.swing.Supplier;

/**
 * Created by student on 05-May-16.
 */
public class GenrateProduct {

    public static  Computers mackbookpro = new Computers(1,2000,"MackBookPro",100,"Apple","Mackbook",Processor.INTEL,Ram.EIGHT,DiskDrive.HDD,15.01);
    public static  Computers lenovoThinkred = new Computers(2,1800,"ThinkPad Carbon",60,"Lenovo","Carboon",Processor.INTEL,Ram.SIXTEEN,DiskDrive.HDD,12.01);
    public static  Computers dellAlienware = new Computers(5,900,"alien Ware",60,"Dell","allien",Processor.INTEL,Ram.SIXTEEN,DiskDrive.HDD,17.01);

    // generate supplier : Boom

    public static Supplier swati = new Supplier("Swati computer Supply");
    public static Supplier John = new Supplier("John computer Supply");

    static
    {
        swati.getProducts().add(mackbookpro);
        John.getProducts().add(lenovoThinkred);

    }

}
