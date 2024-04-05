package day22;

class MyThread3 extends Thread{

	int start;
	int end;
	int sum;
	
	public MyThread3(int start, int end) {
		this.start = start;
		this.end = end;
	}
	@Override
	public void run() {
		for(int i=start; i<=end; i++) {
			this.sum+=i;
		}
		System.out.println("합계:"+sum);
	}
	
	
}

public class Thread03 {

	public static void main(String[] args) {
		// 1~51, 51~100까지의 합을 구하는 두개의 Thread를 생성
		// 그 결과를 확인
		// 두개의 Thread가 실행되고 난 후 
		
		// thread1(1~50) 출력
		// thread(51~100) 출력
		MyThread3 th = new MyThread3(1,50);
		MyThread3 th2 = new MyThread3(51,100);
		th.start();
		th2.start();		
		
		try {
			th.join();
			Thread.sleep(500); //0.5초 기다렸다가 실행
			th2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		// thread1+thread2  출력
		int total = th.sum+th2.sum;
		System.out.println("thread 합계: "+total);
		
		
	}

}
