package day08;

public class Method07_lotto {

	public static void main(String[] args) {
		/* 메서드를 이용해 로또번호를 생성, 리턴하여 출력 
		 */
		int lotto[] = new int[7]; //당첨번호
		int user[] = new int[6]; //사용자 로또 번호
		
		randomArray(lotto); // 로또번호 채우기
		randomArray(user); // 유저번호 채우기
		System.out.println("---당첨번호---");
		printArray(lotto);
		System.out.println("---사용자번호---");
		printArray(user);
		System.out.println();
		int rank = lottoRank(lotto, user);
		if(rank == -1) {
			System.out.println("꽝입니다");
		} else {
			System.out.println(rank+"등 당첨입니다.");
		}
	}
	
	
	/* 배열을 매개변수로 받아 1~45까지 랜덤수를 채워서(중복없이) 생성 
	 * 매개변수 : int arr[] => 로또배열, 유저배열 모두 받을 배열
	 * random 생성 뒤 해당 배열에 없으면 넣음 / random == arr[i] -> false면 추가
	 */
	public static void randomArray(int arr[]) {
		// 배열을 받아서 배열에 랜덤 값 중복없이 채우기
		int cnt = 0; // while에서 i의 역할
		while(cnt < arr.length) {
			int r = (int)(Math.random()*10)+1;
			if(isContain(arr, r)) {
				arr[cnt] = r;
				cnt++;
			}
		}
	}
	
	
	/*배열을 매개변수로 받아 배열을 출력하는 메서드
	 * 3 7 26 45 11 6 [34]
	 */
	public static void printArray(int arr[]) {
		if(arr.length==7) {
			for(int i=0; i<arr.length-1; i++) {
				System.out.print(arr[i]-1+" ");
			}
			System.out.println("["+arr[arr.length-1]+"]");
		} else {
			for(int i=0; i<arr.length; i++) {
				System.out.print(arr[i]+" ");
			}
		}
	}
	
	/* 중복확인메서드 //로또 당첨번호에 중복이 있는지, 로또 당첨 등수 선별 ... 에 사용
	 * 매개변수 : 배열, 값
	 * 리턴타입 : boolean
	 * 값이 배열안에 있으면 true, 없으면 false 리턴
	 * 메서드명 : isContain
	 */
	public static boolean isContain (int arr[], int random) {
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==random) {
				return false;
			}
		}
		return true;
	}
	
	/* 등수확인메서드
	 * 매개변수 : lotto[] / user[]
	 * 리턴타입 : int
	 * 메서드명 : lottoRank
	 * --당첨기준--
	 * user번호 기준 => 
	 * 모두 맞으면 1등 / 5개맞고 보너스(마지막번호)가 맞으면 2등 / 5개 맞으면 3등 / 4개 맞으면 4등 / 3개 맞으면 5등
	 */
	//me
//	public static int lottoRank (int lotto[], int user[]) {
//		int rank = 0;
//		for(int i=0; i<user.length; i++) {
//			int u = user[i];
//			if(isContain(lotto,u)) {
//				lotto[i]=user[i];
//				rank++;
//				}
//			}
//		return rank;
//	}
	
	//ssam
	public static int lottoRank(int lotto[], int user[]) {
		//lotto = 7개, user = 6개
		//lotto/user 개수가 다르기 때문에 배열이 바뀌어서 들어온다면.. 값 자체가 달라짐
		if(lotto.length <= user.length) {
			return -1;
		}
		
		int cnt = 0; //일치하는 개수를 세기위한 변수(보너스는 제외)
		for(int i=0; i<user.length; i++) { //보너스 제외하고 5번지까지만 돌렸을때
			if(isContain(user,lotto[i])) {
				cnt++;
			}		
		}
		switch(cnt) {
		case 6: return 1;
		case 5: 
			if(isContain(user,lotto[lotto.length-1])) {
				return 2;
			} else {
				return 3;
			}
		
		case 4: return 4;
		case 3: return 5;
			default: return -1;
		}
	}
}
