package day11;

public class Class04 {

	public static void main(String[] args) {
		/* TV 클래스 생성
		 * 멤버변수 : brand, power, ch, vol
		 * 메서드
		 * power(): power가 켜지면 "tv가 켜졌습니다." 꺼지면 "tv가 꺼졌습니다."
		 * chUp() : 1씩 증가 / ch은 20까지 있음 / 20이 넘어가면 다시 0으로 순환
		 * chDown() : 1씩 감소 / 0->20 순환
		 * volUp() / volDown : 1씩 증가 / 1씩 감소
		 * 10까지 있고 그 이상은 10으로 고정, 0이면 음소거라고 출력
		 */
		Tv t = new Tv("삼성");
//		t.print();
		t.power();
		t.chUp();
		t.power();
//		t.chDown();
//		t.chDown();
//		t.chUp();
//		t.chUp();
//		t.chUp();
//		t.volDown();
////		System.out.println("현재 채널"+t.getCh());
////		System.out.println("현재 볼륨"+t.getVol());
//		t.power();
		
		
	}

}

class Tv {
	
	private final String BRAND = "삼성"; //final은 변경할 수 없는 값을 지정
	private boolean power; //false
	private int ch; //0
	private int vol; //0
	
	//기본생성자
	public Tv() {
		this.vol = 3;
	}
	//매개변수 : 브랜드, 채널, 볼륨
//	public Tv(String brand, int ch, int vol) {
//		this.brand = brand;
//		this.ch = ch;
//		this.vol = vol;
//	}
	//ssam
	public Tv(String brand) { //final로 지정된 값이 있는데 생성자를 만들면 오류
//		this.brand = brand;
		this.vol =3;
	}
	
	//출력
	public void print() {
		System.out.println("TV 브랜드: "+BRAND+" / ch: "+ch+" / vol:"+vol);
	}
	
	//power
	public void power() {
		power = !power;
		if(power) { //tv가 켜진상태
			System.out.println("TV가 켜졌습니다.");
			print(); //tv가 켜진 후 기본적인 상태 출력
		} else { //tv가 꺼진상태
			System.out.println("TV가 꺼집니다.");
		}
	}
	
	//채널올리기
	public void chUp() { //기본값 0
//		if(ch>=20) {
//			ch=0;
//		} else {
//			ch++;
//		}
		//ssam
		if(power) {
			ch++;
			System.out.println("ch: "+ch);
			if(ch>=20) {
				ch=-1;
			}
		}else {
			System.out.println("TV를 켜주세요."); //출력되는일이 없음
		}
	}
	//채널 내리기
	public void chDown() {
//		if(ch<=0) {
//			ch=20;
//		} else {
//			ch--;
//		}
		//ssam
		if(power) {
			ch--;
			System.out.println("ch: "+ch);
			if(ch<=0) {
				ch=21;
			}
		} else {
			System.out.println("TV를 켜주세요.");//출력되는일없음
		}
	}
	//볼륨 올리기
	public void volUp() {
//		if(vol>10) {
//			vol=10;
//		} else {			
//			vol++;
//		}
		//ssam
		if(power) {
			vol++;
			System.out.println("vol: "+vol);
			if(vol>=10) {
				vol=9;
			} 
		} else {
			System.out.println("TV를 켜주세요.");//출력되는일없음
		}
	}
	//볼륨 내리기
	public void volDown() {
//		if(vol<=0) {
//			System.out.println("음소거");
//			vol=0;
//		} else {
//			vol--;
//		}
		//ssam
		if(power) {
			System.out.println("vol: "+vol);
			vol--;
			if(vol<=0) {
				vol=0;
				System.out.println("음소거");
			} 
		} else {
			System.out.println("TV를 켜주세요.");//출력되는일없음
		}
	}

	//getter/setter
	public String getBRAND() {
		return BRAND;
	}
//
//	public void setBrand(String brand) { //final로 받은 값은 set을 할수없음
//		this.brand = brand;
//	}

	public boolean isPower() {
		return power;
	}

	public void setPower(boolean power) {
		this.power = power;
	}

	public int getCh() {
		return ch;
	}

	public void setCh(int ch) {
		this.ch = ch;
	}

	public int getVol() {
		return vol;
	}

	public void setVol(int vol) {
		this.vol = vol;
	}
	
}
