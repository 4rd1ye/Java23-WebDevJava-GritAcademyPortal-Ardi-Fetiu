/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2024-02-22 20:25:17 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.JSP;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(3);
    _jspx_dependants.put("/JSP/fragments/navbar.jsp", Long.valueOf(1708633506758L));
    _jspx_dependants.put("/JSP/fragments/head.jsp", Long.valueOf(1708617519801L));
    _jspx_dependants.put("/JSP/fragments/footer.jsp", Long.valueOf(1708541448719L));
  }

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<footer>\n");
      out.write("<nav>\n");
      out.write("\n");
      out.write("\n");
      out.write("</nav>\n");
      out.write("<banner>\n");
      out.write("</banner>\n");
      out.write("</footer>");
      out.write("\n");
      out.write("<body>\n");
      out.write("<navbar id=\"mainNavbar\">\n");
      out.write("    <banner>\n");
      out.write("    </banner>\n");
      out.write("\n");
      out.write("    <nav>\n");
      out.write("        <div class=\"navlinks\">\n");
      out.write("            <ul>\n");
      out.write("                <li><a href=\"/\">HOME</a></li>\n");
      out.write("                <li><a href=\"/courses\">COURSES</a></li>\n");
      out.write("                <li><a href=\"/login\">LOGIN</a></li>\n");
      out.write("                <li><a href=\"/userPage\">USERPAGE</a></li>\n");
      out.write("            </ul>\n");
      out.write("        </div>\n");
      out.write("    </nav>\n");
      out.write("</navbar>");
      out.write("\n");
      out.write("\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/CSS/style.css\">\n");
      out.write("\n");
      out.write("<h>Lorem ipsum dolor sit amet, consectetur adipiscing elit</h>\n");
      out.write("<p>mentum integer enim neque volutpat. Ipsum a arcu cursus vitae congue mauris rhoncus aenean. Elementum eu facilisis sed odio morbi quis commodo odio aenean. Semper feugiat nibh sed pulvinar proin gravida. Id porta nibh venenatis cras sed felis eget velit aliquet. Et malesuada fames ac turpis egestas sed tempus urna. Ipsum a arcu cursus vitae congue mauris rhoncus aenean vel. Tortor condimentum lacinia quis vel eros. Viverra aliquet eget sit amet tellus. Aliquam ultrices sagittis orci a scelerisque purus se</p>\n");
      out.write("<p>nunc faucibus a pellentesque. Commodo nulla facilisi nullam vehicula ipsum a arcu. Et pharetra pharetra massa massa ultricies mi. At ultrices mi tempus imperdiet nulla malesuada pellentesque elit. Ut eu sem integer vitae justo eget magna fermentum iaculis. Eget duis at tellus at. Magna fermentum iaculis eu non diam phasellus vestibulum lorem sed.</p>\n");
      out.write("\n");
      out.write("<footer>\n");
      out.write("<nav>\n");
      out.write("\n");
      out.write("\n");
      out.write("</nav>\n");
      out.write("<banner>\n");
      out.write("</banner>\n");
      out.write("</footer>");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
