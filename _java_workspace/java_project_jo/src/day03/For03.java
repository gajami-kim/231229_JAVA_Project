package day03;

import java.util.Scanner;

public class For03 {

	public static void main(String[] args) {
		/* 약수 : 나누어서 떨어지는 수의 집합
		 * 6의 약수 : 6%1=0 6%2=0 6%3=0 6%4 6%5 6%6=0 => 1,2,3,6
		 */
		
		int num = 6;
		
		// num를 1~num까지 나눈 나머지가 0인 수를 출력
		for(int i=1; i<=num; i++) {
			if(num%i==0) {
				System.out.print(i+" ");
			}
		}
		System.out.println();
		
		//num1을 입력받아서 약수를 출력
		Scanner scan = new Scanner(System.in);
		
		System.out.println("숫자(정수)를 입력해주세요");
		int num1 = scan.nextInt();
		
		for(int i=1; i<=num1; i++) {
			if(num1%i==0) {
				System.out.print(i+" ");
			}
		}
	
		
		
		scan.close();
	}

}
