package stdManager;

import java.util.Scanner;

public class Stdmain {

	public static void main(String[] args) {
		//메뉴처리
		/* 객체를 생성하고 화면에 출력하는 메서드
			- menu: 
				1.학생등록 | 2.학생리스트출력 | 3.학생검색(학생정보, 수강정보)
				4.수강신청 | 5.수강철회     | 6.종료
		 */
		//객체를 생성하는 것은 항상 미리 해놓고 메서드 호출
		
		Scanner sc = new Scanner(System.in);
		//manager를 호출하기위한 객체
		StdManager sm = new StdManager();
		int menu = 0;
		do {
			//메뉴넣기
			System.out.println("--menu--");
			System.out.println("1.학생등록 | 2.학생리스트출력 | 3.학생검색");
			System.out.println("4.수강신청 | 5.수강철회 | 6.종료");
			System.out.println(">> 메뉴선택 > ");
			
			menu = sc.nextInt();
			
			//메뉴에 따른 분기 구현
			switch(menu) {
			case 1: sm.insertStudent(sc); break;
			case 2: sm.printStudent(); break;
			case 3: sm.searchStudent(sc); break;
			case 4: sm.registerSubject(sc); break;
			case 5: sm.deleteSubject(sc); break;
			case 6: break;
			default:
				System.out.println("잘못된 메뉴입니다.");
			}
		} while(menu!=6);
		System.out.println("종료");

		sc.close();
	}

}
