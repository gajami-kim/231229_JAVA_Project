package day12;
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
public class 과제_ssam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student_s st = new Student_s();
		st.setName("홍길동");
		st.setPhone("010-1234-5678");
//		st.printInfo();
//		st.printCompany();
//		st.printCourse();
		
		Student_s st1 = new Student_s("김첨지","010-1111-2222","인천");
//		st1.printInfo();
//		st1.printCompany();
		st1.insertCourse("html", "1개월");
		st1.insertCourse("html", "1개월");
		st1.insertCourse("앱개발", "3개월");
		st1.insertCourse("c", "2개월");
		st1.insertCourse("파이썬", "5개월");
//		st1.printCourse();
//		st1.insertCorse("java", "6개월"); //print밑에 넣어야 더이상 수강할 수 없습니다가 코스의 밑에 출력됨

		Student_s st2 = new Student_s("유재석","990101","010-9876-5432",25,"인천");
		st2.insertCourse("java", "3개월");
		st2.printCourse();
		Student_s st3 = new Student_s("김종국","980215","010-4567-8123");
		st3.insertCourse("html", "1개월");
		st3.insertCourse("앱개발", "6개월");
		Student_s st4 = new Student_s("송지효","990428","010-4578-1254",24,"강남");
		Student_s st5 = new Student_s("하동훈","970506","010-1247-8450",20,"신촌");
		st5.insertCourse("java", "3개월");
		Student_s st6 = new Student_s("전소민","900417","010-1485-0547",30,"강남");
		st6.insertCourse("java", "3개월");
		st6.insertCourse("c", "2개월");
		Student_s st7 = new Student_s("지석진","881105","010-1293-8246",35,"수원");
		st7.insertCourse("파이썬", "3개월");
		st7.insertCourse("html", "1개월");
		st7.insertCourse("c", "6개월");
		
		
		
		Student_s[] stdArr = new Student_s[8];
		stdArr[0] = st;
		stdArr[1] = st1;
		stdArr[2] = st2;
		stdArr[3] = st3;
		stdArr[4] = st4;
		stdArr[5] = st5;
		stdArr[6] = st6;
		stdArr[7] = st7;
		
		
		
		//김종국의 학생정보와 수강학원정보, 수강정보를 출력
		String searchName = "김종국";
		System.out.println(">>"+searchName+"정보<<");
		for(int i=0; i<stdArr.length; i++) {
			if(stdArr[i].getName().equals(searchName)) {
				stdArr[i].printInfo();
				stdArr[i].printCompany();
				stdArr[i].printCourse();
			}
		}
		
		//인천지점의 학생들을 모두 검색하여 학생정보만 출력
		System.out.println();
		String searchBranch = "인천";
		System.out.println(">>"+searchBranch+"지점학생정보<<");
		for(int i=0; i<stdArr.length; i++) {
			if(stdArr[i].getBranch()!=null) {
				if(stdArr[i].getBranch().equals(searchBranch)) {
					stdArr[i].printInfo();
				}
			}
		}

		//java과목을 수강하는 학생을 검색하여 학생정보/학원정보 출력
		System.out.println();
		String searchCourse = "java";
		System.out.println(">>"+searchCourse+"수강생정보<<");
		int cnt = 0 ;//학생의 번지
		//me > 안나옴
//		for(int i=0; i<stdArr.length; i++) {
//			for(int j=0; j<stdArr[i].getCourse().length; j++) {
//				if(stdArr[i].getCourse()!=null) {
//					if(stdArr[i].getCourse().equals(searChcourse)) {
//						stdArr[i].printInfo();
//						stdArr[i].printCourse();
//					}					
//				} else if(stdArr[i].getCourse()==null) {
//					System.out.println("수강중인 과목이 없습니다.");
//				}
//			}
//		}
		
		//ssam
		while(cnt<stdArr.length) {
			for(int i=0; i<stdArr[cnt].getCourse().length; i++) { //수강과목번지
				if(stdArr[cnt].getCourse()[i]!=null) {
					if(searchCourse.equals(stdArr[cnt].getCourse()[i])) {
						stdArr[cnt].printInfo();
						stdArr[cnt].printCompany();
						stdArr[cnt].printCourse();
					}
				}
			}
			cnt++;
		}
		
	}
}

class Student_s {
	//멤버변수 선언
	private String name;
	private String birth;
	private String phone;
	private int age;
	private final static String COMPANY = "EZEN"; //final은 변수명을 대문자로
	private String branch;
	//같은 번지에 있는 수강과목과 기간은 같은 값으로 처리
	private String[] course = new String[5]; //수강과목
	private String[] period = new String[5]; //기간
	private int cnt; //배열의 index 처리용 변수, 초기값 0
	
	//생성자
	public Student_s () {}
	public Student_s(String name, String phone, String branch) {
		this.name = name;
		this.phone = phone;
		this.branch = branch;
	}
	public Student_s(String name, String birth, String phone, int age, String branch) {
		this(name,phone,branch); //생성자 호출, 반드시 첫줄에서 호출
		this.birth = birth;
		this.age = age;
	}
	
	//method
	public void printInfo() { //학생의 기본정보
		System.out.println("--학생정보--");
		System.out.println("이름:"+name+"("+age+"세/"+birth+") / "+phone);
	}
	public void printCompany() { //학원정보
		System.out.println("--학원정보--");
		System.out.println("학원명:"+COMPANY+"/"+branch+"지점");
	}
	public void printCourse() { //수강정보출력
		//cnt까지만 출력 => 추가되지않은 값은 출력x
		System.out.println("--수강과목--");
		if(course.length==0 || cnt==0) { //등록한 과목이 없을 때
			System.out.println("수강과목이 없습니다.");
			return; //break같은역할 값이 돌지않게 끊어줌
		}
		for(int i=0; i<cnt; i++) { //배열의 length(5개)로 주면 추가되지않은 값까지 출력 => 에러
			System.out.println("과정:"+course[i]+" / 기간:"+period[i]);
		}
	}
			
	//수강정보등록
	//이름 insertCourse()
	//매개변수 course,period 주고 => 배열에 추가(배열을 완성/리턴값은x)
	public void insertCourse(String course, String period) {
		//cnt = 0, 아직 추가값 없음
		if(cnt>=5) {
			//배열을 더 늘려 더 많은 수강을 받을수도 있음(배열복사)
			System.out.println("더이상 수강할 수 없습니다.");
			return;
		} 
		this.course[cnt] = course;//배열값이 아니라 course자체로 선언해야함
		this.period[cnt] = period;
		cnt++;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String[] getCourse() {
		return course;
	}
	public void setCourse(String[] course) {
		this.course = course;
	}
	public String[] getPeriod() {
		return period;
	}
	public void setPeriod(String[] period) {
		this.period = period;
	}
	public int getCnt() {
		return cnt;
	}
	public void setCnt(int cnt) {
		this.cnt = cnt;
	}
	public static String getCompany() {
		return COMPANY;
	}
	
	
}