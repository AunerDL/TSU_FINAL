<%@ Page Language="C#" AutoEventWireup="true" CodeBehind="GoogleAuthorize.aspx.cs" Inherits="OAUTH2Proyecto1.GoogleAuthorize" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <meta charset="utf-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome"/>
    <title>Google Authorization Form</title>
    <link rel="stylesheet" type="text/css" href="Content/style.css" />

</head>
<body>
    <form id="form1" runat="server">
    <section class="container">
        <div class="login">
            <h1>Login Using Google</h1>
            <p>
                <asp:TextBox ID="txtGmail" runat="server" placeholder="Gmail"></asp:TextBox>
            </p>
            <p class="submit">
                <asp:Button ID="btnAuthorize" runat="server" Text="Google Âuthorize" OnClick="btnAuthorize_Click1"/>
            </p>
        </div>
    </section>
    </form>
</body>
</html>
