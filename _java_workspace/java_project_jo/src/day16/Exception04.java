package day16;

public class Exception04 {

	public static void main(String[] args) {
		/* 멀티 캐치 구문, 다중 캐치 구문
		 * try {
		 * 
		 * } catch(예외클래스명1 객체) {
		 * 
		 * } catch(예외클래스명2 객체) {
		 * 
		 * }
		 * 예외를 구체적으로 세분화해서 잡고 싶을 때 => 멀티캐치
		 * 
		 * Exception => 모든 예외의 최고조상(default)
		 * 어떤 예외가 발생하던 다 캐치(Exception)
		 */
		double res = 0;
		try {
		
			res = 1/0;
			
			int arr[] = null;
			arr[1] = 3;
			
			int arr1[] = new int[3];
			arr1[5] = 1;
		
		} catch (ArithmeticException | NullPointerException e) { // a | b => a 또는 b
			System.out.println("0으로 나누었거나 null값입니다.");
		} //catch (NullPointerException e) {
			//System.out.println("객체가 null입니다.");
		 catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열의 범위를 벗어났습니다.");
		} catch (Exception e) { //최고조상이기 때문에 가장 마지막에 처리되어야함
			e.printStackTrace();
		}
		
		System.out.println("종료");

	}

}
