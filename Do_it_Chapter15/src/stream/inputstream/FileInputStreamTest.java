package stream.inputstream;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class FileInputStreamTest {

	public static void main(String[] args) {
		FileReader fis = null; // FileIntputStream : 1����Ʈ�� ����(����Ʈ ���� ��Ʈ��)
							  //FileReader : ���ڿ� ������ ����.
		int i =0;
		try {
			fis = new FileReader("input.txt"); //FilenotFoundException

			//System.out.println((char)fis.read()); //�д� ��� IOException
			//System.out.println((char)fis.read());
			//System.out.println((char)fis.read());//������ ������ ������ ��� ? �� ��µȴ�.
			
			while((i = fis.read()) !=-1) {
				System.out.print((char)i); //���Ͽ� �ѱ��� ���ԵǸ� byte������ �о�鿩�� ���� �� ������. reader�� �о����.
			}
		} catch (IOException e) {
			System.out.println(e); // ������������ ã�� �� ����.
		} finally {
			try {
				fis.close();//������ ���ȿ����� ���̱� ������ ������ null�� �ʱ�ȭ ���ش�.
			} catch (IOException e) {// null�� ���¿���
				System.out.println(e);
			} catch (NullPointerException e) {
				System.out.println(e);
			}
			//System.out.println("end");
		}
	}
}