package Day3;

/**
 * Created by student on 05-May-16.
 */
public interface Product {

    //Define Variables data Type



    //methods Get and set information

    //item number, the name of the product, the number of units in stock, and the price of each unit.

    void SetItemNumber(int ItemNumber);
    int getItemNumber();

    void SetPrice(Double Price);
    Double getPrice();

    void SetName(String ProductName);
    String getName();

    double GetUnitsInStock();

}

