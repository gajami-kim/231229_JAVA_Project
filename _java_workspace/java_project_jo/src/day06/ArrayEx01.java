package day06;

public class ArrayEx01 {

	public static void main(String[] args) {
		/* 10개의 값을 담을 수 있는 arr 생성
		 * 1~10까지 값을 입력한 후 출력
		 */

		int arr[] = new int[10];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = i+1;
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		//배열을 섞는 코드
		//랜덤 번지를 선택해서 순차적으로 하나씩 교환
		//(int)(Math.random()*10)+0 //0부터 10개의 랜덤수 출력
		//max = 최종번지 개수, min = 첫번지
		//교환코드
		//[i][i+1]
//		int temp = arr[i]; //arr[i]의 값을 임시변수 temp에 저장
//		arr[i] = arr[i+1]; //빈 arr[i] 자리에 arr[i+1] 값을 저장
//		arr[i+1] = temp; //빈 arr[i+1] 자리에 temp에 미리 저장해두었던 기존 arr[i]의 값을 저장 => 교환완료
		
		int min = 0;
		int max = arr.length;
		
		for(int i=0; i<arr.length; i++) {
			int random = (int)(Math.random()*max)+min;
			int temp = arr[i];
			arr[i] = arr[random];
			arr[random] = temp;
		}
		
		System.out.println("----섞은 후 값 보기----");
		for(int tmp : arr) {
			System.out.print(tmp+" ");
		}
		
		//섞은 값을 원래대로 정리(정렬)
		//작은수부터 정리 => 오름차순 정렬
		//큰수부터 정리 => 내림차순 정렬
		//버블정렬방법 - 해당 번지의 값과 뒷번지의 값을 비교하여, 뒷번지의 값이 해당번지의 값보다 작다면 서로 자리를 바꾼다(교환) 
		// 3 2 5 6 7 1 9 4 10 8
		// 1 3 5 6 7 2 9 4 10 8 - pass1
		// 1 2 5 6 7 3 9 4 10 8 - pass2
		// 1 2 3 6 7 5 9 4 10 8 - pass3
		// 1 2 3 4 7 6 9 5 10 8 - pass4
		// 1 2 3 4 5 7 9 6 10 8 - pass5
		// 1 2 3 4 5 6 9 7 10 8 - pass6
		// 1 2 3 4 5 6 7 9 10 8 - pass7
		// 1 2 3 4 5 6 7 8 10 9 - pass8
		// 1 2 3 4 5 6 7 8 9 10 - pass9
		
		/* 4 10 1 8 3 9 2 6 5 7
		 * 1 10 4 8 3 9 2 6 5 7 - pass1
		 * 1 2 4 8 3 9 10 6 5 7 - pass2
		 * 1 2 3 8 4 9 10 6 5 7 - pass3
		 * 1 2 3 4 8 9 10 6 5 7 - pass4
		 * 1 2 3 4 5 9 10 6 8 7 - pass5
		 * 1 2 3 4 5 6 10 9 8 7 - pass6
		 * 1 2 3 4 5 6 7 9 8 10 - pass7
		 * 1 2 3 4 5 6 7 8 9 10 - pass8
		 */
		
		System.out.println();
		System.out.println("----정렬 후 값 보기----");
		
		for(int i=0; i<arr.length-1; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i] > arr[j]) { // >:오름차순, <:내림차순
					//교환
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		for(int s : arr) {
			System.out.print(s+" ");
		}
		
		
		
		
		
	}

}
