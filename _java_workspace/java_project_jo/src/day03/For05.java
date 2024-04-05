package day03;

public class For05 {

	public static void main(String[] args) {
		/* 약수 : 1부터 자기자신까지 나누어서 떨어지는 수
		 * 6의 약수 : 6/%1=0 6%2=0 6%3=0 6%4 6%5 6%6=0 => 1,2,3,6
		 * 12의 약수 : 1,2,3,4,6,12
		 * 두 수의 공약수 : 1,2,3,6
		 * 공약수 중 가장 큰 값 최대공약수 : 6
		 */
		
		int num1 = 6;
		int num2 = 12;
		
		for(int i=1; i<=num1; i++) {
			if(num1%i==0 && num2%i==0) {
//				System.out.print(i+" ");
				System.out.println(num1);
			}
		}
	}

}
