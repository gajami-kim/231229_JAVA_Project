package day12;

public class Class05 {
	/* 생성자 : 객체를 생성할 때 값을 초기화하는 방법
	 * - 기본값, 명시적 초기값, 초기화 블럭, 생성자
	 * 1. 기본값 : 기본적으로 지정되는 값 / int=>0 String=>null
	 * 2. 명시적 초기값 : 멤버변수를 선언함과 동시에 값을 지정하는 방법
	 * 		private String name = "홍길동";
	 * 3. 초기화 블럭 : {  } 멤버변수를 초기화
	 * 4. 생성자 : 객체를 생성할 때 초기화해서 생성
	 * 
	 * 초기값의 우선순위
	 * 기본값 -> 명시적초기값 -> 초기화블럭 -> 생성자(가장 우선순위가 높음)
	 */
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EzenStudent ezen = new EzenStudent("인천","홍길동","java","111");
		//toStirng()메서드가 없으면 객체의 주소가 출력
		//toStirng()메서드가 있으면 toString() 출력		
//		System.out.println(ezen.toString());
		System.out.println(ezen);
		EzenStudent ezen1 = new EzenStudent("강남", "김첨지","빅데이터","789");
		EzenStudent ezen2 = new EzenStudent(); //초기화블럭값이 출력
		EzenStudent ezen3 = new EzenStudent("신촌","김남희","java","546");
		EzenStudent ezen4 = new EzenStudent("수원","이연희","앱개발","094");
		EzenStudent ezen5 = new EzenStudent("인천","박이병","빅데이터","855");
		EzenStudent ezen6 = new EzenStudent("강남","이미주","java","123");

		System.out.println(ezen1);
		System.out.println(ezen2);
		System.out.println(ezen3);
		System.out.println(ezen4);
		System.out.println(ezen5);
		System.out.println(ezen6);
		
		EzenStudent[] studentArr = new EzenStudent[7];
		studentArr[0]=ezen;
		studentArr[1]=ezen1;
		studentArr[2]=ezen2;
		studentArr[3]=ezen3;
		studentArr[4]=ezen4;
		studentArr[5]=ezen5;
		studentArr[6]=ezen6;
		System.out.println("test");
		System.out.println(studentArr[1]);
		
		//김첨지 학생이 듣고있는 과목을 출력
		String searchName = "김첨지";
		System.out.println("--"+searchName+"학생이 듣고 있는 과목정보--");
		for(int i=0; i<studentArr.length; i++) {
			if(studentArr[i].getName().equals(searchName)) {
				System.out.println(studentArr[i].getGroup());
			}
		}
		
		//홍길동이 java를 들으려고 했는데 앱개발로 변경
		String modify = "홍길동";
		System.out.println("---홍길동의 과목변경---");
		for(int i=0; i<studentArr.length; i++) {
			if(studentArr[i].getName().equals(modify)) {
				studentArr[i].setGroup("앱개발");
				System.out.println(studentArr[i]);
			}
		}
		
		//java를 듣고있는 학생 명단을 출력 <=홍길동의 수강과목이 바뀐 상태
		//학생이 없으면 명단에 없습니다 출력
		String subject="java";
		int cnt = 0;
		System.out.println("---특정과목 수강생---");
		for(int i=0; i<studentArr.length; i++) {
			if(studentArr[i].getGroup().equals(subject)) {
				cnt++;
				System.out.println(studentArr[i]); //subject를 듣고있는 학생을 모두 출력
			}
		}
		if(cnt==0) {
			System.out.println("명단에 없습니다.");
		}
		
	}

}

class EzenStudent {
	//학생 정보를 생성하는 클래스
	private String gigum = "Incheon"; //명시적초기값
	private String name;
	private String group;
	private String phone;
	
	public EzenStudent() {} //기본생성자
	public EzenStudent(String gigum, String name, String group, String phone) {
		//super(); //나의 상위 클래스의 생성자 호출
		this.gigum = gigum;
		this.name = name;
		this.group = group;
		this.phone = phone;
	}
	
	//초기화블럭
	{	
		//초기화블럭 영역
		gigum ="인천";
		name ="신원미상";
		phone ="000";
		group ="미정";
	}

	//toString : print메서드와 비슷한 일을 함
	//클래스 내부에서 주는 프린트 메서드
	@Override
	public String toString() {
		return gigum + "> " + "name:" + name +"("+ group+"/" + phone+")";
	}

	//getter/setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGroup() {
		return group;
	}

	public void setGroup(String group) {
		this.group = group;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}	
	
}