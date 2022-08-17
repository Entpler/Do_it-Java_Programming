package stream.inputstream;

import java.io.FileInputStream;//파일읽기 연습

import java.io.IOException;

public class FileInputStremTest2 {

	public static void main(String[] args) {
		try (FileInputStream fis = new FileInputStream("input2.txt")) { //try with resources 구문
																		//1.FileNotFoundFileException처리
																		//IOExceptio 으로 해도됨.
		byte[] bs =new byte[10];
		
		int i ;
							
		while((i = fis.read(bs))!=-1) {//파일 끝이 아닐때까지 읽어라.
		for(int j =0; j<i; j++)//j가 읽은것보다 작은동안
			System.out.print((char)bs[j]);
		}
			System.out.println();
		
		} catch (IOException e) {
			
			e.printStackTrace();
		}

	}

}
