package ch05;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

//管理者側の画面遷移をコントロールするサーブレット
public class Admin extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

				try {
					// 文字コードの設定
					request.setCharacterEncoding("Shift_JIS");
					response.setContentType("text/plain; charest=Shift_JIS");

					// セッションオブジェクトの取得
					HttpSession session = request.getSession();

					// 変数宣言	※この先、request.setAttributeで送られる値についても便宜的にパラメータと表記している場合があります。
					String colorGroup1; //グループ1の色を保持する変数
					String colorGroup2; //グループ2の色を保持する変数
					String entry;       //初回アクセスかを識別するためのパラメータを保持する変数
					String reset;		//セッションスコープに保存されたcolorGroup1、2に割り振られた色をリセットする際に送信されるパラメータを代入する変数
					ServletContext ap;  //ServletContext オブジェクトを代入しアプリケーションスコープを利用するための変数

					colorGroup1 = request.getParameter("colorGroup1");//グループ1に割り振る色を保持するパラメータを受信
					colorGroup2 = request.getParameter("colorGroup2");//グループ2に割り振る色を保持するパラメータを受信
					reset = request.getParameter("reset");			  //グループ1、2に割り振られた色をリセットするパラメータを受信
					ap = getServletContext();						//アプリケーションスコープ利用のためServletContext オブジェクトを代入

					if(reset == null){
						reset = "";
					}
					/*グループ1、2に色を割り振るパラメータを同時に受信、つまり表示色設定ページで色を決定し送信ボタンがクリックされたとき処理*/
					if(colorGroup1 != null&&colorGroup2 != null) {
						ap.setAttribute("colorGroup1",colorGroup1);
						ap.setAttribute("colorGroup2",colorGroup2);
					}
					/*カラー選択ページで選択された色を保持するパラメータを受信した際の処理。仕組み上片方ずつしか送れないため
					 *このような条件分岐*/
					if(colorGroup1 != null &&colorGroup2 == null) {
						session.setAttribute("colorGroup1",colorGroup1);
					}else if (colorGroup1 == null&&colorGroup2 != null){
						session.setAttribute("colorGroup2",colorGroup2);
					}


					/*初回アクセス時の処理。entryにfirstという値を持たせ表示色設定ページへ*/

					if(colorGroup1 == null&&colorGroup2 == null){
					entry = "first";
					request.setAttribute("entry",entry);
					}

					/*表示色設定ページで色選択をリセットボタンがクリックされパラメータ「reset」を受信した際の処理*/
					if(reset.equals("reset")){
						session.invalidate();
						ap.removeAttribute("colorGroup1");
						ap.removeAttribute("colorGroup2");
					}
					request.getRequestDispatcher("/view/ch04/colorChange.jsp").forward(request, response);
					/*エラー等が発生した際の処理*/
					} catch (Exception e) {
					System.out.println("予期せぬエラーが発生しました" + e.toString());
					}
			}
}



