package Day4.UnitTesting;

/**
 * Created by student on 06-May-16.
 */
public class CoffeProgram {

    public static void main(String[] args) {
        Cafe cafe = new Cafe();
        cafe.restockBeans(CoffeeType.CAPPUCINO.getRequiredBeans());
        cafe.restockMilk(CoffeeType.CAPPUCINO.getRequiredMilk());
        Coffee coffee =  cafe.brewCoffee(CoffeeType.CAPPUCINO);
        System.out.println(coffee.toString());

    }

}
