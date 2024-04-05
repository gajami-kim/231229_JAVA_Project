package day13;

class Animal {
	private String name; //이름
	private String category; //종
	
	public Animal() {	}
	public Animal(String name, String category) {
		this.name = name;
		this.category = category;
	}
	//출력메서드
	public void printInfo() {
		System.out.println("이름:"+name+" / 종:"+category);
	}
	//울음소리매서드
	public void howl() {
		System.out.println("--"+name+"의 울음소리--");
	}
	
	//getter/setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	
}

//Dog, Cat 클래스 Animal 클래스를 상속받는
//printInfo()
//howl() 오버라이드 후 출력
class Dog extends Animal {
	 //자식의 생성자에서 상속받은 멤버변수를 setting
	public Dog() {
		setName("후추");
		setCategory("강아지");
	}
	@Override
	public void howl() {
		// TODO Auto-generated method stub
		super.howl();
		System.out.println("멍멍");
	}
	
}
class Cat extends Animal {
	public Cat(String name, String category) {
		super.setName("코코");
		super.setCategory("고양이");
	}
	//override 없어도 오버라이드 됨
	public void howl() {
		// TODO Auto-generated method stub
		super.howl();
		System.out.println("야옹");
	}
	
}

class Tiger extends Animal {
	public Tiger(String name, String category) {
		//super 생성자 호출
		super(name, category);
	}
	
	public void howl() {
		super.howl();
		System.out.println("어흥");
	}
}

public class 상속02 {

	public static void main(String[] args) {
		/* 오버라이딩 : 부모 클래스에게서 물려받은 메서드를 재정의하는 것
		 * - 부모클래스의 메서드와 선언부가 일치해야한다
		 * - 접근제한자도 더 넓은 범위는 가능하지만, 축소는 안됨
		 */
		Dog dog = new Dog();
		Cat cat = new Cat("코코","고양이");
		
		dog.printInfo();
		dog.howl();
		System.out.println();
		dog.setName("젠코");
		dog.setCategory("강아지");
		dog.printInfo();
		dog.howl();
		System.out.println();
		cat.printInfo();
		cat.howl();
		System.out.println();
		cat.setName("순돌이");
		cat.setCategory("고양이");
		cat.printInfo();
		cat.howl();
		System.out.println();
		Tiger t = new Tiger("호랭이","고양이");
		t.printInfo();
		t.howl();
	}

}
