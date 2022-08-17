package stream.decorator;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class InputStreamReaderTest {//���� �а� ���� ����� ������ � ��Ʈ���� ����Ʈ �����θ� ���� �� ������ ���ڷ� ��ȯ�ؼ� ���� �� 
	//�ְ� ����.

	public static void main(String[] args) {
		//������Ʈ�� : constructor �ȿ� ��ݽ�Ʈ�� or �Ǵٸ� ������Ʈ���� �����Ѵ�.
											//������ ���ڷ� ��ȯ����.//��ݽ�Ʈ���� InputStreamReader �� �����ڷ� �ִ´�. 
		try (InputStreamReader irs = new InputStreamReader(new FileInputStream("reader.txt"))) {
			int i = 0;
			while ((i = irs.read()) != -1) { // ������ ������ �о����� -1 �ƴҶ����� �о��.
				
				System.out.print((char) i);
			}
		} catch (IOException e) {
			System.out.println(e);
		}
		Socket socket = new Socket();//��������� �ϱ� ���� ������ ����.
		try {							//���ڷ� ��ȯ�Ȱ� ���� �� ����.
								//3.���۸��� ���ְ�							//2.���ڷιٲ��ְ�				//1.��������
			BufferedReader br =new BufferedReader (new InputStreamReader(socket.getInputStream()));//���Ͽ��� �о����.�ѱ۸� ������ ����
			br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
