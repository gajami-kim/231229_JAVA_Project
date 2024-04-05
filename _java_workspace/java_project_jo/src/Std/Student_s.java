package Std;

import java.util.HashMap;
import java.util.Objects;

public class Student_s {
	//멤버변수: 이름, 나이, 전화번호, map(과목,점수), 합계, 평균
	//생성자, getter/setter, 출력메서드
	//메서드 - 출력메서드(학생정보, 과목점수(성적표), 합계, 평균)
	//map(과목, 점수) 데이터를 추가 메서드
	//map(과목, 점수) 데이터를 삭제 메서드
	
	private String name;
	private int age;
	private String phone;
	private HashMap<String, Integer> subject = new HashMap<>();
	private int sum;
	private double avg;
	
	public Student_s() {}
	public Student_s(String name) {
		this.name = name;
		this.age = 15;
	}
	public Student_s(String name, int age, String phone) {
		this.name = name;
		this.age = age;
		this.phone = phone;
	}
	
	//출력메서드
	public void printOne() { //학생한명의 정보출력
		System.out.print(name+"("+age+")"+" / ");
		if(phone!=null) {
			System.out.println(phone);
		}
		System.out.println();
		if(subject.size()<=0) {
			System.out.println("점수가 없습니다.");
			System.out.println("---------");
			return;
		}
		printSubject();
		calc();
		System.out.println("result : "+sum+"["+avg+"]");
		System.out.println("---------");
	}
	
	public void printSubject() { //과목의 성적표출력(map)
		System.out.println("---------");
		for(String sub : subject.keySet()) {
			System.out.println(sub+":"+subject.get(sub));
		}
		System.out.println("---------");
	}
	
	public void calc() { //합계계산
		this.sum=0;
		this.avg=0;
		for(String sub : subject.keySet()) {
			sum+=subject.get(sub);
		}
		avg = (double)sum/subject.size();
	}
	
	public void addSubject(String sub, int score) { //과목추가
		subject.put(sub, score);
		System.out.println("점수추가");
	}
	
	public void delSubject(String sub) { //과목삭제
		
		if(subject.remove(sub)==null) {
			System.out.println("해당 과목이 없습니다.");
			return;
		}
		subject.remove(sub);
		System.out.println("점수삭제");
		
	}
	
	//getter/setter
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
	public int getSum() {
		return sum;
	}
	public void setSum(int sum) {
		this.sum = sum;
	}
	public double getAvg() {
		return avg;
	}
	public void setAvg(double avg) {
		this.avg = avg;
	}
	
	
	@Override
	public String toString() {
		return "Student_s [name=" + name + ", age=" + age + ", phone=" + phone + ", subject=" + subject + ", sum=" + sum
				+ ", avg=" + avg + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(age, avg, name, phone, subject, sum);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) //주소가 내 객체의 주소와 같다면 true
			return true;
		if (obj == null) 
			return false;
		if (getClass() != obj.getClass()) //클래스 정보가 다르다면 false
			return false;
		Student_s other = (Student_s) obj;
		return Objects.equals(name, other.name); //이름만 일치해도 true
	}
	
	
	
}
