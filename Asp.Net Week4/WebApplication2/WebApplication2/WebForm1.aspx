<%@ Page Language="C#" AutoEventWireup="true" CodeBehind="WebForm1.aspx.cs" Inherits="WebApplication2.WebForm1" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title></title>
</head>
    <body>
        <form id="form1" runat="server">
      <div class="divTable">
             <div class="headRow">
                <div class="divCell" align="center">Login In</div>
                <div  class="divCell" align="center">User Name :
                    <asp:TextBox ID="txtUname" runat="server"></asp:TextBox>
                 </div>
                <div  class="divCell" align="center">User Password : <asp:TextBox ID="txtPwd" runat="server"></asp:TextBox>
                 </div>
                  <div class="divCell" align="center">    <asp:Button ID="Button1" runat="server" Text="Button" OnClick="Button1_Click" /></div>
             </div>

      
      </div>
            <asp:GridView ID="GridView1" runat="server">
            </asp:GridView>
        </form>
</body>
</html>
