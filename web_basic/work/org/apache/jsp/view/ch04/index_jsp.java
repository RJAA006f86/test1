package org.apache.jsp.view.ch04;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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

String userType = (String)request.getAttribute("userType");  /* ユーザーが選択したグループを示す変数*/
String message = (String)request.getAttribute("message");    /* 注意事項の確認未実施時のメッセージ用の変数*/
String confirm = (String)request.getAttribute("confirm");/* 注意事項確認を行ったか否かを管理する変数*/
String second = (String)session.getAttribute("second");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- ユーザーがグループ選択と注意事項の確認を行うJSP -->\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<style>\r\n");
      out.write(".space{\r\n");
      out.write("height: 1920px;\r\n");
      out.write("margin:0px auto 0px;\r\n");
      out.write("}\r\n");
      out.write("form{\r\n");
      out.write("width:500px;\r\n");
      out.write("height:100px;\r\n");
      out.write("margin:0px auto;\r\n");
      out.write("}\r\n");
      out.write("form select:nth-of-type(1){\r\n");
      out.write("font-size: 30pt;\r\n");
      out.write("text-align:left;\r\n");
      out.write("}\r\n");
      out.write("form select:nth-of-type(2){\r\n");
      out.write("font-size: 30pt;\r\n");
      out.write("text-align:left;\r\n");
      out.write("}\r\n");
      out.write("form input[type=\"submit\"]{\r\n");
      out.write("width: 300px;\r\n");
      out.write("height: 100px;\r\n");
      out.write("font-size: 30pt;\r\n");
      out.write("margin:50px auto 0px;\r\n");
      out.write("box-sizing: border-box;\r\n");
      out.write("border-radius:20px/20px;\r\n");
      out.write("}\r\n");
      out.write("P{\r\n");
      out.write("text-align: left;\r\n");
      out.write("margin:50px auto;\r\n");
      out.write("font-size: 20pt;\r\n");
      out.write("display:inline-block\r\n");
      out.write("}\r\n");
      out.write(".warning{\r\n");
      out.write("text-align: left;\r\n");
      out.write("margin:0px 0px 0px 0px;\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write(".check P:nth-of-type(1){\r\n");
      out.write("width: 300px;\r\n");
      out.write("margin:20px auto 0px;\r\n");
      out.write("}\r\n");
      out.write(".check P{\r\n");
      out.write("width: 300px;\r\n");
      out.write("margin:0px auto 0px;\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("\t<head>\r\n");
      out.write("\t\t<title>【グループ選択ページ】</title>\r\n");
      out.write("\t</head>\r\n");
      out.write("\t<meta http-equiv=\"Pragma\" content=\"no-cache\">\r\n");
      out.write("\t<meta http-equiv=\"Cache-Control\" content=\"no-cache\">\r\n");
      out.write("\t");
if(second != null) {
      out.write("\r\n");
      out.write("\t<meta http-equiv=\"refresh\" content=\"3; URL=");
      out.print(request.getContextPath());
      out.write("/view/ch04/logout.jsp\">\r\n");
      out.write("\t");
} 
      out.write("\r\n");
      out.write("\t<body>\r\n");
      out.write("\t\t\t<h1 style=\"text-align:center\">グループ選択ページ</h1>\r\n");
      out.write("\t\t\t<hr style=\"height:3; background-color:#0000ff\" />\r\n");
      out.write("\t\t\t<br>\r\n");
      out.write("\t\t\t<br>\r\n");
      out.write("\t\t\t<br>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t<!-- 2つのプルダウンの選択結果により表示変更。またいいえを選択した場合選択でもグループは保持される\r\n");
      out.write("\t\t\t -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t<form action=\"");
      out.print(request.getContextPath());
      out.write("/Userctl\" method=\"get\">\r\n");
      out.write("\t\t\t<!-- グループ選択のプルダウン-->\r\n");
      out.write("\t\t\t\t<SELECT name=\"userType\">\r\n");
      out.write("\t\t\t\t\t");
if(confirm == null) {
      out.write("\r\n");
      out.write("\t\t\t\t\t<OPTION value=\"1\" selected>\r\n");
      out.write("\t\t\t\t\tグループ1\r\n");
      out.write("\t\t\t\t\t</OPTION>\r\n");
      out.write("\t\t\t\t\t<OPTION value=\"2\">\r\n");
      out.write("\t\t\t\t\tグループ2\r\n");
      out.write("\t\t\t\t\t</OPTION>\r\n");
      out.write("\t\t\t\t\t");
} else if((confirm.equals("False")&&userType.equals("1"))){
      out.write("\r\n");
      out.write("\t\t\t\t\t<OPTION value=\"");
      out.print( userType);
      out.write("\" selected>\r\n");
      out.write("\t\t\t\t\tグループ");
      out.print( userType);
      out.write("\r\n");
      out.write("\t\t\t\t\t</OPTION>\r\n");
      out.write("\t\t\t\t\t<OPTION value=\"2\">\r\n");
      out.write("\t\t\t\t\tグループ2\r\n");
      out.write("\t\t\t\t\t</OPTION>\r\n");
      out.write("\t\t\t\t\t");
} else if((confirm.equals("False")&&userType.equals("2"))){
      out.write("\r\n");
      out.write("\t\t\t\t\t<OPTION value=\"");
      out.print( userType);
      out.write("\" selected>\r\n");
      out.write("\t\t\t\t\tグループ");
      out.print( userType);
      out.write("\r\n");
      out.write("\t\t\t\t\t</OPTION>\r\n");
      out.write("\t\t\t\t\t<OPTION value=\"1\">\r\n");
      out.write("\t\t\t\t\tグループ1\r\n");
      out.write("\t\t\t\t\t</OPTION>\r\n");
      out.write("\t\t\t\t\t");
}
      out.write("\r\n");
      out.write("\t\t\t\t</SELECT>\r\n");
      out.write("\t\t\t\t<div class=\"check\">\r\n");
      out.write("\t\t\t\t<p>【注意事項】</p>\r\n");
      out.write("\t\t\t\t<p>・画面の輝度、スクリーンセーバーなどは使用状況に応じて設定変更を行ってください。</p>\r\n");
      out.write("\t\t\t\t<p>・揺らすと動作するアプリがある場合は終了または設定変更を行ってください。</p>\r\n");
      out.write("\t\t\t\t<p>・使用時は周囲の人やものに注意してください。</p>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<br>\r\n");
      out.write("\t\t\t\t<!-- 条件分岐。ユーザーがいいえを選択した場合、サーブレットから返されたパラメータにより\r\n");
      out.write("\t\t\t\t注意事項確認の文字が赤に-->\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t");
 if(message != null) {
      out.write("\r\n");
      out.write("\t\t\t\t<p style=\"color:red;\">注意事項確認\r\n");
      out.write("\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t");
} else{ 
      out.write("\r\n");
      out.write("\t\t\t\t<p>注意事項確認\r\n");
      out.write("\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t");
} 
      out.write("\r\n");
      out.write("\t\t\t\t<!-- 注意事項確認のプルダウン-->\r\n");
      out.write("\t\t\t\t<SELECT name=\"confirm\">\r\n");
      out.write("\t\t\t\t\t<OPTION value=\"False\">\r\n");
      out.write("\t\t\t\t\tいいえ\r\n");
      out.write("\t\t\t\t\t</OPTION>\r\n");
      out.write("\t\t\t\t\t<OPTION value=\"True\">\r\n");
      out.write("\t\t\t\t\tはい\r\n");
      out.write("\t\t\t\t\t</OPTION>\r\n");
      out.write("\t\t\t\t</SELECT>\r\n");
      out.write("\t\t\t\t<!-- 条件分岐。ユーザーがいいえを選択した場合、サーブレットから返されたパラメータにより\r\n");
      out.write("\t\t\t\t注意事項確認を促すメッセージが表示される-->\r\n");
      out.write("\t\t\t\t");
 if(message != null) {
      out.write("\r\n");
      out.write("\t\t\t\t<p style=\"color:red\"class = \"Warning\">");
      out.print(message );
      out.write("</p>\r\n");
      out.write("\t\t\t\t");
} 
      out.write("\r\n");
      out.write("\t\t\t\t<br>\r\n");
      out.write("\t\t\t\t<input type=\"submit\" value=\"送信\">\r\n");
      out.write("\t\t\t\t</form>\r\n");
      out.write("\t</body>\r\n");
      out.write("</html>");
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
