package day17;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Map02 {

	public static void main(String[] args) {
		/* 과목과 점수를 입력받아(Scanner) map에 저장 후 출력
		 * 합계, 평균을 출력
		 * 종료키워드가 나올때까지 반복 (1=계속 / 0=종료)
		 * 국어 89
		 * 수학 78
		 * 0 => 종료
		 */
	
		Scanner sc = new Scanner(System.in);
		HashMap<String,Integer> map = new HashMap<>();	
		int num =1; //종료키워드
		int sum = 0;
		
		//me
		while(num!=0) {
			System.out.println("과목/점수 입력 > ");
			String sub = sc.next();
			int zum = sc.nextInt();
			map.put(sub, zum);
//			sum += map.get(sub);
//			System.out.println("합계: "+sum+" / 평균: "+(sum/map.size()));		
			System.out.println("계속 : 1 / 종료 : 0");
			num = sc.nextInt();
		}
		
		//ssam
		Iterator<String> it = map.keySet().iterator();
		while(it.hasNext()) {
			String sub = it.next();
			int zum = map.get(sub);
			sum+=zum;
			System.out.println(sub+":"+zum);
		}
		System.out.println("합계: "+sum+" / 평균: "+(sum/map.size()));

		sc.close();
		
	}

}

