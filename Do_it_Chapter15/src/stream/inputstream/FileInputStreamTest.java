package stream.inputstream;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class FileInputStreamTest {

	public static void main(String[] args) {
		FileReader fis = null; // FileIntputStream : 1바이트씩 읽음(바이트 단위 스트림)
							  //FileReader : 문자열 단위로 읽음.
		int i =0;
		try {
			fis = new FileReader("input.txt"); //FilenotFoundException

			//System.out.println((char)fis.read()); //읽는 기능 IOException
			//System.out.println((char)fis.read());
			//System.out.println((char)fis.read());//끝까지 읽히면 문자일 경우 ? 가 출력된다.
			
			while((i = fis.read()) !=-1) {
				System.out.print((char)i); //파일에 한글을 쓰게되면 byte단위로 읽어들여서 읽을 수 가없다. reader로 읽어야함.
			}
		} catch (IOException e) {
			System.out.println(e); // 지정된파일을 찾을 수 없다.
		} finally {
			try {
				fis.close();//변수가 블럭안에서만 보이기 때문에 변수를 null로 초기화 해준다.
			} catch (IOException e) {// null인 상태에서
				System.out.println(e);
			} catch (NullPointerException e) {
				System.out.println(e);
			}
			//System.out.println("end");
		}
	}
}