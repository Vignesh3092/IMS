/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.85
 * Generated at: 2024-02-17 09:51:57 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class createIssue_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

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

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <title>Create Issue</title>\r\n");
      out.write("    <style>\r\n");
      out.write("        body {\r\n");
      out.write("            font-family: Arial, sans-serif;\r\n");
      out.write("            background-color: #f8f9fa;\r\n");
      out.write("            padding: 20px;\r\n");
      out.write("        }\r\n");
      out.write("        h1 {\r\n");
      out.write("            color: #007bff;\r\n");
      out.write("            text-align: center;\r\n");
      out.write("            margin-bottom: 30px;\r\n");
      out.write("        }\r\n");
      out.write("        form {\r\n");
      out.write("            max-width: 400px;\r\n");
      out.write("            margin: 0 auto;\r\n");
      out.write("            background-color: #fff;\r\n");
      out.write("            padding: 20px;\r\n");
      out.write("            border-radius: 10px;\r\n");
      out.write("            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);\r\n");
      out.write("        }\r\n");
      out.write("        label {\r\n");
      out.write("            display: block;\r\n");
      out.write("            margin-bottom: 10px;\r\n");
      out.write("            color: #007bff;\r\n");
      out.write("        }\r\n");
      out.write("        input[type=\"text\"], textarea, select {\r\n");
      out.write("            width: 100%;\r\n");
      out.write("            padding: 10px;\r\n");
      out.write("            margin-bottom: 10px;\r\n");
      out.write("            border: 1px solid #ced4da;\r\n");
      out.write("            border-radius: 5px;\r\n");
      out.write("            background-color: #f3f4f6;\r\n");
      out.write("        }\r\n");
      out.write("        input[type=\"submit\"] {\r\n");
      out.write("            background-color: #28a745;\r\n");
      out.write("            color: #fff;\r\n");
      out.write("            border: none;\r\n");
      out.write("            border-radius: 5px;\r\n");
      out.write("            padding: 10px 20px;\r\n");
      out.write("            cursor: pointer;\r\n");
      out.write("            transition: background-color 0.3s ease;\r\n");
      out.write("        }\r\n");
      out.write("        input[type=\"submit\"]:hover {\r\n");
      out.write("            background-color: #218838;\r\n");
      out.write("        }\r\n");
      out.write("        select {\r\n");
      out.write("            appearance: none;\r\n");
      out.write("            -webkit-appearance: none;\r\n");
      out.write("            -moz-appearance: none;\r\n");
      out.write("            background-image: url('data:image/svg+xml;utf8,<svg xmlns=\"http://www.w3.org/2000/svg\" viewBox=\"0 0 24 24\" fill=\"%23007bff\" width=\"18px\" height=\"18px\"><path d=\"M7 10l5 5 5-5H7z\"/><path d=\"M0 0h24v24H0z\" fill=\"none\"/></svg>');\r\n");
      out.write("            background-repeat: no-repeat;\r\n");
      out.write("            background-position: right 10px center;\r\n");
      out.write("            background-size: 15px;\r\n");
      out.write("            padding-right: 30px;\r\n");
      out.write("        }\r\n");
      out.write("    </style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("    <h1>Create Issue</h1>\r\n");
      out.write("    \r\n");
      out.write("    <form action=\"createIssueServlet\" method=\"post\">\r\n");
      out.write("        <label for=\"title\">Title:</label>\r\n");
      out.write("        <input type=\"text\" name=\"title\" required>\r\n");
      out.write("        \r\n");
      out.write("        <label for=\"description\">Description:</label>\r\n");
      out.write("        <textarea name=\"description\" required></textarea>\r\n");
      out.write("        \r\n");
      out.write("        <label for=\"priority\">Priority:</label>\r\n");
      out.write("        <select name=\"priority\" required>\r\n");
      out.write("            <option value=\"High\">High</option>\r\n");
      out.write("            <option value=\"Medium\">Medium</option>\r\n");
      out.write("            <option value=\"Low\">Low</option>\r\n");
      out.write("        </select>\r\n");
      out.write("        \r\n");
      out.write("        <input type=\"submit\" value=\"Create Issue\">\r\n");
      out.write("    </form>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
