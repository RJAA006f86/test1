package ch05;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

//ユーザー側の画面遷移をコントロールするサーブレット



public class Userctl extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

				try {

					// 文字コードの設定
					request.setCharacterEncoding("Shift_JIS");
					response.setContentType("text/plain; charest=Shift_JIS");
					// セッションオブジェクトの取得
					HttpSession session = request.getSession();
					//アプリケーションスコープの保存領域を取得
					ServletContext ap = getServletContext();

					//変数宣言     ※この先、request.setAttributeで送られる値についても便宜的にパラメータと表記している場合があります。
					String message;		//注意事項確認未実施時のメッセージ用変数
					String userType;	//ユーザーが選択したグループを示す変数
					String confirm;		//注意事項確認を行ったか否かを管理する変数
					String second ;    //初回アクセスか再読み込みによるアクセスかを識別するためのセッション用変数
					Integer group1Count; //グループ1(ユーザータイプ1)アクセス者数カウント用
					Integer group2Count; //グループ2(ユーザータイプ2)アクセス者数カウント用
					String reload;		//再読み込み時にアクセスカウントが動かないようにするためのパラメータ
					String logout;		//ログアウトしページ遷移した後、このサーブレットが動作し続けてもエラーが出ないようにするための変数
					String countReset;  //アプリケーションスコープをリセットするためのリクエストパラメータを格納
					String apReset;     //アプリケーションリセット後、このサーブレットが動作し続けてもエラーが出ないようにする変数

					//パラメータ受信 変数の初期化 セッションパラメータの取得
					userType = request.getParameter("userType");
					confirm = request.getParameter("confirm");
					second = (String)session.getAttribute("second");
					group1Count = (Integer)ap.getAttribute("group1Count");
					group2Count = (Integer)ap.getAttribute("group2Count");
					logout = null;
					reload = request.getParameter("reload");
					countReset = request.getParameter("countReset");
					apReset = null;

					if(confirm == null) {
						confirm = "";
					}
					if(userType == null) {
						userType = "";
					}
					if(group1Count == null&&group2Count == null) {
						group1Count = 0;
						group2Count = 0;
						ap.setAttribute("group1Count",group1Count);
						ap.setAttribute("group2Count",group2Count);
					}
					if(countReset != null) {
						ap.removeAttribute("group1Count");
						ap.removeAttribute("group2Count");
						apReset = "True";
						request.getRequestDispatcher("/view/ch04/accessCount.jsp").forward(request, response);
					}


					//セッションにパラメータが存在する場合はログアウト
					if(second != null&&reload == null&&countReset == null) {
						if(group1Count > 0){
							group1Count--;
							ap.setAttribute("group1Count",group1Count);
						}else if(group2Count > 0){
							group2Count--;
							ap.setAttribute("group2Count",group2Count);
						}
						session.invalidate();
						logout = "True";
						request.getRequestDispatcher("/view/ch04/logout.jsp").forward(request, response);
					}



					//初回アクセス時、グループ選択ページにフォワード
					if(userType.equals("")&&second == null&&apReset == null) {
						request.getRequestDispatcher("/view/ch04/index.jsp").forward(request, response);
					}

					/*グループ選択ページで注意事項の確認がされていない場合の処理。注意事項を確認したか否かを返す
					 パラメータ(同名の変数に格納)「confirm」は初期値でいいえを指す「False」が、グループを指すパラメータ
					 userTypeはグループ１を指す「1」が初期値としてプルダウンリストに入っているため仕組み上両方が未選択に
					 なるケースはない。 */
					if((userType.equals("1")&&confirm.equals("False")&&second == null)||(userType.equals("2")&&confirm.equals("False")&&second == null)){
						message = "注意事項を確認してください";
						request.setAttribute("message",message);
						request.setAttribute("confirm",confirm);
						request.setAttribute("userType",userType);
						request.getRequestDispatcher("/view/ch04/index.jsp").forward(request, response);
					}
					//グループ選択ページでグループが選択され注意事項の確認が行われた場合の処理
					//色を表示する画面に遷移させる。

					if((userType.equals("1")&&confirm.equals("True")&&logout == null)||(userType.equals("2")&&confirm.equals("True")&&logout == null)) {
						if(userType.equals("1")&&reload == null&&second == null){
							group1Count++;
							ap.setAttribute("group1Count",group1Count);
						} else if(userType.equals("2")&&reload == null&&second == null) {
							group2Count++;
							ap.setAttribute("group2Count",group2Count);
						}
						request.setAttribute("userType",userType);
						second = "True";
						session.setAttribute("second",second);
						request.getRequestDispatcher("/view/ch04/light.jsp").forward(request, response);
					}



					//エラー発生時
				}catch (Exception e) {
					System.out.println("予期せぬエラーが発生しました" + e.toString());

				}
	}
}
