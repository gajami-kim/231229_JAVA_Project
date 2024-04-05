package studentManager;

//import java.util.Arrays;

public class Student {
	private int id;
	private String name;
	private int age;
	private String phone;
	private String address;
	private Subject subject[] = new Subject[5]; //수강과목
	private int cnt;
	
	public Student() {}
	public Student(String name, int id) {
		this.name = name;
		this.id = id;
	}
	public Student(String name, int id, int age, String phone, String address) {
		this.name = name;
		this.id = id;
		this.age = age;
		this.phone = phone;
		this.address = address;
	}
	
	public void printStu() { //학생정보 출력 메서드
		System.out.println("학생정보: "+name+"/"+id+"("+age+","+phone+","+address+")");
		printSub();
	}
	
	public void insertSub(Subject subject) { //수강과목 추가 메서드
		this.subject[cnt] = subject;
		cnt++;
	}
	
	public void deleteSub() { //수강과목 삭제 메서드
		
	}
	
	public void printSub() { //수강과목 출력 메서드
		if(cnt==0) {
			System.out.println("수강과목이 없습니다.");
			return;
		}
		for(int i=0; i<=cnt-1; i++) {				
				System.out.println("과목명: "+subject[i]);
		}
	}
	
	@Override
	public String toString() {
		return "학생정보: "+name+"/"+id+"("+age+" / "+phone+","+address+")"+subject+" Arrays.toString(subject) ";
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Subject[] getSubject() {
		return subject;
	}
	public void setSubject(Subject[] subject) {
		this.subject = subject;
	}
	
}
