package Day3;

/**
 * Created by student on 06-May-16.
 */
import static Day3.GenrateProduct.*;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.*;
import org.hamcrest.*;

import java.util.List;

public class InventoryUnitTesting {

    private Inventory inventory = new Inventory(100);

    @Test
    public void canGetInventorySize()
    {
        inventory.Computers.add(mackbookpro);
        inventory.Computers.add(lenovoThinkred);

        Assert.assertEquals("Size not match",2, inventory.getSize());

    }
    @Test
    public void shouldContainProducts()
    {
        inventory.Computers.add(mackbookpro);
        inventory.Computers.add(lenovoThinkred);

       assertThat(inventory.Computers,contains(mackbookpro,lenovoThinkred));

        Assert.assertEquals("Size not match",2, inventory.getSize());

    }



    private void asserThat() {
    }
}
