package day09;

import java.util.Scanner;

public class 과제 {

	public static void main(String[] args) {
		/* 야구게임
		 * 컴퓨터가 3자리의 숫자를 생성(각 자리수는 1~9까지의 수) => 배열로 랜덤 저장(중복불가능)
		 * 유저는 3자리의 숫자를 맞추는 게임 => 직접입력(중복x)
		 * 자리와 숫자가 일치하면 strike
		 * 숫자만 일치하면 ball
		 * 아무것도 안맞으면 out
		 * ex) 컴 생성번호 1 2 3
		 * 사용자 생성번호 1 7 8 > 1s
		 * 사용자 생성번호 1 3 2 > 1s 2b
		 * 사용자 생성번호 7 8 9 > out
		 * 사용자 생성번호 1 2 3 > 3s 정답
		 */
		
		//배열로 받아 번지수와 숫자 일치, 번지수가 안맞지만 숫자 일치
		Scanner scan = new Scanner(System.in);
		int com[] = new int[3];
		int user[] = new int[3];
		
		//중복되지않게 컴퓨터변수에 랜덤수 넣기
		for(int i=0; i<com.length; i++) { 
			com[i] = (int)(Math.random()*9)+1;
			for(int j=0; j<i; j++) {
				if(com[i]==com[j]) {
					j--;
					break;
				}
			}
		}
		for(int s : com) {
			System.out.println(s);
		}
		scan.close();
		

	}


}
