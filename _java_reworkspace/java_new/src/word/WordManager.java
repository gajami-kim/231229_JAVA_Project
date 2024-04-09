package word;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class WordManager {
	
	HashMap<String, String> map = new HashMap<>();
	ArrayList<Word> list = new ArrayList<>();
	
	public void addWord(Scanner sc) {
		System.out.print("단어:");
		String word = sc.next();
		System.out.print("뜻:");
		String mean = sc.next();
		map.put(word, mean);
		System.out.println("단어 추가 완료");
		System.out.println();
		
	}
	public void searchWord(Scanner sc) {
		System.out.print("검색할 단어 > ");
		String search = sc.next();
		if(map.containsKey(search)) {
			System.out.println(search+":"+map.get(search));
			return;
		}
		System.out.println("검색결과가 없습니다.");
	}
	
	public void printWord() {
		for(String key : map.keySet()) {
			System.out.println(key+":"+map.get(key));
		}
	}
	
	public void modWord(Scanner sc) {
		System.out.println("수정할 단어");
		String word = sc.next();
		if(map.containsKey(word)) {
			System.out.println("수정할 뜻");
			String modmean = sc.next();
			map.put(word, modmean);
			System.out.println("수정완료");
			return;
		}
		System.out.println("수정할 단어가 없습니다.");
	}
	
	public void fileWord() throws IOException {
			FileWriter writer = new FileWriter("voca.txt");
			BufferedWriter bw = new BufferedWriter(writer);
			StringBuffer sb = new StringBuffer();
			
			String data = "";
			int cnt = 0;
			
			while(cnt<map.size()) {
				sb.append(map.get(cnt).toString()); //list로 바꿔서 다시 만들어보기
				sb.append("\r\n"); //줄바꿈
				cnt++;
			}
			data = sb.toString();
			System.out.println(data);
			writer.write(data);
			bw.close();
			writer.close();
			
//			for(String key : map.keySet()) {
//				writer.write(key);
//				writer.write(map.get(key));
//			}
//			writer.close();
//			System.out.println("파일로 출력하였습니다.");
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
	}

}