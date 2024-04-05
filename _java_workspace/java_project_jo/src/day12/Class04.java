package day12;

public class Class04 {
	/* static
	 * static이 붙은 메서드/멤버변수는 클래스 멤버변수/메서드라고 한다. 객체의 변수가 아닌 클래스의 변수임
	 * - 객체의 생성없이 클래스가 만들어지면 생성
	 * - 객체없이 클래스만으로 사용 가능
	 * - 클래스명.메서드 / 클래스명.멤버변수
	 * - 객체를 생성해서 호출도 가능하지만 그렇게 사용하지않음(굳이 필요가 없기때문) (노란밑줄:의미없음)
	 * - 클래스의 멤버변수/메서드는 하나의 멤버변수가 모든 객체에 공유(사용)할 때 사용함
	 * 
	 * static이 안붙은 메서드/멤버변수는 객체(인스턴스)의 멤버변수/메서드라고 한다.
	 * - 객체의 멤버변수/메서드는 객체를 통해서 생성되고 사용됨(객체를 만들지않으면 생성이 안됨)
	 * - 객체명.메서드 / 객체명.멤버변수
	 * - 각 개체마다 독립적인 객체 => ㄱ가 객체마다 독립적인 멤버변수, 메서드를 생성
	 * 
	 * - 클래스 / 객체는 생성시점이 달라서 메서드를 사용할 수 있는 환경이 다르다
	 * - 객체의 멤버는 클래스가 생성되고 난 후 객체를 생성할 수 있음
	 * - 클래스 멤버는 클래스의 멤버(변수/메서드) / 객체의 멤버(변수/메서드)에서 모두 사용될 수 있음
	 * - 객체의 멤버는 객체에서만 사용될 수 있음
	 */

	public static void main(String[] args) {
		//클래스 멤버에 접근하는 방식
		// TODO Auto-generated method stub
		//현 시점에서 BRAND는 이미 생성되어 있음(객체가 없어도 생성)
//		System.out.println(Tv.BRAND); //private은 접근권한이 없음
		Tv.printBrand(); //클래스명.메서드명();
		
		Tv t = new Tv(); //객체생성 시점에 객체멤버들이 생성됨
		t.printPower(); //객체메서드 사용 객체명.메서드명();
		t.printBrand(); //개체를 통해 클래스멤버에 접근할 수 있지만 그렇게 사용하지않음
	}
	
}

class Tv{
	private boolean power;
	private final static String BRAND="LG";

	//power를 출력하는 메서드
	public void printPower() {
		if(power) {
			System.out.println("TV가 켜졌습니다.");
		} else {
			System.out.println("TV가 꺼졌습니다.");
		}
		//객체메서드에서 클래스변수를 사용할 수 있음
		//클래스의 멤버는 어디서든 사용가능
		System.out.println("Brand: "+BRAND); //가능
	}
	
	public static void printBrand() {
		System.out.println("Brand: "+BRAND);
		//클래스메서드에서 객체 변수를 사용 불가능
//		System.out.println("power: "+power);
	}
	
}


