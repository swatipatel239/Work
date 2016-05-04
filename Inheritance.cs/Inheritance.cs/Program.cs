using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Inheritance.cs
{
    class Program
    {
        class AddCarOwner
        {
            public string employeeID;
            public string employeeLastName;
            public string employeeFirstName;
            public double employeePayrate;
            public int employeeHours;
            public bool employeeFT;
            string Title;
            string Description;

            public static List<AddCarOwner> employees = new List<AddCarOwner>();

            
            public AddCarOwner(string eID, string eLastName, string eFirstName, string ePhone, double ePayrate, int eHours, bool eFT) 
            {
                this.employeeID = eID;
                this.employeeLastName = eLastName;
                this.employeeFirstName = eFirstName;
                this.employeeID = ePhone;
                this.employeePayrate = ePayrate;
                this.employeeHours = eHours;
                this.employeeFT = eFT;
            }


            class AddDescription : AddCarOwner
            {
                public AddDescription(string title) : base("mtsubas_e1", "Murtaza", "Mirza", "615 - 898 - 2323", 10, 90, true)
                {
                    Title = "tEst ttile";
                    Description = "testDesc";
                }
            }
           
            static void Main()
            {

                AddDescription AddDesc = new AddDescription("TestDesc");
                employees.Add(AddDesc);
                employees.Add(new AddCarOwner("mtsubas_e1", "Murtaza", "Mirza", "615-898-2323", 10, 90, true));
                employees.Add(new AddCarOwner("mtsubas_e2", "Ray", "Angie", "615-898-2323", 11, 80, true));
                employees.Add(new AddCarOwner("mtsubas_e3", "Burton", "James", "615-898-2323", 12, 70, false));
                employees.Add(new AddCarOwner("mtsubas_e4", "Bullard", "Dwight", "615-898-2323", 13, 60, true));
                employees.Add(new AddCarOwner("mtsubas_e5", "Apigian", "Charlie", "615-898-2323", 14, 50, true));
                employees.Add(new AddCarOwner("mtsubas_e6", "Lee", "Jung-Song", "615-898-2323", 15, 90, true));
                employees.Add(new AddCarOwner("mtsubas_e7", "Maier", "Lee", "615-898-2323", 16, 70, false));
                employees.Add(new AddCarOwner("mtsubas_e8", "Bamahnziari", "Tammy", "615-898-2323", 17, 60, true));
                DisplayList();
            }

            static void DisplayList()
            {
                foreach (AddCarOwner Displydata in employees)
                {
                    Console.WriteLine(Displydata.employeeID + Displydata.employeeFirstName + Displydata.employeePayrate + Displydata.employeeHours + Displydata.employeeHours +  Displydata.Description  );
                }
                Console.ReadLine();
            }

            // Static constructor to initialize the static member, currentID. This
            // constructor is called one time, automatically, before any instance
            // of AddCarOwner or ChangeRequest is created, or currentID is referenced.
           

        }
    }
}
