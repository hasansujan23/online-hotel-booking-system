package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class default_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Home</title>\n");
      out.write("        <style>\n");
      out.write("            body{background-color: #051019;background-image: url(\"h6.jpg\");background-repeat: no-repeat;background-size: 100% 700px;}\n");
      out.write("            h1{padding: 20px;background-color: #051019;color: aliceblue;border-radius: 10px;opacity: 0.6;}\n");
      out.write("            p{font-family: cursive;font-size: 18px;padding: 20px;background-color: #051019;color: white;border-radius: 10px;opacity: 0.6;}\n");
      out.write("            address{padding: 40px;background-color: #051019;color: aliceblue;border-radius: 10px;opacity: 0.6;}\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Online Hotel Booking</h1>\n");
      out.write("        <p>A hotel is an establishment that provides paid lodging on a short-term basis. Facilities provided may range from a modest-quality mattress in a small room to large suites with bigger, higher-quality beds, a dresser, a refrigerator and other kitchen facilities, upholstered chairs, a flatscreen television and en-suite bathrooms. Small, lower-priced hotels may offer only the most basic guest services and facilities. Larger, higher-priced hotels may provide additional guest facilities such as a swimming pool, business centre (with computers, printers and other office equipment), childcare, conference and event facilities, tennis or basketball courts, gymnasium, restaurants, day spa and social function services. Hotel rooms are usually numbered (or named in some smaller hotels and B&Bs) to allow guests to identify their room. Some boutique, high-end hotels have custom decorated rooms. Some hotels offer meals as part of a room and board arrangement. In the United Kingdom, a hotel is required by law to serve food and drinks to all guests within certain stated hours. In Japan, capsule hotels provide a tiny room suitable only for sleeping and shared bathroom facilities.</p>\n");
      out.write("        <p>A hospitality service, also known as \"accommodation sharing\", \"hospitality exchange\" (short \"hospex\"), \"home stay network\", or \"home hospitality network\" (\"hoho\"), is a centrally organized social networking service of travelers who offer or seek homestays (lodging in a home) either gratis or for money. Hospitality services generally connect users via the internet and are examples of collaborative consumption and sharing. In cases where lodging is offered gratis, they are examples of a barter economy or gift economy. A hospitality service may collect commissions on each homestay, charge a membership fee, or be completely free.</p>\n");
      out.write("        <address>\n");
      out.write("            Developed by,<br>\n");
      out.write("            Name: Md Abdullah Al Hasan , Md Shakil Sorker ,Md Zahidul Hasan, Sujal Kumar<br>\n");
      out.write("            Email: hasansujan23@gmail.com, sorkershakil22@gmail.com, zahidulhasan140148@gmail.com, sujalkumar803@gmail.com<br>\n");
      out.write("            phone:01754704559,01756696872, 01777862857, 01980835836<br>\n");
      out.write("            Jessore University of Science and Technology<br>\n");
      out.write("            Department of Computer Science and Engineering\n");
      out.write("        </address>\n");
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
