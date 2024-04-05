package day05;

import java.util.Scanner;

public class ForEx01 {

	public static void main(String[] args) {
		/* 소수 : 약수가 1과 자기자신만인 수
		 * 소수 : 3 5 7 11 13 17 19 ...
		 * 소수의 약수는 1, 자기자신 => 약수의 개수가 2개
		 * 
		 * 숫자 하나를 입력받아서 해당 수가 소수인지 아닌지 판별
		 * num = 13
		 * 소수입니다.
		 * num = 12
		 * 소수가 아닙니다.
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("숫자(정수)를 입력해주세요 > ");
		int num = scan.nextInt();
		int count1 = 0; //for문 밖에서도 활용하기 위해 밖에서 선언, 소수의 개수를 세기 위한 변수

		for(int i=1; i<=num; i++) { //약수의 개수를 세기위한 for문
			if(num%i==0) {
				count1++;
			}
		}
		if(count1==2) {
			System.out.println("소수입니다.");
		} else {
			System.out.println("소수가 아닙니다.");
		}
		//count(약수)의 개수를 구하는게 관건,,
		
		
		//2~100까지의 소수 모두 출력
		//이중for문 2부터 100까지 돌리는거, 소수 구하는거
		int count=0;
		for(int i=2; i<=100; i++) {
			count=0;
			for(int j=1; j<=i; j++) { //약수의 개수를 세기위한 for문
				if(i%j==0) {
					count++;
				}
			}
//			System.out.println(count);
			if(count==2) {
				System.out.print(i+" ");
			}
		}
		
		scan.close();
		
	}

}
