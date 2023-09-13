package ch04;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/juice")
public class GuessServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException {

		try {
			// �����R�[�h�̐ݒ�
			request.setCharacterEncoding("Shift_JIS");
			response.setContentType("text/plain; charest=Shift_JIS");

			// �Z�b�V�����I�u�W�F�N�g�̎擾
			HttpSession session = request.getSession();

			Integer answerNumber = null; // ���𐔎��p�ϐ�
			ArrayList<NumberInfo> list = null; // ����p�ϐ�
			String message = ""; // ���b�Z�[�W�p�ϐ�

			// �Q�[������t���O���擾
			String cmd = request.getParameter("cmd");

			// ����A�N�Z�X�A�܂��͍ă`�������W���̏���������
			if (cmd == null || cmd.equals("first")) {
				list = new ArrayList<NumberInfo>();
				cmd = "first";
				answerNumber = new Random().nextInt(10);
				session.setAttribute("answer", answerNumber);

				// �Q�[�����p�����̏���
			} else if (cmd.equals("game")) {

				// ���͐��l�A�����A�񓚐��l�̎擾
				String strUserNumber = (String) request.getParameter("user_number");
				list = (ArrayList<NumberInfo>) session.getAttribute("list");
				answerNumber = (Integer) session.getAttribute("answer");

				int intUserNumber = -1; // ���͐��l�p�ϐ�
				String judge = ""; // ����p�ϐ�

				// �G���[�`�F�b�N
				if (strUserNumber.equals("")) {
					message = "�������͂���Ă��܂���";
				} else {
					try {
						intUserNumber = Integer.parseInt(strUserNumber);
						if (intUserNumber < 0 || 9 < intUserNumber) {
							message = "0����9�܂ł̐�������͂��Ă�������";
						}
					} catch (NumberFormatException e) {
						message = "��������͂��Ă�������";
					}
				}

				// �G���[���Ȃ��ꍇ�A���菈��
				if (message.equals("")) {
					if (answerNumber == intUserNumber) {
						judge = "������";
						cmd = "end";
						message = intUserNumber + " �́A������ł�";
					} else {
						judge = "�͂���";
						message = intUserNumber + " �́A�͂���ł�";
					}
					// ���͐��l�A����𗚗��ɒǉ�
					NumberInfo objNumberInfo = new NumberInfo();
					objNumberInfo.setUserNumber(Integer.toString(intUserNumber));
					objNumberInfo.setJudge(judge);
					list.add(objNumberInfo);
				}
			}

			// �Q�[������t���O�A���b�Z�[�W�����N�G�X�g�X�R�[�v�֓o�^
			request.setAttribute("cmd", cmd);
			request.setAttribute("message", message);
			// �������Z�b�V�����֓o�^
			session.setAttribute("list", list);
			// JSP�։�ʑJ��
			request.getRequestDispatcher("/view/ch04/guess.jsp").forward(request, response);

			// �\�����Ȃ���O�����������ꍇ�̉�ʑJ��
		} catch (Exception e) {
			String message = "�\�����ʃG���[���������܂���<br>" + e.toString();
			request.setAttribute("cmd", "end");
			request.setAttribute("message", message);
			request.getRequestDispatcher("/view/ch04/guess.jsp").forward(request, response);
		}
	}
}