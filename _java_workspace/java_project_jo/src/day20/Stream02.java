package day20;

import java.util.Arrays;

public class Stream02 {

	public static void main(String[] args) {
		//배열에서 짝수만 출력(정렬), 중복X
		
		int arr[] = {1,5,4,7,5,9,8,1,6,5,4,3,6,5,8,2,10};
		Arrays.stream(arr)
		.sorted()
		.distinct()
		.filter(n->n%2==0)
		.forEach(n->System.out.print(n+" "));
		
		System.out.println();
		int [] result = Arrays.stream(arr)
		.filter(n->n%2==1)
		.distinct()
		.sorted()
		.toArray(); //배열로 리턴
		for(int tmp : result) {
			System.out.print(tmp+" ");
		}
	}

}