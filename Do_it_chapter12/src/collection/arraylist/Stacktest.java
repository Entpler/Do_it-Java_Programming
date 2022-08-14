package collection.arraylist;

import java.util.ArrayList;

class MyStack{
	
	private ArrayList<String> arrayStack = new ArrayList<String>();
	
	public void push(String data) {
		arrayStack.add(data);
	}
	
	public String pop() { //data ������
	int len = arrayStack.size();
	if(len ==0) { 
		System.out.println("������ ������ϴ�.");
		return null; // �� �ڵ尡 ������ underflow ������ �߻��� �� ����.
	}
	String data = arrayStack.remove(len-1);
		return data;
		
	}
	
	public String peek() {
		int len = arrayStack.size();
		if(len==0) {
			System.out.println("������ ������ϴ�.");
			return null;
		}
		return arrayStack.get(arrayStack.size()-1);
	}
}
public class Stacktest {

	public static void main(String[] args) {
	
		MyStack stack = new MyStack();
		
		stack.push("a");
		stack.push("b");// stack �� Lifo �����̹Ƿ� 
		stack.push("c"); //abc ������� ������ c - b - a ������ ������ �ȴ�
		
		System.out.println(stack.peek()); //peek�� ȣ���ص� ������������. ���������� ��� ȣ��ǰԵȴ�. -c-c-c
		System.out.println(stack.peek());	
		System.out.println(stack.peek());	
		
		System.out.println(stack.pop()); //-c
		System.out.println(stack.pop()); //-b	
		System.out.println(stack.pop()); //a  pop�� ȣ���ϸ� ������.
		//System.out.println(stack.pop()); // ������ ������ϴ�. null ���	
	}

}
