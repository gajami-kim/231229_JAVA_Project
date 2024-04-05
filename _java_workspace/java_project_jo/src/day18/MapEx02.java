package day18;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class MapEx02 {

	public static void main(String[] args) {
		/* 단어장
		 * 단어 5개를 (스캐너)입력받아 콘솔에 출력
		 * --단어장--
		 * hello : 안녕
		 * apple : 사과
		 * orange : 오렌지
		 * map에 저장 후 출력
		 */
		HashMap<String, String> map = new HashMap<>();

		Scanner sc = new Scanner(System.in);

		//me
		for(int i=0; i<5; i++) {
			String eng = sc.next();
			String kor = sc.next();
			map.put(eng, kor);
		}
		System.out.println("--단어장--");
		for(String s : map.keySet()) {
			System.out.println(s+" : "+map.get(s));
		}
		
		//ssam
		int size=3;
		while(map.size()<size) {
			System.out.println("단어:");
			String word = sc.next();
			System.out.println("의미:");
			String mean = sc.next();
			
			map.put(word,mean);
		}
		Iterator<String> it = map.keySet().iterator();
		while(it.hasNext()) {
			String word = it.next();
			String mean = map.get(word);
			System.out.println(word+":"+mean);
		}
		
		
		sc.close();
	}

}
