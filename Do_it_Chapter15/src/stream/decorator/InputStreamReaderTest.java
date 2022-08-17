package stream.decorator;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class InputStreamReaderTest {//직접 읽고 쓰는 기능은 없지만 어떤 스트림이 바이트 단위로만 읽을 수 있을때 문자로 변환해서 읽을 수 
	//있게 해줌.

	public static void main(String[] args) {
		//보조스트림 : constructor 안에 기반스트림 or 또다른 보조스트림을 포함한다.
											//읽을때 문자로 변환해줌.//기반스트림을 InputStreamReader 의 생성자로 넣는다. 
		try (InputStreamReader irs = new InputStreamReader(new FileInputStream("reader.txt"))) {
			int i = 0;
			while ((i = irs.read()) != -1) { // 파일을 끝까지 읽었을때 -1 아닐때까지 읽어라.
				
				System.out.print((char) i);
			}
		} catch (IOException e) {
			System.out.println(e);
		}
		Socket socket = new Socket();//소켓통신을 하기 위해 소켓을 생성.
		try {							//문자로 변환된걸 읽을 수 있음.
								//3.버퍼링을 해주고							//2.문자로바꿔주고				//1.읽은것을
			BufferedReader br =new BufferedReader (new InputStreamReader(socket.getInputStream()));//소켓에서 읽어들임.한글만 읽을수 있음
			br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
