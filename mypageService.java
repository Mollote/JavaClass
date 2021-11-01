	package personal_project;

import java.util.*;

public class mypageService extends memberService {

	public Map<Integer, memberDTO> checkLogin(Map<Integer, memberDTO> memberMap, Map<Integer, mypageDTO> mypageMap) {
		Scanner scan = new Scanner(System.in);
		shopList list = new shopList();
		boolean run = true;

		// 랜덤메뉴추천
		List<String> randomFood = new ArrayList<>();
		String a = "당근 모든 치킨은 옳다! 🍗치킨";
		String b = "완벽한 한끼! 🍕피자";
		String c = "빠르고 간편하게! 🍔햄버거";
		randomFood.add(a);
		randomFood.add(b);
		randomFood.add(c);
		int randomNum = (int) (Math.random() * randomFood.size());

		for (Integer v : memberMap.keySet()) {
			if (memberMap.get(v).isLogin() == true) {
				// 로그인에 성공한 경우 , 마이페이지
				while (run) {
					System.out.println("\n\n 고마운분, " + memberMap.get(v).memberName);
					System.out.println("\n 오늘 [ " + randomFood.get(randomNum) + " ] 어떠세요?");
					System.out.println("\n 나의 배달페이는 [ " + memberMap.get(v).moneyBalance + " ]원 입니다.");
					System.out.println("\n 1.주문하기 2.배달페이충전 3.로그아웃");
					System.out.print(" > ");
					int selectNum = scan.nextInt();
					if (selectNum == 1) {
						// 1.주문하기 입력
						boolean run2 = true;
						while (run2) {
							System.out.println("\n 내 주소지 : " + memberMap.get(v).memberAdd);
							System.out.println("\n [ 1.치킨 ] [ 2.피자 ] [ 3.햄버거 ] [ 4.취소 ]");
							System.out.print(" > ");
							int selectMenu = scan.nextInt();
							if (selectMenu == 1) {
								list.chickenShop(memberMap);
							} else if (selectMenu == 2) {
								list.pizzaShop(memberMap);
							} else if (selectMenu == 3) {
								list.hamburgerShop(memberMap);
							} else if (selectMenu == 4) {
								run2 = false;
							} else {
								System.out.println(" 잘못입력하셨습니다.");
							}
						}

					} else if (selectNum == 2) {
						// 3.포인트충전 입력
						System.out.println("\n 현재 보유 배달페이는 " + memberMap.get(v).moneyBalance + "원 입니다.");
						System.out.println("\n 계좌번호를 입력해주십시오.");
						System.out.print(" > ");
						String accNum = scan.nextLine();
						accNum = scan.nextLine(); // 개행오류
						System.out.println("\n 입금하실 금액을 입력해주십시오.");
						System.out.print(" > ");
						int deposit = scan.nextInt();
						System.out.println("\n 충전이 완료되었습니다.");
						int result = memberMap.get(v).moneyBalance + deposit;
						memberMap.get(v).setMoneyBalance(result);
					} else if (selectNum == 3) {
						run = false;
					}

				}

			}
		}
		return memberMap;
	}

}
