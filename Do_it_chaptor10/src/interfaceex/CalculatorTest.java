package interfaceex;

public class CalculatorTest {

	public static void main(String[] args) {
		Calc calc = new CompleteCalc();
		calc.description();
		int[]arr = {1,2,3,4,5};
	int sum =Calc.total(arr);
	System.out.println(sum);
	}

}
