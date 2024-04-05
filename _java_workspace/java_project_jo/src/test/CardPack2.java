package test;

public class CardPack2 {

	private Card2[] pack = new Card2[52];
	private int cnt;
	
	public CardPack2() {
		char shape = '♥';
		for(int i=1; i<=4; i++) {
			switch(i) {
			case 1: shape = '♥'; break;
			case 2: shape = '◆'; break;
			case 3: shape = '♣'; break;
			case 4: shape = '♠'; break;
			}
			for(int j=1; j<=13; j++) {
				Card2 c = new Card2();
				c.setShape(shape);
				c.setNum(j);
				pack[cnt] = c;
				cnt++;
			}
		}
	}
	
	public void print() {
		cnt = 0;
		for(int i=0; i<4; i++) {
			for(int j=0; j<13; j++) {
				pack[cnt].print();
				cnt++;
			}
		}
	}
	

	public Card2[] getPack() {
		return pack;
	}

	public void setPack(Card2[] pack) {
		this.pack = pack;
	}
	
	
	
}
