package day17;

import java.util.HashMap;
import java.util.Iterator;

public class Map01 {

	public static void main(String[] args) {
		/* Map
		 * - 값을 2개 쌍으로 저장, key / value
		 * - key : 중복불가 / value : 중복가능
		 * - HashMap을 가장 많이 사용
		 * HashMap<클래스,클래스> map = new HashMap<클래스,클래스>();
		 * 
		 * Map은 값이 2개이기 때문에 향상된 for문, iterator 사용안됨
		 * Map의 key => set으로 구성 후 출력
		 * 
		 * list/set => add로 값을 추가
		 * map => put()으로 값을 추가
		 * getKey(), getValue() //추출가능
		 */
		
		HashMap<String, Integer> map = new HashMap<>();
		map.put("사과", 5000);
		map.put("포도", 3000);
		map.put("오렌지", 7000);
		map.put("수박", 10000);
		map.put("딸기", 9000);
		System.out.println(map);
		System.out.println(map.keySet()); //key 부분만 별도로 set 구성 / 순서x
		System.out.println(map.values()); //순서x
		
		//get(key) => value를 리턴
		System.out.println(map.get("사과"));
		
		//remove => key에 대한 값을 삭제하면서 value를 리턴
		System.out.println(map.remove("사과"));
		System.out.println(map);
		System.out.println(map.remove("키위")); //null을 리턴
		System.out.println(map.remove("포도", 3000)); //key,value를 모두 주면 true/false로 리턴
		System.out.println(map);
		
		//향상된 for문으로 출력(key만 가능)
		int sum = 0;
		for(String key : map.keySet()) {
//			sum += map.get(key);
			System.out.print(key+":"+map.get(key)+" ");
		}
		
		System.out.println();
		Iterator<String> it = map.keySet().iterator();
		while(it.hasNext()) {
			String key = it.next();
			sum += map.get(key);
//			System.out.print(key+":"+map.get(key)+" ");
		}
		System.out.println("합계 "+sum);
		
		
	}

}
