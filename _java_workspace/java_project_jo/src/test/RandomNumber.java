package test;

import java.util.Scanner;

public class RandomNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("난수의 개수를 입력하세요 : ");
		int num = sc.nextInt();
		int sum = 0;
		
		for(int i=0; i<=num; i++) {
			sum+=i;
		}
		System.out.println("난수 "+num+"개의 합은 "+sum);
		
		
		sc.close();
	}

}
