package day09;

import java.util.Scanner;

public class 가위바위보게임_ssam {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("가위바위보 게임 시작 >>");
		int comNum = (int)(Math.random()*3);
		System.out.println("컴퓨터 결정 완료");
		System.out.println("가위/바위/보");
		
		String myChoice = scan.next(); //사용자 입력값
		String comChoice = (comNum==0?"가위": comNum==1?"바위": "보"); //컴퓨터 입력값 글자로 치환
		System.out.println("comChoice > "+ comChoice+"("+comNum+")");
		System.out.println("myChoice > "+myChoice);
		
		//비교
		if(comChoice.equals(myChoice)) {
			System.out.println("무승부");
		} else { //무승부는 아닌 케이스
			if(comChoice.equals("가위")) {
				System.out.println(myChoice.equals("바위")? "승":"패");
			} else if(comChoice.equals("바위")) {
				System.out.println(myChoice.equals("보")? "승":"패");
			} else {
				System.out.println(myChoice.equals("가위")? "승":"패");
			}
		}
		
		
		scan.close();
	}
}
