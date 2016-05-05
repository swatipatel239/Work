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
      
        class Book 
        {
            
            string _Title;
            string _Author;
            string _ISBN;
            double _Price;

            public Book()
            {
            }
            public Book(string title,string author,string ISBN,double price)
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

          

        }

        public Form1()
        {
            InitializeComponent();
        }

        public void Addbooks()
        {
            //ArrayList ListofBook = new ArrayList();
            //rayList<CollectionofBooks> ListofBook = new ArrayList<CollectionofBooks>();
           

            ListofBook.Add(new Book("Principles and Practice Using C++ ", "swati patel", "123-123", 100));
            ListofBook.Add(new Book("Principles and Java ", "John", "123456798", 100));
        }

        public void DisplayBook()
        {

            //var query = from Book b in ListofBook
            //            where b.Author.Contains("swati")
            //            select b;
          
            foreach (Book b in ListofBook)
            {
                listBox1.DataSource = ListofBook;
                listBox1.DisplayMember = "Title";
                label1.Text = b.Author;
            }
        }

        private void Form1_Load(object sender, EventArgs e)
        {
            Addbooks();
            DisplayBook();
        }

        private void listBox1_SelectedIndexChanged(object sender, EventArgs e)
        {

        }
    }
}
