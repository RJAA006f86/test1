package org.apache.jsp.view.ch04;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import ch04.NumberInfo;

public final class guess_jsp extends org.apache.jasper.runtime.HttpJspBase
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

String cmd = (String)request.getAttribute("cmd");
String message = (String)request.getAttribute("message");
ArrayList<NumberInfo> list =(ArrayList<NumberInfo>)session.getAttribute("list");
if(cmd == null){
	cmd = "first";
}

      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("\t<head>\r\n");
      out.write("\t\t<title>数字当てゲーム（セッション)</title>\r\n");
      out.write("\t</head>\r\n");
      out.write("\t<body>\r\n");
      out.write("\t\t<div style=\"text-align:center\">\r\n");
      out.write("\t\t\t<h1 style=\"text-align:center\">数字当てゲーム（セッション版）</h1>\r\n");
      out.write("\t\t\t<hr style=\"height:3; background-color:#0000ff\" />\r\n");
      out.write("\t\t\t<br>\r\n");
      out.write("\t\t\t<br>\r\n");
      out.write("\t\t\t<br>\r\n");
      out.write("\t\t\t<p style=\"text-align:center\">0〜9の数字をいれてください</p>\r\n");
      out.write("\r\n");
      out.write("\t\t\t");

			if(cmd.equals("end")){
			
      out.write("\r\n");
      out.write("\t\t\t\t<input type=\"text\">\r\n");
      out.write("\t\t\t\t<input type=\"button\" value=\"送信\" disabled>\r\n");
      out.write("\t\t\t\t<form action=\"");
      out.print(request.getContextPath());
      out.write("/GuessServlet\">\r\n");
      out.write("\t\t\t\t\t<input type=\"hidden\" name=\"cmd\" VALUE=\"first\">\r\n");
      out.write("\t\t\t\t\t<br>\r\n");
      out.write("\t\t\t\t\t<input type=\"submit\" value=\"もう一度挑戦\">\r\n");
      out.write("\t\t\t\t</form>\r\n");
      out.write("\t\t\t");

			}
			else{
			
      out.write("\r\n");
      out.write("\t\t\t\t<form action=\"");
      out.print(request.getContextPath());
      out.write("/GuessServlet\">\r\n");
      out.write("\t\t\t\t\t<input type=\"text\" name=\"user_number\">\r\n");
      out.write("\t\t\t\t\t<input type=\"hidden\" name=\"cmd\" VALUE=\"game\">\r\n");
      out.write("\t\t\t\t\t<input type=\"submit\" VALUE=\"送信\">\r\n");
      out.write("\t\t\t\t</form>\r\n");
      out.write("\t\t\t");

			}
			
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t<br>\r\n");
      out.write("\r\n");
      out.write("\t\t\t");

			if(message != null){
			
      out.write("\r\n");
      out.write("\t\t\t<h3 style=\"text-align:center; color: red;\">");
      out.print(message);
      out.write("</h3>\r\n");
      out.write("\t\t\t");

			}
			
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t<h2 style=\"text-align:center\">判定結果</h2>\r\n");
      out.write("\t\t\t<table style=\"border: 1px solid; margin:0 auto;\">\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td style=\"border: 1px solid;\">挑戦回数</td>\r\n");
      out.write("\t\t\t\t\t<td style=\"border: 1px solid;\">入力数字</td>\r\n");
      out.write("\t\t\t\t\t<td style=\"border: 1px solid;\">判定</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t");

				if(list != null){
					for(int i=0; i<list.size(); i++){
						NumberInfo objNumberInfo = list.get(i);
				
      out.write("\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td style=\"border: 1px solid;\">");
      out.print(i+1);
      out.write("回目</td>\r\n");
      out.write("\t\t\t\t\t\t<td style=\"border: 1px solid;\">");
      out.print(objNumberInfo.getUserNumber());
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t<td style=\"border: 1px solid;\">");
      out.print(objNumberInfo.getJudge());
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t");

					}
				}
				
      out.write("\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("\t\t</div>\r\n");
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
