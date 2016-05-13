package Day4.UnitTesting;

/**
 * Created by student on 06-May-16.
 */
public enum CoffeeType {

    Expresso(10,0), LATTE(5,300),CAPPUCINO(7,100),FILTERCOFFEE(10,0);

    private final int requiredBeans;
    private final int requiredMilk;

        CoffeeType(int requiredBeans, int requiredMilk) {
        this.requiredBeans = requiredBeans;
        this.requiredMilk = requiredMilk;
    }

    public int getRequiredBeans() {
        return requiredBeans;
    }

    public int getRequiredMilk() {
        return requiredMilk;
    }
}
