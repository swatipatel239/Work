package Day3.swing;

import Day3.Computers;
import java.util.ArrayList;

import java.util.List;

/**
 * Created by student on 06-May-16.
 */
public class Supplier {
    private String name;
    private final List<Computers> products = new ArrayList<>();

    public Supplier(String name){this.name = name ;}

    public List<Computers> getProducts(){ return products;}
    public String  getName(){return name;}

    @Override
    public String toString(){return "Supplier { Name : " + name + "Product : " + products;}
}
