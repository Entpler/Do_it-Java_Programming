package collection.arraylist;

import java.util.ArrayList;

class MyQueue{
	
private ArrayList<String> arrayQueue = new ArrayList<String>();
	
public void enQueue(String data) {
	arrayQueue.add(data);
}
	
	public String deQueue() {
		int len = arrayQueue.size();
		if(len ==0 ) {
			System.out.println("큐가 비었습니다.");
			return null;
		}
		return arrayQueue.remove(0); //remove와 get은 다름 get은 꺼내고나서 
		//arraylist에서 사라지지 않는데 remove는 주고 arraylist 에서 지워짐.
		
		//iterator: 순회하는 메소드 Collection 의 개체를 순회하는 인터페이스
	
	}
}


public class QueueTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
