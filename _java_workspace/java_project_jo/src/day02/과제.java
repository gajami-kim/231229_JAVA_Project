package day02;

import java.util.Scanner;

public class 과제 {

	public static void main(String[] args) {
		/*정수 2개와 연산자 1개를 입력받아 두 정수의 연산을 출력
		 * ex) 2 3 + => 2+3=5
		 * 	   5 1 - => 5-1=4
		 * 연산자는 + - / * % 가능
		 * 다른종류의 연산자가 들어오면 잘못된 연산자로 출력
		 */
		
		Scanner scan = new Scanner(System.in);
		
//		System.out.println("첫번째 숫자를 입력해주세요");
//		int num1 = scan.nextInt();
//		System.out.println("두번째 숫자를 입력해주세요");
//		int num2 = scan.nextInt();
//		
//		System.out.println("연산자를 입력해주세요");
//		char ch = scan.next().charAt(0);
//		
//		switch(ch) {
//			case '+':
//				System.out.println("값은 "+(num1+num2));
//				break;
//			case '-':
//				System.out.println("값은 "+(num1-num2));
//				break;
//			case '*':
//				System.out.println("값은 "+(num1*num2));
//				break;
//			case '/':
//				System.out.println("값은 "+(num1/num2));
//				break;
//			case '%':
//				System.out.println("값은 "+(num1%num2));
//				break;
//			default:
//				System.out.println("잘못된 연산자가 입력되었습니다.");
//				break;
//		}
		
		//ssam
		//연산자 = char(기본자료형) == 비교가능 / String(객체) ==  비교불가능
		
		System.out.println("숫자(정수)를 입력해주세요 ");
		int num3 = scan.nextInt();
		System.out.println("다음 숫자(정수)를 입력해주세요");
		int num4 = scan.nextInt();
		System.out.println("연산자를 입력해주세요");
		char op = scan.next().charAt(0);
		
		int a = num3-num4;
		int b = num3*num4;
		double c = num3/(double)num4;
		double d = num3%(double)num4;
		
		// 연산자가 /,% 일 경우 num4가 0이 되면 다시입력하라는 안내문구 띄우기 
		
//		if(op=='%' || op=='/') {
//			if(num4==0)
//			System.out.println("0이 아닌 숫자를 다시 입력해주세요");
//		}
		
		//if((op=='/' || op=='%') && num4==0) 이렇게 작성하는 방법도 있다
		
		switch(op) {
		case '+':
			System.out.println(""+num3+op+num4+"="+(num3+num4));
			break;
		case '-':
			System.out.println(""+num3+op+num4+"="+a);
			break;
		case '*':
			System.out.println(""+num3+op+num4+"="+b);
			break;
		case '/':
			if(num4==0) {
				System.out.println("0이 아닌 숫자를 다시 입력해주세요");
			} else {				
				System.out.println(""+num3+op+num4+"="+c);
			}
			break;
		case '%':
			if(num4==0) {
				System.out.println("0이 아닌 숫자를 다시 입력해주세요");
			} else {				
				System.out.println(""+num3+op+num4+"="+c);
			}
			break;
		default:
			System.out.println("잘못된 연산자입니다.");
			break;
		}

		scan.close();
		
	}

}
