package day12;

public class 과제_day12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student st = new Student("홍길동","990101","010-1234-5678","25","인천");
		
		st.stuPrint();
		st.eduPrint();
		st.addsub("자바", "5개월");
		st.addsub("자바", "5개월");
		st.subPrint();
		st.addsub("자바", "5개월");
		st.addsub("자바", "5개월");
		st.addsub("자바", "5개월");
		st.addsub("자바", "5개월");
		st.addsub("자바", "5개월");
		st.subPrint();
	}

}
/* - 학생정보를 관리하기 위한 클래스
 * - 학생 기본정보 : 이름, 생년월일, 전화번호, 나이
 * - 학원 정보 : 학원명="EZEN"(final static), 지점
 * - 수강 정보 : 수강과목, 기간(String) => 여러과목을 들을 수 있음(여러과목 수강하기 위해서는 배열로 처리, 5과목)
 * 
 * ex) 홍길동 000101 010-1111-1111 25
 * 	   EZEN(인천)
 * 	   자바 6개월, 파이썬 1개월, 빅데이터 3개월
 * 
 * 기능(메서드)
 * - 학생기본정보를 출력하는 기능
 * - 학원정보를 출력하는 기능
 * - 수강정보를 출력하는 기능
 * - 학생의 수강정보를 추가하는 기능
 */
class Student{
	private String name;
	private String birth;
	private String phone;
	private String age;
	private final static String EDU = "EZEN";
	private String gigum;
	private String sub;
	private String month;
	private String subArr[] = new String[5];
	private int cnt=0;
	
	public Student() {}
	public Student(String name, String birth, String phone, String age, String gigum) {
		this.name = name;
		this.birth = birth;
		this.phone = phone;
		this.age = age;
		this.gigum = gigum;
	}
	
	//과목정보추가 및 제한
	public void addsub(String sub, String month) {
		if(cnt==4) {
			System.out.println("더이상 수강이 불가능합니다.");
		} else {
			subArr[0] = this.sub+this.month;
			cnt++;
			subArr[cnt] = sub+month;
		}
	}
	
	
	//학생출력
	public void stuPrint() {
		System.out.println("학생정보 > "+name+"("+birth+"/"+phone+"/"+age+")");
	}
	//학원출력
	public void eduPrint() {
		System.out.println("학원지점 > "+EDU+"("+gigum+")");
	}
	//과목정보 출력
	public void subPrint() {
		System.out.println("수강과목");
		for(int i=0; i<cnt+1; i++) {
			System.out.println(subArr[i]);
		}
	}
	
	//getter/setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getGigum() {
		return gigum;
	}
	public void setGigum(String gigum) {
		this.gigum = gigum;
	}
	
	public String getSub() {
		return sub;
	}
	public void setSub(String sub) {
		this.sub = sub;
	}
	public String getMonth() {
		return month;
	}
	public void setMonth(String month) {
		this.month = month;
	}
	public String[] getSubArr() {
		return subArr;
	}
	public void setSubArr(String[] subArr) {
		this.subArr = subArr;
	}
	public int getCnt() {
		return cnt;
	}
	public void setCnt(int cnt) {
		this.cnt = cnt;
	}
	public static String getEdu() {
		return EDU;
	}
	
	
}
