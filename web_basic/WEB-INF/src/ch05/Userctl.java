package ch05;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

//���[�U�[���̉�ʑJ�ڂ��R���g���[������T�[�u���b�g



public class Userctl extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

				try {

					// �����R�[�h�̐ݒ�
					request.setCharacterEncoding("Shift_JIS");
					response.setContentType("text/plain; charest=Shift_JIS");
					// �Z�b�V�����I�u�W�F�N�g�̎擾
					HttpSession session = request.getSession();
					//�A�v���P�[�V�����X�R�[�v�̕ۑ��̈���擾
					ServletContext ap = getServletContext();

					//�ϐ��錾     �����̐�Arequest.setAttribute�ő�����l�ɂ��Ă��֋X�I�Ƀp�����[�^�ƕ\�L���Ă���ꍇ������܂��B
					String message;		//���ӎ����m�F�����{���̃��b�Z�[�W�p�ϐ�
					String userType;	//���[�U�[���I�������O���[�v�������ϐ�
					String confirm;		//���ӎ����m�F���s�������ۂ����Ǘ�����ϐ�
					String second ;    //����A�N�Z�X���ēǂݍ��݂ɂ��A�N�Z�X�������ʂ��邽�߂̃Z�b�V�����p�ϐ�
					Integer group1Count; //�O���[�v1(���[�U�[�^�C�v1)�A�N�Z�X�Ґ��J�E���g�p
					Integer group2Count; //�O���[�v2(���[�U�[�^�C�v2)�A�N�Z�X�Ґ��J�E���g�p
					String reload;		//�ēǂݍ��ݎ��ɃA�N�Z�X�J�E���g�������Ȃ��悤�ɂ��邽�߂̃p�����[�^
					String logout;		//���O�A�E�g���y�[�W�J�ڂ�����A���̃T�[�u���b�g�����삵�����Ă��G���[���o�Ȃ��悤�ɂ��邽�߂̕ϐ�
					String countReset;  //�A�v���P�[�V�����X�R�[�v�����Z�b�g���邽�߂̃��N�G�X�g�p�����[�^���i�[
					String apReset;     //�A�v���P�[�V�������Z�b�g��A���̃T�[�u���b�g�����삵�����Ă��G���[���o�Ȃ��悤�ɂ���ϐ�

					//�p�����[�^��M �ϐ��̏����� �Z�b�V�����p�����[�^�̎擾
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


					//�Z�b�V�����Ƀp�����[�^�����݂���ꍇ�̓��O�A�E�g
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



					//����A�N�Z�X���A�O���[�v�I���y�[�W�Ƀt�H���[�h
					if(userType.equals("")&&second == null&&apReset == null) {
						request.getRequestDispatcher("/view/ch04/index.jsp").forward(request, response);
					}

					/*�O���[�v�I���y�[�W�Œ��ӎ����̊m�F������Ă��Ȃ��ꍇ�̏����B���ӎ������m�F�������ۂ���Ԃ�
					 �p�����[�^(�����̕ϐ��Ɋi�[)�uconfirm�v�͏����l�ł��������w���uFalse�v���A�O���[�v���w���p�����[�^
					 userType�̓O���[�v�P���w���u1�v�������l�Ƃ��ăv���_�E�����X�g�ɓ����Ă��邽�ߎd�g�ݏ㗼�������I����
					 �Ȃ�P�[�X�͂Ȃ��B */
					if((userType.equals("1")&&confirm.equals("False")&&second == null)||(userType.equals("2")&&confirm.equals("False")&&second == null)){
						message = "���ӎ������m�F���Ă�������";
						request.setAttribute("message",message);
						request.setAttribute("confirm",confirm);
						request.setAttribute("userType",userType);
						request.getRequestDispatcher("/view/ch04/index.jsp").forward(request, response);
					}
					//�O���[�v�I���y�[�W�ŃO���[�v���I�����꒍�ӎ����̊m�F���s��ꂽ�ꍇ�̏���
					//�F��\�������ʂɑJ�ڂ�����B

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



					//�G���[������
				}catch (Exception e) {
					System.out.println("�\�����ʃG���[���������܂���" + e.toString());

				}
	}
}
