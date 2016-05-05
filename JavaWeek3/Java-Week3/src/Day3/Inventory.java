package Day3;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.List;
import static Day3.GenrateProduct.*;

/**
 * Created by student on 05-May-16.
 */
public class Inventory {

    List<Computers> Computers = new ArrayList<>();

    private final int maxSize;
    private  int Size;

    public Inventory(int MaxSize)
    {
        this.maxSize = MaxSize;
        this.Size = 0;
    }
    public int getSize(){return Size;}

    public Computers getProduct(int index)
    {
        return Computers.get(index);
    }
    public void AddProduct()
    {
        Computers.add(mackbookpro);
        Computers.add(lenovoThinkred);
    }


}
