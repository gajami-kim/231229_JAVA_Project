package day09;

import java.util.Scanner;

public class 가위바위보게임 {

	public static void main(String[] args) {
		/* 컴퓨터가 가위바위보를 랜덤으로 선택(0=가위, 1=바위, 2=보)
		 * 내가 가위바위보중 하나를 선택해서 입력
		 * 승/패/무의 결과를 출력
		 * ex)
		 * com = 0(가위)
		 * user = 가위 => 무승부입니다.
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("---가위바위보 게임---");
		System.out.println("가위 | 바위 | 보");

		String user = scan.nextLine();
		int com = (int)(Math.random()*3);
		
		int scanValue = 0; //사용자의 입력값을 숫자로 변경
		if(user.equals("가위")) {
			scanValue = 0;
		} else if(user.equals("바위")) {
			scanValue = 1;
		} else if(user.equals("보")) {
			scanValue = 2;
		}
		
		if(com==0) { //컴퓨터의 값을 글로 출력
			System.out.println("컴퓨터는 가위");
		} else if(com==1) {
			System.out.println("컴퓨터는 바위");
		} else if(com==2) {
			System.out.println("컴퓨터는 보");
		}
		
		switch(scanValue) { //컴퓨터와 사용자값 비교
			case 0: //사용자 가위
				if(com==0) {
					System.out.println("비겼습니다.");
				} else if(com==1) {
					System.out.println("졌습니다.");
				} else if(com==2) {
					System.out.println("이겼습니다.");
				}
			break;
			case 1: //사용자 바위
				if(com==0) {
					System.out.println("이겼습니다.");
				} else if(com==1) {
					System.out.println("비겼습니다.");
				} else if(com==2) {
					System.out.println("졌습니다.");
				}
				break;
			case 2: //사용자 보
				if(com==0) {
					System.out.println("졌습니다.");
				} else if(com==1) {
					System.out.println("이겼니다.");
				} else if(com==2) {
					System.out.println("비겼습니다.");
				}
				break;
		}
		
//		if(user.equals("가위")) {
//			if(com==0) {
//				System.out.println("무승부입니다.");
//			} else if(com==1) {
//				System.out.println("졌습니다.");
//			} else {
//				System.out.println("이겼습니다.");
//			}
//		}
//		
//		if(user.equals("바위")) {
//			if(com==0) {
//				System.out.println("이겼습니다.");
//			} else if(com==1) {
//				System.out.println("무승부입니다.");
//			} else {
//				System.out.println("졌습니다.");
//			}
//		}
//		
//		if(user.equals("보")) {
//			if(com==0) {
//				System.out.println("졌습니다.");
//			} else if(com==1) {
//				System.out.println("이겼습니다.");
//			} else {
//				System.out.println("무승부입니다.");
//			}
//		}

		scan.close();
		
	}

}
