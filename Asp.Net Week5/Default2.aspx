<%@ Page Language="C#" AutoEventWireup="true" CodeFile="Default2.aspx.cs" Inherits="Default2" %>
<a href="Web.config"></a>
<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title></title>
</head>
<body>
    <form id="form1" runat="server">
    
    
   
    <asp:Table ID="Table1" runat="server" BorderColor="WindowFrame" Height="100px" Width="236px">
        <asp:TableRow>
            <asp:TableCell><asp:label runat="server" text="User Name" ID="lblUname"></asp:label> 

            </asp:TableCell>
           <asp:TableCell>
                <asp:TextBox ID="txtUname" runat="server"></asp:TextBox>
           </asp:TableCell>
        </asp:TableRow>
         <asp:TableRow>
        <asp:TableCell><asp:label runat="server" text="Password:" ID="lblpwd"></asp:label> 

               </asp:TableCell>
                <asp:TableCell>
                <asp:TextBox ID="txtPassword" runat="server"></asp:TextBox>
              </asp:TableCell>

        </asp:TableRow>
    </asp:Table>
         <asp:Button ID="Button1" runat="server" OnClick="Button1_Click" Text="Button" />
         <asp:Button ID="btnSubmit" runat="server" Text="Submit" OnClick="btnSubmit_Click" />
        <asp:Label ID="lblMessage" runat="server" Text=""></asp:Label>
       
    </form>
</body>
</html>

