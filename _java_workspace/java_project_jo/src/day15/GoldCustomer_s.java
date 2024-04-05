package day15;

public class GoldCustomer_s extends Customer_s{
	
	//gold / vip만 할인율 존재
	private double saleRatio;
	
	public GoldCustomer_s() {}
	public GoldCustomer_s(int id, String name) {
		super(id,name);
		customerGrade = "Gold";
		bonusRatio = 0.02;
		saleRatio = 0.1;
	}
	
	//할인금액을 리턴할 수 있게 calcPrice메서드를 오버라이딩
	@Override
	public int calcPrice(int price) {
		bonusPoint = bonusPoint+(int)(price*bonusRatio);
		//할인가격 구하기
		price = price-(int)(price*saleRatio);
		return price;
	}
	public double getSaleRatio() {
		return saleRatio;
	}
	public void setSaleRatio(double saleRatio) {
		this.saleRatio = saleRatio;
	}
	
}
