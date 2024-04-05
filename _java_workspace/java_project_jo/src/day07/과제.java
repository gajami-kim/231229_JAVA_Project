package day07;

import java.util.Scanner;

public class 과제 {

	public static void main(String[] args) {
		/* 계산기 만들기
		 * --menu--
		 * 1.덧셈 | 2.뺄셈 | 3.곱셈 | 4.나눗셈 | 5.나머지 | 6.종료
		 * >> 메뉴선택 1
		 * >> 숫자 1 5
		 * >> 숫자 2 10
		 * 결과 : 5+10=15
		 * (더하기 메서드를 호출하여 연산결과를 출력)
		 */
		
		Scanner scan = new Scanner(System.in);
		
		int menu = 0;
		do {
			System.out.println("--menu--");
			System.out.println("1.덧셈 | 2.뺄셈 | 3.곱셈 | 4.나눗셈 | 5.나머지 | 6.종료");
			System.out.print(">> 메뉴선택 > ");
			menu = scan.nextInt();
			System.out.print(">> 첫번째 숫자 > ");
			int num1 = scan.nextInt();
			System.out.print(">> 두번째 숫자 > ");
			int num2 = scan.nextInt();
			
			//메서드 호출
			switch(menu) {
			case 1:
				System.out.println(num1+"+"+num2+"="+sum(num1,num2));
				break;
			case 2:
				System.out.println(num1+"-"+num2+"="+sub(num1,num2));
				break;
			case 3:
				System.out.println(num1+"*"+num2+"="+mul(num1,num2));
				break;
			case 4:
				System.out.println(num1+"/"+num2+"="+div(num1,num2));
				break;
			case 5:
				System.out.println(num1+"%"+num2+"="+mod(num1,num2));
				break;
			case 6:
				System.out.println("계산기 종료");
				break;
				default:
					System.out.println("잘못된 메뉴입니다.");

			}
		} while(menu!=6);
		System.out.println("프로그램 종료");
		
		scan.close();
	}
	
	public static int sum(int num1, int num2) {
		return num1+num2;
	}
	public static int sub(int num1, int num2) {
		return num1-num2;
	}
	public static int mul(int num1, int num2) {
		return num1*num2;
	}
	public static double div(int num1, int num2) {
		return num1/(double)num2;
	}
	public static int mod(int num1, int num2) {
		return num1%num2;
	}
	

}
