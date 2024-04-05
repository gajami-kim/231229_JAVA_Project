package day21;

import java.io.File;

public class File06 {

	public static void main(String[] args) {
		// 파일이 가지고 있는 정보 출력
		File f = new File("D:\\jungon\\_java_workspace\\java_project_jo\\test.txt");
		System.out.println(f.getName()); //경로를 제외한 파일이름
		System.out.println(f.getPath()); //경로 + 파일이름
		System.out.println(f.getParent()); //경로만
		System.out.println(File.separator); //파일구분자(출력:\)
		
		String f2 = f.toString();
		System.out.println(f2); //String 객체
		//f2를 기준으로 파일명만 추출
		String f21 = f2.substring(f2.lastIndexOf(File.separator)+1);
		System.out.println(f21);
		
		System.out.println(f.toString()); //file객체
	}

}
