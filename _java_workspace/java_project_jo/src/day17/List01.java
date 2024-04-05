package day17;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class List01 {

	public static void main(String[] args) {
		/* 하루일과를 저장하는 list를 생성
		 * 출력 일반for / 향상된for / iterator 출력
		 * import 단축키 ctrl+shift+o
		 */
		ArrayList<String> day = new ArrayList<>();
		day.add("기상");
		day.add("근무시작");
		day.add("식사");
		day.add("퇴근");
		day.add("수업시작");
		day.add("수업끝");
		day.add("귀가");
		
		System.out.println(">>for문");
		for(int i=0; i<day.size(); i++) {
			System.out.println(day.get(i));
		}
		
		System.out.println();
		System.out.println(">>향상된 for문");
		for(String s : day) {
			System.out.println(s);
		}

		System.out.println();
		System.out.println(">>Iterator");
		Iterator<String> it = day.iterator();
		while(it.hasNext()) {
			String tmp = it.next();
			System.out.println(tmp);
		}
		
		//정렬
		System.out.println();
		Collections.sort(day);
		System.out.println(day);
		
		day.sort(new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				// 숫자는(크다/작다를 이용) -/+의 값이 출력
				// 문자는 compareTo 메서드르 활용하여 정렬
				//o1.compareTo(o2) : 오름차순
				//o2.compareTo(o1) : 오름차순
				
				return o2.compareTo(o1);
			}
			
		});
		System.out.println(day);
		
	}

}
