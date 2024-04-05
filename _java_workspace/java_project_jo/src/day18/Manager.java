package day18;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

//단어추가, 단어검색, 단어수정, 단어출력, 단어삭제
public class Manager{

	private HashMap<String,String> map = new HashMap<String,String>();
	
	public void addWord() {
		map.put("dog","강아지");
		map.put("cat","고양이");
		map.put("bird","새");
		map.put("tiger","호랑이");
		map.put("rion","사자");
	}

	public void insertWord(Scanner sc) { //단어등록
		System.out.println("단어: ");
		String word = sc.next();
		System.out.println("의미: ");
		String mean = sc.next();
		map.put(word,mean);
	}
	
	public void searchWord(Scanner sc) {
		System.out.println("검색할 단어> ");
		String word = sc.next();
		if(map.containsKey(word)) {
			System.out.println("검색결과");
			System.out.println(word+":"+map.get(word));
			return;
		}
		System.out.println("검색결과가 없습니다.");
	}
	
	public void changeWord(Scanner sc) {
		//map은 set이 없음 => remove해서 put을 다시해야함
		//key 중복 불가능 / put=> 덮어쓰기
		System.out.println("수정할 단어");
		String word = sc.next();
		if(map.containsKey(word)) {
			System.out.println("의미> ");
			String mean = sc.next();
			map.remove(word);
			map.put(word, mean);
			return;
		}
		System.out.println("수정할 단어가 없습니다.");
	}
	
	public void removeWord(Scanner sc) {
		System.out.println("삭제할 단어> ");
		String word = sc.next();
		String result = map.remove(word);
		if(result ==null) {			
			System.out.println("삭제할 단어가 없습니다.");
		}
	}
	
	public void printWord() {
		int count=0;
		Iterator<String> it = map.keySet().iterator();
		while(it.hasNext()) {
			String word = it.next();
			String mean = map.get(word);				
			count++;
			System.out.println(count+"번 "+word+":"+mean);
		}
	}
	
	public void printFile() throws IOException {
		//StringBuffer 객체
		//.append : 기존 String에 데이터를 추가
		FileWriter fw = new FileWriter("word.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		
		StringBuffer sb = new StringBuffer();
		//sb.append : 기존 String에 데이터 추가
		String data = null;
		sb.append("--단어장--");
		sb.append("\r\n");//줄바꿈
		
	
		for(String key : map.keySet()) {
			sb.append(key+":"+map.get(key)+"\r\n");
			sb.append("\r\n");
		}
		
		data = sb.toString();//STringBuffer 객체에서 String 객체로 변환
		System.out.println(data);
		bw.write(data);
		if(bw!=null) {
			bw.close();
		}
		if(fw!=null) {
			fw.close();
		}

		//me
//		for(String s : map.keySet()) {
//			fw.write(s+":"+map.get(s)+"\r\n");
//		}
	}
	

}
