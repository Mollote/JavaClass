package personal_project;

public class mypageDTO {
	int randomFood;
	String orderList;
	String chicken;
	String pizza;
	String korea;
	String china;
	String susi;
	
	public mypageDTO(String chicken, String pizza, String korea, String china, String susi) {
//		super();
		this.chicken = chicken;
		this.pizza = pizza;
		this.korea = korea;
		this.china = china;
		this.susi = susi;
	}
	public int getRandomFood() {
		return randomFood;
	}
	public void setRandomFood(int randomFood) {
		this.randomFood = randomFood;
	}
	public String getOrderList() {
		return orderList;
	}
	public void setOrderList(String orderList) {
		this.orderList = orderList;
	}
}
