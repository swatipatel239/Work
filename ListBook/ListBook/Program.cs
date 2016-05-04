using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ListBook
{
    class Program
    {
        static void Main(string[] args)
        {
            
            //Create a program that contains a list of book titles and allows you to add a book, delete a book, list the books and sort the books

            List<string> books = new List<string>() {"Book1","Book3","Book2","Book4"};
            Console.WriteLine("Oprations you want to perform:0=PrintList 1=Add 2=Delete 3=Sort 4=Search");
            Console.Write("Please enter your selection: ");
            string str = Console.ReadLine();

            // Notice the goto statements in cases 2 and 3. The base cost of 25
            // cents is added to the additional cost for the medium and large sizes.
            do
            {
                switch (str)
                {
                    case "0":
                    case "PrintList":
                        Console.WriteLine("list of books are:" + string.Join(",", books));
                        break;
                    case "1":
                    case "Add":
                        Console.Write("Please enter you want to add: ");
                        str = Console.ReadLine();
                        books.Add(str);
                        Console.WriteLine("New List with Added :" + string.Join(",", books));
                        break;
                    case "2":
                    case "Delete":
                        Console.Write("Please enter you want to Delete: ");
                        str = Console.ReadLine();
                        books.Remove(str);
                        Console.WriteLine("New List After Deleting :" + string.Join(",", books));
                        break;
                    case "3":
                    case "Sort":
                        books.Sort();
                        Console.WriteLine("New List with Sorting :" + string.Join(",", books));
                        break;
                    case "4":
                    case "Search":
                        Console.Write("Please enter you want to Search: ");
                        str = Console.ReadLine();
                        var value = books.Find(item => item.Equals(str));

                        if (value != null)
                         {
                                Console.WriteLine("Search is fine,This book is in our data Base: "+ str);
                         }
                            else
                         {
                                Console.WriteLine("You dont have that in list");
                         }
                        break;
                    default:
                        Console.WriteLine("Invalid selection. Please select 1, 2, or 3.");
                        break;
                }
                Console.Write("Please enter your selection: ");
                str = Console.ReadLine();
            } while (str != "");
            

           
        }

    }
    
}
