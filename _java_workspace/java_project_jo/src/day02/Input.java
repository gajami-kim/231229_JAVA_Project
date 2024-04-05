package day02;

import java.util.Scanner;

public class Input {

	public static void main(String[] args) {
		/* 콘솔입력 : 콘솔에서 값을 입력받는 것을 의미
		 * Scanner 클래스 => 콘솔에서 값을 입력받을 수 있게 해주는 클래스
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("숫자(정수)를 입력해주세요.");
		int num = scan.nextInt();
		System.out.println("내가 입력한 수 : "+num);
		
		if(num%2==0) {
			System.out.println("짝수");
		} else {
			System.out.println("홀수");
		}
		
		System.out.println("----------------");
		
		System.out.println("실수입력 > ");
		double num2 = scan.nextDouble();
		System.out.println("내가 입력한 실수 : "+ num2);
		
		System.out.println("----------------");
		//문자열 입력 : next() / 한글자 charAt(index) : 문자열 중 해당하는 index번지의 한글자를 추출하라는 뜻
		//index의 번지는 0부터 시작
		System.out.println("한글자입력");
		char ch = scan.next().charAt(0);
		System.out.println("내가 입력한 글자 : "+ch);
		
		System.out.println("한단어입력");
		String s = scan.next();
		System.out.println("내가 입력한 단어: "+s);
		
		
		System.out.println("----------------");
		scan.nextLine(); // 위에서 입력한 Enter 처리용
		
		//여러 단어 출력 : nextLine() : 공백포함 / next는 공백X
		System.out.println("여러단어 ");
		String str = scan.nextLine();
		System.out.println("내가 입력한 단어: "+str);
		
		scan.close();
	}

}
