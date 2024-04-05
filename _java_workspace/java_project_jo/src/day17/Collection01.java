package day17;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Collection01 {

	public static void main(String[] args) {
		/* 컬렉션 프레임워크 : 표준화된 방식의 자료구조
		 * List, Set, Map => 인터페이스, 반드시 구현클래스로 객체를 생성
		 * 데이터를 묶어서 관리할 때 사용
		 * 주로 배열대신 사용됨
		 * 
		 * List(배열과 동일)
		 * - List<클래스명> 객체명 = new 구현클래스<클래스명>();
		 * - 구현클래스 ArrayList, LinkedList
		 * 		- ArrayList : 검색 시 유리(배열과 비슷)
		 * 					  미리 길이를 지정하지 않음, 추가되면 늘어나고 삭제되면 줄어듬 / 추가, 삭제, 검색이 쉬움
		 * 		- LinkedList : 추가, 삭제가 많을 경우 유리
		 * 					   값을 중간에 끼원허거나 빼는게 쉬움, 검색은 느림
		 * - 값을 하나씩 저장
		 * - 순서를 보장(index가 있음)
		 * - 중복허용
		 * - 배열 대신에 가장 많이 사용하는 구조
		 * 
		 * Set
		 * - 값을 하나씩 저장
		 * - 순서를 보장하지 않음(index가 없음)
		 * - 중복허용x(같은 자료가 입력되면 버려짐)
		 * 
		 * Map
		 * - 값을 두개씩 저장 key / value 쌍으로 저장
		 * - key : 중복불가능 / value(값) : 중복가능
		 * - key가 중복되면 value는 덮어쓰게 됨
		 * - 아이디/패스워드와 같이 하나의 자료를 묶어서 저장해야 할 때 사용
		 * 
		 * 배열은 기본자료형, 클래스자료형으로 구성이 가능함.
		 * int arr[] / String arr[] / Student arr[] 다 가능함
		 * 
		 * Collection은 기본자료형은 불가능함. 클래스자료형만 구성가능
		 * 기본자료형에 맞는 클래스자료형을 사용하면 됨
		 * int => Integer(int의 클래스자료형), String
		 * 나머지는 기본자료형의 첫글자만 대문자로 변환하면 클래스가 됨
		 * long => Long, byte => Byte, boolean => Boolean ...
		 * 
		 * 만약 클래스를 지정하지 않으면 Object가 자동 설정됨
		 */
		
		List<Integer> list = new ArrayList<Integer>(); //부모를 기준으로 생성
		ArrayList<Integer> list1 = new ArrayList<Integer>(); //자식을 기준으로 생성
		ArrayList<Integer> list3 = new ArrayList<>();
		ArrayList list2 = new ArrayList(); //object로 생성
		
		
		//add() : 요소를 추가
		list.add(10);
		list.add(2);
		list.add(30);
		System.out.println(list);
		
		//get(index) : index 번지의 요소를 가져오기
		System.out.println(list.get(0)); //list가 class이기 때문에 사용가능
		//set(index) : index 번지의 값을 변경하기
		list.set(0,5);
		System.out.println(list.get(0));
		System.out.println(list);
		for(int i=0; i<list.size(); i++) {
			System.out.print(list.get(i)+" ");
		}
		
		//size() : 총 개수를 확인
		System.out.println(list.size());
		
		//문자열을 담을 수 있을 ArrayList를 생성
		//문자열 5개를 저장한 후 출력
		//총 개수가 몇개인지도 출력
		System.out.println("---문자열---");
		ArrayList<String> strlist = new ArrayList<>();
		strlist.add("가나다");
		strlist.add("라마바");
		strlist.add("사아자");
		strlist.add("차카타");
		strlist.add("파하");
		System.out.println(strlist);
		for(int i=0; i<strlist.size(); i++) {
			System.out.println(strlist.get(i));
		}
		for(String s : strlist) {
			System.out.println(s);
		}
		
		//list1에 1부터 10까지 값을 지정한 후 출력
		System.out.println("---");
		for(int i=0; i<10; i++) {
			list1.add(i+1);
		}
		System.out.println(list1);
		
		//0번지값을 7로 변경 후 출력
		list1.set(0, 7);
		System.out.println(list1);
		
		//remove(index) : index번지의 값을 삭제
		//remove(object) : object의 요소를 삭제
		System.out.println("---remove---");
		list1.remove(0);
		System.out.println(list1);
		Integer a = 9; //9번지가 아닌 요소 9를 삭제
		Integer b = 11;
		list1.add(b);
		list1.remove(a);
		System.out.println(list1);
		
		//contains(object) : list에 해당 값이 있는지 검사 true / false로 리턴
		System.out.println(list1.contains(a)); //값으로 검사x
		
		//clear() : list를 비움(요소 전부 삭제)
		list1.clear();
		System.out.println(list1);
		
		//isEmpty() : list가 비어져있는지 체크 비어있으면 true / 아니면 false
		System.out.println(list1.isEmpty());
		
		//ArrayList로 number를 생성 숫자를 저장하는 리스트
		//1부터 10까지 채운 후 출력(향상된 for문 이용)
		ArrayList<Integer> number = new ArrayList<>();
		for(int i=0; i<10; i++) {
			number.add(i+1);
		}
		for(Integer s : number) {
			System.out.print(s+" ");
		}
		System.out.println();
		System.out.println("----------");
		
		/* Iterator : index가 없는 값을 출력하기 위해 사용
		 * list에서는 순서를 보장하기 때문에 get(i)를 사용하여 원하는 번지에 접근가능
		 * set / map은 순서를 보장하지 않기 때문에 일반 for문을 사용할 수 없음
		 * 향상된 for문, Iterator를 사용
		 * 순서와 상관없이 값을 가져올 수 있는 구문
		 * map은 향상된 for문, Iterator 모두 직접 사용 불가능
		 */
		System.out.println(">> Iterator 출력 ");
		Iterator<Integer> it = number.iterator();
		while(it.hasNext()) { //hasNext() 다음요소가 있는지 체크 ture / false
			Integer tmp = it.next(); //next() 다음요소 가져오기
			System.out.print(tmp+" ");
		}
		
		//indexOf(값) : 해당 값이 list에 있는지 확인, index를 반환 / 없다면 -1 리턴
		System.out.println();
		System.out.println(number.indexOf(a));
		System.out.println(number.contains(a));
		
		//number 리스트를 비우고 값을 무작위로 5개만 출력
		System.out.println("---Collections.sort---");
		number.clear();
		number.add(11);
		number.add(06);
		number.add(75);
		number.add(69);
		number.add(88);
		System.out.println(number);
		
		//정렬
		//Collections.sort() : 오름차순으로 정렬
		Collections.sort(number);
		System.out.println(number);
		
		//sort(Comparator를 구현한 객체) : 정렬(오름차순/내림차순)
		//Comparator 인터페이스를 구현한 구현체를 넣어야함(익명클래스 사용) 
		//compareTo 메서드를 구현해야 객체를 정렬
		// - compareTo : 사전상 앞에 있으면 -1, 같으면 0, 뒤에 있으면 1
		number.sort(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				// o1 - o2 : 오름차순 / o2 - o1 : 내림차순
				// 결과가 마이너스면 앞으로 보내고, 플러스면 뒤로 보내는 역할
				return o2-o1;
			}
		});
		System.out.println(number);
		
	}

}
