package new01;

import java.util.HashMap;
import java.util.Scanner;

public class New04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 단어장
		 * 단어 : 의미
		 * map으로 생성
		 * 입력받을 단어의 개수를 입력받아 개수만큼 map에 추가
		 * 콘솔에 출력
		 */
		
		Scanner sc = new Scanner(System.in);
		HashMap<String, String> map = new HashMap<>();
		
		System.out.print("추가할 단어의 개수를 입력해주세요");
		int num = sc.nextInt();
		for(int i=0; i<num; i++) {
			System.out.println();
			System.out.print("단어 : ");
			String voca = sc.next();
			System.out.print("뜻 : ");
			String mean = sc.next();
			map.put(voca, mean);
		}
		
		System.out.println();
		for(String temp : map.keySet()) {
			System.out.println(temp +" : "+map.get(temp));
		}
		
		sc.close();
	}

}
