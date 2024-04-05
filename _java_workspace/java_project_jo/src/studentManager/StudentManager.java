package studentManager;

import java.util.Scanner;

class StudentManager implements Program {

	private Student std[] = new Student[10];
	private int cnt;
	private int cntsub;
	
	@Override
	public void printStudent() {
		System.out.println("-----전체학생정보-----");
		for(int i=0; i<=cnt-1; i++) { //학생리스트출력
			if(std[i]!=null) {
				std[i].printStu();	
			} 
		}
		if(cnt==0) {
			System.out.println("등록된 학생이 없습니다.");
		}
	}

	@Override
	public void insertStudent(Scanner scan) { //학생추가기능
		
		System.out.println("이름/학번 입력 >");
		String name = scan.next();
		int id = scan.nextInt();
//		int age = scan.nextInt();
//		String phone = scan.next();
//		String address = scan.next();
		
		Student s = new Student(name, id);
		std[cnt] = s;
//		System.out.println("학생등록이 완료되었습니다");
		cnt++;
				
	}

	@Override
	public void searchStudent(Scanner scan) { //학생검색기능
		System.out.println("검색 >");
		int count=0;
		String search = scan.next();
			for(int i=0; i<cnt; i++) {
				if(std[i].getName().equals(search)) { 
					std[i].printStu();	
					count++;
				}
			}
			if(count==0) {
				System.out.println("검색한 값이 없습니다.");
			}
	}

	@Override
	public void registerSubject(Scanner scan) { //수강신청기능
		
		System.out.println("수강신청 학생명 > ");
		String name = scan.next();
		
		System.out.println("수강신청 코드/과목 > ");
		String code = scan.next();
		String sub = scan.next();
		
		Subject register = new Subject(code, sub);
		
			for(int i=0; i<cnt; i++) {
				if(cntsub<=5) {
					if(std[i].getName().equals(name)) {
						std[i].insertSub(register);
						System.out.println("수강신청을 완료하였습니다");
						std[i].printSub();
						cntsub++;
						return;
					} 				 
				else if(cntsub>5) {
					System.out.println("더이상 수강할 수 없습니다.");
				}
			}
		} //오류x, but else if 값이 안나옴
	}
//		for(int i=0; i<=cnt; i++) {
//			if(cntsub<=5) {
//				if(std[i].getName().equals(name)) {
//					std[i].insertSub(register);
//					System.out.println("수강신청을 완료하였습니다");
//					std[i].printSub();
//					cntsub++;
//					return;
//				} else if(!std[i].getName().equals(name)) {
//					System.out.println("등록된 학생이 없습니다");
//				}
//			}
//		}
//		if(cntsub>5) {
//			System.out.println("더이상 수강할 수 없습니다");
//		}
//	}
	//값을 5개초과로 넣으면 오류뜸
	
//	public void printSub() { //수강출력기능
//		for(int i=0; i<cnt; i++) {
//			System.out.println(subInfo[i].toString());
//		}
//	}

	@Override
	public void deleteSubject(Scanner scan) {
		
	}
	
}
