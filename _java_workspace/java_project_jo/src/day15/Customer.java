package day15;

public class Customer { //일반고객

	/* 일반고객 / Gold고객(할인) / VIP고객(할인)
	 * 
	 * 고객ID : int customerID
	 * 고객이름 : String customerName
	 * 고객등급 : String customerGrade
	 * 보너스포인트 : int bonusPoint
	 * 보너스적립비율 : double bonusRatio
	 * 
	 * 클래스 생성
	 * - 기본 customerGrade = "silver"
	 * - 보너스적립비율 = 0.01 => 1% 적립
	 * 
	 * 메서드 생성
	 * 1. 보너스 적립 계산 메서드 (메서드명 : calcPrice(int price))
	 * => 구매금액을 주고 적립보너스를 계산 bonusPoint에 누적
	 * => 보너스적립 후, 할인여부를 체크해서 구매 price를 리턴
	 * 2. 출력메서드 (메서드명 : customerInfo())
	 * => 홍길동님 등급은 VIP입니다. 보너스포인트는 1000입니다.
	 * 	  (VIP) 전담상담사 번호는 1111입니다.
	 * 
	 * - Silver 등급
	 *  => 제품을 구매할 때 0%할인 / 보너스포인트 1% 적립
	 * - Gold 등급
	 *  => 제품을 구매할 때 10%할인 / 보너스포인트 2% 적립
	 * - VIP 등급
	 * 	=> 제품을 구매할 때 10%할인 / 보너스포인트 5% 적립
	 *  => 전담상담사 코드 혹은 이름을 멤버변수에 추가(int agentID)
	 * 
	 * GoldCustomer extends Customer{
	 * 	-기본메서드를 오버라이딩하여 사용
	 * }
	 * VIPCustomer extends Customer{
	 * 	-기본메서드를 오버라이딩하여 사용
	 * }
	 * CustomerMain 클래스에서 확인
	 */
	
	public static void main(String[] args) {
		Customer c = new Customer(001,"홍길동",1000);
		c.customerInfo();
		c.calcPrice(10000);
		c.calcPrice(30000);
		c.calcPrice(50000);
		c.calcPrice(10000);
		System.out.println();
		Customer g = new GoldCustomer();
		g.setCustomerName("김박이");
		g.setCustomerGrade("Gold");
		g.setBonusPoint(1000);
		g.setBonusRatio(0.02);
		g.customerInfo();
		g.calcPrice(10000);
		g.calcPrice(30000);

		System.out.println();
		Customer v = new VIPCustomer();
		v.setCustomerName("최이나");
		v.setCustomerGrade("VIP");
		v.setBonusPoint(1000);
		v.setBonusRatio(0.05);
		v.setAgentID(123);
		v.customerInfo();
		v.calcPrice(10000);
		v.calcPrice(30000);
		
		
	}
	
	//멤버변수 선언
	private int customerID;
	private String customerName;
	private String customerGrade="Silver";
	private int bonusPoint;
	private double bonusRatio=0.01;
	private int agentID;
	
	//생성자
	public Customer() {}
	public Customer(int customerID, String customerName, int bonusPoint) {
		this.customerID = customerID;
		this.customerName = customerName;
		this.bonusPoint = bonusPoint;
	}
	public Customer(int customerID, String customerName, String customerGrade, int bonusPoint, double bonusRatio) {
		this.customerID = customerID;
		this.customerName = customerName;
		this.customerGrade = customerGrade;
		this.bonusPoint = bonusPoint;
		this.bonusRatio = bonusRatio;
	}

	
	//메서드
	public int calcPrice(int price) { //보너스 적립계산메서드, 할인메서드
		double plusPoint = price*bonusRatio; //보너스적립 / if문 밑으로 내려가면 price 값이 달라져서 적립을 먼저 실행해야함
		bonusPoint = bonusPoint+(int)plusPoint;

		System.out.println("결제가격:"+price);
		System.out.println("적립 후 현재 보너스포인트:"+bonusPoint);
		
		return price;
	}

	public void customerInfo() { //출력메서드
		System.out.println(customerName+"님의 등급은 "+customerGrade+"입니다. 보너스포인트는 "+bonusPoint+"입니다.");
	}
	
	//getter/setter
	public int getCustomerID() {
		return customerID;
	}
	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerGrade() {
		return customerGrade;
	}
	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}
	public int getBonusPoint() {
		return bonusPoint;
	}
	public void setBonusPoint(int bonusPoint) {
		this.bonusPoint = bonusPoint;
	}
	public double getBonusRatio() {
		return bonusRatio;
	}
	public void setBonusRatio(double bonusRatio) {
		this.bonusRatio = bonusRatio;
	}
	public int getAgentID() {
		return agentID;
	}
	public void setAgentID(int agentID) {
		this.agentID = agentID;
	}
	
	//toString
	@Override
	public String toString() {
		return "CustomerID:" + customerID + " / CustomerName:" + customerName + " / CustomerGrade:"
				+ customerGrade + " / BonusPoint:" + bonusPoint + " / BonusRatio:" + bonusRatio;
	}
	
	
}

class GoldCustomer extends Customer{
	//현재 클래스에서 값을 찾으려면 this. 조상클래스에서 값을 찾으려면 super.
	@Override
	public int calcPrice(int price) {
		double plusPoint = price*super.getBonusRatio();
		int Bp = super.getBonusPoint()+(int)(plusPoint);

		price = price-(int)((double)price*0.1);
		System.out.println("결제가격:"+price);
		System.out.println("적립 후 현재 보너스포인트:"+Bp);
		
		return price;
	}
	
	public void customerInfo() { //출력메서드
		System.out.println(super.getCustomerName()+"님의 등급은 "+super.getCustomerGrade()+"입니다. 보너스포인트는 "+super.getBonusPoint()+"입니다.");
	}

}

class VIPCustomer extends Customer {

	@Override
	public int calcPrice(int price) {
		
		double plusPoint = price*super.getBonusRatio();
		int Bp = super.getBonusPoint()+(int)(plusPoint);

		price = price-(int)((double)price*0.1);
		System.out.println("결제가격:"+price);
		System.out.println("적립 후 현재 보너스포인트:"+Bp);
		
		return price;
	}

	@Override
	public void customerInfo() {
		System.out.println(getCustomerName()+"님의 등급은 "+getCustomerGrade()+"입니다. 보너스포인트는 "+getBonusPoint()+"입니다.");
		System.out.println("전담상담사 번호는 "+getAgentID()+"입니다.");
	}

	
}
	