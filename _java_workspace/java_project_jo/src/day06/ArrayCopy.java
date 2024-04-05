package day06;

public class ArrayCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = new int[] {1,2,3,4}; //new를 통해서 객체를 생성
		int arr1[] = arr;
		int arr2[] = new int[5];
		//두 객체 주소를 확인
//		System.out.println(arr);
//		System.out.println(arr1);
//		System.out.println(arr2);

		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		for(int i=0; i<arr1.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		for(int i=0; i<arr2.length; i++) {
			System.out.print(arr2[i]+" ");
		}
		System.out.println();
		
		//arr의 값을 arr2로 복사
		for(int i=0; i<arr.length; i++) { //복사를 하는 변수의 길이만큼
			arr2[i+1] = arr[i];
		}
		
		for(int i=0; i<arr2.length; i++) {
			System.out.print(arr2[i]+" ");
		}
		System.out.println();
		
		//arr를 arr3으로 복사
		//arr3은 10개의 데이터를 담을 수 있는 배열로 생성
		int arr3[] = new int[10];
//		for(int i=0; i<arr.length; i++) {
//			arr3[i]=arr[i];
//		}
		
		//System.arraycopy(이전배열, 시작번지, 새배열, 시작번지, 개수) 배열복사명령어
		System.arraycopy(arr1, 0, arr3, 2, arr.length);		
		//출력
		for(int s : arr3) {
			System.out.print(s+" ");
		}

	}

}