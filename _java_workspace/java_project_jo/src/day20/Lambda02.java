package day20;

import java.util.HashMap;

public class Lambda02 {

	public static void main(String[] args) {
		//map을 구성하여 forEach를 사용하여 출력
		HashMap<String, Integer> map = new HashMap<>();
		map.put("김종국", 80);
		map.put("유재석", 100);
		map.put("지석진", 70);
		map.put("송지효", 50);
		map.put("하하", 60);
		
		map.forEach((x,y)-> {
			System.out.println(x+":"+y);
		});
		
		
		
		Number sum = (a,b) -> { //함수구현
			return a+b;
		};
		
		int hap = sum.add(50, 60);
		System.out.println(hap);
		
		System.out.println(sum.add(100, 200));
		
		
		
		Number max = (a,b) -> (a>=b)? a:b; //함수구현
		System.out.println(max.add(50, 200));
		
	}
}

//함수형 인터페이스 생성
//메서드가 반드시 1개여야만 함
@FunctionalInterface
interface Number{
	int add(int a, int b);
//	int max(int a, int b); //메서드가 2개 이상이면 오류
}
