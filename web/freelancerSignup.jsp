<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="style.css" rel="stylesheet" type="text/css" />
        <title>Freelancer Signup</title>
    </head>
    <body>
    <%
            String fname=(String)session.getAttribute("fname");
            if(fname!=null)
            {
               response.sendRedirect("freelancerHome.jsp");
               return; //to avoid 'HTTP Status 500 - An exception occurred processing JSP page', as java code after this line shouldn't be excuted.
            }
            String ename=(String)session.getAttribute("ename");
            if(ename!=null)
            {
               response.sendRedirect("employerHome.jsp");
               return; //to avoid 'HTTP Status 500 - An exception occurred processing JSP page', as java code after this line shouldn't be excuted.
            }
    %>
    <center>
        <div class="heading">
            Freelancing Projects Portal (FPP)
        </div>
        <h1>Hello Freelancer!</h1>
        <span style="font-size:20px;">Enter Details:</span>
        <form action="FreelancerSignupChecker" method="post">
            <table>
                <tr>
                    <td><B>Username:</B></td>
                    <td><input type="text" name="fname" placeholder="Enter Username Here"></td>
                </tr>
                <tr>
                    <td><B>Full Name:</B></td>
                    <td><input type="text" name="fullname" placeholder="Enter Full Name Here"></td>
                </tr>
                <tr>
                <tr>
                    <td><B>Email:</B></td>
                    <td><input type="text" name="email" placeholder="Enter Email Here"></td>
                </tr>
                <tr>
                    <td><B>Password:</B></td>
                    <td><input type="password" name="fpassword" placeholder="Enter Password Here"></td>
                </tr>
                <tr>
                    <td><B>Confirm Password:</B></td>
                    <td><input type="password" name="cpassword" placeholder="Re-enter Password Here"></td>
                </tr>
                <tr>
                    <td><B>Age:</B></td>
                    <td><input type="number" name="age" placeholder="Enter Age Here"></td>
                </tr>
                <tr>
                    <td><B>Phone Number:</B></td>
                    <td><input type="number" name="phone" placeholder="Enter Number Here"></td>
                </tr>
                <tr>
                    <td><B>City:</B></td>
                    <td><input type="text" name="city" placeholder="Enter City Here"></td>
                </tr>
                <tr>
                    <td><input type="reset"></td>
                    <td><input type="submit" value="Sign Up"></td>
                </tr>
            </table>
        </form><br><br>
        <p><B>Note:</B> 1.Make sure your 'Password' and 'Confirm Password' fields contain same value.<br>
            2.Your username should be unique.<br>
            <B>Failure of above statements will lead to signup failure.</B></p>
        <br><br><h3>Already a Registered Freelancer?... <a href="home.jsp">Click here to Login</a></h3>
    </center>
    </body>
</html>
