package day04;

import java.util.Scanner;

public class 과제 {

	public static void main(String[] args) {
		/* 주사위게임
		 * 주사위를 던져서 총 30칸을 이동
		 * 주사위는 랜덤으로 생성(1~6)
		 * 주사위 : 3
		 * 3칸 전진 => 27칸 남았습니다.
		 * 주사위 : 1
		 * 1칸 전진 => 26칸 남았습니다.
		 * 주사위 : 6
		 * 6칸 전진 => 20칸 남았습니다.
		 * 도착  총 이동횟수 : 10회(주사위를 던진 횟수)
		 */
		
		Scanner scan = new Scanner(System.in);
		
		//me
		System.out.println("주사위 게임을 시작합니다.");
//		
//		int goal = 0;
//		int count = 0;
//		
//		while(goal<30) {
//			scan.nextLine();
//			int ran = (int)(Math.random()*6)+1;
//			goal = goal+ran;
//			count++;
//			System.out.print("주사위: "+ran);
//			System.out.println();
//			System.out.print(ran+"칸 전진 => "+(30-goal)+"칸 남았습니다.");
//			System.out.println();	
//		}
//		System.out.println("도착");
//		System.out.println("총 이동횟수는 "+count+"번입니다.");
		
		//이전코딩에서 부족했던 것 : 변수를 얼마나 선언해야하는지 아직 감이?.. 작업 시작전에 필요할 것 같은 변수와 변수의 값을 모두, 최대한 많이 생각해보고 필요없는것을 쳐내는 방향으로 .. 해보자 .... .  .
		
		//ssam
		int random = 0; //주사위 값(랜덤수)
		int sum = 0;//거리누적
		int cnt=0;//주사위 던진 횟수
		int last=30;//최종 목표 이동 수
		
		while(sum<last) { //거리누적 값 < 최종목적지 라면 while을 계속 돌려라
			scan.nextLine(); //enter를 이용하여 주사위를 던질 수 있게 해주는 역할
			random = (int)(Math.random()*6)+1; //1부터 6까지 랜덤수 저장
			//랜덤수 발생값 거리 합산
			sum += random;
			cnt++;
			System.out.println("주사위 값 : "+random);
			System.out.println(random+"칸 전진 => "+(last-sum)+"칸 남았습니다.");
		}
		System.out.println("도착. 총 이동횟수 : "+cnt);
		scan.close();
	}
}
