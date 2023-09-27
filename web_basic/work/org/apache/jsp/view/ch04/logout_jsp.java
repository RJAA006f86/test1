package org.apache.jsp.view.ch04;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class logout_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write('\r');
      out.write('\n');

String second = (String)session.getAttribute("second");

      out.write('\r');
      out.write('\n');
if(second != null) {
session.invalidate();
} 
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- ログアウトページ-->\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<style>\r\n");
      out.write(".check P{\r\n");
      out.write("width: 300px;\r\n");
      out.write("margin:0px auto 0px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("P{\r\n");
      out.write("text-align: center;\r\n");
      out.write("width: 300px;\r\n");
      out.write("margin:0px auto 0px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("\t<head>\r\n");
      out.write("\t\t<title>【ログアウトページ】</title>\r\n");
      out.write("\t</head>\r\n");
      out.write("\t\t<body>\r\n");
      out.write("\t\t\t<h1 style=\"text-align:center\">ログアウトページ</h1>\r\n");
      out.write("\t\t\t<hr style=\"height:3; background-color:#0000ff\" />\r\n");
      out.write("\t\t\t<br>\r\n");
      out.write("\t\t\t<br>\r\n");
      out.write("\t\t\t<br>\r\n");
      out.write("\t\t\t<div class=\"check\">\r\n");
      out.write("\t\t\t\t<p>【アプリを閉じる前に】</p>\r\n");
      out.write("\t\t\t\t<p>・ログイン時に行った端末の設定設定変更を元に戻してください。</p>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<p style=\"color:red;\">ご利用ありがとうございました</p>\r\n");
      out.write("\t\t\t<p style=\"color:blue;\"><a href=\"");
      out.print(request.getContextPath());
      out.write("/Userctl\">再ログイン</a></p>\r\n");
      out.write("\t\t</body>\r\n");
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
