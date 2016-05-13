package Day3;

import Day3.swing.Supplier;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

import static Day3.Computers.by_brand;
import static Day3.GenrateProduct.*;

/**
 * Created by student on 05-May-16.
 */
public class Inventory implements Iterator<Computers> {

    List<Computers> Computers = new ArrayList<>();

    private final int maxSize;
    private  int Size;
    private static final int Productdoesnotex = -1;

    public Inventory(int MaxSize)
    {
        this.maxSize = MaxSize;
      //  this.Size = 0;

    }
    public int getSize(){return Computers.size();}

    public Computers getProduct(int index)
    {
        return Computers.get(index);
    }
    /*
    public void AddProduct()
    {
        Computers.add(mackbookpro);
        Computers.add(lenovoThinkred);
    }
*/
    public void ReplaceProduct(Computers OldProduct,Computers newComputer)
    {
        final int index = Computers.indexOf(OldProduct);
        if(index != Productdoesnotex )
        {
            Computers.set(index,newComputer);
        }
    }
    public void prepareProduct()
    {
        // Sort product
        Computers.sort(by_brand);
    }

    public void isSuppliedBy(Supplier Suplier)
    {
        Computers.addAll(Suplier.getProducts());
    }

    public Iterator<Computers> iterator() {return Computers.iterator();}

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Computers next() {
        return null;
    }

    @Override
    public void remove() {

    }

    @Override
    public void forEachRemaining(Consumer<? super Computers> action) {

    }
}
