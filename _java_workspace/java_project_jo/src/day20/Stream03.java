package day20;

import java.util.ArrayList;

public class Stream03 {

	public static void main(String[] args) {
		//Student 클래스로 리스트 구성
		//add로 5명 추가
		//스트림을 이용하여 콘솔에 출력 ex) 홍길동: 98
		ArrayList<Student> list = new ArrayList<>();
		list.add(new Student("김종국",96));
		list.add(new Student("유재석",80));
		list.add(new Student("지석진",40));
		list.add(new Student("송지효",65));
		list.add(new Student("하하",70));
		
//		for(Student s : list) {
//			System.out.println(s);
//		}
		
		System.out.println("----toString 출력----");
		list.stream()
		.forEach(n->System.out.println(n));
		
		System.out.println("----------");
		list.stream()
		.forEach(n->{
			String name = n.getName();
			int score = n.getScore();
			System.out.println(name+": "+score);
		});
		
		//list의 점수합계와 전체 인원수 출력
		System.out.println("---합계/인원수 출력---");
		int sum = list.stream()
				.mapToInt(n->n.getScore()).sum(); //n은 name과 int를 가지고있는 변수
		System.out.println("전체점수합계:"+sum);
		int count = (int)list.stream().count(); //list.size()와 비슷한 의미. 객체의 개수를 센다
		System.out.println(count+"명");
	}

}
