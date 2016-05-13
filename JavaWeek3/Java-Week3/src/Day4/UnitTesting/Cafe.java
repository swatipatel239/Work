package Day4.UnitTesting;

/**
 * Created by student on 06-May-16.
 */
public class Cafe {
    private  int beansInStock = 0;
    private int milkInStock = 0;

    public void restockBeans(int beansInGrams)
    {
        beansInStock += beansInGrams;
    }

    public void restockMilk(int milkInMilileters)
    {
        milkInStock += milkInMilileters;
    }

    public int getBeansInStock(){ return  beansInStock; }
    public int getMilkInStock(){ return  milkInStock; }

    public Coffee brewCoffee(CoffeeType coffeeType)
    {
        return brewCoffee(coffeeType,1);
    }
    public Coffee brewCoffee(CoffeeType coffeeType,int quantity)
    {
       int requiredBeans = coffeeType.getRequiredBeans() * quantity;
        int requiredMilk = coffeeType.getRequiredMilk() * quantity;
        if(requiredBeans > beansInStock || requiredMilk > getMilkInStock())
        {
            throw new IllegalStateException("Not Enough stock to brea man!");
        }
        beansInStock -= requiredBeans;
        milkInStock -= requiredMilk;

        return  new Coffee(coffeeType,requiredBeans,requiredMilk);
    }

}
