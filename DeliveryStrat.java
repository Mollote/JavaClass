package personal_project;

import java.util.*;

public class DeliveryStrat {

	public static void main(String[] args) {
		// 배달어플만들기
		Scanner scan = new Scanner(System.in);
		boolean run = true;
		Map<Integer, memberDTO> memberMap = new HashMap<>();
		Map<Integer, mypageDTO> mypageMap = new HashMap<>();
		memberService memInfo = new memberService();

		while (run) {
			System.out.println("");
			System.out.println("                        ⠀⠀⢸⣿⠿⢿⡿⠿⢿⣷⡆⠀⠀⠀⠀⣀⠞⠀⠀⠀");
			System.out.println("                        ⠀⠀⢸⡇⠀  ⠀⢸⡏⠀⠀⠶⣦⣾⣷⠀⠀⠀⠀");
			System.out.println("⠀  배달시켜 먹고 싶을때는?     ⠀⢸⡇⠀⠀⠀⠀⢸⡇⠀⠀⠀⢘⡷⣶⡀⠀⠀⠀");
			System.out.println("⠀       배달 이츠!          ⠀⠘⣿⡟⢿⣟⠛⠛⢻⣶⠂⠀⢸⡇⣼⣷⠀⠀⠀");
			System.out.println("                        ⠀⠀⠀⣹⡿⠛⠛⠻⣶⡱⣿⣀⣀⣾⢃⣽⠿⣶⣄⠀");
			System.out.println("⠀⠀                        ⢠⣿⣀⣀⣀⣀⣘⣃⣉⣛⣋⣁⣠⣶⠟⠛⣽⠀");
			System.out.println("  [ 1.로그인 ] [ 2.회원가입 ] ⠈⠉⣿⣏⣉⣽⠟⣩⣍⠉⠉⠉⠹⣦⣴⣢⡿⠀");
			System.out.println("⠀⠀                        ⠰⠋⠀⠉⠉⠁⠀⠉⠁⠀⠀⠀⠰⠋⠉⠉⠀⠀");
			System.out.print("   번호 입력 : ");
			int selectNum = scan.nextInt();
			if (selectNum == 1) {
				memberMap = memInfo.memberLogin(memberMap,mypageMap);//로그인
			} else if (selectNum == 2) {
				memberMap = memInfo.memberJoin(memberMap);//회원가입
			} else {
				System.out.println("\n잘못된 정보입니다. 다시 입력해주십시오.");// 1,2가 아닐시
			}
		}
	}

}
