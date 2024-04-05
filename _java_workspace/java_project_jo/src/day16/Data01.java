package day16;

import java.util.Calendar;
import java.util.Date;

public class Data01 {

	public static void main(String[] args) {
		/* 날짜/시간 클래스
		 * Date 클래스 => Deprecated(비권장) / Calendar 클래스
		 * Calendar : 추상클래스 => 추상클래스는 객체를 생성할 수 없음
		 * 추상클래스를 구현한 객체를 이용하여 사용
		 * new로 객체 생성 불가능
		 * getInstance()메서드를 이용하여 객체를 얻어옴 => static메서드 / 클래스명.메서드명()
		 */
		
//		Date d = new Date();
//		Calendar c = new Calendar();
		Calendar c = Calendar.getInstance();//오늘날짜리턴
		int year = c.get(Calendar.YEAR);
		System.out.println(year);
		//월 0-11까지 존재 +1표현
		int month = c.get(Calendar.MONTH)+1;
		System.out.println(month);
		int day = c.get(Calendar.DAY_OF_MONTH);
		System.out.println(day);
		int week = c.get(Calendar.DAY_OF_WEEK); //일~토
		System.out.println(week);
		
		System.out.println(year+"-"+month+"-"+day);
		
		//hour, minute, second, am_pm
		int hour = c.get(Calendar.HOUR);
		System.out.println(hour);
		int minute = c.get(Calendar.MINUTE);
		System.out.println(minute);
		int second = c.get(Calendar.SECOND);
		System.out.println(second);
		int am_pm = c.get(Calendar.AM_PM);
		System.out.println(am_pm);
		
		//2024-1-26(금)
		//오후 4:13
		//me
		String week1 = String.valueOf(week);
		switch(week) {
		case 1: week1="일"; break;
		case 2: week1="월"; break;
		case 3: week1="화"; break;
		case 4: week1="수"; break;
		case 5: week1="목"; break;
		case 6: week1="금"; break;
		case 7: week1="토"; break;
		}
		
		String am_pm1 = String.valueOf(am_pm);
		if(am_pm==1) {
			am_pm1 = "오후";
		} else if(am_pm==0) {
			am_pm1 = "오전";
		}
		
		//ssam
		String weekStr = null;
		switch(week) {
		case 1: weekStr="일"; break;
		case 2: weekStr="월"; break;
		case 3: weekStr="화"; break;
		case 4: weekStr="수"; break;
		case 5: weekStr="목"; break;
		case 6: weekStr="금"; break;
		case 7: weekStr="토"; break;
		}
		System.out.println(weekStr);
		System.out.println((am_pm==0?"오전":"오후"));
		
		System.out.println(year+"-"+month+"-"+day+"("+week1+")");
		System.out.println(am_pm1+" "+hour+":"+minute+":"+second);
	}

}
