package new02;

class Counter {
	//싱글톤으로 객체 만들기
	private int count;
	private static Counter instance;
	
	private Counter() {}
	
	public static Counter getInstance() {
		if(instance == null) {
			instance = new Counter();
		}
		return instance;
	}
	//countMethod() 생성, 호출시 count 1씩 증가 리턴
	//count 싱클톤으로 객체 만들기
	public int countMethod() {
		count++;
		return count;
	}
}


public class SinglentonCount {

	public static void main(String[] args) {
		//Count 객체 2개 생성, 각각 countMethod()를 호출하여 출력 
		Counter c = Counter.getInstance();
		Counter c1 = Counter.getInstance();
			
		System.out.println(c.countMethod()); //1
		System.out.println(c.countMethod()); //2
		System.out.println(c1.countMethod()); //3
		System.out.println(c1.countMethod()); //4
		System.out.println(c1.countMethod()); //5
		System.out.println(c.countMethod()); //6
	}

}
