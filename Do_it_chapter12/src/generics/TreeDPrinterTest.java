package generics;

public interface TreeDPrinterTest {

	public static void main(String[] args) {

		TreeDPrinter<Powder> printer = new TreeDPrinter<Powder>(); 
		// 그 문자대신에 참조형 타입(클래스를 쓰란말)
		printer.setMaterial(new Powder());

		Powder powder = (Powder) printer.getMaterial();
		// 모든 참조자료형을 쓸때 Object를 써도 되지만 그러면 Object로 upcasting이 되기 때문에
		// 다시 DownCasting을 해주어야함.
		// object가 아닌 제네릭 클래스로 정의하기 //모든 자료형으로 대치될 곳을
		// 문자로 쓰면됨. 이 문자를 자료형 매개변수라고함. <T> type의 약자 <E> <V>
		// 여러자료형으로 대체될 수 있는 부분 =>T =>object로 변환이 되기 때문에 형변환을 해줄필요가 없다.
		System.out.println(printer);

		TreeDPrinter<Plastic> printerPlastic = new TreeDPrinter<Plastic>();
		
		printerPlastic.setMaterial(new Plastic());
		
		Plastic plastic = printerPlastic.getMaterial();
		
		System.out.println(printerPlastic);

	}
	
	
	
	
	
}
