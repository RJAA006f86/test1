package ch05;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

//�Ǘ��ґ��̉�ʑJ�ڂ��R���g���[������T�[�u���b�g
public class Admin extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

				try {
					// �����R�[�h�̐ݒ�
					request.setCharacterEncoding("Shift_JIS");
					response.setContentType("text/plain; charest=Shift_JIS");

					// �Z�b�V�����I�u�W�F�N�g�̎擾
					HttpSession session = request.getSession();

					// �ϐ��錾	�����̐�Arequest.setAttribute�ő�����l�ɂ��Ă��֋X�I�Ƀp�����[�^�ƕ\�L���Ă���ꍇ������܂��B
					String colorGroup1; //�O���[�v1�̐F��ێ�����ϐ�
					String colorGroup2; //�O���[�v2�̐F��ێ�����ϐ�
					String entry;       //����A�N�Z�X�������ʂ��邽�߂̃p�����[�^��ێ�����ϐ�
					String reset;		//�Z�b�V�����X�R�[�v�ɕۑ����ꂽcolorGroup1�A2�Ɋ���U��ꂽ�F�����Z�b�g����ۂɑ��M�����p�����[�^��������ϐ�
					ServletContext ap;  //ServletContext �I�u�W�F�N�g�������A�v���P�[�V�����X�R�[�v�𗘗p���邽�߂̕ϐ�

					colorGroup1 = request.getParameter("colorGroup1");//�O���[�v1�Ɋ���U��F��ێ�����p�����[�^����M
					colorGroup2 = request.getParameter("colorGroup2");//�O���[�v2�Ɋ���U��F��ێ�����p�����[�^����M
					reset = request.getParameter("reset");			  //�O���[�v1�A2�Ɋ���U��ꂽ�F�����Z�b�g����p�����[�^����M
					ap = getServletContext();						//�A�v���P�[�V�����X�R�[�v���p�̂���ServletContext �I�u�W�F�N�g����

					if(reset == null){
						reset = "";
					}
					/*�O���[�v1�A2�ɐF������U��p�����[�^�𓯎��Ɏ�M�A�܂�\���F�ݒ�y�[�W�ŐF�����肵���M�{�^�����N���b�N���ꂽ�Ƃ�����*/
					if(colorGroup1 != null&&colorGroup2 != null) {
						ap.setAttribute("colorGroup1",colorGroup1);
						ap.setAttribute("colorGroup2",colorGroup2);
					}
					/*�J���[�I���y�[�W�őI�����ꂽ�F��ێ�����p�����[�^����M�����ۂ̏����B�d�g�ݏ�Е�����������Ȃ�����
					 *���̂悤�ȏ�������*/
					if(colorGroup1 != null &&colorGroup2 == null) {
						session.setAttribute("colorGroup1",colorGroup1);
					}else if (colorGroup1 == null&&colorGroup2 != null){
						session.setAttribute("colorGroup2",colorGroup2);
					}


					/*����A�N�Z�X���̏����Bentry��first�Ƃ����l���������\���F�ݒ�y�[�W��*/

					if(colorGroup1 == null&&colorGroup2 == null){
					entry = "first";
					request.setAttribute("entry",entry);
					}

					/*�\���F�ݒ�y�[�W�ŐF�I�������Z�b�g�{�^�����N���b�N����p�����[�^�ureset�v����M�����ۂ̏���*/
					if(reset.equals("reset")){
						session.invalidate();
						ap.removeAttribute("colorGroup1");
						ap.removeAttribute("colorGroup2");
					}
					request.getRequestDispatcher("/view/ch04/colorChange.jsp").forward(request, response);
					/*�G���[�������������ۂ̏���*/
					} catch (Exception e) {
					System.out.println("�\�����ʃG���[���������܂���" + e.toString());
					}
			}
}



