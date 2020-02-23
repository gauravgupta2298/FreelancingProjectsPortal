<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta content="text/html; charset=utf-8" http-equiv="Content-Type" />
        <link href="style.css" rel="stylesheet" type="text/css" />
        <title>Login Page</title>
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
        <div class="heading">
            <center>Freelancing Projects Portal (FPP)</center>
        </div>
        <div class="options">
            <center><br><a href="">Home</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                        <a href="browseCategories.jsp">Browse Project Categories</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                        <a href="aboutUs.jsp">About us</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                        <a href="contactUs.jsp">Contact us</a>
            </center>
        </div>
        <div style="height: 500px; width:49.9%; float:left; background-color:#FFFFCC; border-right-style:groove">
            <center><br/><span style="font-size:35px">Are you an <b>Employer</b>?</span>
                    <br/><br/>
                    <span style="font-size:20px">FPP is the best freelance platform in India to find & Hire talented and skilled freelancers to help you with your projects.</span>		
                    <br/><br/><br/>
                    <span style="font-size:25px">To become a Member <a href="employerSignup.jsp"><button>Sign Up</button></a>
                    <br/><br/><br/>
                    <b>Employer Login</b>
                    <form action="EmployerLoginChecker" method="post" style="font-size:20px">
                    <table>
                    <tr>
                        <td>Email :</td>
                        <td><input type="text" name="ename" placeholder="Enter Username Here"></td>
                    </tr>
                    <tr>
                        <td>Password:</td>
                        <td><input type="password" name="epassword" placeholder="Enter Password Here"></td>
                    </tr>
                    <tr>
                        <td><input type="reset"></td>
                        <td><input type="submit" value="login"></td>
                    </tr>
                    </table>
                    </form></span>		
            </center>
        </div>
        <div style="height: 500px; width:49.9%; float:left; background-color:#CCFFCC">
                    <center><br/><span style="font-size:35px">Are you a <b>Freelancer</b>?</span>			
                            <br/><br/><br/>
                            <span style="font-size:20px">FPP provides a great platform to freelancers to showcase their skills!</span>
                            <br/><br/><br/>
                            <span style="font-size:25px">To become a Member <a href="freelancerSignup.jsp"><button>Sign Up</button></a>
                            <br/><br/><br/>
                            <b>Freelancer Login</b>
                    <form action="FreelancerLoginChecker" method="post" style="font-size:20px">
                    <table>
                    <tr>
                        <td>Username:</td>
                        <td><input type="text" name="fname" placeholder="Enter Username Here"></td>
                    </tr>
                    <tr>
                        <td>Password:</td>
                        <td><input type="password" name="fpassword" placeholder="Enter Password Here"></td>
                    </tr>
                    <tr>
                        <td><input type="reset"></td>
                        <td><input type="submit" value="login"></td>
                    </tr>
                    </table>
                    </form></span>		
            </center>
        </div>
        <div style="height: 55px; width:99.9%; float:left; border-top-style:groove">	
            <b>Disclaimer:</b> You shall be solely responsible for your interaction (dealing in any way and making any payment) with the members at 
                               FreelancingProjectsPortal.Com and FreelancingProjectsPortal.Com is not responsible for the authenticity of the members or content provided by them. 
        </div>
    </body>
</html>
