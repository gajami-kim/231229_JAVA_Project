package day03;

import java.util.Scanner;

public class 과제 {

	public static void main(String[] args) {
		/* up/down 게임
		 * 1-50사이의 랜덤수를 생성하여 맞추는 게임
		 * 컴퓨터가 랜덤 수 생성 : 23
		 * 입력 > 10
		 * up
		 * 입력 > 40
		 * down
		 * 입력 > 23
		 * 정답
		 */
		
		//me
		Scanner scan = new Scanner(System.in); // 중복선언이 안됨
//		int random = (int)(Math.random()*50) + 1;
//		
//		System.out.print("입력 > ");
//		int a = scan.nextInt();
//		
//		while(a<=50) {
//			if(a<random) {
//				System.out.println("up!");
//				System.out.print("다시입력 > ");
//				a = scan.nextInt();
//			} else if(a>random) {
//				System.out.println("down!");
//				System.out.print("다시입력 > ");
//				a = scan.nextInt();
//			} else {
//				System.out.println("정답!");
//				break;
//			}
//		}
		
		//비교 > scan을 if문 밖 while문에 넣어 한번만 선언했다.
		//ssam
		int random1 = (int)(Math.random()*50) + 1;
		System.out.println("컴퓨터가 랜덤수를 생성하였습니다. start!");
		int num = 0; // 사용자 입력값
		int count=0; //횟수
		
		while(num!=random1) {
			System.out.print("입력 > ");
			num = scan.nextInt();
			count++; //게임횟수증가
			
			if(count>5) {
				System.out.println("정답을 맞추지 못했습니다. 게임종료");
				break;
			}
			if(num > random1) {
				System.out.println("down! "+count+"회");
			} else if(num < random1) {
				System.out.println("up! "+count+"회");
			} else {
				System.out.println("정답! "+count+"회");
			}
		}
		
		
		
		
		scan.close();
	}

}
