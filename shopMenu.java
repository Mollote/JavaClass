package personal_project;

import java.util.*;

public class shopMenu extends shopList {

	public Map<Integer, memberDTO> chickenMenu(List<shopDTO> chickenList, Map<Integer, memberDTO> memberMap) {
		Scanner scan = new Scanner(System.in);
		boolean run = true;

		List<shopMenuDTO> cartMenu = new ArrayList<>();// 장바구니용 배열선언
		shopPayService pay = new shopPayService();// 결제 불러오기

		System.out.print(" 가게를 입력해주세요 : ");
		String selectShop = scan.nextLine();

		while (run) {
			for (int i = 0; i < chickenList.size(); i++) {
				if (selectShop.equals(chickenList.get(i).name)) {
					System.out.println(chickenList.get(i));// 가게정보
					// 메뉴시작
					System.out.println(" 메뉴 \n [1.후라이드] \n [2.양념]\n [3.반반]\n [4.간장]\n [5.결제하기]\n [6.취소]");
					int selectMenu = scan.nextInt();
					if (selectMenu == 1) {
						shopMenuDTO a = new shopMenuDTO("후라이드치킨", 1, 9000);
						cartMenu.add(a);
					} else if (selectMenu == 2) {
						shopMenuDTO b = new shopMenuDTO("양념치킨", 1, 11000);
						cartMenu.add(b);
					} else if (selectMenu == 3) {
						shopMenuDTO c = new shopMenuDTO("반반 치킨", 1, 11000);
						cartMenu.add(c);
					} else if (selectMenu == 4) {
						shopMenuDTO d = new shopMenuDTO("간장 치킨", 1, 12000);
						cartMenu.add(d);
					} else if (selectMenu == 5) {
						// 다음 단계_ 결제하기,
						if (cartMenu.size() == 0) {
							// 장바구니에 아무것도 없을시
							System.out.println(" 메뉴를 선택해주십시오.");
						} else {
							pay.payService(cartMenu, memberMap);
						}
					} else if (selectMenu == 6) {
						run = false;
					}
					// 새로운배열(장바구니) 만들고 거기에 추가하기
					System.out.println("장바구니 " + cartMenu);
				}
			}
		}
		return memberMap;
	}

	public Map<Integer, memberDTO> hamburgerMenu(List<shopDTO> hamburgerList, Map<Integer, memberDTO> memberMap) {
		Scanner scan = new Scanner(System.in);
		boolean run = true;

		List<shopMenuDTO> cartMenu = new ArrayList<>();// 장바구니용 배열선언
		shopPayService pay = new shopPayService();// 결제 불러오기

		System.out.print(" 가게를 입력해주세요. ");
		String selectShop = scan.nextLine();

		while (run) {
			for (int i = 0; i < hamburgerList.size(); i++) {
				if (selectShop.equals(hamburgerList.get(i).name)) {
					System.out.println(hamburgerList.get(i));// 가게정보
					// 메뉴시작
					System.out.println("메뉴\n [1.불고기버거] [2.치즈버거] [3.새우버거] [4.치킨버거] [5.결제하기] [6.취소]");
					int selectMenu = scan.nextInt();
					if (selectMenu == 1) {
						shopMenuDTO a = new shopMenuDTO("후라이드치킨", 1, 9000);
						cartMenu.add(a);
					} else if (selectMenu == 2) {
						shopMenuDTO b = new shopMenuDTO("양념치킨", 1, 11000);
						cartMenu.add(b);
					} else if (selectMenu == 3) {
						shopMenuDTO c = new shopMenuDTO("반반 치킨", 1, 11000);
						cartMenu.add(c);
					} else if (selectMenu == 4) {
						shopMenuDTO d = new shopMenuDTO("간장 치킨", 1, 12000);
						cartMenu.add(d);
					} else if (selectMenu == 5) {
						// 다음 단계_ 결제하기,
						if (cartMenu.size() == 0) {
							// 장바구니에 아무것도 없을시
							System.out.println("메뉴를 선택해주십시오.");
						} else {
							pay.payService(cartMenu, memberMap);
						}
					} else if (selectMenu == 6) {
						run = false;
					}
					// 새로운배열(장바구니) 만들고 거기에 추가하기
					System.out.println("장바구니 " + cartMenu);
				}
			}
		}
		return memberMap;
	}

	public Map<Integer, memberDTO> pizzaMenu(List<shopDTO> pizzaList, Map<Integer, memberDTO> memberMap) {
		Scanner scan = new Scanner(System.in);
		boolean run = true;

		List<shopMenuDTO> cartMenu = new ArrayList<>();// 장바구니용 배열선언
		shopPayService pay = new shopPayService();// 결제 불러오기

		System.out.print(" 가게를 입력해주세요. ");
		String selectShop = scan.nextLine();

		while (run) {
			for (int i = 0; i < pizzaList.size(); i++) {
				if (selectShop.equals(pizzaList.get(i).name)) {
					System.out.println(pizzaList.get(i));// 가게정보
					// 메뉴시작
					System.out.println("메뉴\n [1.불고기피자] [2.치즈피자] [3.페페로니피자] [4.결제하기] [5.취소]");
					int selectMenu = scan.nextInt();
					if (selectMenu == 1) {
						shopMenuDTO a = new shopMenuDTO("불고기피자", 1, 17000);
						cartMenu.add(a);
					} else if (selectMenu == 2) {
						shopMenuDTO b = new shopMenuDTO("치즈피자", 1, 18000);
						cartMenu.add(b);
					} else if (selectMenu == 3) {
						shopMenuDTO c = new shopMenuDTO("페페로니피자", 1, 20000);
						cartMenu.add(c);
					} else if (selectMenu == 4) {
						// 다음 단계_ 결제하기,
						if (cartMenu.size() == 0) {
							// 장바구니에 아무것도 없을시
							System.out.println("메뉴를 선택해주십시오.");
						} else {
							pay.payService(cartMenu, memberMap);
						}
					} else if (selectMenu == 5) {
						run = false;
					} else {
						System.out.println(" 잘못입력하셨습니다.");
						run = false;
					}
					// 새로운배열(장바구니) 만들고 거기에 추가하기
					System.out.println(" 장바구니 목록 " + cartMenu);
				}
			}
		}
		return memberMap;
	}

}
