package day13;

import java.util.Scanner;

/* Product 클래스 생성 : 상품을 등록하는 클래스
 * 멤버변수 : 상품명, 가격
 * 상품추가 메서드
 * 상품출력메서드(toString으로 생성가능)
 */
class Product1 {
	private String name;
	private int price;
	private String product[] = new String[10];
	private int p_price[] = new int[10];
	int cnt;
	
	public Product1() {}
	public Product1(String name, int price) {
		this.name = name;
		this.price = price;
	}

	public void print() {
		System.out.println("상품명:"+name+" / 가격:"+price+"원");
	}
	public void addprint() {
		System.out.println("--추가상품--");
		for(int i=0; i<cnt; i++) {			
			System.out.println("상품명:"+product[i]+" / 가격:"+p_price[i]+"원");
		}
	}
	
	public void addProduct(String product, int p_price) {
			this.product[cnt] = product;
			this.p_price[cnt] = p_price;
			cnt++;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String[] getProduct() {
		return product;
	}
	public void setProduct(String[] product) {
		this.product = product;
	}
	public int[] getP_price() {
		return p_price;
	}
	public void setP_price(int[] p_price) {
		this.p_price = p_price;
	}
	
}

public class 과제_day13 {

	public static void main(String[] args) {
		//상품을 10개 등록가능한 배열 생성
		//스캐너를 통해서 상품을 등록받기
		//등록한 상품 출력
		Scanner scan = new Scanner(System.in);
		Product1 p = new Product1("포카칩",1500);
		p.print();
		p.addProduct("홈런볼", 2000);
		p.addprint();
		
		int cnt=0;
		String productArr[] = new String[10];
		int priceArr[] = new int[10];
		if(cnt>=10) {
			System.out.println("더이상 상품을 추가할 수 없습니다.");
		}
		for(int i=0; i<productArr.length; i++) {
			System.out.println("추가하실 상품명을 입력하세요");
			String productscan = scan.next();
			System.out.println("상품의 가격을 입력하세요");
			int pricescan = scan.nextInt();
			productArr[i] = productscan;
			priceArr[i] = pricescan;
			cnt++;
		}
		
		scan.close();
	}

}
