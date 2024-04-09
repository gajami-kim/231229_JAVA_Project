package new01;

public class New01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 홍길동 주민등록번호 881122-1234567이다
		 * 출력형태 => 생년월일 : 881122, 성별 : 남(1,3)
		 * 콘솔에 출력
		 */
		String pin = "881122-1234567";
		String birth = pin.substring(0,pin.indexOf("-"));
		String birth_g = pin.substring(pin.indexOf("-")+1);
		String gender = "";
		String a = birth_g.substring(0, 1);

//		System.out.println(birth_g);
//		System.out.println(a);
		
		if(a.equals("1") || a.equals("3")) {
			gender = "남";
		} else {
			gender = "여";
		}
		
		System.out.println("생년월일 : " + birth + ", 성별 : "+ gender);
		
	}

}
