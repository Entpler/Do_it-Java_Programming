package generics;

public interface TreeDPrinterTest {

	public static void main(String[] args) {

		TreeDPrinter<Powder> printer = new TreeDPrinter<Powder>(); 
		// �� ���ڴ�ſ� ������ Ÿ��(Ŭ������ ������)
		printer.setMaterial(new Powder());

		Powder powder = (Powder) printer.getMaterial();
		// ��� �����ڷ����� ���� Object�� �ᵵ ������ �׷��� Object�� upcasting�� �Ǳ� ������
		// �ٽ� DownCasting�� ���־����.
		// object�� �ƴ� ���׸� Ŭ������ �����ϱ� //��� �ڷ������� ��ġ�� ����
		// ���ڷ� �����. �� ���ڸ� �ڷ��� �Ű����������. <T> type�� ���� <E> <V>
		// �����ڷ������� ��ü�� �� �ִ� �κ� =>T =>object�� ��ȯ�� �Ǳ� ������ ����ȯ�� �����ʿ䰡 ����.
		System.out.println(printer);

		TreeDPrinter<Plastic> printerPlastic = new TreeDPrinter<Plastic>();
		
		printerPlastic.setMaterial(new Plastic());
		
		Plastic plastic = printerPlastic.getMaterial();
		
		System.out.println(printerPlastic);

	}
	
	
	
	
	
}
