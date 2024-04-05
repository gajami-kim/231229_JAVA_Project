package day18;

import java.io.IOException;
import java.util.Scanner;

public class WordMain {

	public static void main(String[] args) throws IOException {
		/* 단어장 프로그램
		 * 1.단어등록|2.단어검색|3.단어수정|4.단어출력|5.단어삭제|6.종료
		 * wordManager 클래스를 생성하여 메서드 구현 (멤버변수로 map을 구성)
		 *  - word => map을 이용해서 단어를 등록
		 * 기본단어 등록(5개)
		 * main에서는 메뉴가 반복 실행되도록 설정
		 */
		
		Scanner sc = new Scanner(System.in);
		Manager wm = new Manager();
		wm.addWord(); // 기본값추가
		int menu = 0;
	
		do {
			System.out.println("--menu--");
			System.out.println("1.단어등록|2.단어검색|3.단어수정|4.단어출력|5.단어삭제|6.단어파일출력|7.종료");
			System.out.println(">> 메뉴선택");
			menu = sc.nextInt();
			
			switch(menu) {
			case 1: wm.insertWord(sc); break;
			case 2: wm.searchWord(sc); break;
			case 3: wm.changeWord(sc); break;
			case 4: wm.printWord(); break;
			case 5: wm.removeWord(sc); break;
			case 6: wm.printFile(); break;
			case 7: break;
				default: System.out.println("잘못된 메뉴"); break;
			}
		} while(menu!=7);
		System.out.println("프로그램종료");
		
		sc.close();
	}

}
