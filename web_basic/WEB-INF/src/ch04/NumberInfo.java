package ch04;

public class NumberInfo {

	private String userNumber;	//���͐��l�p�ϐ�
	private String judge;			//����p�ϐ�

	NumberInfo(){
		userNumber = "";
		judge = "";
	}

	//�ϐ�userNumber�̃A�N�Z�T���\�b�h
	public String getUserNumber() {
		return userNumber;
	}
	public void setUserNumber(String userNumber) {
		this.userNumber = userNumber;
	}

	//�ϐ�judge�̃A�N�Z�T���\�b�h
	public String getJudge() {
		return judge;
	}
	public void setJudge(String judge) {
		this.judge = judge;
	}
}