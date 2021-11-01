package personal_project;

public class memberDTO {
	int memberNum;
	String memberId;
	String memberPw;
	String memberName;
	String memberAdd;
	String memberPhone;
	int moneyBalance;
	boolean login;

	public memberDTO() {

	}

	public memberDTO(int memberNum, String memberId, String memberPw, String memberName, String memberAdd,
			String memberPhone, int moneyBalance) {
		super();
		this.memberNum = memberNum;
		this.memberId = memberId;
		this.memberPw = memberPw;
		this.memberName = memberName;
		this.memberAdd = memberAdd;
		this.memberPhone = memberPhone;
		this.moneyBalance = moneyBalance;
	}

	public int getMoneyBalance() {
		return moneyBalance;
	}

	public void setMoneyBalance(int moneyBalance) {
		this.moneyBalance = moneyBalance;
	}

	public int getMemberNum() {
		return memberNum;
	}

	public void setMemberNum(int memberNum) {
		this.memberNum = memberNum;
	}

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getMemberPw() {
		return memberPw;
	}

	public void setMemberPw(String memberPw) {
		this.memberPw = memberPw;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public String getMemberAdd() {
		return memberAdd;
	}

	public void setMemberAdd(String memberAdd) {
		this.memberAdd = memberAdd;
	}

	public String getMemberPhone() {
		return memberPhone;
	}

	public void setMemberPhone(String memberPhone) {
		this.memberPhone = memberPhone;
	}

	public boolean isLogin() {
		return login;
	}

	public void setLogin(boolean login) {
		this.login = login;
	}

}
