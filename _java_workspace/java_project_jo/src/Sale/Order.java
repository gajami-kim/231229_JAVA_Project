package Sale;

public class Order<A,B> extends Sale {
	
	private A count;
	private B total;
	
	public Order() {}
	public Order(String menu, int price, A count, B total) {
		super(menu, price);
		this.count = count;
		this.total = total;
	}
	
	public A getCount() {
		return count;
	}
	public B getTotal() {
		return total;
	}
	public void setCount(A count) {
		this.count = count;
	}
	public void setTotal(B total) {
		this.total = total;
	}
	@Override
	public String toString() {
		return "주문내역: " + count + ", 총 지불금액 =" + total;
	}
	
	

}
