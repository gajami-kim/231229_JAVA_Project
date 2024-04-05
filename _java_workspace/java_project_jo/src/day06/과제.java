package day06;

import java.util.Scanner;

public class 과제 {

	public static void main(String[] args) {
		/* 숫자를 입력받아서 받은 숫자를 거꾸로 출력. 각자리의 합계 출력
		 * ex) 11456 => 출력 65411 => 6+5+4+1+1=>합계출력
		 * ex) 19874 => 출력 47891 => 4+7+8+9+1=>합ㄴ계출력
		 */
		Scanner scan = new Scanner(System.in);
		
		System.out.println("숫자를 입력해주세요 > ");
		
		int arr[] = new int[5];
		int sum = 0; //입력받은 숫자의 합계를 저장할 변수
		
		//숫자를 입력받음, 입력받은 숫자를 sum변수에 더하는것까지
		for(int i=0; i<arr.length; i++) {
			arr[i] = scan.nextInt();
			sum += arr[i];
		}
		for(int s : arr) {
			System.out.print(s+" ");
		}
		System.out.println();
		System.out.println("--정렬--");
		
		//숫자를 내림차순 정렬
		for(int i=0; i<arr.length-1; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]<arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		//정렬한 배열을 출력, 합계 sum을 출력
		for(int s : arr) {
			System.out.print(s+" ");
		}
		System.out.println();
		System.out.println("합계 : "+sum);
		
		
		scan.close();
	}

}
