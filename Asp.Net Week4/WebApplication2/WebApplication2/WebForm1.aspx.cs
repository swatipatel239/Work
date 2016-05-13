using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;
using System.Data;

namespace WebApplication2
{
    public partial class WebForm1 : System.Web.UI.Page
    {
        protected void Page_Load(object sender, EventArgs e)
        {

        }
        protected void Button1_Click(object sender, EventArgs e)
        {
            DataClasses1DataContext dbContext = new DataClasses1DataContext();
            var d = from db in dbContext.GetTable<Login>()
                   where db.UserName == txtUname.Text.ToString() && db.Password == txtPwd.Text.ToString()
                    select db;
             GridView1.DataSource = d;
            if (d != null)
            {
                GridView1.DataBind();
                Response.Redirect("CustomerDetails.aspx");
            }
        }
    }
}