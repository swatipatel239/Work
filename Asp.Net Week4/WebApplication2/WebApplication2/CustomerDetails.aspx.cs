using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

namespace WebApplication2
{
    public partial class CustomerDetails : System.Web.UI.Page
    {
        protected void Page_Load(object sender, EventArgs e)
        {
            if (!IsPostBack)
            {
                DataGridBind();
            }
        }

        protected void GridView1_RowEditing(object sender, GridViewEditEventArgs e)
        {
            GridView1.EditIndex = e.NewEditIndex;
            DataGridBind();
        }

        protected void GridView1_RowDeleting(object sender, GridViewDeleteEventArgs e)
        {
            DataClasses1DataContext dbContext = new DataClasses1DataContext();
            Response.Write(Convert.ToInt32(GridView1.DataKeys[e.RowIndex].Value));
            int row = Convert.ToInt32(GridView1.DataKeys[e.RowIndex].Value);

            var d = from db in dbContext.GetTable<Login>()
                    where db.id == row
                    select db;
            GridView1.DataSource = d;
            GridView1.DataBind();
        }

        public void DataGridBind()
        {
            DataClasses1DataContext dbContext = new DataClasses1DataContext();
            var d = from db in dbContext.GetTable<Login>()
                    select db;
            GridView1.DataSource = d;
            GridView1.DataBind();
        }

        protected void GridView1_RowUpdating(object sender, GridViewUpdateEventArgs e)
        {
            GridViewRow row = (GridViewRow)GridView1.Rows[e.RowIndex];
            DataClasses1DataContext dbContext = new DataClasses1DataContext();
            
        }
    }
}