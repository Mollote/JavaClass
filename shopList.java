package personal_project;

import java.util.*;

public class shopList extends mypageService {
	public Map<Integer, memberDTO> chickenShop(Map<Integer, memberDTO> memberMap) {
		Scanner scan = new Scanner(System.in);
		boolean run = true;

		List<shopDTO> chickenList = new ArrayList<>();
		shopDTO a = new shopDTO(" 비비치킨 \n ⭐5 (68) \n 최소주문 15000원\n\n️", "비비치킨", 5, 68, 15000, 1);
		shopDTO b = new shopDTO(" 호섭이치킨 \n ⭐4 (152) \n 최소주문 11000원\n\n", "호섭이치킨",4, 152, 11000, 2);
		shopDTO c = new shopDTO(" 교총치킨 \n ⭐3 (33) \n 최소주문 9000원\n\n", "교총치킨",3, 33, 9000, 3);
		chickenList.add(a);
		chickenList.add(b);
		chickenList.add(c);

		shopComparison orderCom = new shopComparison(); // 항목별 비교하기
		shopMenu callMenu = new shopMenu();// 가게의 메뉴들을 호출

		while (run) {
			System.out.println(" 어떤 순서로 찾으시겠습니까?");
			System.out.println(" [ 1.주문많은순 ] [ 2.별점순 ] [ 3.최소주문금액순 ] [ 4.취소 ]");
			System.out.print(" > ");
			int selectNum = scan.nextInt();
			if (selectNum == 1) {// 주문많은순
				orderCom.chickenOrderComparsion(chickenList);
				callMenu.chickenMenu(chickenList, memberMap);
			} else if (selectNum == 2) {// 별점순
				orderCom.chickenStarComparsion(chickenList);
				callMenu.chickenMenu(chickenList, memberMap);
			} else if (selectNum == 3) {// 최소금액순
				orderCom.chickenLeastComparsion(chickenList);
				callMenu.chickenMenu(chickenList, memberMap);
			} else if (selectNum == 4) {
				run = false;
			} else {
				System.out.println("잘못입력하셨습니다.");
			}
		}
		return memberMap;
	}

	public Map<Integer, memberDTO> pizzaShop(Map<Integer, memberDTO> memberMap) {
		Scanner scan = new Scanner(System.in);
		boolean run = true;

		List<shopDTO> pizzaList = new ArrayList<>();
		shopDTO a = new shopDTO(" 도레미피자\n ⭐5 (33) \n 최소주문 19000원\n\n","도레미피자", 5, 38, 19000, 1);
		shopDTO b = new shopDTO(" 마마존스\n ⭐4 (122) \n 최소주문 17000원\n\n","마마존스",4, 122, 17000, 2);
		shopDTO c = new shopDTO(" 미세스피자\n ⭐3 (73) \n 최소주문 15000원\n\n","미세스피자", 3, 73, 15000, 3);
		pizzaList.add(a);
		pizzaList.add(b);
		pizzaList.add(c);

		shopComparison orderCom = new shopComparison(); // 항목별 비교하기
		shopMenu callMenu = new shopMenu();// 가게의 메뉴들을 호출

		while (run) {
			System.out.println(" 어떤 순서로 찾으시겠습니까?");
			System.out.println(" [ 1.주문많은순 ] [ 2.별점순 ] [ 3.최소주문금액순 ] [ 4.취소 ]");
			System.out.print(" > ");
			int selectNum = scan.nextInt();
			if (selectNum == 1) {// 주문많은순
				orderCom.pizzaOrderComparsion(pizzaList);
				callMenu.pizzaMenu(pizzaList, memberMap);
			} else if (selectNum == 2) {// 별점순
				orderCom.pizzaStarComparsion(pizzaList);
				callMenu.pizzaMenu(pizzaList, memberMap);
			} else if (selectNum == 3) {// 최소금액순
				orderCom.pizzaLeastComparsion(pizzaList);
				callMenu.pizzaMenu(pizzaList, memberMap);
			} else if (selectNum == 4) {
				run = false;
			} else {
				System.out.println("잘못입력하셨습니다.");
			}
		}
		return memberMap;
	}

	public Map<Integer, memberDTO> hamburgerShop(Map<Integer, memberDTO> memberMap) {
		Scanner scan = new Scanner(System.in);
		boolean run = true;

		List<shopDTO> hamburgerList = new ArrayList<>();
		shopDTO a = new shopDTO(" 맥도날드\n ⭐4 (258) \n 최소주문 8000원\n\n","맥도날드", 4, 258, 8000, 1);
		shopDTO b = new shopDTO(" 롯데리아\n ⭐5 (15) \n 최소주문 12000원\n\n","롯데리아", 5, 15, 12000, 2);
		shopDTO c = new shopDTO(" 버거킹\n ⭐3 (79) \n 최소주문 13000원\n\n","버거킹", 3, 79, 13000, 3);
		hamburgerList.add(a);
		hamburgerList.add(b);
		hamburgerList.add(c);

		shopComparison orderCom = new shopComparison(); // 항목별 비교하기
		shopMenu callMenu = new shopMenu();// 가게의 메뉴들을 호출

		while (run) {
			System.out.println(" 어떤 순서로 찾으시겠습니까?");
			System.out.println(" [ 1.주문많은순 ] [ 2.별점순 ] [ 3.최소주문금액순 ] [ 4.취소 ]");
			System.out.print(" > ");
			int selectNum = scan.nextInt();
			if (selectNum == 1) {// 주문많은순
				orderCom.hamburgerOrderComparsion(hamburgerList);
				callMenu.hamburgerMenu(hamburgerList, memberMap);
			} else if (selectNum == 2) {// 별점순
				orderCom.hamburgerStarComparsion(hamburgerList);
				callMenu.hamburgerMenu(hamburgerList, memberMap);
			} else if (selectNum == 3) {// 최소금액순
				orderCom.hamburgerLeastComparsion(hamburgerList);
				callMenu.hamburgerMenu(hamburgerList, memberMap);
			} else if (selectNum == 4) {
				run = false;
			} else {
				System.out.println(" 잘못입력하셨습니다.");
			}
		}
		return memberMap;
	}
}
