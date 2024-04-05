package day04;

import java.util.Scanner;

public class Break01 {

	public static void main(String[] args) {
		/* break문 : 반복문을 빠져나오게 하는 키워드
		 * 반복문에서 조건문(if)를 동반하여 조건에 맞을 때 반복문을 벗어나게 하는 역할
		 */
		
		/* 1~10까지 출력
		 * 초기값, 증감식 그대로 두고 조건식을 생략하여 무한루프를 생성
		 * break를 이용하여 빠져나오게 사용
		 */
		
		for(int i=1; ;i++) { 
			System.out.print(i+" "); //if문 밑으로 내려갈 경우 10 출력x
			if(i==10) {
				break;
			}
		}
		System.out.println();
		
		/* 한글자를 입력받아 글자를 출력(반복해서 출력)
		 * y를 입력받으면 출력
		 * a->a b->b y->종료
		 */
		Scanner scan = new Scanner(System.in);
		
		//me
		System.out.print("한글자를 입력해주세요 > ");
		char ch = scan.next().charAt(0);
		
		while(ch!=1) {
			if(ch=='y') {
				System.out.println("종료");
				break;
			}
			System.out.println(ch);
			break;
		}
		
		//ssam 
//		for(;;) {
//			System.out.println("한글자 입력");
//			char a = scan.next().charAt(0);
//			System.out.println(a);
//		}
		
		scan.close();
		}

}
