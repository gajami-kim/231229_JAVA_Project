package jdbcBoard;

import java.util.List;
import java.util.Scanner;

public class BoardController {
	/* Controller <-> Service <-> DAO <-> DB */
	
	private Scanner sc;
	private Service svc;
	private boolean flag; //메뉴 돌릴용(종료변수)
	
	public BoardController() {
		sc = new Scanner(System.in);
		svc = new BoardServiceImpl();
		flag = true;
		PrintMenu();
	}
	
	private void PrintMenu() {
		while(flag) {
			System.out.println("------게시판------");
			System.out.println("1.게시물등록|2.게시물목록|3.게시물검색");
			System.out.println("4.게시물수정|5.게시물삭제|6.종료");
			System.out.println("메뉴선택");
			
			int menu = sc.nextInt();
			
			switch(menu) {
			case 1: register(); break;
			case 2: list(); break;
			case 3: detail(); break;
			case 4: modify(); break;
			case 5: remove(); break;
			default:
				flag = false;
				break;
			}
		}
	}

	private void remove() {
		// delete from board where bno=?
		System.out.println("삭제할 게시글 번호");
		int bno = sc.nextInt();
		int isOk = svc.delete(bno);
		System.out.println("게시글삭제"+((isOk>0)? "성공":"실패"));		
	}

	private void modify() {
		//update from board set title=?, content=?, moddate=now() where bno=?
		System.out.println("수정할 게시글 번호");
		int bno = sc.nextInt();
		System.out.println("제목");
		String title = sc.next();
		System.out.println("내용");
		sc.nextLine();
		String content = sc.nextLine();
		
		BoardVO b = new BoardVO(bno, title, content);
		int isOk = svc.modify(b);
		System.out.println("게시글수정"+((isOk>0)? "성공":"실패"));		
	}

	private void detail() {
		//select * from board where bno=?
		System.out.println("검색할 게시글 번호");
		int bno = sc.nextInt();
		BoardVO b = svc.getDetail(bno);
		System.out.println(b);
	}

	private void list() {
		//select * from board
		List<BoardVO> list = svc.getList();
		//출력
		for(BoardVO b : list){
			System.out.println(b);
		}
	}

	private void register() {
		//상품등록
		System.out.println("제목:");
		String title = sc.next();
		System.out.println("작성자");
		String writer = sc.next();
		System.out.println("내용");
		sc.nextLine();
		String content = sc.nextLine();
		BoardVO b = new BoardVO(title, writer, content);
		int isOk = svc.register(b);
		System.out.println("게시글등록"+((isOk>0)? "성공":"실패"));
	}
}
