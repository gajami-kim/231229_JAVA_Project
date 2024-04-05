package day07;

public class StringEx01 {

	public static void main(String[] args) {
		/* file에 저장되어 있는 문자를 file명과 확장자로 분리하여 출릭
		 * 파일명 : 이것이자바다
		 * 확장자 : java
		 */
		
		String file = "이것이자바다.java";
		
		int a = file.indexOf(".");
		int b = file.indexOf(".")+1;
		
		String name = file.substring(0,a);
		String h = file.substring(b);
		
		System.out.println("파일명 : "+name);
		System.out.println("확장자 : "+h);
		
		System.out.println("---한줄로 나누기---");
		System.out.println(file.substring(0,file.indexOf(".")));
		System.out.println(file.substring(file.indexOf(".")+1));
		
		System.out.println("---split으로 나누기---");
		String[] arr = file.split("[.]");
		for(String s : arr) {
			System.out.println(s);
		}
		
		if(file.contains("java")); {
			System.out.println("자바파일입니다.");
		}
		
		
	}

}
