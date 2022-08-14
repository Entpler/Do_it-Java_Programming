package collection.arraylist;

import java.util.ArrayList;

class MyStack{
	
	private ArrayList<String> arrayStack = new ArrayList<String>();
	
	public void push(String data) {
		arrayStack.add(data);
	}
	
	public String pop() { //data 꺼내기
	int len = arrayStack.size();
	if(len ==0) { 
		System.out.println("스택이 비었습니다.");
		return null; // 이 코드가 없으면 underflow 에러가 발생할 수 있음.
	}
	String data = arrayStack.remove(len-1);
		return data;
		
	}
	
	public String peek() {
		int len = arrayStack.size();
		if(len==0) {
			System.out.println("스택이 비었습니다.");
			return null;
		}
		return arrayStack.get(arrayStack.size()-1);
	}
}
public class Stacktest {

	public static void main(String[] args) {
	
		MyStack stack = new MyStack();
		
		stack.push("a");
		stack.push("b");// stack 은 Lifo 구조이므로 
		stack.push("c"); //abc 순서대로 넣으면 c - b - a 순서로 나오게 된다
		
		System.out.println(stack.peek()); //peek은 호출해도 없어지지않음. 마지막것이 계속 호출되게된다. -c-c-c
		System.out.println(stack.peek());	
		System.out.println(stack.peek());	
		
		System.out.println(stack.pop()); //-c
		System.out.println(stack.pop()); //-b	
		System.out.println(stack.pop()); //a  pop은 호출하면 없어짐.
		//System.out.println(stack.pop()); // 스택이 비었습니다. null 출력	
	}

}
