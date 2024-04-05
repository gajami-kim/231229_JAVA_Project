package stdManager;

import java.util.Arrays;

public class Std {
	/* student class : 학생의 정보를 저장하는 클래스
	- 학번, 이름, 나이, 전화번호, 주소, 수강과목[]
	- 멤버변수,생성자,getter/setter,toString
	- 멤버변수에 학생이 듣고자하는 과목을 저장 Subject[]
	- 메서드
		- 학생정보 출력 메서드
		- 수강과목 추가 메서드
		- 수강과목 삭제 메서드
		- 수강과목 출력 메서드
	int => 정수형 숫자 / 전화번호나 학번같은 연산이 필요하지않은 값은 int로 값을 받지말고 Stirng으로 받야야함
	 */
	private String stdNum;
	private String stdName;
	private String StdPhone;
	
	private Sub[] subjectList = new Sub[5];
	private int cnt; //subjectList 배열의 index 역할
	
	//생성자
	public Std() {}
	public Std(String stdNum, String stdName, String stdPhone) { //데이터를 모두 받는 생성자
		this.stdNum = stdNum;
		this.stdName = stdName;
		this.StdPhone = stdPhone;
	}
	
	//메서드
	// - 학생정보 출력 메서드(toString 사용가능)
	public void stdPrint() {
		System.out.println("학생명: "+stdName+"("+stdNum+") /"+StdPhone);
	}
	
	// - 수강과목 출력 메서드 : 배열로 여러개 존재함(for)
	public void subPrint() {
		//Sub 클래스의 toString을 호출하여 출력
		if(cnt==0) {
			System.out.println("수강중인 과목이 없습니다.");
			return;
		}
		for(int i=0; i<cnt; i++) {
			System.out.println(subjectList[i]); //toString 호출
		} //if가 밑에 달리면 for문이 실행된 뒤에 if문이 실행되기때문에 값이 없을 때를 대비한 if문을 먼저 돌린 뒤 for문을 돌린다
		//toString은 객체의 내용미 문자로 리턴 sysout(객체) => toString 호출
	}
 	
	// - 수강과목 추가 메서드
	//매개변수 : 수강과목 객체 Subject subjectList 배열에 해당 객체 담기
	public void insertSub(Sub sub) {
		//배열이 다 찼다면.. 배열을 늘려주기
		//배열은 길이를 정하면 변경 불가능
		//더 긴 길이의 배열을 생성하여 배열복사 후 배열을 바꿔줌
		if(cnt == subjectList.length) { //배열이 다 찼다면
			Sub[] tmp = new Sub[subjectList.length+5];
			//배열복사
			System.arraycopy(subjectList, 0, tmp, 0, cnt);
			subjectList = tmp;
		}
		
		//subjectList 배열에 해당 객체 담기
		subjectList[cnt] = sub;
		cnt++;
	}
	
	// - 수강과목 삭제 메서드 -> 수강과목만 관리 / manager => 학생을 관리
	//					   과목을 삭제하는 방법 / 어떤 학생이 삭제하는지
	public void deleteSub(String subName) {
		//수강과목에 대한 배열에서 subName을 검색하여 삭제
		int index = -1;
		if(subName == null) {
			return;
		}
		for(int i=0; i<cnt; i++) {
			if(subjectList[i].getSubName().equals(subName)) { //같은 이름 찾기
				index = i;
				break;
			}
		}
		
		if(index==-1) {
			System.out.println("찾는값이 없습니다");
			return;
		}
		//삭제 : 찾은 위치부터 뒷번지를 앞번지로 옮기는 작업 / 끝번지는 null처리
		for(int i=index; i<cnt-1; i++) { //cnt(끝번지)까지 값을 찾으면 뒤에서 땡겨올 번지가 없기때문에 끝번지 -1번지까지만 돌림
			subjectList[i] = subjectList[i+1];
		}
		subjectList[cnt-1]=null; //끝번지 null처리 for문밖에서 처리해야함
		//한과목 삭제 => 과목 개수가 줄어듬
		cnt--;
	}
	
	public String getStdNum() {
		return stdNum;
	}
	public void setStdNum(String stdNum) {
		this.stdNum = stdNum;
	}
	public String getStdName() {
		return stdName;
	}
	public void setStdName(String stdName) {
		this.stdName = stdName;
	}
	public String getStdPhone() {
		return StdPhone;
	}
	public void setStdPhone(String stdPhone) {
		StdPhone = stdPhone;
	}
	
	@Override
	public String toString() {
		return "Std [stdNum=" + stdNum + ", stdName=" + stdName + ", StdPhone=" + StdPhone + ", subjectList="
				+ Arrays.toString(subjectList) + ", cnt=" + cnt + "]";
	}
	
	
	
	
}
