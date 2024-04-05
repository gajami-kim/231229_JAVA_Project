package Std;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import java.util.Scanner;

public class Student {
	//멤버변수: 이름, 나이, 전화번호, map(과목,점수), 합계, 평균
	//생성자, getter/setter, 출력메서드
	//메서드 - 출력메서드(학생정보, 과목점수(성적표), 합계, 평균)
	//map(과목, 점수) 데이터를 추가 메서드
	//map(과목, 점수) 데이터를 삭제 메서드
	
	private String stdName;
	private int stdAge;
	private String stdPhone;
	private HashMap<String, Integer> map = new HashMap<String, Integer>();
	private int sum;
	private double avg;
	
	public Student() {}
	public Student(String stdName) {
		this.stdName = stdName;
	}
	public Student(String stdName, int stdAge, String stdPhone) {
		this.stdName = stdName;
		this.stdAge = stdAge;
		this.stdPhone = stdPhone;
	}
	
	public void stdPrint() {
		System.out.println("학생정보: "+stdName+"("+stdAge+"/"+stdPhone+")");
		
		if(map.size()>0) {
			for(String sub : map.keySet()) {
				System.out.println("과목명: "+sub+"/ 점수: "+map.get(sub));
			}
			
			Iterator<String> it = map.keySet().iterator();
			while(it.hasNext()) {
				String key = it.next();
				int zum = map.get(key);
				sum+=zum;
			}
			
			avg = sum/map.size();
			System.out.println("합계: "+sum+" / 평균: "+avg);
			System.out.println();
			
		} else {
			System.out.println("과목이 없습니다.");
		}
	}
	
	public void insertMap(Scanner sc) { //과목 추가 메서드
		System.out.println("과목: ");
		String sub = sc.next();
		System.out.println("점수: ");
		int zum = sc.nextInt();
		map.put(sub, zum);
	}
	
	public void removeMap(Scanner sc) { //점수 삭제 메서드
		System.out.println("삭제할 과목: ");
		String sub = sc.next();
//		int zum = sc.nextInt();
		Integer result = map.remove(sub);
		if(result==null) {
			System.out.println("해당 과목이 없습니다.");
		}
	}
	
	public void modMap(Scanner sc) { //점수수정
		System.out.println("수정할 과목: ");
		String sub = sc.next();
		if(map.containsKey(sub) ) {
			System.out.println("수정점수 >");
			int score = sc.nextInt();
			map.remove(sub);
			map.put(sub, score);
		} else {
			System.out.println("해당 과목이 없습니다.");
		}
	}
	
	
	
	//getter / setter
	public String getStdName() {
		return stdName;
	}
	public void setStdName(String stdName) {
		this.stdName = stdName;
	}
	public int getStdAge() {
		return stdAge;
	}
	public void setStdAge(int stdAge) {
		this.stdAge = stdAge;
	}
	public String getStdPhone() {
		return stdPhone;
	}
	public void setStdPhone(String stdPhone) {
		this.stdPhone = stdPhone;
	}
	public HashMap<String, Integer> getMap() {
		return map;
	}
	public void setMap(HashMap<String, Integer> map) {
		this.map = map;
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
	public int hashCode() {
		return Objects.hash(avg, map, stdAge, stdName, stdPhone, sum);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return  Objects.equals(stdName, other.stdName);
	}
	
	
}
