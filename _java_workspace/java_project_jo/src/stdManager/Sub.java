package stdManager;

public class Sub {
	/* Subject class : 하나의 수강과목 정보를 저장하는 클래스
	 * - 과목코드 과목명 학점 시수 교수명 학기 시간표 강의장
	 * - 멤버변수, 생성자, getter/setter, toString
	 */
	private String subName; //과목명
	private String subTime; //시수
	private String subProfessor; //담당교수
	private String subScheduler; //시간표
	
	//생성자
	public Sub() {}
	public Sub(String subName) { //과목명만 받는
		this.subName = subName;
	}
	public Sub(String subName, String subTime, String subProfessor, String subScheduler) { //모두 받는
		this.subName = subName;
		this.subTime = subTime;
		this.subProfessor = subProfessor;
		this.subScheduler = subScheduler;
	}
	public String getSubName() {
		return subName;
	}
	public void setSubName(String subName) {
		this.subName = subName;
	}
	public String getSubTime() {
		return subTime;
	}
	public void setSubTime(String subTime) {
		this.subTime = subTime;
	}
	public String getSubProfessor() {
		return subProfessor;
	}
	public void setSubProfessor(String subProfessor) {
		this.subProfessor = subProfessor;
	}
	public String getSubScheduler() {
		return subScheduler;
	}
	public void setSubScheduler(String subScheduler) {
		this.subScheduler = subScheduler;
	}
	@Override
	public String toString() {
		return "과목명:" + subName + ", 시수:" + subTime + ", 담당교수:" + subProfessor + ", 시간표:"
				+ subScheduler;
	}
	
	
	
}
