using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;
using System.Data.Sql;
using System.Data.SqlClient;
using System.Data.Linq;
using System.Data;
using System.Web.Configuration;

public partial class Default2 : System.Web.UI.Page
{
    string str = "";

    protected void Page_Load(object sender, EventArgs e)
    {

    }

    protected void btnSubmit_Click(object sender, EventArgs e)
    {   

        SqlConnection con = new SqlConnection(WebConfigurationManager.ConnectionStrings["swatidatConnectionString"].ConnectionString);

        try
        {
            con.Open();
            SqlDataAdapter sda = new SqlDataAdapter("select * from Login ", con);
            DataTable dt = new DataTable();
            sda.Fill(dt);

            lblMessage.Text = "Connection is succesfull.";
        }
        catch(Exception ex)
        { 
            Response.Write(ex.Message);
        }

    }
}