package day17;

import java.util.ArrayList;
import java.util.Scanner;

public class 과제2 {

	public static void main(String[] args) {
		/* 숫자를 입력받아 입력받은 숫자를 list로 구성하고 출력
		 * 합계를 출력
		 * 입력 : 45,78,89,97,68,57,48 => String
		 * list에 넣고 출력 => 합계출력/인원수출력
		 * 70이상 인원수 출력
		 */

		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
		int cnt=0;
		int sum=0;
		
		while(true) {
			System.out.println("점수를 입력해주세요");
			String num = sc.next();
			list.add(Integer.parseInt(num));
			System.out.println("계속:1 / 종료:0");
			int close = sc.nextInt();
			if(close==0) {
				System.out.println("종료");
				break;
			}
		}
		
		for(int tmp : list) {
			sum+=tmp;
			if(tmp>=70) {
				cnt++;
			}
		}

		System.out.println("총합: "+sum);
		System.out.println("70점 이상 인원: "+cnt);
		
		
		sc.close();

	}

}
