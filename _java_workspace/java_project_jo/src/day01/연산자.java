package day01;

public class 연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 대입연산자 : =, +=, -= .... =을 기준으로 오른쪽에 있는 값을 왼쪽의 변수에 저장
		 * 왼쪽의 값은 반드시 변수여야함
		 * a=b; 1=a;(x)
		 * a += 1; = > a=a+1; 기존값과 1을 더해서 저장하라는 의미
		 */

		int a = 10;
		int b = 5;
		a=b;
		System.out.println(a);

		a += 1;
		System.out.println(a);
		
		//증감연산자 : ++ (1증가) / -- (1감소)
		a++;
		System.out.println(a);
		System.out.println(a++);//출력 후 1증가
		System.out.println(++a);//1증가 후 출력
		
		/*산술연사자 : + - * / %(나머지)
		 * 정수 / 정수 = 정수 (10/3=3) 소수점을 버림
		 * 정수 / 실수 = 실수 (순서 상관x 실수가 하나라도 있으면 실수값 출력)
		 * 값 / 0 = > 예외발생(Exception)
		 * 자료형 double / 0 => infinity 발생
		 */
		
		System.out.println("3+2="+(3+2));
		System.out.println("3-2="+(3-2));
		System.out.println("3*2="+(3*2));
		System.out.println("3/2="+(3/2));
		System.out.println("3.0/0="+(3.0/0)); // infinity 발생
		System.out.println("3%2="+(3%2));
		
		/* 비교연산자 : 결과가 반드시 true / false
		 * >= 이상 / <= 이하 / > 초과 / < 미만 / == 같다 / != 같지않다
		 * 3 >= 5 -> false
		 * 
		 *  논리연산자 : a && b (and) 모두 true여야 true를 리턴
		 *  		  a || b (or) 둘 중 하나만 true여도 true를 리턴
		 *  		  !a (not) a 값을 반대로 리턴
		 */
		
		System.out.println("3>2 ? "+(3>2));
		System.out.println("3<2 ? "+(3<2));
		System.out.println("3==2 ? "+(3==2));
		System.out.println("3!=2 ? "+(3!=2));
		
		System.out.println("&& 연산자 :"+(3>2 && 4<3));
		System.out.println("|| 연산자 :"+(3>2 || 4<3));		
		
		
		/* 조건선택연산자(3항연산자)
		 * (조건식)? true : false;
		 */
		System.out.println((3>2)? "참입니다" : "거짓입니다");
		
		int num=15;
		System.out.println((num%2==0)? "짝수입니다" : "홀수입니다");
		
		String result = (num%2==0)? "짝수":"홀수";
		System.out.println(num+"는"+result);
		
	}

}
