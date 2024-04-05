package day13;

public class 상속01 {

	public static void main(String[] args) {
		/* 상속 : 부모의 것을 자식에게 물려주는 것
		 * 상속대상 : 멤버변수 / 멤버메서드만 상속 가능
		 * 클래스의 확장개념
		 * 상속의 이유 : 재사용을 하여 중복코드를 줄이고, 유지보수를 쉽게하기 위해
		 * class A(부모), class B(자식)
		 * class B extends A {	}
		 * 
		 * 상속 키워드 : extends
		 * - 상속을 받으면 부모의 멤버변수와 메서드를 사용할 수 있다.
		 * - 접근제한자 private : 자식클래스에서 접근 불가능
		 * - 접근제한자 protected : 상속받는 자식에게 허용하는 제어자
		 */
		A a = new A();
		a.setA(10);
		a.setB(20);
		a.setC(30);
		a.setNum(100);
		a.print();
		System.out.println("------------------");
		B b = new B();
		b.setA(100);
		b.setB(200);
		b.setC(300);
		b.num=1000; //접근제어자가 protected여서 직접접근이 가능함
		b.print();
		System.out.println("------------------");
		b.setD(10);
		b.setE(20);
		b.setF(30);
		b.print();
	}

}

class A { //부모 클래스
	private int a,b,c; //상속불가능(나만사용)
	protected int num; //상속가능
	
	public void print() {
		System.out.println("a:"+a+" b:"+b+" c:"+c);
		System.out.println("num:"+num);
	}
	
	//getter/setter
	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public int getC() {
		return c;
	}

	public void setC(int c) {
		this.c = c;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
	
}

class B extends A { //자식 클래스
	private int d,e,f;
	
	//override(오버라이드) : 부모의 메서드를 재정의하여 사용하는 것
	//super : 부모의 값을 가져올 때 사용하는 키워드
	@Override
	public void print() {
		//a b c num
		super.print(); //부모의 print() 메서드를 호출하여 출력
		System.out.println("d:"+d+" e:"+e+" f:"+f);
	}

	//getter/setter
	public int getD() {
		return d;
	}

	public void setD(int d) {
		this.d = d;
	}

	public int getE() {
		return e;
	}

	public void setE(int e) {
		this.e = e;
	}

	public int getF() {
		return f;
	}

	public void setF(int f) {
		this.f = f;
	}
	
	
}
