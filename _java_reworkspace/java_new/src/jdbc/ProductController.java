package jdbc;

import java.util.List;
import java.util.Scanner;

public class ProductController {
	/* Controller <-> Service <-> DAO <-> DB
	 * Controller 모든 메뉴에 분기처리
	 */
	
	private Scanner sc;
	private Service svc; //아직없음(interface)
	private boolean flag; //종료변수

	public ProductController() {
		sc = new Scanner(System.in);
		svc = new ProductServiceImpl(); //service의 구현체
		flag = true;
		PrintMenu();
	}
	
	private void PrintMenu() {
		while(flag) {
			System.out.println("상품관리 프로그램");
			System.out.println("1.상품등록|2.상품목록|3.상품검색(상품상세보기)");
			System.out.println("4.상품수정|5.상품삭제|6.종료");
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
		// 상품삭제
		//delete from product where pno=?
		System.out.println("삭제할 상품번호:");
		int pno = sc.nextInt();
		int isOk = svc.delete(pno);
		System.out.println("상품삭제"+((isOk>0)? "성공" : "실패"));
	}

	private void modify() {
		//상품의 정보를 수정(업데이트) update
		//update product set pname=?, price=?, madeby=? where pno=?
		System.out.println("수정할 상품번호:");
		int pno = sc.nextInt();
		System.out.println("수정할 상품명");
		sc.nextLine();
		String pname = sc.nextLine();
		System.out.println("수정가격:");
		int price = sc.nextInt();
		System.out.println("수정상품설명:");
		sc.nextLine();
		String madeby = sc.nextLine();
		ProductVO p = new ProductVO(pno, pname, price, madeby);
		int isOk = svc.update(p);
		System.out.println("상품수정"+((isOk>0)? "성공" : "실패"));
	}

	private void detail() {
		//상품 하나의 상세정보를 출력 select * from product where pno = ?
		System.out.println("상품번호");
		int pno = sc.nextInt();
		ProductVO p = svc.getDetail(pno);
		System.out.println(p);
	}

	private void list() {
		//상품 전체 리스트 출력 select * from product;
		List<ProductVO> list = svc.getList();
		//출력
		for(ProductVO p : list) {
			System.out.println(p);
		}
	}

	private void register() {
		System.out.println("상품명:");
		sc.nextLine();
		String pname = sc.nextLine();
		System.out.println("가격:");
		int price = sc.nextInt();
		System.out.println("상품설명:");
		sc.nextLine();
		String madeby = sc.nextLine();
		ProductVO p = new ProductVO(pname, price, madeby);
		//service에게 등록을 요청하는 메서드를 작성
		int isOk = svc.register(p);
//		System.out.println(isOk);
		//잘되면 1, 안되면 0
		System.out.println("상품등록"+((isOk>0)? "성공" : "실패"));
		
	}
}




























