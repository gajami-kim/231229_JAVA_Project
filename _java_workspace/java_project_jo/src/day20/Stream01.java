package day20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.Stream;

public class Stream01 {

	public static void main(String[] args) {
		/* Stream(스트림)
		 * - 실제 입력 / 출력이 표현된 데이터의 이상화된 흐름
		 * - 스트림은 자료에 대한 스트림을 생성하여 연상
		 * - 그 연산을 다 수행하면 스트림은 소모됨
		 * - 기존자료에 변경을 유발하지 않음
		 * - 기존자료를 복사하여 복사본을 연산에 사용
		 * - 중간연산과 최종연산으로 구분됨
		 * - 중간연산은 메서드를 이어서 사용할 수 있음 / 중간연산 -> 중간연산 -> 최종연산
		 * 	- distinct():중복제거 / filter():조건에 맞는 값만 다음스트림으로 넘김
		 *  - limit():일부를 잘라냄(잘라낸것은 사용x) / skip():일부를 건너뜀
		 *  - peek():요소의 작업 수행 / sorted():정렬 ....
		 *  
		 * - 최종연산은 마지막에만 가능 / 사용하고나면 더이상 쓸 수 없음(스트림소모)
		 * 	- forEach() / count()/개수 / sum()
		 * 	- allMatch():스트림요소에서 모두 만족하면 true / anyMatch():스트림요소에서 한개라도 만족하면 true
		 * 	- toArray():배열로 변환 / collect():스트림의 요소 수집 ....
		 */
		
		int arr[] = {1,2,3,4,5,6,7,8};
		int sum = 0;
		for(int i : arr) {
			sum+=i;
		}
		System.out.println(sum);
		
		System.out.println("-----스트림을 이용한 합계-----");
		int total = Arrays.stream(arr).sum();
		System.out.println(total);
		System.out.println("-----스트림 count()------");
		int count = (int)Arrays.stream(arr).count(); //count의 리턴타입 long / total은 소모됨 -> 다시생성
		System.out.println(count);
		System.out.println("-----스트림 average()-----");
		OptionalDouble avg = Arrays.stream(arr).average(); //average의 리턴타입 Optional(Double)(혹시 발생할 수 있는 Exception을 처리할 수 있는 패키지)
		System.out.println(avg);
		
		//arr값 중 5 이상의 값만 합계
		System.out.println("-----스트림 filter()-----");
		int s5 = Arrays.stream(arr).filter(n->n>=5).sum(); //filter는 중간연산자 -> .을 통해 계속 이어갈 수 있음
		System.out.println(s5);
	
		
		//점수 배열을 생성한 후 70점 이상만 합계, 평균, 가장 높은 점수 출력
		System.out.println("--점수예시--");
		int arr1[] = {70,54,82,61,99,40,60};
		int sum1 = Arrays.stream(arr1).filter(n->n>=70).sum();
		OptionalDouble avg1 = Arrays.stream(arr1).filter(n->n>=70).average();
		OptionalInt max = Arrays.stream(arr1).max();
		System.out.println("합계:"+sum1);
		System.out.println("평균:"+avg1);
		System.out.println("최대값:"+max);
		
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(8);
		list.add(3);
		list.add(3);
		list.add(3);
		list.add(5);
		list.add(5);
		list.add(2);
		list.add(2);
		list.add(2);
		list.add(4);
		list.add(7);
		list.add(10);
		System.out.println("----list를 stream으로 구성----");
		list.stream()
		.forEach(n->System.out.print(n+" "));
		System.out.println();
		System.out.println("-----distinct() 중복제거-----");
		//System.out::println
		list.stream()
		.distinct()
		.forEach(System.out::print); //매개변수가 필요없을 때 출력문
		System.out.println();
		System.out.println("-----sorted() 정렬-----");
		list.stream()
		.sorted()
		.distinct()
		.forEach(n->System.out.print(n+" "));
		
		System.out.println();
		System.out.println();
		System.out.println("--스트림 객체 생성--");
		Stream<Integer> s1 = Stream.of(10,20,40,50,90,30); //Stream으로 구성되었기 때문에 원본없이 복사본만 존재. 재사용 불가능
		System.out.println("--합계--");
		// map : 스트림 변환에 사용하는 중간연산
		// mapToInt : map의 값을 int로 변환
		int s = s1.mapToInt(n->n.intValue()).sum(); //매개변수 n을 int로 변환
		System.out.println(s);
//		s1.forEach(n->System.out.println(n+" ")); //오류 / s로 stream을 사용했기때문에 s1으로 재사용 불가능 
	}
	
}
