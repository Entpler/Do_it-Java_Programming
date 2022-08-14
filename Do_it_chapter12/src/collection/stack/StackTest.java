package collection.stack;

import java.util.ArrayList;

class MyStack {
	private ArrayList<String> arrayStack = new ArrayList<String>();

	public void push(String data) {
		arrayStack.add(data);
	}

	public String pop() {// data������
		int len = arrayStack.size();
		if (len == 0) {
			System.out.println("stack�� ������ϴ�");
			return null;
		}
		String data = arrayStack.remove(len - 1);
		return data;
	}

	public String peek() {// data������
		int len = arrayStack.size();
		if (len == 0) {
			System.out.println("stack�� ������ϴ�");
			return null;
		}
		return arrayStack.get(arrayStack.size() - 1);

	}
}

public class StackTest {

	public static void main(String[] args) {

		MyStack stack = new MyStack();

		stack.push("a");
		stack.push("b");
		stack.push("c");

		
		  System.out.println(stack.peek()); //peek�� ������ �����Ͱ� ������� ����. �ڿ������� �������Ƿ� c�� ���
		  System.out.println(stack.peek());
		  System.out.println(stack.peek());
		 

		System.out.println(stack.pop());
		System.out.println(stack.pop()); // Stack�� Lifo �����̹Ƿ� - c-b-a ���·� ������. push �� ������ ���� �����Ͱ� �����
		System.out.println(stack.pop());
	}

}
