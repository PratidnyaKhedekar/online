package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class user_005fchangePassword_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Change Password</title>\n");
      out.write("        \n");
      out.write("       <style>\n");
      out.write("            \n");
      out.write("            .div1{\n");
      out.write("                \n");
      out.write("                \n");
      out.write("                border:2px solid #00ffcc;\n");
      out.write("                \n");
      out.write("                display: inline-block;\n");
      out.write("                height: 50px;\n");
      out.write("                border-radius:20px 20px 20px 20px;\n");
      out.write("            }\n");
      out.write("            .heading\n");
      out.write("            {\n");
      out.write("                border:3px solid #00cc99;\n");
      out.write("                width:700px;\n");
      out.write("                height:50px;\n");
      out.write("                background-image: url(\"Images/banner.jpg\");\n");
      out.write("                background-repeat: no-repeat;\n");
      out.write("                color:#ff3333;\n");
      out.write("                border-radius:50px 50px 50px 50px;\n");
      out.write("                font-size: x-large;\n");
      out.write("                \n");
      out.write("            }\n");
      out.write("            .tbl\n");
      out.write("            {\n");
      out.write("                border:4px solid #66ff00;\n");
      out.write("                \n");
      out.write("                border-radius:34px 0px 34px 0px;\n");
      out.write("                width:700px;\n");
      out.write("                font-size: x-large;\n");
      out.write("                color:#ff3333;\n");
      out.write("                background-position: right;\n");
      out.write("                \n");
      out.write("                \n");
      out.write("            }\n");
      out.write("            .btn\n");
      out.write("            {\n");
      out.write("               \n");
      out.write("                border:2px solid;\n");
      out.write("                border-radius :12px 0px 12px 0px;\n");
      out.write("                height: 49px;\n");
      out.write("                width: 300px;\n");
      out.write("                font-size: x-large;\n");
      out.write("                color:#ff3333;\n");
      out.write("            }\n");
      out.write("            #form1\n");
      out.write("            {\n");
      out.write("                background-image: url(\"Images/A21.jpg\");\n");
      out.write("                background-repeat: no-repeat;\n");
      out.write("                background-color: white;\n");
      out.write("                \n");
      out.write("                \n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            body{\n");
      out.write("                background-color: #00cc99;\n");
      out.write("                background-image: url(\"Images/web7.jpg\");\n");
      out.write("              \n");
      out.write("                background-repeat: round;\n");
      out.write("                width:98%;\n");
      out.write("                height:600px;\n");
      out.write("            }\n");
      out.write("            .person\n");
      out.write("            {\n");
      out.write("             font-size: xx-large;  \n");
      out.write("             margin-left: 900px;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            .div2\n");
      out.write("            {\n");
      out.write("                display:inline-block; \n");
      out.write("                border:3px solid;\n");
      out.write("                font-size: x-large;\n");
      out.write("                color:#00ffcc;\n");
      out.write("               \n");
      out.write("                \n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            .dd1\n");
      out.write("            {\n");
      out.write("                background-image: url(\"Images/banner.jpg\");\n");
      out.write("                height:310px;\n");
      out.write("                width:700px;\n");
      out.write("                 margin-top: 40px;\n");
      out.write("                 border: 2px solid #00ffcc;\n");
      out.write("                 border-radius:63px 23px 0px 0px;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("        </style>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("    <center>  <h1 class=\"heading\">Fill form</h1></center>\n");
      out.write("    <center>    \n");
      out.write("    <form method=\"post\" action=\"user_changePassword.jsp\">\n");
      out.write("            \n");
      out.write("        <table class=\"tbl\">\n");
      out.write("            <tr><td>\n");
      out.write("                    Enter New Password </td><td><input type=\"password\" name=\"t1\" class=\"btn\"></td></tr>\n");
      out.write("           <tr><td></td><td><input type=\"Submit\" value=\"Change Password\" class=\"btn\"></td></tr>\n");
      out.write("           </table>\n");
      out.write("           \n");
      out.write("            \n");
      out.write("        </form>\n");
      out.write("    </center> \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        ");

        try
                               {
        String newpswd;                     
        HttpSession se=request.getSession();
        Class.forName("com.mysql.jdbc.Driver");
         
      
        newpswd =request.getParameter("t1");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/onlineshopping","root","password");
       
        String email =(String)session.getAttribute("id");
       out.println(email);
        
        if(newpswd!=null)
                               {
        PreparedStatement pst=con.prepareStatement("update usertbl set password='"+newpswd+"' where email='"+ email +"'");
        int i=pst.executeUpdate();
        if(i>0)
                       {
            out.println("Password has been updated");
            response.sendRedirect("user_profile.jsp");
        }
        }
        
      
       
       
         
        
        
        
        
        
        
        }
        catch(Exception e)
                               {
            out.println(e);
        }
        
      out.write("\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
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
