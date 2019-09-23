package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class newRegister_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Register Page</title>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"newRegister.css\">\n");
      out.write("    </head>\n");
      out.write("    <body style=\"background-image: url(h4.jpg);background-repeat: no-repeat;background-size: 100%\">\n");
      out.write("        \n");
      out.write("        ");

        String customerId=(String)session.getAttribute("cidTextBox");    
        String firstName=(String)session.getAttribute("firstnameTextBox");
        String lastName=(String)session.getAttribute("lastnameTextBox");
        String contactNo=(String)session.getAttribute("contactTextBox");
        String email=(String)session.getAttribute("emailTextBox");
        String country=(String)session.getAttribute("countryTextBox");
        String guestNum=(String)session.getAttribute("guestTextBox");
        String id=request.getParameter("idTextBox");

            
      out.write("\n");
      out.write("            \n");
      out.write("            <div id=\"register\">\n");
      out.write("                        \n");
      out.write("                <form id=\"index_form\" action=\"NewRegisterServlet\" method=\"get\" style=\"opacity: 0.8;\" >\n");
      out.write("                <h1 style=\"color: red;padding:15px;background-color:gray;border-radius:10px;\">Customer Registration</h1>\n");
      out.write("                \t\t\t\t\t\n");
      out.write("                <input id=\"textInput\" type=\"text\" name=\"cidTextBox\" placeholder=\"Enter Your Customer Id\" required ><br><br>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t     <input id=\"textInput\" type=\"text\" name=\"firstnameTextBox\" placeholder=\"Enter your first name here\" required><br><br>\n");
      out.write("\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t     <input id=\"textInput\" type=\"text\" name=\"lastnameTextBox\" placeholder=\"Enter your last name here\" required><br><br>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t     <input id=\"textInput\" type=\"text\" name=\"contactTextBox\" placeholder=\"Enter your contact no here\" required><br><br>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t     <input id=\"textInput\" type=\"text\" name=\"emailTextBox\" placeholder=\"Enter your email here\" required><br><br>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\n");
      out.write("                     <input id=\"textInput\" type=\"text\" name=\"countryTextBox\" placeholder=\"Enter your country here\" required><br><br>\n");
      out.write("\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t     <input id=\"textInput\" type=\"text\" name=\"guestTextBox\" placeholder=\"Enter your number of guest here\" required><br><br>\n");
      out.write("\n");
      out.write("                     <input id=\"inputButton\" type=\"submit\" value=\"Register\">\n");
      out.write("\t\t</form>\n");
      out.write("            </div>\n");
      out.write("            \n");
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
