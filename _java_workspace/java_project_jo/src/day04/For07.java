package day04;

public class For07 {

	public static void main(String[] args) {
		/* 이중 for문
		 *for(int i=1; i<=5; i++) {  	i=1    2    3    4    5
 		 *	for(int j=1; i<=5; j++) {	j=1~5  1~5  1~5  1~5  1~5
		 *		실행문; => 25번 실행
		 *	}
		 *}
		*/
		//별
		/* *****   i=1일 때 j=5번
		 * *****   i=2일 때 j=5번
		 * *****   i=3일 때 j=5번
		 * *****   i=4일 때 j=5번
		 * *****   i=5일 때 j=5번
		 */
		
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				System.out.print("*");
			}
			System.out.println();//한 줄 끝나면 줄바꿈
		}
		
		System.out.println("---------------");
		
		/* *
		 * **
		 * ***
		 * ****
		 * *****
		 */
		
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("-------------");
		
		/* *****
		 * ****
		 * ***
		 * **
		 * *
		 */
		//me
		for(int i=1; i<=5; i++) {
			for(int j=i; j<=5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		//ssam
		System.out.println("-----ssam-----");
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=6-i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("------------");
		
		/*      * i=1 공백=4 j=1
		 *     ** i=2 공백=3 j=2
		 *    *** i=3 공백=2 j=3
		 *   **** i=4 공백=1 j=4
		 *  ***** i=5 공백=0 j=5
		 */
		for(int i=1; i<=5; i++) {
			//공백
			for(int o=1; o<=5-i; o++) {
				System.out.print(" ");
			}
			//별
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("------------");
		
		/*     *      1
		 *    ***     1-3
		 *   *****    1-5
		 *  *******   1-7
		 * *********  1-9
		 */
		for(int i=1; i<=5; i++) {
			//공백
			for(int o=1; o<=5-i; o++) {
				System.out.print(" ");
			}
			//별
			for(int j=1; j<=(i*2)-1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("-------------");
		
		/* 1 2 3
		 * 4 5 6
		 * 7 8 9
		 * 3줄씩 3개 출력
		 */
		//me
//		int a=1;
//		for(int i=1; i<=3; i++) {
//			for(int j=1; j<=10; j++) {
//				System.out.printf("%n",j);
//			}
//			System.out.printf("%3d",a++);
//		}
		
		//ssam
		int cnt=0;
		for(int i=1; i<=3; i++) {//줄 역할
			for(int j=1; j<=3; j++) { //찍히는 숫자개수 역할, j가 5라면 숫자는 1-5 / 6-10 / 7-15식으로 출력
				cnt++;
				System.out.print(cnt+" ");
			}
			System.out.println();
		}
		
		
		
	}

}
