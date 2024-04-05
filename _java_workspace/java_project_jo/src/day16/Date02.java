package day16;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Date02 {

	public static void main(String[] args) {
		LocalDateTime today = LocalDateTime.now(); //형식이 LocalDateTime
		System.out.println(today);
		System.out.println(today.getYear());
		String t = today.toString(); //toString() 스트링으로 객체를 변환
		System.out.println(t); //형식이 스트링
		//날짜 2024-01-26 /  시간 17:03:34
		System.out.println("날짜 "+ t.substring(0, t.indexOf("T")));
		System.out.println("시간 "+ t.substring(t. indexOf("T")+1));
		
		String date = t.substring(0,t.indexOf("T"));
		System.out.println(date);
		String time = t.substring(t.indexOf("T")+1, t.indexOf("."));
		System.out.println(time);
		System.out.println(date + " / " + time);
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd hh:mm:ss");
		System.out.println(dtf.format(today));
		
		LocalDateTime sDate = LocalDateTime.of(1999,11,6,1,30);
		System.out.println(sDate.format(dtf));
	}

}
