package org.apache.jsp.view.ch04;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class colorselect_jsp extends org.apache.jasper.runtime.HttpJspBase
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

/*変数宣言*/
String userType = request.getParameter("userType");			/*グループ1、2を識別するパラメータを受信して保持する変数*/
String[] colorsBlue = {"mintcream","honeydew","lightcyan","cornflower","powderblue","lightskyblue","skyblue","aqua","aquamarine","cyan","richblue","cadetblue","azure","aliceblue","lavender","lightblue","lightsteelblue","turquoise","darkturquoise","mediumturquoise","deepskyblue","dodgerblue","royalblue","mediumslateblue","slateblue","darkslateblue","indigo","navy","richblue","cadetblue","cornflowerblue","steelblue","blue","mediumblue","darkblue","midnightblue"};
String[] colorsGreen = {"greenyellow","lightgreen","chartreuse","lawngreen","lime","yellowgreen","limegreen","seagreen","olivedrab","darkolivegreen","green","darkslategray","springgreen","mediumspringgreen","mediumaquamarine","darkseagreen","lightseagreen","mediumseagreen","teal","darkcyan","forestgreen","darkgreen","palegreen"};
String[] colorsRed ={"seashell","oldlace","cornsilk","papayawhip","bisque","moccasin","navajowhite","wheat","lightpink","violet","lightsalmon","salmon","palevioletred","lightcoral","orchid","mediumorchid","mediumpurple","copper","darkorchid","blueviolet","purple","red","darkbrown","darkred","lavenderblush","linen","antiquewhite","mistyrose","blanchedalmond","feldsper","peachpuff","pink","thistle","plum","darksalmon","rosybrown","hotpink","indianred","deeppink","magenta","fuchsia","mediumvioletred","darkviolet","darkmagenta","tomato","orangered","crimson","firebrick"};
String[] colorsYellow = {"lightyellow","lemonchiffon","khaki","burlywood","sandybrown","brass","darkgoldenrod","chocolate","olive","orange","yellow","saddlebrown","brown","beige","lightgoldenrodyellow","palegoldenrod","tan","coral","darkkhaki","goldenrod","peru","coolcopper","darkorange","gold","sienna","maroon"};
String[] colorsBlack = {"white","ghostwhite","whitesmoke","lightgrey","lightslategray","slategray","dimgray","black","ivory","snow","floralwhite","gainsboro","silver","darkgray","gray"};


