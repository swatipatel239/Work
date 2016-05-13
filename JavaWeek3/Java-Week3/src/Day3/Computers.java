package Day3;

import sun.plugin.dom.exception.NoModificationAllowedException;
import sun.text.normalizer.NormalizerBase;

import java.util.Comparator;
import java.util.Random;
import java.util.jar.Attributes;

/**
 * Created by student on 05-May-16.
 */
public class Computers implements Product {

    private int ItemNumber = 0;
    private double Price = 0;
    private String ProductName = "";
    private int UnitsinStock = 0;

    private String Brand;
    private  String Model;
    Processor Processor;
    Ram ram;
    DiskDrive disckDrive;
    Double ScreenSize;

    //Creaate Comparator

    public static final Comparator<Computers> by_brand = new Comparator<Computers>() {
        @Override
        public int compare(final Computers c1, final Computers c2) {
            return c1.Brand.compareToIgnoreCase(c2.Brand);
        }
    };

    public Computers(int ItemNo,double Price, String ProductName, int unitsinStock, String Brand, String Model, Processor Processor,
            Ram ram,
            DiskDrive disckDrive,
            Double ScreenSize)
    {
        this.ItemNumber = ItemNo;
        this.Price = Price;
        this.ProductName =  ProductName;
        this.UnitsinStock = unitsinStock;
        this.Brand = Brand;
        this.Model = Model;
        this.Processor = Processor;
        this.ram = ram;
        this.disckDrive = disckDrive;
        this.ScreenSize = ScreenSize;

    }


    void  SetBrand(String Brand){this.Brand = Brand;}
    String GetBrand(){ return Brand;}

    void  SetModel(String Model){this.Model = Model;}
    String getModel(){ return Model;}

    void  SetProcessor(Processor Processor){this.Processor = Processor;}
    Processor GetProcessor(){ return Processor ;}

    void  Setram(Ram ram){this.ram = ram;}
    Ram Getram(){ return ram ;}

    void  SetdisckDrive(DiskDrive disckDrive){this.disckDrive = disckDrive;}
    DiskDrive GetdisckDrive(){ return disckDrive ;}

    void  SetScreenSize(Double ScreenSize){this.ScreenSize = ScreenSize;}
    Double GetScreenSize(){ return ScreenSize ;}


    @Override
    public void SetItemNumber(int ItemNumber) {
    ItemNumber = ItemNumber;
    }

    @Override
    public int getItemNumber() {
        return ItemNumber;
    }

    @Override
    public void SetPrice(Double Price) {
        this.Price = Price;

    }

    @Override
    public Double getPrice() {
        return Price;
    }

    @Override
    public void SetName(String ProductName) {
        this.ProductName = ProductName;
    }

    @Override
    public String getName() {
        return  ProductName;
    }

    @Override
    public double GetUnitsInStock() {
        return UnitsinStock;
    }

    @Override
    public String toString() {
        return "Computers{" +
                "Brand='" + Brand + '\'' +
                ", ItemNumber=" + ItemNumber +
                ", Price=" + Price +
                ", ProductName='" + ProductName + '\'' +
                ", UnitsinStock=" + UnitsinStock +
                ", Model='" + Model + '\'' +
                ", Processor=" + Processor +
                ", ram=" + ram +
                ", disckDrive=" + disckDrive +
                ", ScreenSize=" + ScreenSize +
                '}';
    }

}

enum Processor { INTEL,AMD}
enum Ram{FOUR,EIGHT,SIXTEEN,THIRTYTWO}
enum DiskDrive{HDD,SDD}

