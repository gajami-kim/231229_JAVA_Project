package day19;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Generics01 {

	public static void main(String[] args) {
		// 제네릭(Generics) : 데이터의 타입을 나중에 확정하는 기법
		// 클래스나 메서드를 선언할 때 어떤 데이터가 들어올지 확신이 없다면,
		// 제네릭 타입으로 구현 => 나중에 객체를 생성할 때 타입을 확정
		
		// 객체의 타입을 컴파일 할 때 체크할 수 있어서 타입의 안정성을 해치치 않는 선에서
		// 적당히 형변환이 가능한 기법
		// 안정성 - 의도하지 않은 타입의 객체가 저장되는 것을 막음
		
//		List<String> list = new ArrayList<E>();
//		HashMap<String, String> map = new HashMap<K, V>(); //key/value
		
		/* Sale 클래스 생성 - main
		 * 1.제품추가|2.제품리스트보기|3.제품주문|4.주문내역보기|5.종료
		 * 제품리스트, 주문내역확인하는 리스트
		 */
		
		Scanner sc = new Scanner(System.in);
		SaleManager sm = new SaleManager();
		
		int menu = 0;
		
		do {
			System.out.println("--menu--");
			System.out.println("1.제품추가|2.제품리스트보기|3.제품주문|4.주문내역보기|5.종료");
			System.out.println("선택 > ");
			menu = sc.nextInt();
			
			switch(menu) {
			case 1: sm.add(sc); break;
			case 2: sm.menuPrint(); break;
			case 3: 
				System.out.println("주문할 제품>");
				String name  = sc.next();
				System.out.println("수량>");
				int num = sc.nextInt();
				sm.orderPick(name,num); 
				break;
			case 4: sm.orderPrint(); break;
			case 5: break;
			default:
				System.out.println("잘못된 메뉴");
				break;
			}
			
		} while(menu!=5);
		System.out.println("프로그램종료");
		
		
		
		
		
		
		
		
		
		sc.close();
		
	}

}
