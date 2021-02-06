package kr.or.ddit.basic;

import java.io.File;

public class FileTest02 {

	public static void main(String[] args) {
		File f1 = new File("d:/D_Other/test.txt");
		System.out.println(f1.getName() + "의 크기 : " + f1.length() + "bytes");
		System.out.println("Path : " + f1.getPath());
		System.out.println("AbsolutePath : " + f1.getAbsolutePath());
		System.out.println();
		
		File f2 = new File(".");
		System.out.println("Path : " + f2.getPath());
		System.out.println("AbsolutePath : " + f2.getAbsolutePath());
		System.out.println();
		
		if(f1.isFile()) {
			System.out.println(f1.getName() + "은 파일입니다.");
		}else if(f1.isDirectory()) {
			System.out.println(f1.getName() + "은 디렉토리(폴더)입니다.");
		}else {
			System.out.println(f1.getName() + "은 뭘까???");
		}
		
		System.out.println();
		
		if(f2.isFile()) {
			System.out.println(f2.getName() + "은 파일입니다.");
		}else if(f2.isDirectory()) {
			System.out.println(f2.getName() + "은 디렉토리(폴더)입니다.");
		}else {
			System.out.println(f2.getName() + "은 뭘까???");
		}
		System.out.println();
		
		File f3 = new File("d:/D_Other/sample.exe");  // 현재 존재하지 않는 파일을 지정했을 때
		if(f3.isFile()) {
			System.out.println(f3.getName() + "은 파일입니다.");
		}else if(f3.isDirectory()) {
			System.out.println(f3.getName() + "은 디렉토리(폴더)입니다.");
		}else {
			System.out.println(f3.getName() + "은 뭘까???");
		}

	}

}
