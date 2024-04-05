package test;

public class Card2_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Card2 c = new Card2();
		CardPack2 cp = new CardPack2();
		c.setNum(1);
		c.setShape('♥');
		c.print();
		System.out.println();
		System.out.println("----카드팩 전체 출력----");
		cp.print();
	}

}
