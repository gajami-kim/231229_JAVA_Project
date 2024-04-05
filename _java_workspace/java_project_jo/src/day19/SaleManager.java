package day19;

import java.util.ArrayList;
import java.util.Scanner;

public class SaleManager {
	//제네릭클래스처리
	private ArrayList<Sale<String, Integer>> menu = new ArrayList<>();
	private ArrayList<Sale<String, Integer>> order = new ArrayList<>();
	
	public void add(Scanner sc) { //제품추가
		System.out.println("제품명>");
		String menu = sc.next();
		System.out.println("가격>");
		int price = sc.nextInt();
		
		//객체생성 후 추가 잊지말기~
		this.menu.add(new Sale<String, Integer>(menu, price));
		System.out.println("추가완료");
	}

	public void menuPrint() { //제품출력
		for(Sale<String, Integer> s : menu) {
			System.out.println(s);
		}
	}

	public void orderPick(String name, int num) {
		//입력받는 값은 제품명, 수량
		//제품명, 가격*수량(지불금액)을 order에 추가
		//햄버거 5개 => 햄버거 25000 추가
				
		for(int i=0; i<this.menu.size(); i++) {
			String ProductMenu = this.menu.get(i).getMenu();
			int ProductPrice = this.menu.get(i).getPrice();
			if(ProductMenu.equals(name)) { 
				int index = orderSearch(name);
				if(index != -1) { //order에 같은 제품이 있다면			
					int price = order.get(index).getPrice();
					order.get(index).setPrice(price+(ProductPrice*num));
					return;
				}
			}
			//주문한적 없는 메뉴일 경우
			Sale p = new Sale(ProductMenu, (ProductPrice*num));
			order.add(p);
		}
		
	}
	
	public int orderSearch(String name) {
		//name은 주문메뉴
		int index = -1; //번지는 0번지부터 시작이라 값을 -1을로 줌
		for(int i=0; i<order.size(); i++) {
			if(order.get(i).getMenu().equals(name)) {
				index = i;
				System.out.println(index);
				return index;
			}
		}
		return index;
	}

	public void orderPrint() {
		int sum = 0;
		for(Sale s : order) {
			System.out.println(s);
			sum+=(int)s.getPrice();
		}
		System.out.println("총 지불금액:" +sum);
	}
	
	
}
