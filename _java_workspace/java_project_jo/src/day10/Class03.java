package day10;

public class Class03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Car1클래스를 통해 c객체를 생성 new 키워드를 통해 생성 Car1() 생성자에 의해 초기화된다.
		Car1 c = new Car1(); 
		c.setName("k5");
		c.setColor("검은색");
		c.setYear("2024");
		c.setDoor(4);
		c.print();
		c.power();
		c.speedup();
		c.speedup();
		c.speedup();
		c.speedup();
//		c.power();
		System.out.println("현재속도는 "+c.getSpeed());
		c.speeddown();
		System.out.println("현재속도는 "+c.getSpeed());
		
		Car1 c2 = new Car1("모닝","2016");
		c2.print();
		
		Car1 c3 = new Car1("아반떼","2005","검은색",4);
		c3.print();
		
	}

}

//같은 패키지에서 같은 이름의 클래스는 사용불가능(private은 상관없다)
class Car1 {
	
	//멤버변수 : name, year, color, door(문짝갯수), power, speed
	private String name;
	private String color;
	private String year;
	private boolean power;
	private int speed;
	private int door;
	
	//생성자 위치
	public Car1() {
		//기본생성자, 주는것도 없고 받는것도 없는
		//매개변수를 받는 생성자를 만들고 싶다면 기본생성자가 반드시 있어야한다.
	}
	//생성자는 여러개 만들 수 있음(생성자 오버로딩)
	//오버로딩 조건 : 매개변수의 개수가 달라야함, 타입이 달라야함
	public Car1(String name, String color, String year, int door) {
		this(name,year); //생성자 호출, name과 year만 받는 생성자가 있다면 가져와라
		this.color = color;
		this.door = door;
	}
	public Car1(String name, String year) {
		this.name = name;
		this.year = year;
	}
	
	
	
	
	//내 차량의 정보를 출력하는 메서드 (name, year, color, door)
	public void print() {
		System.out.println("my Car : "+name+"/"+color+"/"+door+"D"+"("+year+")");
	}

	
	
	//power()
	//시동이 켜졌습니다 / 시동이 꺼졌습니다
	//속도가 얼마이상이면 시동을 끌수없습니다 출력
	public void power() {
		power = !power;
		if(power==true) {
			System.out.println("시동이 켜졌습니다.");
		} else if(speed>0) { 
			System.out.println("시동을 끌수없습니다. 속도를 낮춰주세요.");
		} else {
			System.out.println("시동이 꺼졌습니다.");
		}
	}
	
	//speedUp/Down의 기본조건은 power가 켜져야 가능
	//시동이 꺼져있는 상태라면 시동이 꺼져있습니다. 시동을 켜주세요 출력
	//speedUp()
	//속도가 300이상이면 더이상 올라가지 않음 / 최고속도입니다 출력
	//현재속도를 출력
	public void speedup() {
		if(power==true) {
			if(speed>=300) {
				speed=300;
				System.out.println("최고속도입니다.");
			} else {
				speed+=10;
			}
		} else {
			System.out.println("시동이 꺼져있습니다. 시동을 켜주세요");
		}
	}
	
	
	//speedDown()
	//속도가 0이 되면 더이상 내려가지않음 / 속도가 0이면 멈췄습니다 출력
	//현재속도를 출력
	public void speeddown() {
		if(power==true) {
			if(speed<=0) {
				speed=0;
				System.out.println("멈췄습니다.");
			} else {
				speed-=10;
			}
		}
	}
	
	
	//getter/setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public boolean isPower() {
		return power;
	}

	public void setPower(boolean power) {
		this.power = power;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getDoor() {
		return door;
	}

	public void setDoor(int door) {
		this.door = door;
	}
	
	
}
