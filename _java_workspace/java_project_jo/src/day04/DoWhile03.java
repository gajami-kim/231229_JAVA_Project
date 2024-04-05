package day04;

import java.util.Scanner;

public class DoWhile03 {

	public static void main(String[] args) {
		/* 숫자 2개를 입력받고
		 * menu에 따라서
		 * 1.+ | 2.- | 3.* | 4./ | 5.% | 6.종료
		 * menu에 따라서 두 수의 연산결과를 출력
		 * num1=5 / num2=3
		 * 1 => 5+3=8
		 * 2 => 5-3=2
		 * 다른 번호는 잘못된 메뉴로 설정
		 */
		
		Scanner scan = new Scanner(System.in);
//		int menu = 0;
//		System.out.print("첫번째 숫자(정수)를 입력해주세요 > ");
//		int num1 = scan.nextInt();
//		System.out.print("두번째 숫자(정수)를 입력해주세요 > ");
//		int num2 = scan.nextInt();
//		
//		//me
//		do {
//			
//			System.out.println("--menu--");
//			System.out.println("1.+ | 2.- | 3.* | 4./ | 5.% | 6.종료");
//			menu = scan.nextInt();
//		
//			switch(menu){
//				case 1:
//					System.out.println("1=> "+num1+"+"+num2+"="+(num1+num2));
//					break;
//				case 2:
//					System.out.println("2=> "+num1+"-"+num2+"="+(num1-num2));
//					break;
//				case 3:
//					System.out.println("3=> "+num1+"*"+num2+"="+(num1*num2));
//					break;
//				case 4:
//					System.out.println("4=> "+num1+"/"+num2+"="+(num1/num2));
//					break;
//				case 5:
//					System.out.println("5=> "+num1+"%"+num2+"="+(num1%num2));
//					break;
//				default:
//					System.out.println("잘못된 메뉴");
//			}
//			
//		} while (menu!=6);
//		System.out.println("프로그램 종료");
		
		
		//ssam
		System.out.print("두 숫자를 입력해주세요 >  ");
		int num3 = scan.nextInt();
		int num4 = scan.nextInt();
		int menu1 = 0;

		do {
			System.out.println("--menu--");
			System.out.println("1.+ | 2.- | 3.* | 4./ | 5.% | 6.종료");
			System.out.println("menu 선택 > ");
			menu1 = scan.nextInt();
			
			switch(menu1) {
			case 1:
				System.out.println("1=> "+num3+"+"+num4+"="+(num3+num4));
				break;
			case 2:
				System.out.println("2=> "+num3+"-"+num4+"="+(num3-num4));
				break;
			case 3:
				System.out.println("3=> "+num3+"*"+num4+"="+(num3*num4));
				break;
			case 4:
				if(num4==0) {
					System.out.println("잘못입력된 값입니다. 0을 제외한 숫자를 다시 입력해주세요.");
					num4 = scan.nextInt();
				} // 출력문이 2개 이상일 때 else 붙이는거 까먹지 않기
				System.out.println("4=> "+num3+"/"+num4+"="+(num3/num4));
				break;
			case 5:
				if(num4==0) {
					System.out.println("잘못입력된 값입니다. 0을 제외한 숫자를 다시 입력해주세요.");
					num4 = scan.nextInt();
				}
				System.out.println("5=> "+num3+"%"+num4+"="+(num3%num4));
				break;
			case 6:
				System.out.println("종료됩니다.");
				break;
				default:
					System.out.println("잘못된 메뉴");
					break;
			}
		} while(menu1!=6); //do 괄호 안에서 선언되는 값은 do 괄호를 나가면 인식되지 않는다

		scan.close();
	}

}
