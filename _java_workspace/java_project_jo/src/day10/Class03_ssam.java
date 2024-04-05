package day10;

public class Class03_ssam {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car2 c = new Car2();
		c.setName("카니발");
		c.setColor("하얀색");
		c.setYear("2005");
		c.setDoor("4");
		c.printInfo();
		c.power();
		c.speedup();
		c.speedup();
		c.speedup();
		c.speedup();
		c.speedup();
		c.power();
		c.power();
	}

}

//같은 패키지에서 같은 이름의 클래스는 사용불가능(private은 상관없다)
class Car2 {
	
	//멤버변수 : name, year, color, door(문짝갯수), power, speed
	private String name;
	private String color;
	private String year;
	private boolean power;
	private int speed;
	private String door;
	
	//내 차량의 정보를 출력하는 메서드 (name, year, color, door)
	public void printInfo() {
		System.out.println("my Car : "+name+"/"+color+"/"+door+"D"+"("+year+")");
	}

	
	
	//power()
	//시동이 켜졌습니다 / 시동이 꺼졌습니다
	//속도가 얼마이상이면 시동을 끌수없습니다 출력
	public void power() {
		this.power = !power;
		if(this.power && speed<=0) {
			System.out.println("시동이 켜졌습니다.");
		} else if(power&&speed>0) {
			System.out.println("주행중입니다.");
		} else if(!power&&speed>0) {
			System.out.println("주행중에 시동을 끌수없습니다.");
		} else {
			System.out.println("시동을 끕니다.");
			this.power = false;
		}
	}
	
	
	//speedUp/Down의 기본조건은 power가 켜져야 가능
	//시동이 꺼져있는 상태라면 시동이 꺼져있습니다. 시동을 켜주세요 출력
	//speedUp()
	//속도가 300이상이면 더이상 올라가지 않음 / 최고속도입니다 출력
	//현재속도를 출력
	public void speedup() {
		if(!power) {
			System.out.println("시동이 꺼져있습니다. 시동을 켜주세요");
		} else {
			if(speed>300) {
				speed=300;
				System.out.println("최고속도입니다.");
			}
			speed+=10;
			System.out.println("현재속도 : "+speed );
		}
	}
	
	
	//speedDown()
	//속도가 0이 되면 더이상 내려가지않음 / 속도가 0이면 멈췄습니다 출력
	//현재속도를 출력
	public void speeddown() {
		if(power) {
			speed-=10;
			if(speed<=0) {
				System.out.println("멈춰있습니다.");
				speed=0;
			}
			System.out.println("현재속도 : "+speed);
		} else {
			System.out.println("시동이 꺼져있습니다.");
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

	public String getDoor() {
		return door;
	}

	public void setDoor(String door) {
		this.door = door;
	}
	
	
}
