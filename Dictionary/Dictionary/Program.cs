using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Dictionary
{
    class Program
    {
        static void Main(string[] args)
        {
            var myDictionary = new Dictionary<string, int>()
                {
                    {"Abc", 1},
                    {"PQR", 2},
                    {"XYZ", 3}
                };

            Console.WriteLine("Total Dictionaty are :" + myDictionary.Count);
            //Console.ReadLine();

            Console.Write("Please enter your key value: ");
            string str = Console.ReadLine();
            Console.WriteLine(myDictionary.ContainsKey(str));

            do
            {
                if (myDictionary.ContainsKey(str) == true)
                {
                    int value = myDictionary[str];
                    Console.WriteLine("you have key value in Disctonary : " + str);
                    Console.WriteLine("you have key value in Disctonary So do want to remore it : " + str);
                    string answer = Console.ReadLine();
                    if (answer == "yes")
                    {
                        myDictionary.Remove(str);
                        foreach (KeyValuePair<string, int> pair in myDictionary)
                        {
                            Console.WriteLine("New myDictionaryafter remove is here :" + pair.Key, pair.Value);
                            // Console.ReadLine();
                        }
                    }
                    else
                    {
                        Console.WriteLine("please dont do anything ");
                    }
                    // Console.Write("Please enter your key value: ");
                    //str = Console.ReadLine();
                }
                else
                {
                    myDictionary.Add(str, 4);
                    foreach (KeyValuePair<string, int> pair in myDictionary)
                    {
                        Console.WriteLine("New myDictionary is here :" + pair.Key, pair.Value);
                        //Console.ReadLine();
                    }
                }

                Console.Write("Please enter your key value: ");
                str = Console.ReadLine();
            }
            while (str != null);
        }
    }
}
