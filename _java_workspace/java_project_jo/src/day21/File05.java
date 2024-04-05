package day21;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class File05 {

	public static void main(String[] args) throws IOException {
		// test.txt 파일을 읽어들여 map에 저장하여
		// 공백을 기준으로 앞을 이름 뒤는 점수 떼서 map에 저장 for문으로 출력
		// 명단, 합계, 평균을 출력
		// txt에서 읽어들이는 값은 모두 String
		// 계산을 위해서는 int 자료형으로 변환이 필요
		// Integer.parseInt(); String -> int로 변환
		
		BufferedReader br =
				new BufferedReader(new FileReader("test.txt"));
		
		HashMap<String,Integer> map = new HashMap<>(); //선언도 while문 밖에서 !!
		int sum = 0;
		double avg = 0;
		
		while(true) {
			String line = br.readLine();
			if(line ==null) {
				break;
			}
			//line이 null이 아니라면
			//substring(포함,미포함);
			String name = line.substring(0,line.indexOf(" "));
			int score = Integer.parseInt(line.substring(line.indexOf(" ")+1));
			map.put(name, score);
//			String score = line.substring(line.indexOf(" "));
//			map.put(name, Integer.parseInt(score));

		}

		for (String key : map.keySet()) { //출력부턴 while문안에서 반복되지 않도록해야함
			System.out.println(key+": "+map.get(key));
			sum+=map.get(key);
		}
		
		avg = sum/map.size();
		System.out.println("합계:"+sum+" / 평균:"+avg);
		
		//br끊기
//		br.close();
		if(br!=null) { //객체가 생성되었다면 끊기(이미 close가 되었다면 또 close 하지마라)
			br.close();
		}
	}

}
