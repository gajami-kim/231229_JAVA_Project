package studentManager;

public class Subject {
	private String code;
	private String sub;
	private int grade;
	private String professer;
	private String space;
	
	//생성자
	public Subject() {}
	public Subject(String code, String sub) {
		this.code = code;
		this.sub = sub;
	}
	public Subject( String sub, int grade, String professer, String space) {
		this.sub = sub;
		this.grade = grade;
		this.professer = professer;
		this.space = space;
	}
	
	
	@Override
	public String toString() {
		return sub+"("+code+")";
	}
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getSub() {
		return sub;
	}
	public void setSub(String sub) {
		this.sub = sub;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public String getProfesser() {
		return professer;
	}
	public void setProfesser(String professer) {
		this.professer = professer;
	}
	public String getSpace() {
		return space;
	}
	public void setSpace(String space) {
		this.space = space;
	}
	
	
}
