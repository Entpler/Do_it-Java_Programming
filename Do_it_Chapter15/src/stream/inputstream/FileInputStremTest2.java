package stream.inputstream;

import java.io.FileInputStream;//�����б� ����

import java.io.IOException;

public class FileInputStremTest2 {

	public static void main(String[] args) {
		try (FileInputStream fis = new FileInputStream("input2.txt")) { //try with resources ����
																		//1.FileNotFoundFileExceptionó��
																		//IOExceptio ���� �ص���.
		byte[] bs =new byte[10];
		
		int i ;
							
		while((i = fis.read(bs))!=-1) {//���� ���� �ƴҶ����� �о��.
		for(int j =0; j<i; j++)//j�� �����ͺ��� ��������
			System.out.print((char)bs[j]);
		}
			System.out.println();
		
		} catch (IOException e) {
			
			e.printStackTrace();
		}

	}

}
