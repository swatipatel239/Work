package Day3;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by student on 05-May-16.
 */
public class InventorySystem {

    public static void main(String[] args)
    {
        Inventory inventory = new Inventory(500);
        List<Computers> computerses = new ArrayList<>();

        inventory.AddProduct();

        for(int i = 0 ; i < inventory.Computers.size() ; i++ )
        {
           computerses.add(inventory.getProduct(i));
            System.out.print(computerses.get(i));
        }

    }
}
