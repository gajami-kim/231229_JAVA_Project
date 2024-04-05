package day20;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class 과제 {

	public static void main(String[] args) {
		/* 스트림으로 출력
		 * 여행사 상품 존재
		 * 여행 비용은 15세 이상은 100만원, 15세 미만은 50만원으로 계산
		 * 고객 3명이 패키지여행을 떠남
		 * 1. 비용계산 =>출력, 2. 고객명단검색 =>출력
		 * 고객클래스를 생성하고 ArrayList로 고객관리
		 * 
		 * 예시 ) 고객정보 -> 고객명단
		 * 이름: 이순신, 나이:40, 비용:100
		 * 이름: 신사임당, 나이:35, 비용:100
		 * 이름: 홍길동, 나이:10, 비용:50
		 * 총 여행경비 : 250
		 * 
		 * 20대이상 고객명단 => 이름순으로 정렬해서 출력
		 * 이름: 신사임당, 나이:35, 비용:100
		 * 이름: 이순신, 나이:40, 비용:100
		 */
		
		ArrayList<Customer> list = new ArrayList<>();
		list.add(new Customer("이순신",40));
		list.add(new Customer("신사임당",35));
		list.add(new Customer("홍길동",10));
		list.add(new Customer("이이",60));
		list.add(new Customer("이황",5));
		System.out.println("----고객정보----");
		list.stream()
		.forEach(n->{
			if (n.getAge()>=15) {
				n.setPrice(100);
			} else {
				n.setPrice(50);
			}
			System.out.println(n); //toString 출력
		});
		
		System.out.println();
		int tPrice = list.stream()
				.mapToInt(n->n.getPrice()).sum();
		System.out.println("총 여행비용: "+tPrice+"만원");
		
		System.out.println();
		System.out.println("----20대이상 고객명단----");
		list.stream()
		.filter(n->n.getAge()>=20)
		//기존클래스 자체에서 정렬이 구현되어있지 않을 경우
		.sorted(new Comparator<Customer>() { 
			public int compare(Customer o1, Customer o2) {
				return o1.getName().compareTo(o2.getName());
			}
		})
		.forEach(n->System.out.println(n));
		
		//Comparator는 인터페이스 -> Cu..클래스에서 선언하여 사용가능
		//클래스에 정렬(Comparator)이 구현되어 있으면 사용가능함		
		//익명클래스 사용할 경우 Comparator 대상(매개변수) 2개
		//클래스 내부에서 사용할 경우 Comparable 대상(매개변수) 1개
		Collections.sort(list);
		
		
		//원하는 요소만 출력
		System.out.println("----고객명만 출력----");
		list.stream()
		.map(n->n.getName()) //map을 이용해서 원하는 값만 뽑아낼 수 있음
		.forEach(n->System.out.println(n));
	}

}

