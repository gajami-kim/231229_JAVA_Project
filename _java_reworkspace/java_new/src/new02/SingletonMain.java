package new02;

public class SingletonMain {

	public static void main(String[] args) {
		//싱글턴 객체 생성
//		Singleton s = new Singleton(); //생성X
		Singleton s = Singleton.getInstance(); //static이기 때문에 클래스에서 직접접근
		Singleton s1 = Singleton.getInstance();
		
		if(s==s1) { //주소가 같은지 확인
			System.out.println("s와 s1은 같은 객체 입니다.");
		} else {
			System.out.println("s와 s1은 다른 객체 입니다.");
		}
	}

}
