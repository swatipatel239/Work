using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Carsales
{
    class Car
    {
        //Instantiate 3 objects
        public static int NoOfcar;
        public static string Status;
        public string Make;
        public string Model;
        public int Price;
        public Boolean sold;

        public static string userInputcarName;
        public static string userInputCarModel;
        public static int userInputCarPrice;
        public static List<Car> AddcarinList = new List<Car>() { };


        public void AddCar(string Make, string Model, int price, string status)
        {
            this.Make = Make;
            this.Model = Model;
            this.Price = price;
        }
        
        //Add a static method to the car class

        //Add car Function is Adding new car in List
        static void AddcarMethod()
        {

            Console.Write("Please enter Car Maker Name you want Add :  ");
            userInputcarName = Console.ReadLine();

            Console.Write("Please enter Car Maker Model you want Add :  ");
            userInputCarModel = Console.ReadLine();

            Console.Write("Please enter Car Price you want Add :  ");
            userInputCarPrice = Convert.ToUInt16(Console.ReadLine());

        }

        //Add car Function is BuyCar and check if is is sold or not.
        static void BuyCarInput()
        {
            Console.Write("Please enter Car Maker Name you want to buy: ");
            userInputcarName = Console.ReadLine();

            Console.Write("Please enter New Car Model Name Name you want to buy: ");
            userInputCarModel = Console.ReadLine();

            Console.Write("Please enter New Car Price Name you want to buy: ");
            userInputCarPrice = Convert.ToUInt16(Console.ReadLine());

        }

        static void Main(string[] args)
            {


            Car car1 = new Car();
            Car car2 = new Car();
            Car car3 = new Car();

                List<Car> AddCarinList = new List<Car>();
                Console.WriteLine("Do you want to Add Car as Admin Press A ");
                Console.WriteLine("Do you want to check Car is Sold or not Press Y");
                Status = Console.ReadLine().ToUpper();

                if (Status != null && Status == "Y")
                {
                    BuyCarInput();
                }
                else
                {

                    car1.AddCar("RollsRoyce", "Silver Cloud", 35000,"Sold");
                    NoOfcar++;
                    car2.AddCar("Aston Martin", "DB5", 750000,"Not Sold");
                    NoOfcar++;
                    car3.AddCar("Reliant", "Robin", 550,"Not Sold");
                    NoOfcar++;

                    AddCarinList.Add(car1);
                    AddCarinList.Add(car2);
                    AddCarinList.Add(car3);

                    car1.ListAllCars(AddCarinList);
                    car2.ListAllCars(AddCarinList);
                    car3.ListAllCars(AddCarinList);


                Console.ReadLine();
                AddcarMethod();
                car1.AddCar(userInputcarName, userInputCarModel, userInputCarPrice, "NotSold");
                AddcarinList.Add(car1);
                car1.ListAllCars(AddcarinList);
                NoOfcar++;
                // Car.

                 }

            }

        public void ListAllCars(List<Car> allCars)
        {
            int totalValueSold = 0;
            int totalValueInStock = 0;

            foreach (Car item in allCars)
            {
                Console.WriteLine("The details of this car are: ");
                Console.Write("Make and model: {0} {1}, price: £{2:N0}.", item.Make, item.Model, item.Price);  //:N0 formats the number
                if (Car.Status == "Sold")
                {
                    Console.WriteLine("This car has been sold.");
                    totalValueSold += item.Price;
                }
                else
                {
                    Console.WriteLine("This car is unsold.");
                    totalValueSold += item.Price;
                }
                Console.WriteLine();
            }
            Console.WriteLine("The total value of cars sold is: £{0:N0}.", totalValueSold);
            Console.WriteLine("The total value of cars still in stock is: £{0:N0}.", totalValueInStock);
            Console.WriteLine();
        }
        //record the sale of a car
        public void Sold(bool isSold, int price)
        {
            this.sold = isSold;
          //  this.price = price;
            //adjust the number of cars
            Car.NoOfcar--;
        }

    }
}


