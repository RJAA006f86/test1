package ch05;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//���[�U�[���̉�ʑJ�ڂ��R���g���[������T�[�u���b�g



public class Userctl extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

				try {
					// �����R�[�h�̐ݒ�
					request.setCharacterEncoding("Shift_JIS");
					response.setContentType("text/plain; charest=Shift_JIS");

					//�ϐ��錾     �����̐�Arequest.setAttribute�ő�����l�ɂ��Ă��֋X�I�Ƀp�����[�^�ƕ\�L���Ă���ꍇ������܂��B
					String message;		//���ӎ����m�F�����{���̃��b�Z�[�W�p�ϐ�
					String userType;	//���[�U�[���I�������O���[�v�������ϐ�
					String confirm;		//���ӎ����m�F���s�������ۂ����Ǘ�����ϐ�


					//�p�����[�^��get�Ŏ�M
					userType = request.getParameter("userType");
					confirm = request.getParameter("confirm");

					if(confirm == null) {
						confirm = "";
					}
					if(userType == null) {
						userType = "";
					}


					//����A�N�Z�X���A�O���[�v�I���y�[�W�Ƀt�H���[�h
					if(userType.equals("") ) {
						request.getRequestDispatcher("/view/ch04/index.jsp").forward(request, response);
					}


					//�O���[�v�I���y�[�W�ŃO���[�v���I�����꒍�ӎ����̊m�F���s��ꂽ�ꍇ�̏���
					//�F��\�������ʂɑJ�ڂ�����B

					if((userType.equals("1")&&confirm.equals("True"))||(userType.equals("2")&&confirm.equals("True"))) {
						request.setAttribute("userType",userType);
						request.getRequestDispatcher("/view/ch04/light.jsp").forward(request, response);
					}

					/*�O���[�v�I���y�[�W�Œ��ӎ����̊m�F������Ă��Ȃ��ꍇ�̏����B���ӎ������m�F�������ۂ���Ԃ�
					 �p�����[�^(�����̕ϐ��Ɋi�[)�uconfirm�v�͏����l�ł��������w���uFalse�v���A�O���[�v���w���p�����[�^
					 userType�̓O���[�v�P���w���u1���v�����l�Ƃ��ăv���_�E�����X�g�ɓ����Ă��邽�ߎd�g�ݏ㗼�������I����
					 �Ȃ�P�[�X�͂Ȃ��B */

					if((userType.equals("1")&&confirm.equals("False"))||(userType.equals("2")&&confirm.equals("False"))){
						message = "���ӎ������m�F���Ă�������";
						request.setAttribute("message",message);
						request.setAttribute("confirm",confirm);
						request.setAttribute("userType",userType);
						request.getRequestDispatcher("/view/ch04/index.jsp").forward(request, response);
					}


					//�G���[������
				}catch (Exception e) {
					System.out.println("�\�����ʃG���[���������܂���" + e.toString());

				}
	}
}
