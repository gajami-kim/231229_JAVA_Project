package day11;

/* 1장의 카드를 생성하기 위한 클래스
 * - 숫자 : 1-10,J(11),Q(12),K(13)
 * - 모양 : ♥,◆,♠,♣
 * - 한장의 카드를 출력하는 기능 print() => 출력 : ♥1
 * ex) ◆12 => ◆Q / ♣13 => ♣K, %2(설정되지않은모양) => ♥2, &15(설정값을벗어나는값) => ♥1
 * 입력은 setter에서
 */
/* 클래스의 구성
 * - 멤버변수 : 모양(shape), 숫자(num) => private => getter/setter
 * - 메서도 : print() / 11-13을 알파벳으로 바꾸는건 print에서
 * - 생성자 : 기본생성자 => ♥1
 */
public class Card_ssam {
	
	private int num;
	private char shape;
	
	//생성자
	public Card_ssam() {
		this.num = 1;
		this.shape = '♥';
	}
	
	public void print() {
		System.out.print(shape);
		switch(num) {
		case 11:
			System.out.print("J ");
			break;
		case 12:
			System.out.print("Q ");
			break;
		case 13:
			System.out.print("K ");
			break;
		default:
			System.out.print(num+" ");
		}
	}

	
	//getter/setter
	public int getNum() {
		return num;
	}
	
	//외부의 값(매개변수)으로 내부변수(멤버변수)를 변경할 때 사용하는 메서드
	public void setNum(int num) {
		//1-13까지만 내 숫자, 그 외는 1로 설정
		if(num<1 || num>13) {
			this.num =1;
		} else {
			this.num = num;
		}
	}

	public char getShape() {
		return shape;
	}

	public void setShape(char shape) {
		this.shape = shape;
		//♥,◆,♠,♣가 아닌 모양은 전부 ♥
		switch(shape) {
		case '♥': case '◆': case '♠': case '♣':
			this.shape = shape;
			break;
			default:
				this.shape='♥';
		}
	}

}
