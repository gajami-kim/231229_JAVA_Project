package day07;

import java.util.Scanner;

public class StringEx02 {

	public static void main(String[] args) {
		/* 5개의 파일명이 주어졌을 때,
		 * 검색어를 입력하면 해당 단어를 포함하는 파일을 출력
		 */
		
		String[] fileName = {"이것이자바다.java", "java의정석.java","String.jpg","String 메서드.txt", "array.txt"};
		
		// ex) java => 이것이자바다.java / java의정석.java
		//String => String.jpg / String 메서드.txt
		//txt => String 메서드.txt / array.txt
		//스트링 => 검색결과가 없습니다.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("검색어를 입력해주세요");
		String s = scan.next();
		
		int count=0;
		System.out.println("검색어 : "+s+"");
		//향상된 for문을 이용해 빈 변수에 배열값을 넣고 해당 변수를 조건에 넣어 검색
		for(String tmp : fileName) {
			if(tmp.contains(s)) {
			System.out.println(tmp);
			count++;
			}
		}
		if(count==0) {
			System.out.println("검색결과가 없습니다.");
		}
		
		
		scan.close();
		
	}

}
