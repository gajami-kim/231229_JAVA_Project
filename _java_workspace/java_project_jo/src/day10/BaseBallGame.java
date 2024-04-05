package day10;

import java.util.Scanner;

import day08.Method07_lotto;

public class BaseBallGame {
	
	int apple = 0; //멤버변수

	public static void main(String[] args) {
		/* 야구게임 메서드화
		 * 사용자번호는 직접입력
		 * 번호는 랜덤생성(1~9, 중복없이)
		 * 중복안되게 하는 메서드 isContain 호출하여 사용 
		 */
		
		Scanner scan = new Scanner(System.in);
		
		int[] comNum = new int[3];
		int[] myNum = new int[3];
		int s=0, b=0;
		
		randomArray(comNum);
		createRandomArray(comNum,1,9);
//		Method07_lotto.printArray(comNum);
		
		//ssam
		while(s!=3) {
			System.out.println("myNum 3개 입력 > ");
			int cnt = 0;
			while(cnt < 3) {
				myNum[cnt] = scan.nextInt();
				cnt++;
			}
			
			//결과출력
			s = strike(comNum,myNum);
			b = ball(comNum,myNum);
			
			if(s!=0) {
				System.out.println(s+"s ");
			}
			if(b!=0) {
				System.out.println(b+"b ");
			}
			if(s==0 && b==0) {
				System.out.println("out");
			}
		}
		System.out.println("정답. 종료");
		
		//me
		while(true) {
			//사용자 번호 입력
			System.out.println("숫자입력> ");
			String mystr = scan.next();
			String[] myNumstr = mystr.split("");
			
			//문자>숫자변환
			for(int i=0; i<myNumstr.length; i++) {
				myNum[i] = Integer.parseInt(myNumstr[i]);
			}
			
			//변수안에 메서드값 넣기
			int stk = strike(comNum, myNum);
			int ball = ball(comNum,myNum);
			
			//게임진행
			if(stk==0 && ball==0) {
				System.out.println("out");
			} else {
				System.out.println("> "+stk+"s "+ball+"b");
			}
			
			//게임종료조건
			if(strike(comNum,myNum)==3) {
				System.out.println("성공. 게임종료");
				break;
			}
			
		}
		
		scan.close();

	}
	
	//랜덤으로 배열을 중복되지 않게 생성하는 메서드
	//method07의 isContain 가져와서 사용
	public static void randomArray(int arr[]) {
		int cnt=0;
		while(cnt<arr.length) {
			int r = (int)(Math.random()*9)+1;
			if(Method07_lotto.isContain(arr, r)) {
				arr[cnt] = r;
				cnt++;
			}
		}
	}
	
	//랜덤 수 범위에 상관없이 랜덤수를 채우는 메서드
	//범위를 매개변수로 받아오면 됨
	//(int)(Math.random()*개수)+시작값
	//시작값과 개수를 매개변수로 받아 범위를 생성함
	public static void createRandomArray(int arr[], int start, int count) {
		int cnt=0;
		while(cnt<arr.length) {
			int r = (int)(Math.random()*count)+start;
			if(Method07_lotto.isContain(arr, r)) {
				arr[cnt] = r;
				cnt++;
			}
		}
	}
	
	//스트라이크 개수를 카운트하는 메서드
	/* comNum, myNum을 주고 번호와 위치가 일치하면 count하는 메서드
	 * 리턴타입 : int count를 리턴
	 */
	public static int strike(int comNum[], int myNum[]) {
		int count=0;
		for(int i=0; i<comNum.length; i++) {
				if(comNum[i]==myNum[i]) { //같은값에 같은위치
					count++;
				}
		}
		return count;
	}

	//볼 개수를 카운트하는 메서드
	/* comNum, myNum을 주고 번호만 일치하면 count하는 메서드
	 * 리턴타입 : int count를 리턴
	 */
	public static int ball(int comNum[], int myNum[]) {
		int count=0;
		for(int i=0; i<comNum.length; i++) {
			for(int j=0; j<myNum.length; j++) {
				if(comNum[i]==myNum[j] && i!=j) {
					count++;
				}
			}
		}
		return count;
	}
	
	public static int ball_ssam(int com[], int my[]) {
		int count=0;
		for(int i=0; i<com.length; i++) {
			if(Method07_lotto.isContain(my, com[i])) {
				count++;
			}
		}
		return count-strike(com, my); //ball과 strike가 같이 체크되는 라인에서 strike가 빠지고 ball만 남게함
	}
}
