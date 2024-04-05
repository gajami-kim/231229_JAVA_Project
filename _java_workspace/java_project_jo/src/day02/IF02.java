package day02;

import java.util.Scanner;

public class IF02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//국어, 영어, 수학 점수를 입려받아 합계, 평균, 평가를 출력
		//평가는 평균이 90이상이면 A, 80이상이면 B, 70이상이면 C, 나머지는 D
		//입력값이 음수나 100점 이상이 나오면 다시 입력하라는 안내문 출력
		
		Scanner scan = new Scanner(System.in);
		
		//me
//		System.out.println("국어 점수를 입력해주세요 : ");
//		int kor = scan.nextInt();
//		if(0>kor || kor>100) {
//			System.out.println("다시 입력해주세요");
//		}
//		kor = scan.nextInt();
//		scan.nextLine();
//
//		System.out.println("영어 점수를 입력해주세요 : ");
//		int eng = scan.nextInt();
//		System.out.println("수학 점수를 입력해주세요 : ");
//		int math = scan.nextInt();
//		
//		int sum = kor+eng+math;
//		int avg = sum/3;
//		
//		System.out.println("합계 : "+sum);
//		System.out.println("평균 : "+avg);
//		
//		
//		if(avg>=90) {
//			System.out.println("평가 A");
//		} else if (avg>=80) :{
//			System.out.println("평가 B");
//		} else if (avg>=70) {
//			System.out.println("평가 C");
//		} else {
//			System.out.println("평가 D");
//		}
		
		
		//ssam
		//입력 안내문자
		System.out.println("정수입력(0~100) : 국어, 영어, 수학 순으로 입력 > ");
		
		int kor1 = scan.nextInt();
		int eng1 = scan.nextInt();
		int math1 = scan.nextInt();
		
		if(kor1<0 || kor1>100) {
			System.out.println("국어 점수의 범위가 벗어났습니다.");
		}
		if(eng1<0 || eng1>100) {
			System.out.println("영어 점수의 범위가 벗어났습니다.");
		}
		if(math1<0 || math1>100) {
			System.out.println("수학 점수의 범위가 벗어났습니다.");
		}
		
		
		int sum1 = kor1 + eng1 + math1;
		double avg1 = sum1 / 3.0;
		
		System.out.println("합계: "+sum1+" 평균: "+avg1);
		
		char result = 'D';
		if(avg1>100 || avg1<0) {
			System.out.println("잘못된 성적입니다.");
		} else if(avg1>=90) {
			result = 'A';
		} else if(avg1>=80) {
			result = 'B';
		} else if(avg1>=70) {
			result = 'C';
		} else {
			result = 'D';
		}
		
		System.out.println("결과: "+result);
		
		scan.close();
	}
}
