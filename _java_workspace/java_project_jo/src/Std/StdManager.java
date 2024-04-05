package Std;

import java.util.ArrayList;
import java.util.Scanner;

public class StdManager implements StdProgram{
	
	private ArrayList<Student> std = new ArrayList<>();
//	private int stdcnt; //index 처리변수

	@Override
	public void printStd() { //학생정보출력
		System.out.println("-----전체학생정보-------");
		for(int i=0; i<std.size(); i++) {
			std.get(i).stdPrint();
		}
	}

	@Override
	public void addStd(Scanner sc) { //학생정보추가
		System.out.println("이름 >");
		String stdName = sc.next();
//		System.out.println("나이 >");
//		int stdAge = sc.nextInt();
//		System.out.println("전화번호 >");
//		String stdPhone = sc.next();
//		Student s = new Student(stdName, stdAge, stdPhone);
		Student s = new Student(stdName);
		std.add(s);
		System.out.println("추가완료");
	}

	@Override
	public void modStd(Scanner sc) { //학생정보수정
		System.out.println("수정할 학생 이름 >");
		String modstd = sc.next();
		Student s = new Student(modstd);//객체생성
		
//		if(std.contains(s)) { //방법1 remove=>add
//			System.out.println("수정 >");
//			String mod = sc.next();
//			Student s1 = new Student(mod); //객체생성
//			std.remove(s);
//			std.add(s1);
//			System.out.println("수정완료");
//			return;
//		}
//		
		for(int i=0; i<std.size(); i++) { //방법2 for문으로 번지찾고 해당번지에 다시set
			if(std.contains(s)) {
				System.out.println("수정 >");
				String mod = sc.next();
				Student s1 = new Student(mod); //객체생성
				std.set(i, s1);
				System.out.println("수정완료");
				return;
			}
		}
		
		System.out.println("해당하는 학생이 없습니다.");
	}

	@Override
	public void delStd(Scanner sc) { //학생정보삭제
		System.out.println("삭제할 학생 이름 >");
		String delstd = sc.next();
		
		Student s = new Student(delstd);//객체생성
		
		if(std.contains(s)) {
			std.remove(s);
			System.out.println("삭제완료");
			return;
		}
		
//		for(int i=0; i<std.size(); i++) {
//			if(delstd.equals(std.get(i).getStdName())) {
//				std.remove(i);
//				System.out.println("삭제완료");
//				return;
//			}
//		}
		
		
		System.out.println("해당하는 학생이 없습니다.");
	}

	@Override
	public void searchStd(Scanner sc) { //학생정보검색
		System.out.println("검색할 학생 이름 >");
		String searchstd = sc.next();
		
		for(int i=0; i<std.size(); i++) {
			if(searchstd.equals(std.get(i).getStdName())) {
				std.get(i).stdPrint();
			}
		}
		
		System.out.println("해당하는 학생이 없습니다.");
		
//		for(int i=0; i<std.size(); i++) {
//			if(std.contains(s)) {
//				std.get(i).stdPrint(); //모든학생출력구문
//			} else {		
//				System.out.println("해당하는 학생이 없습니다.");
//			}
//		}		
		
	}

	@Override
	public void addSub(Scanner sc) { //점수추가
		System.out.println("점수를 추가할 학생명 >");
		String stdName = sc.next();
		int index = -1;
				
		Student s = new Student(stdName);
		for(int i=0; i<std.size(); i++) {
			if(std.contains(s)) {
				index=i;
				break;			
			}	
		}
		
//		for(int i=0; i<std.size(); i++) {
//			if(stdName.equals(std.get(i).getStdName())) {
//				index=i;
//				break;
//			}
//		}
		
		if(index==-1) {
			System.out.println("학생정보가 없습니다");
			return;
		}
		
		std.get(index).insertMap(sc);
	
	}

	@Override
	public void modSub(Scanner sc) { //점수수정
		System.out.println("점수를 수정할 학생명 >");
		String stdName = sc.next();
		int index=-1;
		Student s = new Student(stdName);
		
		for(int i=0; i<std.size(); i++) {
			if(std.contains(s)) {
				index=i;
				break;			
			}	
		}
		
//		for(int i=0; i<std.size(); i++) {
//			if(stdName.equals(std.get(i).getStdName())) {
//				index=i;
//				break;
//			}
//		}
		
		if(index==-1) {
			System.out.println("학생정보가 없습니다.");
		}
		
		std.get(index).modMap(sc);
		
	}

	@Override
	public void delSub(Scanner sc) { //점수삭제
		System.out.println("점수를 삭제할 학생명 >");
		String stdName = sc.next();
		int index = -1;
		Student s = new Student(stdName);

		for(int i=0; i<std.size(); i++) {
			if(std.contains(s)) {
				index=i;
				break;			
			}	
		}
		
//		for(int i=0; i<std.size(); i++) {
//			if(stdName.equals(std.get(i).getStdName())) {
//				index=i;
//				break;
//			}
//		}
		
		if(index==-1) {
			System.out.println("학생정보가 없습니다");
			return;
		}
		
		std.get(index).removeMap(sc);
	}
	
	
	
	
	//학생 리스트 생성 후 프로그램에 있는 메서드 구현
}
