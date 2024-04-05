package test;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a = {{10,20,50},{20,30,15},{100,110,120}};
		int sum =0;
		
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a.length; j++) {
				sum+=a[i][j];
			}
		}
		System.out.println("모든 배열의 합: "+sum);
	}

}
