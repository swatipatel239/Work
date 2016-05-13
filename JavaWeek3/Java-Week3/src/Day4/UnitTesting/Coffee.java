package Day4.UnitTesting;

/**
 * Created by student on 06-May-16.
 */
public class Coffee {
    private final CoffeeType type;
    private final int beans;
    private final int milk;

    public Coffee(CoffeeType type, int beans, int milk) {
        this.type = type;
        this.beans = beans;
        this.milk = milk;
    }
    public int getBeans()
    {
        return beans;
    }
    public int getMilk()
    {
        return milk;
    }
    public CoffeeType getType()
    {
        return type;
    }

    @Override
    public String toString() {
        return "Coffee{" +
                "beans=" + beans +
                ", type=" + type +
                ", milk=" + milk +
                '}';
    }
}
