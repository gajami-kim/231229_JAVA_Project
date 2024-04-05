package studentManager;

import java.util.Scanner;

public class Studentmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Student s = new Student(201926009,"김정온",25,"010-7765-8487","인천시부평구");
//		s.printStu();
//		s.insertSub(new Subject("T001A","자바"));
//		s.printSub();
//		
		Scanner scan = new Scanner(System.in);
		
		StudentManager sm = new StudentManager();
//		sm.insertStudent(scan);
//		sm.printStudent();
//		sm.registerSubject(scan);
//		sm.printStudent();
//		sm.searchStudent(scan);
		int menu = 0;
		do {
			System.out.println("--menu--");
			System.out.println("1.학생등록 | 2.학생리스트출력 | 3.학생검색 | 4.수강신청 | 5.수강철회 | 6.종료");
			System.out.println(">> menu >");
			menu = scan.nextInt();
			
			switch(menu) {
			case 1:
				sm.insertStudent(scan);
				break;
			case 2:
				sm.printStudent();
				
				break;
			case 3:
				sm.searchStudent(scan);
				break;
			case 4:
				sm.registerSubject(scan);
				//sm.printSub();
				break;
			case 5:
				break;
			case 6:
				System.out.println("종료되었습니다");
				break;
				default:
					System.out.println("잘못된 메뉴입니다");
			}
			
		} while(menu!=6);
		
		System.out.println("프로그램 종료");
		
		scan.close();
	}

}
