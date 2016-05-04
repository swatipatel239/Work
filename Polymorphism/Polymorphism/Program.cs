using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Polymorphism
{
    class Program
    {
        class Polymorphism
        {
            //Create a program which displays the number of wheels different vehicles have, using polymorphism

            void print(int i)
            {
                Console.WriteLine("Number of wheels Normal Car have : {0}", i);
            }

            void print(double f)
            {
                Console.WriteLine("Number of wheels BUS " , f);
            }

            void print(string s)
            {
                Console.WriteLine("This is tractor", s);
            }
            static void Main(string[] args)
            {
                Polymorphism p = new Polymorphism();

                // Call print to print integer
                p.print(4);

                // Call print to print float
                p.print(6);

                // Call print to print string
                p.print("Tracktor");
                Console.ReadKey();
            }
        }
    }
}
