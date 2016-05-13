package Day4.UnitTesting;

/**
 * Created by student on 06-May-16.
 */

import org.junit.*;
import org.hamcrest.*;

public class CoffeUnitTesting {

    private Cafe cafe = new Cafe();
    private static final int NOMILK=0;
    private static final int NOBEANS=0;

    @Test
    public void mustRestockBeans()
    {
        //given
        //when
        cafe.restockBeans(100);
        //then
        Assert.assertEquals("failed to restock",100,cafe.getBeansInStock());
    }

    @Test
    public void canBrewcappucino()
    {
        //Given
        //When
       Coffee coffee = cafe.brewCoffee(CoffeeType.CAPPUCINO);

        //Then
        Assert.assertEquals("Wrong Coffee Type", CoffeeType.CAPPUCINO,coffee.getType());
    }

    public void requirePoistivevalue(int value)
    {
        if(value < 1 ) throw new IllegalArgumentException();{}
    }
}
