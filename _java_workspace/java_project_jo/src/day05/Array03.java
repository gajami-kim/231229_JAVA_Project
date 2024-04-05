package day05;

public class Array03 {

	public static void main(String[] args) {
		
		int arr[] = new int[] {10,56,78,89,48,62,93,50}; 
		/* arr배열의 합계와 평균을 출력
		 * 최대값/최소값 출력 => Math.max / Math.min // if문 두 가지 방법 이용
		 */
		int sum = 0;
		int max = arr[0];
		int min = arr[0];

		
		for(int i=0; i<arr.length; i++) {
			sum = sum+arr[i];
			if(max<arr[i]) {
				max = arr[i];
			} else if(min>arr[i]) { //else if -> 각각 다른 if문이 맞음 max의 값과 min의 값이 같은 경우가 나올 수 있기때문
				min = arr[i];
			}
		}
		double avg = sum/(double)arr.length;
		
		System.out.println("모든 점수의 합 : "+sum);
		System.out.println("점수의 평균 : "+avg);		
		System.out.println("Math.max를 이용해 구한 최대값 : "+Math.max(max,min));
		System.out.println("Math.max를 이용해 구한 최소값 : "+Math.min(max,min));
		System.out.println("if문을 이용해 구한 최대값 : "+max);
		System.out.println("if문을 이용해 구한 최소값 : "+min);
	}

}
