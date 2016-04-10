<%-- 
    Document   : ShowFormData
    Created on : Apr 10, 2016, 5:29:31 PM
    Author     : weitang
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean id = "b" class = "com.javax.lex.StoreFormDataBean" scope = "applicaton">
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>

    </head>
    <body>
        <h1>Congratulation!</h1>
        <p>FName: ${b.FName}</p>
        <p>LName: ${b.LName}</p>
        <p>UserID ${b.UserID}</p>
        <p>Password: ${b.password}</p>
        <p>RePassword ${b.RePassword}</p>
        <p> Alias: ${b.alias}</p>
        <p> CountryOfRes: ${b.CountryOfRes}</p>
        <p> City: ${b.City}</p>
        <p>Language: ${b.Language}</p>
        <p>Security Question: ${b.SecurityQues}</p>
        <p>Security Ans : ${b.SecurityAns}</p>

    </body>
</html>
