package Day3;

        import java.util.ArrayList;
        import java.util.List;

        import static Day3.GenrateProduct.*;

/**
 * Created by student on 05-May-16.
 */
public class InventorySystem {

    public static void main(String[] args)
    {
        Inventory inventory = new Inventory(500);
        List<Computers> computerses = new ArrayList<>();

        /*
        inventory.AddProduct();

        for(int i = 0 ; i < inventory.Computers.size() ; i++ )
        {
            computerses.add(inventory.getProduct(i));
            System.out.print(computerses.get(i));
        }
        */

        inventory.isSuppliedBy(swati);
        inventory.isSuppliedBy(John);

        System.out.println(swati);
        inventory.ReplaceProduct(lenovoThinkred,dellAlienware);
        inventory.prepareProduct();

        for(int i = 0; i<inventory.Computers.size() ; i++) {
            System.out.println(inventory.Computers.get(i));
        }

    }
}
