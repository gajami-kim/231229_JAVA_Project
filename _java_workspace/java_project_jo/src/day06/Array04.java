package day06;

public class Array04 {

	public static void main(String[] args) {
		/* 10개의 값을 가지는 배열을 생성한 후
		 * 1~50 랜덤수를 배열에 저장한 후 출력
		 * 10개의 데이터의 합계, 평균, 최대, 최소 출력
		 */

		int arr[] = new int[10]; //배열의 초기값은 0
		int sum = 0;
		double avg = 0;
		int max = 0;
		int min = 50;

		//배열의 완성
		for(int i=0; i<arr.length; i++) {
			int random = (int)(Math.random()*50)+1; //랜덤 수 생성
			arr[i] = random; //배열 안에 랜덤 수 저장
			//arr[i] = (int)(Math.random()*50)+1; 로 바로생성 가능
			System.out.print(arr[i]+" ");
			sum = sum+arr[i]; //합계출력
			max = Math.max(max, arr[i]); //최대값
			min = Math.min(min, arr[i]); //최소값
		}
		
		//배열에서 탐색, 배열을 완성하고 탐색하기 때문에 값이 오류나거나 바뀔 일이 없다.(더 안전하다)
		for(int i=0; i<arr.length; i++) {
			sum+=arr[i];
			if(max<arr[i]) {
				max=arr[i];
			}
			if(min>arr[i]) {
				min=arr[i];
			}
		}
		avg = sum/(double)arr.length; //평균출력
		
		System.out.println();
		System.out.println("합계: "+sum+" / 평균: "+avg);
		System.out.println("최대값: "+max+" / 최소값: "+min);
	}

}
