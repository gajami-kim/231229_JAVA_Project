package day15;

public class CustomerMain_s {
	
	public static void main(String[] args) {
		Customer_s[] customerList = new Customer_s[10];
		
		
		Customer_s cLee = new Customer_s(1001,"이정혁");
		Customer_s cHong = new GoldCustomer_s(1002,"홍길동");
		Customer_s cKim = new VIPCustomer_s(1002,"홍길동",1111);
		
		int cnt=0;
		customerList[cnt] = cLee;
		cnt++;
		customerList[cnt] = cHong;
		cnt++;
		customerList[cnt] = cKim;
		cnt++;
		customerList[cnt] = new Customer_s(1004,"영희");
		cnt++;
		customerList[cnt] = new GoldCustomer_s(1005,"순이");
		cnt++;
		customerList[cnt] = new VIPCustomer_s(1006,"영철",2222);
		cnt++;
		customerList[cnt] = new VIPCustomer_s(1006,"영수",1111);
		cnt++;
		
		System.out.println("--할인율과 포인트 계산---");
		
		int price = 100000;
		for(int i=0; i<cnt; i++) {
			int salePrice = customerList[i].calcPrice(price);
			System.out.println(customerList[i].getCustomerName()+
					"님의 지불금액은 "+salePrice+"입니다. / 보너스포인트는 "+
					customerList[i].getBonusPoint()+"입니다.");
			System.out.println();
		}
		
		//다운캐스팅 : 부모의 공유되는 멤버변수나 메서드가 아닌
		//자식 고유의 멤버변수나 메서드를 호출하고자 할 때 사용
		//다운캐스팅은 반드시 명시적으로 형변환을 해야함.
		//instaceof : 객체의 형이 맞는지 체크하는 명령어 true/false
		System.out.println("--고객정보출력--");
		for(int i=0; i<cnt; i++) {
			customerList[i].customerInfo();
			System.out.println();
		}
		
		System.out.println("----------");
		//agentID = 1111 => 3333 변경
		for(int i=0; i<cnt; i++) {
			Customer_s c = customerList[i]; //주소복사, 객체생성x
			if(c instanceof VIPCustomer_s) {
//				if(customerList[i] instanceof VIPCustomer_s) //이렇게도 가능
				VIPCustomer_s vip = (VIPCustomer_s)c; //명시적형변환
				if(vip.getAgentID()==1111) {
					vip.setAgentID(3333);
				}
			}
		}
		
		System.out.println("--고객정보출력--");
		for(int i=0; i<cnt; i++) {
			customerList[i].customerInfo();
			System.out.println();
		}
	
//		int price = cLee.calcPrice(10000);
//		cLee.customerInfo();
//		System.out.println("지불금액 "+price);
//		System.out.println();
//		System.out.println("지불금액 "+cHong.calcPrice(10000));
//		cHong.customerInfo();
//		System.out.println();
//		System.out.println("지불금액 "+cKim.calcPrice(10000));
//		cKim.customerInfo();
		
	}
}
