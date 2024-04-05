package Sale_s;

import java.util.ArrayList;
import java.util.Scanner;

public class SaleManager {
	//메뉴를 저장하기 위한 리스트
	private ArrayList<Sale<String,Integer>> menu = new ArrayList<>();
	//주문을 저장하기 위한 리스트
	private ArrayList<Order> order = new ArrayList<>();
	
	//기본메뉴구성
	public void addMenu1() {
		menu.add(new Sale("햄버거",5000));
		menu.add(new Sale("물",1000));
		menu.add(new Sale("피자",15000));
		menu.add(new Sale("콜라",3000));
		menu.add(new Sale("과자",2000));
	}

	public void addMenu(Scanner sc) {
		System.out.println("메뉴와 가격 입력 >");
		String menu = sc.next();		
		int price = sc.nextInt();

	}

	public void delMenu(Scanner sc) {
		System.out.println("삭제할 상품명>");
		String name = sc.next();
		
		for(int i=0; i<menu.size(); i++) {
			if(menu.get(i).getMenu().equals(name)) {
				//remove 방법 2가지
				//list.remove(index) / list.remove(Object)
				menu.remove(i); //i번지의 객체삭제
				//menu.remove(menu.get(i)) //객체(Object)를 삭제
				System.out.println("삭제완료");
				return;
			}
		}
		System.out.println("상품이 없습니다.");
		
	}

	public void modMenu(Scanner sc) {
		// TODO Auto-generated method stub
		
	}

	public void printMenu() {//메뉴출력
		System.out.println("----menu----");
		for(Sale s : menu) {
			System.out.println(s);
		}
		System.out.println("------------");
		
	}

	public void orderPick(String name, int count) {
		// TODO Auto-generated method stub
		
	}

	public void printOrder() {
		// TODO Auto-generated method stub
		
	}

}
