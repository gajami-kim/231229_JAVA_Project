package day13;
/* Product 클래스 생성 : 상품을 등록하는 클래스
 * 멤버변수 : 상품명, 가격
 * 상품추가 메서드
 * 상품출력메서드(toString으로 생성가능)
 */

import java.util.Scanner;

class Product {
	private String name;
	private int price;
	
	//생성자 => 한번만 호출 가능
	public Product () {}
	public Product(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	//메서드 => 자주 호출 가능
	public void insertproduct(String name, int price) {
		
	}
	
	
	//getter/setter
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
	@Override
	public String toString() {
		return "상품명:" + name + " / 가격:" + price;
	}
	
	
}
public class 과제_day13_ssam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		//Product 클래스를 담을 수 있는 배열 10칸을 준비
		Product[] menu = new Product[10];
		
		//상품을 등록하시겠습니까?(y/n) y=>등록 n=>그만
		//n을 누르면 등록한 상품 출력
		char c = 'y'; //반복키워드
		int cnt = 0; //index역할을 하는 변수
		
		while(c!='n') { //(!c.equals("n")) => String일 경우
			System.out.println("상품을 등록하시겠습니까? > y/n");
			c=scan.next().charAt(0);
			if(c=='y') {
				System.out.println("상품명: ");
				String name = scan.next();
				System.out.println("가격: ");
				int price = scan.nextInt();
				
				//객체생성
				Product p = new Product(name, price); //안에 값을 넣어주려면 값이 들어갈 객체가 필요하다
				menu[cnt]=p;
				cnt++;//다음번지로 이동
			} else { 
				if(c=='n') {
					System.out.println("상품등록 종료");
				} else {
					System.out.println("y/n만 가능합니다.");
				}
			}
		}
		System.out.println("--등록된 상품 리스트 출력--");
		for(int i=0; i<cnt; i++) { //값을 돌릴땐 값이 없을 상황을 대비해 배열의 길이가 아니라 cnt로 조건을 줘야함
			//toString사용경우
			System.out.println((i+1)+". "+menu[i]);
			//출력메서드일 경우
			//menu[i].print();
		}
		
		//하나씩 찍어보는
//		int cnt=0;
//		Product p = new Product("pizza",15000);
//		menu[cnt]=p;
//		cnt++;
//		Product p1 = new Product("coke",2000);
//		p1.insertproduct("coke", 2000);
//		menu[cnt]=p1;
//		cnt++;
//		for(int i=0; i<cnt; i++) {
//			System.out.println(menu[i]);
//		}
		
		//me
//		while(cnt<=10) {
//	         System.out.println("상품을 등록하시겠습니까? > y/n");
//	         String yn = scan.next();
//	         switch(yn) {
//	         case "y": 
//	            System.out.println("등록하실 상품을 입력해주세요");
//	            String add = scan.next();
//				System.out.println("상품의 가격을 입력해주세요");
//       		int price = scan.nextInt();	
//	            break;
//	         case "n":
//	            System.out.println("등록하신 상품");
//	            System.out.println(menu[cnt]);
//	            break;
//	         default:
//	            System.out.println("다시 입력해주세요");
//	         }
//	      }
//	      System.out.println("더이상 등록할 수 없습니다.");
	      
		
		
		scan.close();
	}

}
