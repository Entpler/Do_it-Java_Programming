package scheduler;

import java.io.IOException;
import java.sql.Connection;

public class SchedulerTest {

	public static void main(String[] args) throws IOException {
		
	// R ,  L , P 
		System.out.println("��ȭ ��� ��й���� �����ϼ���. R, L , P");
		
		Scheduler scheduler = null;
		
		int ch = System.in.read();
		
		if(ch == 'R' || ch =='r') {
			scheduler = new RoundRobin();
		}
		else if(ch == 'L'|| ch =='l') {
			scheduler = new LeastJob();
			
		}else {
			System.out.println("�������� �ʴ� ����Դϴ�.");
			return;
		}
		scheduler.getNextCall();
		scheduler.sendCallToAgent();
	}

}
