package interfaceex;

public interface Calc {
	//인터페이스 : 상수 ,추상메소드가 선언된다.
	
	double PI = 3.14;
	int ERROR = -99999999;
	
	int add (int num1, int num2);
	int substract (int num1, int num2);
	int times (int num1, int num2);
	int divide (int num1, int num2);

	default void description() {
		System.out.println("정수 계산기를 구현합니다.");
	}
	
	static int total (int[] arr) {
		int total =0;
		for(int i : arr) {
			total += i;
		}
		return total;
		}
	}
	
	
