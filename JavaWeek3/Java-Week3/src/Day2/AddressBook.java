package Day2;

/**
 * Created by student on 04-May-16.
 */
public class AddressBook {

    private  String street;
    private String City;
    private String Country;
    private String Postcode;

    public  AddressBook(){}

    public AddressBook(String st, String city,String cunty,String pd)
    {
        this.street = st;
        this.City = city;
        this.Country = cunty;
        this.Postcode = pd;
    }

    public String getStreet(){ return street ;}
    public void SetStreet(String street){this.street = street ; }

    public String getCity(){ return City ;}
    public void SetCity(String city){this.City = city ; }

    public String GetCountry(){ return Country ;}
    public void SetContry(String Coutry){this.Country = Coutry ; }

    public String GetPostcode(){ return Postcode ;}
    public void SetPostcode(String postcode){this.Postcode = postcode ; }

    @Override
    public String toString()
    {
        return String.format( "Street Address :%s, City: %s, Country: %s, Postcode: %s " , street,City,Country,Postcode);
    }
}

