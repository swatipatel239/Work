using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using System.Data.Entity;
using System.Data.SqlClient;

namespace WindowsFormsApplication1
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }
        private void Form1_Load(object sender, EventArgs e)
        {

        
            using (Swati_DatabaseEntities  myEntities = new Swati_DatabaseEntities())
            {
                var Questions = from ques in myEntities.MathQuizes select ques;
                                

                List<MathQuize> listCustomers = new List<MathQuize>();
              //  int customerListIndex = 0;
                listCustomers = Questions.ToList();

              //listBox1.Text = listCustomers.ToList();

                // SqlDataAdapter sda = new SqlDataAdapter(cmd);
                //  DataTable dt = new DataTable();
                // sda.Fill(dt);

                // DataTable dt = new DataTable();

                //// sda.Fill(dt);
                // for (int i = 0; i < dt.Rows.Count; i++)
                // {
                //     checkedListBox1.Items.Add(dt.Rows[i]["questions"].ToString());

                // }
            }
        }

      
        
    }
}
