package Day2;

/**
 * Created by student on 04-May-16.
 */
public class Contact extends Person {

    private AddressBook[] addresses;
    private String Phone;
    private  String Email;
    private  String TwitterAccout;
    private  String facebook;

    public Contact(String Firstname, String Lastname,String Phone,AddressBook Address,String Email,String Twitter,String Facebook )
    {
        super(Firstname,Lastname);
        this.Phone = Phone;
        this.addresses = addresses;
        this.TwitterAccout = Twitter;
        this.facebook = Facebook;

    }

    public Contact(String Fname, String Lname,AddressBook Address )
    {
        super(Fname, Lname);
        this.Phone = Phone;
        this.addresses = addresses;
    }

    @Override
    public String toString()
    {
        return super.toString()+ " Phone Numer is: " + Phone + " Address is : " + addresses + "  Email i is :" + Email + " Twitter Account : " + TwitterAccout + " facebook is :  " + facebook;
    }
}
