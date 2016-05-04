package Day2;

/**
 * Created by student on 04-May-16.
 */
public class Person {
    private String Fname;
    private String Lname;
    private String Gender;
    private int Age;
    private int weight;
    private String Smoker;
    private String Available;


    public Person()
    {
        Available = "yes";
    }
    public Person(String Firstname,String Lastname)
    {
        this.Fname = Firstname;
        this.Lname = Lastname;
    }

    public Person(String Firstname,String Lastname,String gender,int age, int weight ,String Smoker)
    {
        this(); //invoke the default constructor to set Available or not
        this.Fname = Firstname;
        this.Lname = Lastname;
        this.Gender = gender;
        this.Age = age;
        this.weight = weight;
        this.Smoker = Smoker;

       // this.Available = Available;

    }
    public void setname(String Firstname,String Lastname,String gender,int age, int weight ,String Smoker)
    {
        this.Fname = Firstname;
        this.Lname = Lastname;
        this.Gender = gender;
        this.Age = age;
        this.weight = weight;
        this.Smoker = Smoker;

    }

    public String getFirstname() { return Fname ;}
    public String getLasttname() { return Lname ;}
    public String getGender() { return Gender ;}
    public int getAge() { return Age ;}
    public int getWright() { return weight ;}
    public String getSmoker() { return Smoker ;}
    public String getAvailable() { return Available ;}


    @Override
    public String toString()
    {
        return  "" + Fname + " " +  Lname  + " " +  Gender  + " " +  Age  + " " +  weight  + " " +  Smoker  + " " +  Available ;
    }
}