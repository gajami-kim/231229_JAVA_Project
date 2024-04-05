package Sale_s;

public class Order extends Sale {
	//주문객체
	//주문을 하려면 (메뉴명,가격),수량,합계(가격*수량)
	//메뉴명,가격 : 상속받은 객체의 값
	//수량,합계 : order만 가지고있는 내 객체
	
	private int count; //수량
	private int total; //합계(가격*수량)
	
	public Order() {}
	public Order(String menu, int price, int count) {
//		super.setMenu(menu); //부모의 set을 사용
//		super.setPrice(price);
		super(menu,price); //부모의 생성자를 호출하여 사용
		this.count = count;
		this.total = price*count;
	}
	
	public int getCount() {
		return count;
	}
	public int getTotal() {
		return total;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	
	//주문내역을 출력하는 메서드
	public void print() { //하나의 주문객체만 출력
		System.out.print(super.getMenu()+":"+super.getPrice()+" / ");
		System.out.println(count+"개 주문 => 금액: "+total);
	}
	
	@Override
	public String toString() {
		return "Order [count=" + count + ", total=" + total + "]";
	}
	
	
}
