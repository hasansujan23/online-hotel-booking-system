package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Home_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Home Page</title>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"Home.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1 style=\"padding: 20px;width: 100%;background-color: #0c6996;color: aliceblue;border-radius: 10px;\">Welcome to Online Hotel Booking System</h1>\n");
      out.write("        <ul>\n");
      out.write("              <li><a href=\"index.html\" target=\"iframe_a\">Home</a></li>\n");
      out.write("              <li><a href=\"Login.jsp\" target=\"iframe_a\">Login</a></li>\n");
      out.write("              <li><a href=\"RoomStatus.jsp\" target=\"iframe_a\">Available Rooms</a></li>\n");
      out.write("              <li><a href=\"RoomBooking.jsp\" target=\"iframe_a\">Booking</a></li>\n");
      out.write("              <li><a href=\"AdminLogin.jsp\" target=\"iframe_a\">Admin</a></li>\n");
      out.write("              <li><a href=\"AboutUs.jsp\" target=\"iframe_a\">About Us</a></li>\n");
      out.write("        </ul>\n");
      out.write("        \n");
      out.write("        <iframe height=\"600\" width=\"1345\" name=\"iframe_a\"></iframe>\n");
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
