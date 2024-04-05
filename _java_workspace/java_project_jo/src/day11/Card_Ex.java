package day11;

public class Card_Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Card c = new Card();
		Card_ssam s = new Card_ssam();
//		c.print(); //기본값
//		c.setNum(7);
//		c.setShape('◆');
//		c.print();
//		c.setNum(14);//설정값을 벗어난 num과 shape일때
//		c.setShape('$');
//		c.print();
//		
//		s.print(); //기본값
//		s.setNum(7);
//		s.setShape('◆');
//		s.print();
//		s.setNum(2);
//		s.setShape('♣');
//		s.print();
//		s.setNum(13);
//		s.setShape('♠');
//		s.print();
//		s.setNum(14);//설정값을 벗어난 num과 shape일때
//		s.setShape('$');
//		s.print();
		CardPack cp = new CardPack(); // 52장의 카드가 모두 생성됨
		int cnt=0;
//		for(int i=0; i<4; i++) {
//			for(int j=0; j<13; j++) {
//				cp.getPack()[cnt].print();
//				//cp.getPack : CardPack 클래스 안에 있는 pack[]
//				//cp.getPack()[cnt] : pack[0] => Card_ssam(멤버변수, 메서드)
//				//cp에 있는 배열 pack 안에 있는 0번지 -> pack안에 있는 card_ssam안에 프린트 메서드를 출력
//				cnt++;
//			}
//			System.out.println();
//		}
		
		cp.shuffle(); //셔플
		cp.pick().print();
		

	}

}
