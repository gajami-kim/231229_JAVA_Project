package jdbcBoard;

public class BoardVO {
	
	private int bno; //자동생성
	private String title;
	private String writer;
	private String content;
	private String regdate;
	private String moddate;
	
	public BoardVO() {}
	
	//게시글등록용
	public BoardVO(String title, String writer, String content) {
		this.title = title;
		this.writer = writer;
		this.content = content;
	}
	
	//게시글수정용
	public BoardVO(int bno, String title, String content) {
		this.bno = bno;
		this.title = title;
		this.content = content;
	}
	 
	//게시글목록용
	public BoardVO(int bno, String title, String content, String writer) {
		this(title, writer, content);
		this.bno = bno;
	}
	//게시글출력용(상세)
	public BoardVO(int bno, String title, String writer, String content, String regdate, String moddate) {
		this(title, writer, content);
		this.bno = bno;
		this.regdate = regdate;
		this.moddate = moddate;
	}

	public int getBno() {
		return bno;
	}

	public void setBno(int bno) {
		this.bno = bno;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getRegdate() {
		return regdate;
	}

	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}

	public String getModdate() {
		return moddate;
	}

	public void setModdate(String moddate) {
		this.moddate = moddate;
	}

	@Override
	public String toString() {
		return "BoardVO [bno=" + bno + ", title=" + title + ", writer=" + writer + ", content=" + content + ", regdate="
				+ regdate + ", moddate=" + moddate + "]";
	}
	
	

}