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
public class Card {

	private char shape;
	private int num;
	
	//값을 가지는 기본생성자
	public Card() {
		this.shape='♥'; 
		this.num=1;
	}
	
	//출력
	public void print() {
		if(getShape()!='♥' && getShape()!='◆' && getShape()!='♠' && getShape()!='♣') {
			shape='♥';
			System.out.print(shape);
		} else {
			System.out.print(shape);
		}
		if(1<=getNum() || getNum()<=10) {
			if(getNum()==11) {
				System.out.println('J');
			} else if(getNum()==12) {
				System.out.println('Q');
			} else if(getNum()==13) {
				System.out.println('K');
			} else if(getNum()<0 || getNum()>13) {
				num=1;
				System.out.println(num);
			} else {
				System.out.println(num);
			}
		}
	}

	
	//getter/setter
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public char getShape() {
		return shape;
	}

	public void setShape(char shape) {
		this.shape = shape;
	}
	
	
}



