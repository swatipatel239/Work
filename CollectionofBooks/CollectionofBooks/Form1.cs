using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using System.Collections;


namespace CollectionofBooks 
{
    public partial class Form1 : Form
    {
        public static ArrayList ListofBook = new ArrayList();
      
        class CollectionofBooks 
        {
            
            string _Title;
            string _Author;
            string _ISBN;
            double _Price;

            public CollectionofBooks()
            {
            }
            public CollectionofBooks(string title,string author,string ISBN,double price)
                {
                this._Title = title;
                this._Author = author;
                this._ISBN = ISBN;
                this._Price = price;
                }
            public string Title
            {
                get { return _Title; }
                set { _Title = value; }
            }
            public string Author
            {
                get { return _Author; }
                set { _Author = value; }
            }
            public string ISBN
            {
                get { return _ISBN; }
                set { _ISBN = value; }
            }
            public double Price
            {
                get { return _Price; }
                set { _Price = value; }
            }

            public String toString()
            {
                return String.Format("Title: {0}", _Title);
            }

        }

        public Form1()
        {
            InitializeComponent();
        }

        public void Addbooks()
        {
            //ArrayList ListofBook = new ArrayList();
            //rayList<CollectionofBooks> ListofBook = new ArrayList<CollectionofBooks>();
           

            ListofBook.Add(new CollectionofBooks("Principles and Practice Using C++ ", "swati patel", "123-123", 100));
            ListofBook.Add(new CollectionofBooks("Principles and Java ", "John", "123456798", 100));
        }

        public void DisplayBook()
        {
            
            foreach (object obj in ListofBook) 
            {
                Console.WriteLine(obj.);
                //string[] arr = ((IEnumerable)ListofBook).Cast<object>().Select(x => x.ToString()).ToArray();
                //label1.Text = string.Join("," , arr );
            }
        }

        private void Form1_Load(object sender, EventArgs e)
        {
            Addbooks();
            DisplayBook();
        }
    }
}
