package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class RoomInformation_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Room Information</title>\n");
      out.write("        <link href=\"RoomInformation.css\" rel=\"stylesheet\" type=\"text/css\" >\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <table border=\"0\" >\n");
      out.write("       <tr>\n");
      out.write("           <td>\n");
      out.write("               <image src=\"first.jpg\" hspace=100px; vspace=20px; style=\"width: 400px; height: 200px;\" usemap=\"#fm\"/>         \n");
      out.write("               <map name=\"fm\" >\n");
      out.write("               <area shap=\"rect\" coords=\"0,0,500,270\" href=\"file:///C:/Users/SHAKIL%20SORKAR/Desktop/140112/test.html\" />\n");
      out.write("               </map>\n");
      out.write("           </td>\n");
      out.write("           <td>\n");
      out.write("               <image src=\"second.jpg\" hspace=100px; vspace=20px: style=\"width: 400px; height: 200px;\" usemap=\"#sm\" />\n");
      out.write("               <map name=\"sm\" >\n");
      out.write("               <area shap=\"rect\" coords=\"0,0,500,270\" href=\"file:///C:/Users/SHAKIL%20SORKAR/Desktop/140112/test.html\" />\n");
      out.write("               </map>\n");
      out.write("            </td>\n");
      out.write("      </tr>\n");
      out.write("      \n");
      out.write("      \n");
      out.write("      <tr>\n");
      out.write("            <td>             \n");
      out.write("                 <p align=\"center\" > Single Non-AC <br/> Delux </p>\n");
      out.write("            </td>\n");
      out.write("            <td>           \n");
      out.write("                 <p align=\"center\" > Single AC <br/> Superdelux </p>\n");
      out.write("            </td>\n");
      out.write("      \n");
      out.write("      </tr>\n");
      out.write("   \n");
      out.write("      <tr class=\"separator\" />\n");
      out.write("      \n");
      out.write("      <tr>\n");
      out.write("            <td>\n");
      out.write("                <image src=\"third.jpg\" hspace=100px; vspace=20px; style=\"width: 400px; height: 200px;\" usemap=\"#tm\" />\n");
      out.write("                <map name=\"tm\" >\n");
      out.write("                <area shap=\"rect\" coords=\"0,0,500,270\" href=\"file:///C:/Users/SHAKIL%20SORKAR/Desktop/140112/test.html\" />\n");
      out.write("                </map>\n");
      out.write("            </td>\n");
      out.write("            <td>\n");
      out.write("                <image src=\"fourth.jpg\" hspace=100px; vspace=20px; style=\"width: 400px; height: 200px;\" usemap=\"#fom\"/>\n");
      out.write("                <map name=\"fom\" >\n");
      out.write("                <area shap=\"rect\" coords=\"0,0,500,270\" href=\"file:///C:/Users/SHAKIL%20SORKAR/Desktop/140112/test.html\" />\n");
      out.write("                </map>               \n");
      out.write("            </td>\n");
      out.write("      </tr>     \n");
      out.write("       <tr>\n");
      out.write("            <td>             \n");
      out.write("                 <p align=\"center\" >Double Non-AC <br/> Delux </p>\n");
      out.write("            </td>\n");
      out.write("            <td>           \n");
      out.write("                 <p align=\"center\" >Double AC <br/> Superdelux </p>\n");
      out.write("            </td>\n");
      out.write("      \n");
      out.write("      </tr>\n");
      out.write("       </table>  \n");
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
