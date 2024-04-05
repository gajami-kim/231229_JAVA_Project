package day01;

public class 변수 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			/* 변수 선언
			 * 자료형(타입) 변수명;
			 * 
			 * 변수선언 + 초기화;
			 * 자료형(타입) 변수명 = 값;
			 */
		
		int num = 123; //선언+초기화
		System.out.println(num);
		
		//int num = 456; //변수는 중복선언x

		int num1= 12, num2 = 34, num3 = 56; //같은자료형은 한줄로 선언 가능
		
		System.out.println(num1);
		
		num1 = 78; // =은 대입연산자 오른쪽의 값을 왼쪽의 변수에 저장하는 역할(덮어쓰기)
		System.out.println(num1);
		
		// 8개의 기본 자료형은 지역변수, 이런 지역변수의 범위(scope) {중괄호} 안에서만 가능
		// main 안에서 선언되는 변수들이 지역변수
		
		/* 한글자만 저장가능한 char 자료형 작은따옴표안에 작성 'a'
		 "문자열", 숫자
		 String = "문자열";
		 char = 'a(한글자)';
		*/
		
		char ch = 'a';
		System.out.println(ch);
		
		double dou = 3.1;
		System.out.println(dou);
		
		byte b = 1;
		System.out.println(b);
		
		boolean boo = true; // true, false 만으로 작성가능 
		System.out.println(boo);

		// float / long 자료형은 접미사를 붙여야 사용가능
		//float(f F) long(l L) long은 보통 숫자1과 구별을 위해 대문자 사용
		
		float f = 1.2f;
		long l = 1L;
		System.out.println(f);
		System.out.println(l);
		
		num1 = 010; //숫자앞에 0을 붙이면 8진수로 인식(0~7 8=>10을 의미)
		// 10진수 (0~9 10=>10) / 16진수 (0~15 10=>16 10~15(A~F))
		System.out.println(num1);
		
		num2 = 0x10; //16진수로 인식
		System.out.println(num2);
		
		// + - * / %(나머지)
		
		num1 = 10;
		num2 = 20;
		System.out.println(num1+num2);
		
		int kor=80, eng=75, math=90;
		System.out.println(kor+eng+math);
		int sum = kor+eng+math;
		System.out.println("합계:"+sum);
		// + : 숫자+숫자 = 숫자(더하기연산자)
		// + : 숫자+문자 = 문자(연결연산자)
		System.out.println((kor+eng+math)/3);
		System.out.println("평균:"+sum/3.0); // 정수/정수는 정수의 값을 나타냄, 실수값을 원한다면 값 중 하나라도 실수가 있어야함
		
		int a = 10;
		a += 10;
		System.out.println(a);
		
	}

}
