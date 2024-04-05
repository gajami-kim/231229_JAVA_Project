package day08;

public class Method06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = new int[] {1,5,78,15,60,95,3,42,52,10,54,81,77,90,6};
		
		printArray(arr);
		System.out.println();
		
		sortArray(arr); //정렬을 먼저 실행
		System.out.println("---정렬후---");
		printArray(arr); //sortArray를 통해 정렬된 값이 print됨
		System.out.println();
		
		System.out.println("---배열 리턴 후 출력---");
		int arr1[] = sortArray1(arr);
		printArray(arr1);
//		printArray(sortArray1(arr)); 위 2줄과 같은 의미
		System.out.println();
		 
		System.out.println("--랜덤 수 생성 후 리턴--");
		printArray(randomArray());
		System.out.println();
		printArray(sortArray1(randomArray())); //랜덤 수 생성 후 오름차순으로 정렬하여 출력
	}

	/* 주어진 정수 배열을 콘솔에 출력하는 메서드
	 * 매개변수 : 배열
	 * 리턴타입 : 출력 => void
	 * 메서드명 : printArray
	 * 5개씩 한줄에 나열
	 */
	public static void printArray(int arr[]) {
		for(int i=0; i<arr.length; i++) {
			if(i%5==0 && i!=0) {
				System.out.println();
			}
			System.out.print(arr[i]+" ");
		}
	}
	
	/* 배열이 주어지면 배열을 오름차순 정렬
	 * 매개변수 : 배열
	 * 리턴타임 : 없음 => void
	 * 메서드명 : sortArray
	 */
	public static void sortArray(int arr[]) {
		for(int i=0; i<arr.length-1; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]>arr[j]) {
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
	}
		
	//정렬 후 배열을 리턴
	public static int[] sortArray1(int arr[]) {
		for(int i=0; i<arr.length-1; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]>arr[j]) {
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		return arr;
	}
	
	
	/* randomArray
	 * 배열을 생성하여 [10] 랜덤값(1-50)을 채우고 해당 배열을 릴턴
	 * printArray에서 출력
	 * 매개변수 : x
	 * 리턴타입 : 배열
	 */
	public static int[] randomArray() {
		int arr[] = new int[10];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*50)+1;
		}
		return arr;
	}
	
	
	
	
	
}
