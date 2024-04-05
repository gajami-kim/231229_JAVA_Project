package day06;

public class ArrayEx02 {

	public static void main(String[] args) {
		/* 1~50까지의 랜덤수를 10개 생성하여 배열에 저장 출력
		 * 오름차순 정렬 후 출력 
		 */

		int arr[] = new int[10];
		
		//랜덤 수 생성 배열에 저장
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*50)+1;
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("---정렬 후---");
		
		//생성된 배열 오름차순으로 정렬
		for(int i=0; i<arr.length-1; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]>arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		//출력
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
		//출력
//		for(int s : arr) {
//			System.out.print(s+" ");
//		}
		
	}

}
