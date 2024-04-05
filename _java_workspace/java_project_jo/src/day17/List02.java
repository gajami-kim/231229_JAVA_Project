package day17;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class List02 {

	public static void main(String[] args) {
		/* 두 개의 배열을 입력받아서 하나로 합치는 ArrayList 생성
		 * 정렬하여 출력 
		 */
		String arr1[] = new String[] {"a","e","d","f"};
		String arr2[] = new String[] {"k","z","o","b"};
		
		ArrayList<String> arr = new ArrayList<>();
		for(int i=0; i<arr1.length; i++) { //배열의 길이가 같기때문에 1번만 돌려도 됨
			arr.add(arr1[i]);
			arr.add(arr2[i]);
		}
		System.out.println(arr);
		
		int cnt = arr1.length+arr2.length;
		int i=0, j=0;
		while(cnt>arr.size()) {
			if(i<arr1.length) {
				arr.add(arr1[i]);
				i++;
			}
			if(j<arr2.length) {
				arr.add(arr2[i]);
				j++;
			}
		}
		System.out.println(arr);
		
		System.out.println("--정렬--");
		Collections.sort(arr);
		System.out.println(arr);
		
		arr.sort(new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				return o2.compareTo(o1);
			}
			
		});
		System.out.println(arr);
	}

}
