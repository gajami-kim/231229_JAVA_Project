package day16;

public class Exception06 {

	public static void main(String[] args) {
		// 메서드에서 생성된 배열출력
		Exception06 e6 = new Exception06();
		int arr[] = null;
		int start = 5, count = -1, size=0;
		try {
			arr = new int[size];
			e6.randomArr(arr, start, count);
			arr = e6.size(start, count, size);
			for(int i=0; i<arr.length; i++) {
				System.out.println(arr[i]);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		//size메서드
		try {
			size(-1,1,10);
			size(10,1,-1);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
//		randomaArr메서드
//		try {
//			int arr[] = null;
//			randomArr(arr,1,10);
//			randomArr(new int[-1],1,10);
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
//		}


	}
	
	//메서드생성
	/* 기능 : size를 매개변수로 입력받아 size만큼의 길이를 가지는 배열을 생성하여 
	 * 랜덤값을 채워 배열을 리턴
	 * 랜덤값의 범위는 매개변수로 입력 => start(시작값), count(개수)
	 * 
	 * 예외처리 
	 * - size가 0보다 작다면 예외발생 (throw new)
	 * - count 개수가 0보다 작다면 예외발생
	 */
	public static int[] size(int size,int start, int count) {
		if(size<=0) {
			throw new RuntimeException("배열의 길이가 0보다 작을 수 없습니다.");
		}
		if(count<=0) {
			throw new RuntimeException("들어갈 수를 1이상으로 설정해주세요.");
		}
		
		int sizeArr[] = new int[size];
		
		for(int i=0; i<sizeArr.length; i++) {
			sizeArr[i] = (int)(Math.random()*count)+start;
			System.out.print(sizeArr[i]+" ");
		}
		System.out.println();
		return sizeArr;
	}
	
	
	//메서드 생성
	/* 기능 : 매개변수로 배열을 받아서 랜덤값을 채우는 메서드
	 * 랜덤값의 범위는 매개변수로 입력 => start(시작값), count(개수)
	 * 
	 * 예외처리
	 * - 배열이 null이면 예외발생
	 * - 들어온 배열의 길이가 0보다 작다면 예외발생
	 */
	public static void randomArr(int randomArr[], int start, int count) {
		if(randomArr==null) {
			throw new RuntimeException("배열의 값이 null입니다.");
		}
		if(randomArr.length<=0) {
			throw new RuntimeException("배열의 길이가 0보다 작습니다.");
		}
		for(int i=0; i<randomArr.length; i++) {
			randomArr[i] = (int)(Math.random()*count)+start;
			System.out.print(randomArr[i]+" ");
		}
		System.out.println();
	}
	

}
