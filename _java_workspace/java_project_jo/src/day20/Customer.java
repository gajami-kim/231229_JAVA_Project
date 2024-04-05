package day20;

public class Customer implements Comparable<Customer>{
	
	//멤버변수 이름, 나이, 가격
	private String name;
	private int age;
	private int price;
	
	public Customer() {}
	public Customer(String name, int age) {
		this.name = name;
		this.age = age;
		this.price = (age>=15)?100:50;
	}

	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public int getPrice() {
		return price;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "이름:" + name + ", 나이:" + age + ", 비용:" + price;
	}
	@Override
	public int compareTo(Customer o) {
		
		return this.name.compareTo(o.name);
	}
	
	

}
