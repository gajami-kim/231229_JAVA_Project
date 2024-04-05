package day05;

import java.util.Scanner;

public class Array02 {

	public static void main(String[] args) {
		/* 5명의 점수를 입력할 수있는 배열을 생성
		 * 5명의 점수를 입력받아서 배열에 저장
		 * 점수를 출력 => 점수의 합계 / 점수의 평균
		 */
		Scanner scan = new Scanner(System.in);
		
		System.out.println("점수를 입력해주세요 > ");
		
		int zum[] = new int[7];
		int sum = 0;
		
		for(int i=0; i<zum.length; i++) {
			zum[i] = scan.nextInt();
//			System.out.println("점수는 "+ zum[i]);
			sum = sum+zum[i];
		}
		double avg = sum/(double)zum.length;
		
		System.out.println("점수 합계 > "+sum);
		System.out.println("평균 점수 > "+avg);
		
		scan.close();
		
		
	}

}
