package day19;

import java.util.HashSet;
import java.util.Random;
import java.util.TreeSet;

public class SetEx01 {

	public static void main(String[] args) {
		/* set 중복저장X
		 * set에 로또번호 6개 생성 후 출력
		 */
		HashSet<Integer> set = new HashSet<>();
	
		//me
//		for(int i=0; i<6; i++) {
//			int lotto = (int)(Math.random()*45)+1;
//			set.add(lotto);
//			for(int j=0; j<i; j++) {
//				if(set.contains(j)) {
//					j--;
//					break;
//				}
//			}
//		}
//		System.out.println(set);		
		
		
		//ssam
		//6개생성 : 중복발생가능성
		//set이 6개가 찰 때 까지
		while(set.size()<6) {
			int random = new Random().nextInt(45)+1; //랜덤클래스를 사용하는 방법
			set.add(random);
		}
		System.out.println(set);
		System.out.println("--------------");
		
		//TreeSet : set 중에서 정렬이 되는 set
		//부모-자식 관계를 형성한 이후에는 자식이 가지고 있는 고유한 메서드(등등)를 사용할 수 없다
		TreeSet<Integer> treeset = new TreeSet<>();
		while(treeset.size()<6) {
			int random = new Random().nextInt(45)+1;
			treeset.add(random);
		}
		System.out.println(treeset);
		
		//treeSet 고유의 메서드
		//first() : 가장 앞에 있는 값 / last() : 가장 뒤에 있는 값
		System.out.println(treeset.first());
		System.out.println(treeset.last());
		
		//headSet : 지정한 값보다 작은 값 / tailSet : 지정한 값보다 큰 값
		System.out.println(treeset.headSet(15));
		System.out.println(treeset.tailSet(15));
		
		//subSet : 검색범위지정, 뒤쪽 값은 미포함
		System.out.println(treeset.subSet(15, 30)); //15~30 /30은 미포함
		
	}

}
