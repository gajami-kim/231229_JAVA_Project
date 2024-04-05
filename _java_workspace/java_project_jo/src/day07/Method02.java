package day07;

public class Method02 {

	public static void main(String[] args) {
		// + - * / %
		//main에서 호출하여 확인
		
		System.out.println(sum(10,20));
		System.out.println(sub(15,30));
		System.out.println(mul(9,7));
		System.out.println(div(30,8));
		System.out.println(mod(70,3));
		
	}
	
	//메서드 선언 위치
	//두 정수의 합을 알려주는 메서드 sum
	public static int sum(int num1, int num2) {
		return num1+num2;
	}
	//두 정수의 차를 알려주는 메서드 sub
	public static int sub(int num1, int num2) {
		return num2-num1;
	}
	//두 정수의 곱을 알려주는 메서드 mul
	public static int mul(int num1, int num2) {
		return num1*num2;
	}
	//두 정수의 몫을 알려주는 메서드 div
	public static double div(int num1, int num2) {
		return num1/(double)num2;
	}
	//두 정수의 나머지을 알려주는 메서드 mod
	public static int mod(int num1, int num2) {
		return num1%num2;
	}

}
