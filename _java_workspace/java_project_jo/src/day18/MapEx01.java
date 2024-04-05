package day18;

import java.util.HashMap;

public class MapEx01 {

	public static void main(String[] args) {
		/* map을 이용하여 상품과 가격을 추가하여 합계를 구하시오
		 * 상품을 map에 추가하는 작업은 메서드를 활용
		 * 1. map을 main에 생성해놓고, 매개변수로 받아 map의 데이터를 채우는 메서드
		 * 2. map을 메서드 내부에서 생성하여 main으로 리턴하는 메서드
		 * 
		 * 가위 2500
		 * 크레파스 4000
		 * 물감 5000
		 * 합계
		 */
		int sum = 0;
		
		//map을 매개변수로 받는 케이스
		System.out.println("---map을 매개변수로 받는 케이스---");
		HashMap<String, Integer> map = new HashMap<>();
		MapEx01 m = new MapEx01();
		m.makeMap(map);
		for(String key : map.keySet()) {
			sum+=map.get(key);
			map.get(key);
			System.out.print(key+":"+map.get(key)+" ");
		}
		System.out.println();
		System.out.println("합계:"+sum);
		
		//map을 내부에서 생성하여 리턴하는 케이스
		System.out.println("---map을 내부에서 생성하여 리턴하는 케이스---");
		HashMap<String, Integer> map1 = m.makemap2();  //메서드를 실행하면 map을 줌
//		MapEx01 m = new MapEx01();
		sum=0; //sum 초기화
		for(String key : map1.keySet()) {
			sum+=map1.get(key);
			map1.get(key);
			System.out.print(key+":"+map1.get(key)+" ");
		}
		System.out.println();
		System.out.println("합계:"+sum);
		
		//map을 받아서 출력하는 메서드
		System.out.println("--map을 받아서 출력하는 메서드---");
		m.printMap(map);
		m.printMap(m.makemap2());
	}
	
	//map을 매개변수로 받는 케이스
	public void makeMap(HashMap<String,Integer>map) {
		map.put("가위", 2500);
		map.put("크레파스", 4000);
		map.put("물감", 5000);
	}
	
	//map을 내부에서 생성하여 리턴하는 케이스
	public HashMap<String, Integer> makemap2() {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("가위", 3500);
		map.put("크레파스", 5000);
		map.put("물감", 6000);
		
		return map;
	}

	//map을 받아서 출력하는 메서드
	public void printMap(HashMap<String,Integer>map) {
		int sum = 0;
		for(String key : map.keySet()) {
			sum+=map.get(key);
			map.get(key);
			System.out.print(key+":"+map.get(key)+" ");
		}
		System.out.println();
		System.out.println("합계:"+sum);
	}
}
