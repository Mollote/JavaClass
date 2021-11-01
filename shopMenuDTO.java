package personal_project;

public class shopMenuDTO {

	String nameChicken;
	int countChicken;
	int moneyChicken;
	int payMoney;

	public int getPayMoney() {
		return payMoney;
	}

	public void setPayMoney(int payMoney) {
		this.payMoney = payMoney;
	}

	@Override
	public String toString() {
		return " "+nameChicken +" "+ countChicken + "개 " + moneyChicken + "원 ";
	}

	public shopMenuDTO() {

	}

	public shopMenuDTO(String nameChicken, int countChicken, int moneyChicken) {
		super();
		this.nameChicken = nameChicken;
		this.countChicken = countChicken;
		this.moneyChicken = moneyChicken;
	}

}
