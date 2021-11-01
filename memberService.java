package personal_project;

import java.util.*;

public class memberService {

	public Map<Integer, memberDTO> memberJoin(Map<Integer, memberDTO> memberMap) {
		Scanner scan = new Scanner(System.in);
		boolean run = true;
		String pw = "";
		String pw2 = "";
		String id = "";

		// 아이디 유효검사
		while (run) {
			// 데이터에 아이디가 존재하지않을경우
			System.out.print(" 회원가입할 ID를 입력해주세요 : ");
			id = scan.nextLine();
			if (memberMap.size() == 0) {
				System.out.println(" 사용 가능한 아이디입니다.");
				run = false;
			}
			// 데이터에 아이디가 존재할 경우
			for (Integer i : memberMap.keySet()) {
				if (id.equals(memberMap.get(i).memberId)) {
					System.out.println(" 중복된 아이디입니다. ");
				} else {
					System.out.println(" 사용가능한 아이디 입니다.");
					run = false;
				}
			}
		}

		run = true;
		// 비밀번호 입력검사
		while (run) {
			System.out.print(" 비밀번호를 입력해주세요 : ");
			pw = scan.nextLine();
			System.out.print(" 비밀번호를 확인 : ");
			pw2 = scan.nextLine();
			if (pw.equals(pw2)) {
				System.out.println(" 확인 되었습니다.");
				run = false;
			} else {
				System.out.println(" 비밀번호가 일치하지않습니다. 다시 입력해주십시오.");
			}
		}
		// 주소, 이름, 폰번호 입력하기
		System.out.print(" 주소를 입력해주십시오. : ");
		String add = scan.nextLine();
		System.out.print(" 이름을 입력해주십시오. : ");
		String name = scan.nextLine();
		System.out.print(" 휴대폰 번호를 입력해주십시오. : ");
		String phone = scan.nextLine();
		System.out.println(" 정상적으로 가입되셨습니다.");
		int memberNum = memberMap.size() + 1;// 회원번호
		int money = 0;// 시작 잔고
		memberDTO input = new memberDTO(memberNum, id, pw, name, add, phone, money);
		memberMap.put(memberNum, input);

		return memberMap;
	}

	// 로그인기능
	public Map<Integer, memberDTO> memberLogin(Map<Integer, memberDTO> memberMap, Map<Integer, mypageDTO> mypageMap) {
		Scanner scan = new Scanner(System.in);
		mypageService mypageInfo = new mypageService();
		System.out.print(" ID를 입력해주세요 : ");
		String id = scan.nextLine();
		System.out.print(" 비밀번호를 입력해주세요 : ");
		String pw = scan.nextLine();

		// 입력은 받았지만 맵데이터에 아무것도 없을 경우.
		if (memberMap.size() == 0) {
			System.out.println("아이디 혹은 비밀번호가 잘못되었습니다.");
		}
		// 입력받은 아이디와 비밀번호가 일치할경우
		for (Integer i : memberMap.keySet()) {
			if (id.equals(memberMap.get(i).memberId) && pw.equals(memberMap.get(i).memberPw)) {
				memberMap.get(i).setLogin(true);// boolean값을 true로 바꿔준다.
				mypageInfo.checkLogin(memberMap, mypageMap);// 로그인에 성공시 다음.
			} else {
				System.out.println("아이디 혹은 비밀번호가 잘못되었습니다.");
			}
		}
		return memberMap;
	}

}
