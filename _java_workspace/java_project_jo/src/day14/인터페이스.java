package day14;

public class 인터페이스 {

	public static void main(String[] args) {
		/* 인터페이스 : 추상메서드와 상수(final)로만 이루어진 것
		 * 추상메서드 : 메서드의 선언부만 있고, 구현부가 없는 메서드
		 * 추상클래스 / 인터페이스 => 반드시 구현을 해야 객체를 생성할 수 있음
		 * 
		 * 인터페이스 키워드 : interface
		 * - 기능요약서 : 메뉴얼 화
		 * - 자체적으로 사용할 수 없고, 인터페이스를 구현한 클래스로 활용
		 * - 구현 키워드 : implements
		 * - 인터페이스는 멤버변수가 없음, 이 부분을 염두에 두고 메서드 정리가 필요함
		 * 
		 * - 상속 : 다중상속 불가능
		 * - 구현 : 다중구현 가능
		 * - 상속 + 구현은 동시에 가능
		 */
		Tv t = new Tv();
		t.trunOn();
		t.chUp();
		t.chUp();
		t.chUp();
		t.chUp();
		t.chDown();
		t.trunOff();
		t.trunOn();
		t.volUp();
		t.volUp();
		t.volDown();
		t.trunOff();
	}

}

interface Power {
	abstract void trunOn(); //전원을 키는 메서드
	abstract void trunOff(); //전원을 끄는 메서드	
}

interface Remocon {
	void volUp(); //abstract 생략가능
	void volDown();
}

//상속받으면서 인터페이스를 구현할 때(거의없음)
//class Tv extends 부모 implements 인터페이스명{ }


//인터페이스 구현
class Tv implements Power, Remocon { //인터페이스를 구현한 클래스 / 다중구현
	
	private boolean power;
	private int ch;
	private int vol;
	
	//인터페이스 구현한 구현체
	@Override
	public void trunOn() { //전원켜기
		power = true;
		System.out.println("전원이 켜졌습니다.");
	}

	@Override
	public void trunOff() { //전원끄기
		power = false;
		System.out.println("전원이 꺼졌습니다.");
	}
	
	//내가 만든 클래스
	public void chUp() {
		if(power) {
			ch++;
			System.out.println("ch: "+ch);
		}
	}
	
	public void chDown() {
		if(power) {
			ch--;
			System.out.println("ch: "+ch);
		}
	}

	@Override
	public void volUp() {
		if(power) {
			vol++;
			System.out.println("vol: "+vol);
		}
	}

	@Override
	public void volDown() {
		if(power) {
			vol--;
			System.out.println("vol: "+vol);
		}
	}
}
















