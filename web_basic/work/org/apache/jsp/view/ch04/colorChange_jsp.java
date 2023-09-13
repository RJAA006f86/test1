package org.apache.jsp.view.ch04;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class colorChange_jsp extends org.apache.jasper.runtime.HttpJspBase
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

/*変数宣言*/
String entry;				/*初回アクセスか判別するパラメータを代入する変数*/
String colorGroup1 = (String)session.getAttribute("colorGroup1");/*グループ1に割り振る色を保持する変数(セッションスコープに保持)*/
String colorGroup2 = (String)session.getAttribute("colorGroup2");/*グループ2に割り振る色を保持する変数(セッションスコープに保持)*/
entry = (String)request.getAttribute("entry");					/*初回アクセスか判別するパラメータを受信*/
if(entry == null){
	entry ="";
}

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!--管理者がユーザーグループごとの表示色を設定するページを表示するJSP-->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("\t<head>\r\n");
      out.write("\t\t<title>【表示色設定ページ】管理者用</title>\r\n");
      out.write("\t\t</head>\r\n");
      out.write("\t\t<body>\r\n");
      out.write("\t\t\t<h1 style=\"text-align:center\">表示色設定ページ</h1>\r\n");
      out.write("\t\t\t<hr style=\"height:3; background-color:#0000ff\" />\r\n");
      out.write("\t\t\t<br>\r\n");
      out.write("\t\t\t<br>\r\n");
      out.write("\t\t\t<br>\r\n");
      out.write("\t\t\t<body>\r\n");
      out.write("\t\t\t\t\t<form action=\"");
      out.print(request.getContextPath());
      out.write("/Admin\" method=\"get\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<!--初回アクセスかつグループ1の色を保持するパラメータがnull、またはグループ1の色を保持するパラメータがnull(グループ2の色が先に設定された時など)\r\n");
      out.write("\t\t\t\t\t\t、グループ1の色を保持するパラメータの値がある場合の処理-->\r\n");
      out.write("\t\t\t\t\t\t<p style=\"color:white;background-color:black;display:inline;\">グループ1</p>\r\n");
      out.write("\t\t\t\t\t\t");
if (colorGroup1 == null||(entry.equals("first")&&colorGroup1 == null)){
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<p style=\"width:250px;display:inline-block;background-color:white\">デフォルト(ホワイト)</p>\r\n");
      out.write("\t\t\t\t\t\t");
}else if(colorGroup1 != null){
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<p style=\"width:250px;display:inline-block;background-color:");
      out.print(colorGroup1);
      out.write(';');
      out.write('"');
      out.write('>');
      out.print(colorGroup1);
      out.write("</p>\r\n");
      out.write("\t\t\t\t\t\t");
}
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<!-- グループ1のカラー選択ページへ -->\r\n");
      out.write("\t\t\t\t\t\t<p style=\"display:inline-block\"><a href= \"");
      out.print(request.getContextPath());
      out.write("/view/ch04/colorselect.jsp?userType=1\">表示色変更</a></p>\r\n");
      out.write("\t\t\t\t\t\t<br>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<!--初回アクセスかつグループ2の色を保持するパラメータがnull、またはグループ2の色を保持するパラメータがnull(グループ1の色が先に設定された時など)\r\n");
      out.write("\t\t\t\t\t\t、グループ2の色を保持するパラメータの値がある場合の処理の処理-->\r\n");
      out.write("\t\t\t\t\t\t<p style=\"color:white;background-color:black;display:inline;\">グループ2</p>\r\n");
      out.write("\t\t\t\t\t\t");
if (colorGroup2 == null||(entry.equals("first")&&colorGroup2 == null)) {
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<p style=\"width:250px;display:inline-block;background-color:white\">デフォルト(ホワイト)</p>\r\n");
      out.write("\t\t\t\t\t\t");
} else if(colorGroup2 != null){
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<p style=\"width:250px;display:inline-block;background-color:");
      out.print(colorGroup2);
      out.write(';');
      out.write('"');
      out.write('>');
      out.print(colorGroup2);
      out.write("</p>\r\n");
      out.write("\t\t\t\t\t\t");
}
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<!-- グループ2のカラー選択ページへ -->\r\n");
      out.write("\t\t\t\t\t\t<p style=\"display:inline-block\"><a href= \"");
      out.print(request.getContextPath());
      out.write("/view/ch04/colorselect.jsp?userType=2\">表示色変更</a></p>\r\n");
      out.write("\t\t\t\t\t\t<br>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<!--上から\r\n");
      out.write("\t\t\t\t\t\tグループ1、2の色が設定されていない場合\r\n");
      out.write("\t\t\t\t\t\tグループ2だけ色が設定されていない場合\r\n");
      out.write("\t\t\t\t\t\tグループ1だけ色が設定されていない場合\r\n");
      out.write("\t\t\t\t\t\tグループ1、2共に色が設定されている場合-->\r\n");
      out.write("\t\t\t\t\t\t");
if(colorGroup1 == null&&colorGroup2 == null) {
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<input type=\"hidden\" name=\"colorGroup1\" value=\"white\">\r\n");
      out.write("\t\t\t\t\t\t<input type=\"hidden\" name=\"colorGroup2\" value=\"white\">\r\n");
      out.write("\t\t\t\t\t\t");
} else if(colorGroup1 != null&&colorGroup2 == null) {
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<input type=\"hidden\" name=\"colorGroup1\" value=\"");
      out.print(colorGroup1);
      out.write("\">\r\n");
      out.write("\t\t\t\t\t\t<input type=\"hidden\" name=\"colorGroup2\" value=\"white\">\r\n");
      out.write("\t\t\t\t\t\t");
}else if(colorGroup2 != null&&colorGroup1 == null) { 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<input type=\"hidden\" name=\"colorGroup1\" value=\"white\">\r\n");
      out.write("\t\t\t\t\t\t<input type=\"hidden\" name=\"colorGroup2\" value=\"");
      out.print(colorGroup1);
      out.write("\">\r\n");
      out.write("\t\t\t\t\t\t");
 }else {
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<input type=\"hidden\" name=\"colorGroup1\" value=\"");
      out.print(colorGroup1);
      out.write("\">\r\n");
      out.write("\t\t\t\t\t\t<input type=\"hidden\" name=\"colorGroup2\" value=\"");
      out.print(colorGroup2);
      out.write("\">\r\n");
      out.write("\t\t\t\t\t\t");
} 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<input type=\"submit\" value=\"送信\">\r\n");
      out.write("\t\t\t\t\t</form>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<!-- セッションスコープに保存されたグループ1、2の色選択情報をリセット -->\r\n");
      out.write("\t\t\t\t\t<form action=\"");
      out.print(request.getContextPath());
      out.write("/Admin\"method=\"get\">\r\n");
      out.write("\t\t\t\t\t\t<input type=\"hidden\" name=\"reset\" value=\"reset\">\r\n");
      out.write("\t\t\t\t\t\t<input type=\"submit\" value=\"色選択リセット\">\r\n");
      out.write("\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t</body>\r\n");
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
