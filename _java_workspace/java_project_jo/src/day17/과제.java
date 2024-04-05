package day17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class 과제 {

	public static void main(String[] args) {
		/* 숫자를 입력받아 입력받은 숫자를 list로 구성하고 출력
		 * 합계를 출력
		 * 입력 : 45,78,89,97,68,57,48 => String
		 * list에 넣고 출력 => 합계출력/인원수출력
		 * 70이상 인원수 출력
		 */
		
//		List<Integer> list1 = new ArrayList<Integer>(Arrays.asList());
		String num = "45,78,89,97,68,57,48";
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
//		System.out.println("숫자를 입력해주세요 > ");
		String number = sc.next();
		String[] numbers = num.split(",");

		for(String n : numbers) {
			list.add(Integer.parseInt(n));
		}
		System.out.println(list);
		
		int sum = 0;
		int count = 0;
		for(int tmp : list) {
			sum+=tmp;
			if(tmp>=70) {
				count++;
			}
		}
		System.out.println("총합: "+sum);
		System.out.println("70점 이상 인원수 : "+count);
		
		sc.close();

	}

}
