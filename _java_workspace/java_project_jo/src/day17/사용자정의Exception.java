package day17;

public class 사용자정의Exception {

	public static void main(String[] args) {
		/* passwordException
		 * - 비밀번호는 null일 수 없다
		 * - 비밀번호의 길이는 5자 이상
		 * - 비밀번호는 문자로만 이루어지면 안됨(문자+숫자+특수문자...)
		 */
		
		PasswordTest pt = new PasswordTest();
//		String password = null;
//		String password = "abc";
//		String password = "abcdef";
		String password = "abcdef!!";
		
		try {
			pt.setPassword(password);
			System.out.println(pt.getPassword());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

class PasswordTest {
	private String Password;

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		//Exception 처리 구간
		if(password == null) {
			throw new PasswordException("비밀번호는 null일 수 없습니다.");
		} else if(password.length()<5) {
			throw new PasswordException("비밀번호는 5자 이상이어야합니다.");
		} else if(password.matches("[a-zA-Z]+")) { //영어 대문자.소문자 a-z에 다른 무언가를 포함해야한다
			throw new PasswordException("비밀번호는 숫자나 특수문자를 포함해야합니다.");
		}
		
		this.Password = password;
	}
	
	
}