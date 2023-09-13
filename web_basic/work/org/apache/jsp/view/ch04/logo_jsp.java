package org.apache.jsp.view.ch04;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class logo_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
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
      response.setContentType("text/html; charset=Shift_JIS");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- ロゴ表示ページ。この画面をサイリウムとして使用。-->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<style>\r\n");
      out.write(".page{\r\n");
      out.write("height: 1920px;\r\n");
      out.write("margin:500px auto 0px;\r\n");
      out.write("}\r\n");
      out.write(".page div{\r\n");
      out.write("height: 500px;\r\n");
      out.write("margin:500px auto 0px;\r\n");
      out.write("text-align:center\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("img{\r\n");
      out.write("width:430px;\r\n");
      out.write("height: auto;\r\n");
      out.write("margin:0px auto 0px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("\t<head>\r\n");
      out.write("\t\t<title>【ロゴ表示ページ】</title>\r\n");
      out.write("\t</head>\r\n");
      out.write("<meta http-equiv=\"refresh\" content=\"5; URL=");
      out.print(request.getContextPath());
      out.write("/Userctl\">\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("<div class=\"page\">\r\n");
      out.write("\t<div >\r\n");
      out.write("  \t\t<img src=\"");
      out.print(request.getContextPath());
      out.write("/img/logo2.png\">\r\n");
      out.write("  \t</div>\r\n");
      out.write("</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else log(t.getMessage(), t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
