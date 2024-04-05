package Sale;

import java.util.ArrayList;
import java.util.Scanner;

import day19.Sale;

public class SaleManager {

	private ArrayList<Sale<String,Integer>> menu = new ArrayList<>();
//	private ArrayList<Order<String,Integer>> order = new ArrayList<>();
	private ArrayList<Order<Integer,Integer>> order1 = new ArrayList<>();
	
	
	public void addMenu1() {
		menu.add(new Sale("햄버거",5000));
		menu.add(new Sale("물",1000));
		menu.add(new Sale("피자",15000));
		menu.add(new Sale("콜라",3000));
		menu.add(new Sale("과자",2000));
	}

	public void addMenu(Scanner sc) {
		System.out.println("상품명>");
		String name = sc.next();
		System.out.println("가격>");
		int price = sc.nextInt();
		
		Sale<String, Integer> s = new Sale<>(name,price);
		this.menu.add(s);
		System.out.println("추가완료");
		
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
		System.out.println("수정할 상품명>");
		String name = sc.next();
		
		for(int i=0; i<menu.size(); i++) {
			if(menu.get(i).getMenu().equals(name)) {
				System.out.println("수정가격>");
				int price = sc.nextInt();
				menu.get(i).setPrice(price);
				System.out.println("수정완료");
				return;
			}
		}
		System.out.println("상품이 없습니다.");
	} 
	
	public void printMenu() {
		for(Sale<String, Integer> s : menu) {
			System.out.println(s);
		}
		
	}

	public void orderPick(Scanner sc) {
		System.out.println("주문할 상품>");
		String name = sc.next();
		System.out.println("수량>");
		int count = sc.nextInt();
		
		for(int i=0; i<menu.size(); i++) {
			String PM = menu.get(i).getMenu();
			int PP = menu.get(i).getPrice();
			int total = PP*count;
			if(menu.get(i).getMenu().equals(name)) {				
				int index = orderSearch(name);
				if(index!=-1) {
					int cnt = order1.get(index).getCount();
					int tt = order1.get(index).getTotal();
					order1.get(index).setCount(cnt+count);
					order1.get(index).setTotal(tt+total);
					System.out.println("추가주문완료");
					return;
				}
				Order<Integer,Integer> p = new Order<>(name, PP, count,total);
				order1.add(p);
				System.out.println("주문완료");
				return;	
			}  
		}
		
		//메뉴에 없는 상품을 주문했을 때
		System.out.println("해당 상품이 없습니다. 상품의 가격을 입력해주세요");
		int newPrice = sc.nextInt();
		Sale<String, Integer> s1 = new Sale<>(name,newPrice);
		menu.add(s1);
		System.out.println("새로운 상품 추가");
		return;

	}
	
	public int orderSearch(String name) {
		int index = -1;
		for(int i=0; i<order1.size(); i++) {
			if(order1.get(i).getMenu().equals(name)) {
				index=i;
				System.out.println(index);
				return index;
			}
		}
		return index;
	}
	
	
	public void printOrder() {
		int sum =0;
		System.out.println("-주문내역-");

		for(int i=0; i<order1.size(); i++) {
			System.out.println(menu.get(i).getMenu()+" "+order1.get(i).getCount()+"개"+" "
								+ order1.get(i).getTotal()+"원");
			sum+=(int)order1.get(i).getTotal();
		}
		System.out.println();
		System.out.println("총 지불금액: "+sum);
		
	}

	
}
