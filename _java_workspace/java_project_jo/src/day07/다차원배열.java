package day07;

public class 다차원배열 {

	public static void main(String[] args) {
		/* 2차원 배열
		 * 10 20 30
		 * 60 40 80
		 * 60 40 80
		 * 60 40 80
		 * 60 40 80
		 * 자료형 배열명[][] = new 자료형[5][3] //5행개수, 3열개수
		 */
		
		int arr[][] = new int[5][3];
		
		int cnt = 1;
		for(int i=0; i<arr.length; i++) { //0~4번지까지 5개의 행 반복
			for(int j=0; j<arr[0].length; j++) { //첫 행의 length
				arr[i][j] = cnt;
				cnt++;
				System.out.print(arr[i][j]+" ");
			}
			System.out.println(); //한 행마다 줄바꿈
		}

	}

}
