package day16;

public class Exception01 {

	public static void main(String[] args) {
		/* Exception : 예외처리
		 * 개발자가 코드 구현 시 발생할 수 있는 예외를 처리하는 구문
		 * 예외가 발생하면 예외발생시점부터 코드는 중지 => 예외문구를 출력
		 * 예외처리 : 예외가 발생할 수 있는 값만 빼고, 나머지는 정상처리로 유지시키는 기능
		 * 예외 / 에러(시스템상에서 발생하는 에러: 개발자가 처리할 수 없음)
		 * try ~ catch
		 * try ~ catch ~ finally
		 * try : 예외가 발생할 가능성이 있는 구문 작성
		 * catch : try구문에서 발생한 예외를 처리하는 구문
		 * finally : try구문 외 반드시 실행되어야하는 구문을 작성(없으면 사용x)
		 */
		
		try{
			System.out.println(1);
			System.out.println(2);
			System.out.println(1/0); //exception 발생
			System.out.println(3); //exception 발생 이후는 실행x
			System.out.println(4); //실행x
		} catch(Exception e) { //발생한 예외를 처리할 객체 e
			e.printStackTrace(); //실제 예외 구문을 콘솔에 출력
			System.out.println("예외가 발생했습니다.");
		}
		
		//Exception이 발생해도 처리됨
		System.out.println(5);
		System.out.println(6);
	}

}
