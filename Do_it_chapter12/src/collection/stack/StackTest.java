package collection.stack;

import java.util.ArrayList;

class MyStack {
	private ArrayList<String> arrayStack = new ArrayList<String>();

	public void push(String data) {
		arrayStack.add(data);
	}

	public String pop() {// data꺼내기
		int len = arrayStack.size();
		if (len == 0) {
			System.out.println("stack이 비었습니다");
			return null;
		}
		String data = arrayStack.remove(len - 1);
		return data;
	}

	public String peek() {// data꺼내기
		int len = arrayStack.size();
		if (len == 0) {
			System.out.println("stack이 비었습니다");
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

		
		  System.out.println(stack.peek()); //peek은 꺼내도 데이터가 사라지지 않음. 뒤에서부터 꺼내지므로 c만 출력
		  System.out.println(stack.peek());
		  System.out.println(stack.peek());
		 

		System.out.println(stack.pop());
		System.out.println(stack.pop()); // Stack은 Lifo 구조이므로 - c-b-a 형태로 꺼내짐. push 는 꺼내고 나서 데이터가 사라짐
		System.out.println(stack.pop());
	}

}
