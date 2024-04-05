package Sale_s;

import java.util.Scanner;

public class SaleMain {

	public static void main(String[] args) {
		/* menu
		 * 1.메뉴추가|2.메뉴삭제|3.메뉴수정(가격수정)
		 * 4.메뉴보기(전쳋메뉴출력)|5.주문|6.주문내역출력(영수증)
		 * 7.종료
		 */
		
		Scanner sc = new Scanner(System.in);
		SaleManager sm = new SaleManager();
		sm.addMenu1();
		
		int menu = 0;
		
		do {
			System.out.println("--menu--");
			System.out.println("1.메뉴추가|2.메뉴삭제|3.메뉴수정");
			System.out.println("4.메뉴보기|5.주문|6.주문내역출력");
			System.out.println("7.종료");
			System.out.println("선택 > ");
			menu = sc.nextInt();
			
			switch(menu) {
			case 1: sm.addMenu(sc); break;
			case 2: sm.delMenu(sc); break;
			case 3: sm.modMenu(sc); break;
			case 4: sm.printMenu(); break;
			case 5: 
				System.out.println("주문할 상품>");
				String name = sc.next();
				System.out.println("수량>");
				int count = sc.nextInt();
				sm.orderPick(name,count); break;
			case 6: sm.printOrder(); break;
			case 7: break;
			default:
				System.out.println("잘못된 메뉴");
				break;
			}
			
		} while(menu!=7);
		System.out.println("프로그램 종료");
		
		sc.close();

	}

}
