package personal_project;

public class shopDTO {
//  가게의 이름,별점,주문수,최소주문금액, 가게 번호
	String name;
	String shopInfo;
	int star;
	int orderCount;
	int leastMoney;
	int shopNum;

	public shopDTO() {

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getStar() {
		return star;
	}

	public void setStar(int star) {
		this.star = star;
	}

	public int getOrderCount() {
		return orderCount;
	}

	public void setOrderCount(int orderCount) {
		this.orderCount = orderCount;
	}

	public shopDTO(String shopInfo,String name, int star, int orderCount, int least,int shopNum) {
		super();
		this.name = name;
		this.star = star;
		this.orderCount = orderCount;
		this.leastMoney = least;
		this.shopNum = shopNum;
		this.shopInfo = shopInfo;
	}

	@Override
	public String toString() {
		return "[상호명 = " + name + ", 별점 = " + star + ", 주문량 = " + orderCount + "]";
	}

}
