package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta content=\"text/html; charset=utf-8\" http-equiv=\"Content-Type\" />\n");
      out.write("        <link href=\"style.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("        <title>Login Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

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
        
      out.write("\n");
      out.write("        <div class=\"heading\">\n");
      out.write("            <center>Freelancing Projects Portal (FPP)</center>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"options\">\n");
      out.write("            <center><br><a href=\"\">Home</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                        <a href=\"browseCategories.jsp\">Browse Project Categories</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                        <a href=\"aboutUs.jsp\">About us</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                        <a href=\"contactUs.jsp\">Contact us</a>\n");
      out.write("            </center>\n");
      out.write("        </div>\n");
      out.write("        <div style=\"height: 500px; width:49.9%; float:left; background-color:#FFFFCC; border-right-style:groove\">\n");
      out.write("            <center><br/><span style=\"font-size:35px\">Are you an <b>Employer</b>?</span>\n");
      out.write("                    <br/><br/>\n");
      out.write("                    <span style=\"font-size:20px\">FPP is the best freelance platform in India to find & Hire talented and skilled freelancers to help you with your projects.</span>\t\t\n");
      out.write("                    <br/><br/><br/>\n");
      out.write("                    <span style=\"font-size:25px\">To become a Member <a href=\"employerSignup.jsp\"><button>Sign Up</button></a>\n");
      out.write("                    <br/><br/><br/>\n");
      out.write("                    <b>Employer Login</b>\n");
      out.write("                    <form action=\"EmployerLoginChecker\" method=\"post\" style=\"font-size:20px\">\n");
      out.write("                    <table>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Email :</td>\n");
      out.write("                        <td><input type=\"text\" name=\"ename\" placeholder=\"Enter Username Here\"></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Password:</td>\n");
      out.write("                        <td><input type=\"password\" name=\"epassword\" placeholder=\"Enter Password Here\"></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td><input type=\"reset\"></td>\n");
      out.write("                        <td><input type=\"submit\" value=\"login\"></td>\n");
      out.write("                    </tr>\n");
      out.write("                    </table>\n");
      out.write("                    </form></span>\t\t\n");
      out.write("            </center>\n");
      out.write("        </div>\n");
      out.write("        <div style=\"height: 500px; width:49.9%; float:left; background-color:#CCFFCC\">\n");
      out.write("                    <center><br/><span style=\"font-size:35px\">Are you a <b>Freelancer</b>?</span>\t\t\t\n");
      out.write("                            <br/><br/><br/>\n");
      out.write("                            <span style=\"font-size:20px\">FPP provides a great platform to freelancers to showcase their skills!</span>\n");
      out.write("                            <br/><br/><br/>\n");
      out.write("                            <span style=\"font-size:25px\">To become a Member <a href=\"freelancerSignup.jsp\"><button>Sign Up</button></a>\n");
      out.write("                            <br/><br/><br/>\n");
      out.write("                            <b>Freelancer Login</b>\n");
      out.write("                    <form action=\"FreelancerLoginChecker\" method=\"post\" style=\"font-size:20px\">\n");
      out.write("                    <table>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Username:</td>\n");
      out.write("                        <td><input type=\"text\" name=\"fname\" placeholder=\"Enter Username Here\"></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Password:</td>\n");
      out.write("                        <td><input type=\"password\" name=\"fpassword\" placeholder=\"Enter Password Here\"></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td><input type=\"reset\"></td>\n");
      out.write("                        <td><input type=\"submit\" value=\"login\"></td>\n");
      out.write("                    </tr>\n");
      out.write("                    </table>\n");
      out.write("                    </form></span>\t\t\n");
      out.write("            </center>\n");
      out.write("        </div>\n");
      out.write("        <div style=\"height: 55px; width:99.9%; float:left; border-top-style:groove\">\t\n");
      out.write("            <b>Disclaimer:</b> You shall be solely responsible for your interaction (dealing in any way and making any payment) with the members at \n");
      out.write("                               FreelancingProjectsPortal.Com and FreelancingProjectsPortal.Com is not responsible for the authenticity of the members or content provided by them. \n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
