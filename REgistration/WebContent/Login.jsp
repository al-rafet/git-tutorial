<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <style type="text/css">
            div#adminlogin{
                width: 30%;
                height: 50%;
                background-color: #AFC7C7;
                border-width: thin;
                border-style: solid;
                border-color: #000000;
                margin: 0 auto;
                text-align: left;
                overflow: hidden;
                padding: 5px;
                padding-left: 20px;
            }
            .inputtext{
                width: 250px;
                height: 30px;
                font-family: Arial;
                font-size: 18px;
            }
        </style>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div id="adminlogin">
            <p> Administrator Login </p>
        <form method="post" action="Login">
            <label>Username<br/>
                <input type="text" class="inputtext" name="name" 
                       value="" placeholder="user Name"/>
            </label><br/>
             <label>Password<br/>
                <input type="password" class="inputtext" name="pass" 
                        placeholder="password"/>
            </label><br/>
            <br/>
            <input type="submit" value="Login"/>
            New to Our Website?<a href="registration.jsp">Sign Up</a> 
            
        </form>
        </div>
    </body>
</html>