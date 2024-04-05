package day01;

public class 과제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 과제 국어, 영어, 수학의 점수 합계와 평균을 출력
		 * 평균은 소수점을 살려서 출력
		 * 조건선택 연산자를 이용해 평균이 80이상이면 합격 80이하면 불합격으로 출력
		 */
		
		int kor = 85;
		int eng = 90;
		int math = 75;
		
		int sum = kor+eng+math;
		int ave = sum/3;
		//double avg = sum/3.0;
		
		System.out.println("세 과목의 합계는 "+sum+"이고, 세 과목의 평균은 "+(sum/3.0)+"입니다.");
		//System.out.println("세 과목의 합계는 "+sum+"이고, 세 과목의 평균은 "+avg+"입니다.");
		System.out.println(ave>88? "평균 88이상 합격입니다." : "평균 88이하 불합격입니다.");
		
		// 조건선택연산자 -> if문으로 변경
		/*if(조건식) {
			처리문;
		} else {
			처리문;
		}*/
		if(ave>=80) {
			System.out.println("결과: 합격");
		} else {
			System.out.println("결과: 불합격");
		}
	}

}
