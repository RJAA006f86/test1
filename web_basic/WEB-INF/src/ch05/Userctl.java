package ch05;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//ユーザー側の画面遷移をコントロールするサーブレット



public class Userctl extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

				try {
					// 文字コードの設定
					request.setCharacterEncoding("Shift_JIS");
					response.setContentType("text/plain; charest=Shift_JIS");

					//変数宣言     ※この先、request.setAttributeで送られる値についても便宜的にパラメータと表記している場合があります。
					String message;		//注意事項確認未実施時のメッセージ用変数
					String userType;	//ユーザーが選択したグループを示す変数
					String confirm;		//注意事項確認を行ったか否かを管理する変数


					//パラメータをgetで受信
					userType = request.getParameter("userType");
					confirm = request.getParameter("confirm");

					if(confirm == null) {
						confirm = "";
					}
					if(userType == null) {
						userType = "";
					}


					//初回アクセス時、グループ選択ページにフォワード
					if(userType.equals("") ) {
						request.getRequestDispatcher("/view/ch04/index.jsp").forward(request, response);
					}


					//グループ選択ページでグループが選択され注意事項の確認が行われた場合の処理
					//色を表示する画面に遷移させる。

					if((userType.equals("1")&&confirm.equals("True"))||(userType.equals("2")&&confirm.equals("True"))) {
						request.setAttribute("userType",userType);
						request.getRequestDispatcher("/view/ch04/light.jsp").forward(request, response);
					}

					/*グループ選択ページで注意事項の確認がされていない場合の処理。注意事項を確認したか否かを返す
					 パラメータ(同名の変数に格納)「confirm」は初期値でいいえを指す「False」が、グループを指すパラメータ
					 userTypeはグループ１を指す「1が」初期値としてプルダウンリストに入っているため仕組み上両方が未選択に
					 なるケースはない。 */

					if((userType.equals("1")&&confirm.equals("False"))||(userType.equals("2")&&confirm.equals("False"))){
						message = "注意事項を確認してください";
						request.setAttribute("message",message);
						request.setAttribute("confirm",confirm);
						request.setAttribute("userType",userType);
						request.getRequestDispatcher("/view/ch04/index.jsp").forward(request, response);
					}


					//エラー発生時
				}catch (Exception e) {
					System.out.println("予期せぬエラーが発生しました" + e.toString());

				}
	}
}
