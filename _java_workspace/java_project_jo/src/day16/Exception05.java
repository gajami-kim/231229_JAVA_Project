package day16;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exception05 {

	public static void main(String[] args) throws IOException {
		// IO Exception 발생예제
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		String name;
		
		//try-catch
		try {
			name = br.readLine();
			System.out.println(name);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}     
		
		//throws IOException
		name = br.readLine();
		System.out.println(name);
		
		br.close();
	}

}