/*色の選択肢を保持する配列	現時点では青系統しか作っていませんがこの仕組みにより色選択は簡単に増やすことができます*/

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("\t<head>\r\n");
      out.write("\t\t<title>【カラー選択ページ】管理者用</title>\r\n");
      out.write("\t</head>\r\n");
      out.write("\t\t<h1 style=\"text-align:center\">【カラー選択ページ】管理者用</h1>\r\n");
      out.write("\t\t<hr style=\"height:3; background-color:#0000ff\" />\r\n");
      out.write("\t\t<h1>赤系統</h1>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<form action=\"");
      out.print(request.getContextPath());
      out.write("/Admin\" method=\"get\">\r\n");
      out.write("\t\t\t\t");

				int count = 0;
			    for (int a = 0; a < colorsRed.length; a++) {
			      for (int i = 0; i < 10; i++) {
			        if((colorsRed.length-count) == 0) {
			          break;
			        } else if(i == 9) {
      out.write("\r\n");
      out.write("\t\t\t        <input type=\"radio\" name=\"colorGroup");
      out.print( userType);
      out.write("\" value=\"");
      out.print(colorsRed[count]);
      out.write("\"><p style=\"width:100px;display:inline-block; background-color:");
      out.print(colorsRed[count]);
      out.write("\">sample</p><br>\r\n");
      out.write("\t\t\t        ");
 count++;
			        } else if(count != 0) {
      out.write("\r\n");
      out.write("\t\t\t        <input type=\"radio\" name=\"colorGroup");
      out.print( userType);
      out.write("\" value=\"");
      out.print(colorsRed[count]);
      out.write("\"><p style=\"width:100px;display:inline-block; background-color:");
      out.print(colorsRed[count]);
      out.write("\">sample</p>\r\n");
      out.write("\t\t\t        ");
 count++;
			        } else {
      out.write("\r\n");
      out.write("\t\t\t        <input type=\"radio\" name=\"colorGroup");
      out.print( userType);
      out.write("\" value=\"");
      out.print(colorsRed[count]);
      out.write("\"checked><p style=\"width:100px;display:inline-block; background-color:");
      out.print(colorsRed[count]);
      out.write("\">sample</p>\r\n");
      out.write("\t\t\t        ");
count++;}
			      }
			    }
      out.write("\r\n");
      out.write("\t\t\t    <p><input type=\"submit\" value=\"送信する\"></p>\r\n");
      out.write("\t\t\t\t</form>\r\n");
      out.write("\t\t\t<h1>青系統</h1>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<!-- 配列から色を取り出しラジオボタンと共に１行につき10個出力、配列の要素数が10で割り切れなくても対応可\r\n");
      out.write("\t\t\t\t colorGroupという文字列の後にuserTypeを代入する形にすることによりこのページをグループ1、2いずれでも使えるようにしています\r\n");
      out.write("\t\t\t\t また、配列を追加しこの処理を使いまわすことで簡単にページを増設できます-->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<form action=\"");
      out.print(request.getContextPath());
      out.write("/Admin\" method=\"get\">\r\n");
      out.write("\t\t\t\t");

				int count2 = 0;
			    for (int a = 0; a < colorsBlue.length; a++) {
			      for (int i = 0; i < 10; i++) {
			        if((colorsBlue.length-count2) == 0) {
			          break;
			        } else if(i == 9) {
      out.write("\r\n");
      out.write("\t\t\t        <input type=\"radio\" name=\"colorGroup");
      out.print( userType);
      out.write("\" value=\"");
      out.print(colorsBlue[count2]);
      out.write("\"><p style=\"width:100px;display:inline-block; background-color:");
      out.print(colorsBlue[count2]);
      out.write("\">sample</p><br>\r\n");
      out.write("\t\t\t        ");
 count2++;
			        } else if(count2 != 0) {
      out.write("\r\n");
      out.write("\t\t\t        <input type=\"radio\" name=\"colorGroup");
      out.print( userType);
      out.write("\" value=\"");
      out.print(colorsBlue[count2]);
      out.write("\"><p style=\"width:100px;display:inline-block; background-color:");
      out.print(colorsBlue[count2]);
      out.write("\">sample</p>\r\n");
      out.write("\t\t\t        ");
 count2++;
			        } else {
      out.write("\r\n");
      out.write("\t\t\t        <input type=\"radio\" name=\"colorGroup");
      out.print( userType);
      out.write("\" value=\"");
      out.print(colorsBlue[count2]);
      out.write("\"checked><p style=\"width:100px;display:inline-block; background-color:");
      out.print(colorsBlue[count2]);
      out.write("\">sample</p>\r\n");
      out.write("\t\t\t        ");
count2++;}
			      }
			    }
      out.write("\r\n");
      out.write("\t\t\t    <p><input type=\"submit\" value=\"送信する\"></p>\r\n");
      out.write("\t\t\t    </form>\r\n");
      out.write("\t\t\t    <h1>緑系統</h1>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<form action=\"");
      out.print(request.getContextPath());
      out.write("/Admin\" method=\"get\">\r\n");
      out.write("\t\t\t\t");

				int count3 = 0;
			    for (int a = 0; a < colorsGreen.length; a++) {
			      for (int i = 0; i < 10; i++) {
			        if((colorsGreen.length-count3) == 0) {
			          break;
			        } else if(i == 9) {
      out.write("\r\n");
      out.write("\t\t\t        <input type=\"radio\" name=\"colorGroup");
      out.print( userType);
      out.write("\" value=\"");
      out.print(colorsGreen[count3]);
      out.write("\"><p style=\"width:100px;display:inline-block; background-color:");
      out.print(colorsGreen[count3]);
      out.write("\">sample</p><br>\r\n");
      out.write("\t\t\t        ");
 count3++;
			        } else if(count3 != 0) {
      out.write("\r\n");
      out.write("\t\t\t        <input type=\"radio\" name=\"colorGroup");
      out.print( userType);
      out.write("\" value=\"");
      out.print(colorsGreen[count3]);
      out.write("\"><p style=\"width:100px;display:inline-block; background-color:");
      out.print(colorsGreen[count3]);
      out.write("\">sample</p>\r\n");
      out.write("\t\t\t        ");
 count3++;
			        } else {
      out.write("\r\n");
      out.write("\t\t\t        <input type=\"radio\" name=\"colorGroup");
      out.print( userType);
      out.write("\" value=\"");
      out.print(colorsGreen[count3]);
      out.write("\"checked><p style=\"width:100px;display:inline-block; background-color:");
      out.print(colorsGreen[count3]);
      out.write("\">sample</p>\r\n");
      out.write("\t\t\t        ");
count3++;}
			      }
			    }
      out.write("\r\n");
      out.write("\t\t\t    <p><input type=\"submit\" value=\"送信する\"></p>\r\n");
      out.write("\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t\t\t<h1>黄系統</h1>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<form action=\"");
      out.print(request.getContextPath());
      out.write("/Admin\" method=\"get\">\r\n");
      out.write("\t\t\t\t");

				int count4 = 0;
			    for (int a = 0; a < colorsYellow.length; a++) {
			      for (int i = 0; i < 10; i++) {
			        if((colorsYellow.length-count4) == 0) {
			          break;
			        } else if(i == 9) {
      out.write("\r\n");
      out.write("\t\t\t        <input type=\"radio\" name=\"colorGroup");
      out.print( userType);
      out.write("\" value=\"");
      out.print(colorsYellow[count4]);
      out.write("\"><p style=\"width:100px;display:inline-block; background-color:");
      out.print(colorsYellow[count4]);
      out.write("\">sample</p><br>\r\n");
      out.write("\t\t\t        ");
 count4++;
			        } else if(count4 != 0) {
      out.write("\r\n");
      out.write("\t\t\t        <input type=\"radio\" name=\"colorGroup");
      out.print( userType);
      out.write("\" value=\"");
      out.print(colorsYellow[count4]);
      out.write("\"><p style=\"width:100px;display:inline-block; background-color:");
      out.print(colorsYellow[count4]);
      out.write("\">sample</p>\r\n");
      out.write("\t\t\t        ");
 count4++;
			        } else {
      out.write("\r\n");
      out.write("\t\t\t        <input type=\"radio\" name=\"colorGroup");
      out.print( userType);
      out.write("\" value=\"");
      out.print(colorsYellow[count4]);
      out.write("\"checked><p style=\"width:100px;display:inline-block; background-color:");
      out.print(colorsYellow[count4]);
      out.write("\">sample</p>\r\n");
      out.write("\t\t\t        ");
count4++;}
			      }
			    }
      out.write("\r\n");
      out.write("\t\t\t    <p><input type=\"submit\" value=\"送信する\"></p>\r\n");
      out.write("\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t<h1>黒系統</h1>\r\n");
      out.write("\t\t\t\t<form action=\"");
      out.print(request.getContextPath());
      out.write("/Admin\" method=\"get\">\r\n");
      out.write("\t\t\t\t");

				int count5 = 0;
			    for (int a = 0; a < colorsYellow.length; a++) {
			      for (int i = 0; i < 10; i++) {
			        if((colorsBlack.length-count5) == 0) {
			          break;
			        } else if(i == 9) {
      out.write("\r\n");
      out.write("\t\t\t        <input type=\"radio\" name=\"colorGroup");
      out.print( userType);
      out.write("\" value=\"");
      out.print(colorsBlack[count5]);
      out.write("\"><p style=\"width:100px;display:inline-block; background-color:");
      out.print(colorsBlack[count5]);
      out.write("\">sample</p><br>\r\n");
      out.write("\t\t\t        ");
 count5++;
			        } else if(count5 != 0) {
      out.write("\r\n");
      out.write("\t\t\t        <input type=\"radio\" name=\"colorGroup");
      out.print( userType);
      out.write("\" value=\"");
      out.print(colorsBlack[count5]);
      out.write("\"><p style=\"width:100px;display:inline-block; background-color:");
      out.print(colorsBlack[count5]);
      out.write("\">sample</p>\r\n");
      out.write("\t\t\t        ");
 count5++;
			        } else {
      out.write("\r\n");
      out.write("\t\t\t        <input type=\"radio\" name=\"colorGroup");
      out.print( userType);
      out.write("\" value=\"");
      out.print(colorsBlack[count5]);
      out.write("\"checked><p style=\"width:100px;display:inline-block; background-color:");
      out.print(colorsBlack[count5]);
      out.write("\">sample</p>\r\n");
      out.write("\t\t\t        ");
count5++;}
			      }
			    }
      out.write("\r\n");
      out.write("\t\t\t    <p><input type=\"submit\" value=\"送信する\"></p>\r\n");
      out.write("\t\t\t\t</form>\r\n");
      out.write("\r\n");
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
