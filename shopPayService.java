package personal_project;

import java.util.*;

public class shopPayService extends shopMenu {
	// 결제하기
	int result;

	public Map<Integer,memberDTO> payService(List<shopMenuDTO> cartMenu, Map<Integer, memberDTO> memberMap) {
		
		int randomNum = (int) (Math.random() * 20)+40;
		Scanner scan = new Scanner(System.in);
		boolean run = true;
		result = 0;
		shopMenuDTO order = new shopMenuDTO();

		for (int j = 0; j < cartMenu.size(); j++) {
			result = result + cartMenu.get(j).moneyChicken;
			order.setPayMoney(result);
		}
		while (run) {
			for (Integer v : memberMap.keySet()) {
				if (memberMap.get(v).isLogin() == true) {
					System.out.println(" 주소 : " + memberMap.get(v).memberAdd);
					System.out.println(" 핸드폰번호 : " + memberMap.get(v).memberPhone);
					System.out.println(" 배달페이 : " + memberMap.get(v).moneyBalance);
					System.out.println(" "+cartMenu);
					System.out.println(" 총 결제금액은 " + order.getPayMoney() + "원 입니다.");
					System.out.println(" 결제하시겠습니까? \"확인\"을 입력해주세요");
					System.out.print(" > ");
					String okay = scan.nextLine();
					if (okay.equals("확인")) {
						if (memberMap.get(v).moneyBalance > order.getPayMoney()) {
							// 내 배달페이금액이 더 많을경우만 주문가능
							result = memberMap.get(v).moneyBalance - order.getPayMoney();
							memberMap.get(v).moneyBalance = result;
							
							System.out.println("---------------------------------------");
							System.out.println("\n 주문이 완료되었습니다! ");
							System.out.println("\n 배달 소요시간은 약 "+randomNum+"분 입니다. \n");
							System.out.println("---------------------------------------");
							
							run = false;
						} else {
							System.out.println(" 잔액이 부족합니다. 주문이 취소되었습니다.");
							run = false;
						}
					} else {
						System.out.println(" 주문이 취소되었습니다.");
						run = false;
					}
				}
			}
		}
		return memberMap;
	}
}
