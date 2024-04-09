package board;

import java.util.Scanner;

public class BoardMain {

	public static void main(String[] args) {
		/* board class 생성
		 * 멤버변수 : 번호, 제목, 내용, 작성자, 작성일
		 * 작성일은 오늘날짜로 자동생성
		 * 번호는 객체가 생성될 때 자동으로 +1
		 * 검색, 수정, 삭제는 번호 기준으로
		 * 클래스 생성시 번호가 일치하면 같은 게시물로 인지 //std 패키지에서.. 이름만 같다면 true 구문 참고 !! equals 추가
		 * 인터페이스 생성 
		 * 메인 메뉴
		 * 1.게시글추가|2.게시글검색|3.게시글수정|4.게시글삭제|5.(모든)게시글출력|6.종료
		 */
		Scanner sc = new Scanner(System.in);
		BoardManager bm = new BoardManager();
		int menu = 0;
		
		do {
			bm.printMenu();
			menu = sc.nextInt();
			
			switch(menu) {
			case 1: bm.addBoard(sc); break;
			case 2: bm.searchBoard(sc); break;
			case 3: bm.modifyBoard(sc); break;
			case 4: bm.removeBoard(sc); break;
			case 5: bm.printBoard(); break;
			case 6: System.out.println("종료"); break;
			default: System.out.println("잘못된 메뉴");
			}
		} while(menu!=6);
		System.out.println("프로그램 종료");
		
		
		sc.close();
	}

}