package day11;

/* CardPack 클래스
 * - ♥1~ ♥K / ◆1~ ◆K / ♣1~ ♣K / ♠1~ ♠K
 * - 총 카드수 52장
 * - 52장의 카드 한묶음(배열)
 * 
 * - 카드 출력기능 -> Card class print() 사용
 * - 카드 초기화기능 / 52장의 카드가 들어있는(CardPack 생성자)
 * - 카드 한장을 빼내는 기능 => 출력
 * - 카드 섞는 기능
 * 
 */
public class CardPack {
	//int arr[] = new int[52]; //int : 배열안에 들어가는 자료의 형태
	//카드 52장이 들어갈 수 있는 배열을 생성
	private Card_ssam[] pack = new Card_ssam[52];
	private int cnt=0; //카드배열의 index 위치를 체크하기 위한 변수	
	
	public CardPack() {
		//CardPack 클래스를 생성하면 52장의 카드가 생성되어야 함
		//숫자 : 1-10,J(11),Q(12),K(13)
		//모양 : ♥,◆,♠,♣
		char shape = '♥';
		for(int i=1; i<=4; i++) { //4가지 모양을 넣기위한 for문
			switch(i) {
			case 1: shape = '♥'; break;
			case 2: shape = '◆'; break;
			case 3: shape = '♣'; break;
			case 4: shape = '♠'; break;
			}
			for(int j=1; j<=13; j++) { //13까지 숫자를 넣기위한
				Card_ssam c = new Card_ssam(); //새로운 카드 1장을 생성
				c.setShape(shape);
				c.setNum(j); //♥1 카드 생성됨
				pack[cnt] = c;
				cnt++; //52번지
			}
		}
	}
	
	//카드를 섞는 기능
	//shuffle()
	//리턴타입:void, 매개변수:x
	public void shuffle() {
		for(int i=0; i<pack.length; i++) {
			int random = (int)(Math.random()*pack.length);
			Card_ssam temp = pack[i];
			pack[i] = pack[random];
			pack[random] = temp;
		}
	}
	
	
	//카드 한장을 빼내는 기능
	//pick() : 카드가 리턴되어야함
	//리턴타입:카드?, 매개변수:x
	public Card_ssam pick() {
		cnt--; //가장 위에 있는 카드를 뽑기위해 51번지 카드를 불러옴
		return pack[cnt];			
	}
	
	
	
	//getter/setter
	public Card_ssam[] getPack() {
		return pack;
	}

	public void setPack(Card_ssam[] pack) {
		this.pack = pack;
	}
	
	
	
	
}
