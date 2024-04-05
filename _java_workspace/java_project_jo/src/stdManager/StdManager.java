package stdManager;

import java.util.Scanner;

public class StdManager implements Program {

	//학생의 배열값을 멤버변수로 추가
	private Std stdList[] = new Std[10];
	//index처리 변수
	private int stdcnt;
	
	@Override
	public void printStudent() {
		System.out.println("------전체학생정보------");
		for(int i=0; i<stdcnt; i++) {
			stdList[i].stdPrint(); //학생정보출력 메서드
		}
	}

	@Override
	public void insertStudent(Scanner sc) {
		//1명의 학생정보를 입력받아서 객체를 생성한 후 stdList에 추가
		System.out.println("학번>");
		String stdNum = sc.next();
		System.out.println("학생명>");
		String stdName = sc.next();
		System.out.println("전화번호>");
		String stdPhone = sc.next();
		
		//입력받은 값을 객체로 생성
		Std s = new Std(stdNum, stdName, stdPhone);
		
		//배열이 다 찼을 경우 배열복사
		if(stdcnt == stdList.length) {
			Std[] tmp = new Std[stdList.length+5];
			System.arraycopy(stdList, 0, tmp, 0, stdcnt);
			stdList = tmp;
		}
		//배열에 등록
		stdList[stdcnt] = s;
		stdcnt++;
	}

	@Override
	public void searchStudent(Scanner sc) {
		//검색할 학생 이름을 입력받아 배열에서 탐색 후 있다면 학생정보+수강정보 출력
		System.out.println("검색할 학생명 >");
		String searchName = sc.next();
		
		//배열탐색
		for(int i=0; i<stdcnt; i++) {
			if(searchName.equals(stdList[i].getStdNum())) {
				stdList[i].stdPrint();
				stdList[i].subPrint();
				return;
			}
		}
		System.out.println("검색한 이름이 없습니다.");
	}

	@Override
	public void registerSubject(Scanner sc) {
		//누가 무슨 과목을 추가할지 설정
		//수강신청할 학생이름을 입력받아 
		System.out.println("수강신청 학생명 >");
		String name = sc.next();
		int index = -1; //학생의 번지를 저장하기 위한 변수
		
		//학생의 위치를 탐색 후
		for(int i=0; i<stdcnt; i++) {
			if(name.equals(stdList[i].getStdName())) {
				index = i;
				break;
			}
		}
		//학생이 없다면
		if(index==-1) {
			System.out.println("학생정보가 없습니다");
			return;
		}
		
		//그 학생의 배열에 수강과목[]을 추가
		//수강과목의 객체를 생성하여 => Std클래스(수강신청을 한 학생의)의 insertSubject 호출 (해당 배열에 추가)
		System.out.println("수강신청 과목>");
		//subject 객체를 생성후 insertSubject를 가져와야함
		String subname = sc.next();
		Sub s = new Sub(subname);
		//Std클래스(수강신청을 한 학생의)의 insertSubject 호출 (해당 배열에 추가)
		stdList[index].insertSub(s);
		
	}

	@Override
	public void deleteSubject(Scanner sc) {
		//누가 무슨 과목을 추가할지 설정
		//수강신청할 학생이름을 입력받아 
		System.out.println("수강삭제 학생명 >");
		String name = sc.next();
		int index = -1; //학생의 번지를 저장하기 위한 변수
				
		//학생의 위치를 탐색 후
		for(int i=0; i<stdcnt; i++) {
			if(name.equals(stdList[i].getStdName())) {
				index = i;
				break;
			}
		}
		//학생이 없다면
		if(index==-1) {
			System.out.println("학생정보가 없습니다");
			return;
		}
		
		//그 학생의 배열에 수강과목[]을 추가
		//수강과목의 객체를 생성하여 => Std클래스(수강신청을 한 학생의)의 insertSubject 호출 (해당 배열에 추가)
		System.out.println("수강삭제 과목>");
		//subject 객체를 생성후 insertSubject를 가져와야함
		String subname = sc.next();
		
		//해당학생의 수강삭제 메서드 호출
		stdList[index].deleteSub(subname);
	}

}
