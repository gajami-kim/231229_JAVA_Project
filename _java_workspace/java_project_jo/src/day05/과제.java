package day05;

public class 과제 {

	public static void main(String[] args) {
		int arr[] = new int[] {10,56,78,89,48,62,93,50}; 
		/* arr배열의 합계와 평균을 출력
		 * 최대값/최소값 출력 => Math.max / Math.min // if문 두 가지 방법 이용
		 */
		
		//ssam
		int sum = 0;
		//성적데이터 값 = 0~100
		int max = 0; //가장 큰 값을 넣기 위한 변수, 더이상 작을 수 없는 가장 작은 값
		//int max = arr[0]; 도 가능하다
		int min = 100; //가장 작은 값을 넣기 위한 변수, 더이상 클 수 없는 가장 큰 값
		
		for(int i=0; i<arr.length; i++) {
			sum = sum+arr[i];
//			if(max<arr[i]) {
//				max = arr[i];
//			}
//			if(min>arr[i]) { // else if로 사용하면 안된다
//				min = arr[i];
//			}
			max = Math.max(max,arr[i]);
			min = Math.min(min,arr[i]);
		}
		double avg = sum/(double)arr.length;
		
		System.out.println("합계: "+sum+" / 평균 : "+avg);
		System.out.println("최대값: "+max+" / 최소값 : "+min);
		
		
	}

}
