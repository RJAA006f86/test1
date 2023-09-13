package org.apache.jsp.view.ch04;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class light_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!-- 色表示ページ。この画面をサイリウムとして使用。-->\r\n");


/*表示色はアプリケーションスコープから取得し変数に代入*/
ServletContext ap = getServletContext();						/* アプリケーションスコープの保存領域を取得*/
String colorGroup1 = (String)ap.getAttribute("colorGroup1");	/* グループ1に割り振られる色を保管する変数*/
String colorGroup2 = (String)ap.getAttribute("colorGroup2");	/* グループ2に割り振られる色を保管する変数*/
String userType = (String)request.getAttribute("userType");		/* ユーザーがグループ選択を行った際のパラメータが代入される変数
																userType=1がcolorGroup1、userType=2がcolorGroup2*/

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<style>\r\n");
      out.write(".space{\r\n");
      out.write("height: 1920px;\r\n");
      out.write("margin:0px auto 0px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".space p:nth-of-type(1){\r\n");
      out.write("width:250px;\r\n");
      out.write("height:250px;\r\n");
      out.write("margin:200px auto 0px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".space p:nth-of-type(2){\r\n");
      out.write("width:250px;\r\n");
      out.write("height:250px;\r\n");
      out.write("margin:50px auto 0px;\r\n");
      out.write("display:block;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".space p a{\r\n");
      out.write("background:grb(255,255,253);\r\n");
      out.write("width:100%;\r\n");
      out.write("height:100%;\r\n");
      out.write("display:block;\r\n");
      out.write("}\r\n");
      out.write(".space p a img{\r\n");
      out.write("width:100%;\r\n");
      out.write("height:100%;\r\n");
      out.write("}\r\n");
      out.write(".space p a img:hover{\r\n");
      out.write("opacity:0.5;\r\n");
      out.write("transition:0.3s;\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("\t<head>\r\n");
      out.write("\t\t<title>【サイリウム表示ページ】</title>\r\n");
      out.write("\t</head>\r\n");
      out.write("<!-- 条件分岐。変数に代入されたパラメータuserTypeによりグループを判断しそれぞれのグループの色を表示-->\r\n");
if(userType.equals("1")){
      out.write("\r\n");
      out.write("<body style=\"background-color:");
      out.print(colorGroup1);
      out.write("\">\r\n");
} else if(userType.equals("2")){ 
      out.write("\r\n");
      out.write("<body style=\"background-color:");
      out.print(colorGroup2);
      out.write("\">\r\n");
} 
      out.write("\r\n");
      out.write("<div class=\"space\">\r\n");
      out.write("<!-- グループ選択ページへ-->\r\n");
      out.write("<p><a href=\"");
      out.print(request.getContextPath());
      out.write("/Userctl\"><img src=\"");
      out.print(request.getContextPath());
      out.write("/img/btnt.png\" alt=\"TOPへ\" border=\"0\"/></a></p>\r\n");
      out.write("<!-- 再読み込み。ユーザーがこのページにアクセスしたときと同じパラメータをサーブレットUserctlへ送信-->\r\n");
      out.write("<p><a href=\"");
      out.print(request.getContextPath());
      out.write("/Userctl?userType=");
      out.print(userType);
      out.write("&confirm=True\"><img src=\"");
      out.print(request.getContextPath());
      out.write("/img/btnr.png\" alt=\"リロード\" border=\"0\"/></a></p>\r\n");
      out.write("</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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
