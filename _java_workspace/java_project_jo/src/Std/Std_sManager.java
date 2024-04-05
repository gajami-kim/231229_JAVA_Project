package Std;

import java.util.ArrayList;
import java.util.Scanner;

public class Std_sManager implements StdProgram {
	//학생리스트 생성 후 program 메서드 구현
	private ArrayList<Student_s> list = new ArrayList<>();
	
	public void add() {
		list.add(new Student_s("홍길동"));
		list.add(new Student_s("김종민"));
		list.add(new Student_s("강호동"));
		list.add(new Student_s("유재석"));
		list.add(new Student_s("김종국"));
	}
	
	@Override
	public void printStd() {
		for(int i=0; i<list.size(); i++) {
			list.get(i).printOne();
		}
	}

	@Override
	public void addStd(Scanner sc) {
		System.out.println("학생명>");
		String name = sc.next();
		System.out.println("나이>");
		int age = sc.nextInt();
		System.out.println("전화번호>");
		String phone = sc.next();
		
		Student_s s = new Student_s(name, age, phone);
		
		list.add(s);
		System.out.println("추가완료");
	}

	@Override
	public void modStd(Scanner sc) {
		System.out.println("학생명>");
		String name = sc.next();
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getName().equals(name)) {
				System.out.println("수정할 정보(이름,나이,전화번호 중 하나 입력)>");
				String op = sc.next();
				System.out.println("수정할 정보 입력>");
				switch(op) {
				case"이름": 
					String modName = sc.next();
					list.get(i).setName(modName);
					System.out.println("수정완료");
					break;
				case"나이":
					int modAge = sc.nextInt();
					list.get(i).setAge(modAge);
					System.out.println("수정완료");
					break;
				case"전화번호": 
					String modPhone = sc.next();
					list.get(i).setPhone(modPhone);
					System.out.println("수정완료");
					break;
				default:
					System.out.println("정보가 존재하지 않습니다.");
					break;
				}
				return;
			}
		}
		System.out.println("학생이 존재하지 않습니다.");
		
	}

	@Override
	public void delStd(Scanner sc) {
		System.out.println("학생명>");
		String name = sc.next();
		boolean result = list.remove(new Student_s(name));
		if(!result) {
			System.out.println("학생이 없습니다.");
			return;
		}
		System.out.println("학생 삭제 완료");
	}

	@Override
	public void searchStd(Scanner sc) {
		System.out.println("학생명>");
		String name = sc.next();
		for(Student_s s : list) {
			if(s.getName().equals(name)) {
				s.printOne();
				return;
			}
		}
		System.out.println("검색된 학생이 없습니다.");
	}

	@Override
	public void addSub(Scanner sc) {
		System.out.println("학생명>");
		String name = sc.next();
		System.out.println("과목>");
		String sub = sc.next();
		System.out.println("점수>");
		int score = sc.nextInt();

		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getName().equals(name)) {
				list.get(i).addSubject(sub, score);
				System.out.println("점수추가완료");
				return;
			}
		}
		System.out.println("학생이 없습니다.");
	}

	@Override
	public void modSub(Scanner sc) {
		System.out.println("학생명>");
		String name = sc.next();
		System.out.println("과목>");
		String sub = sc.next();
		System.out.println("점수>");
		int score = sc.nextInt();

		
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getName().equals(name)) {
//				list.get(i).delSubject(sub); //map이라 중복x 덮어씀
				list.get(i).addSubject(sub, score);
				System.out.println("점수수정완료");
				return;
			}
		}
		System.out.println("학생이 없습니다.");
	}

	@Override
	public void delSub(Scanner sc) {
		System.out.println("학생명>");
		String name = sc.next();
		System.out.println("과목>");
		String sub = sc.next();
		
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getName().equals(name)) {
				list.get(i).delSubject(sub);
				System.out.println("점수삭제완료");
				return;
			}
		}
		System.out.println("학생이 없습니다.");
	}

}
