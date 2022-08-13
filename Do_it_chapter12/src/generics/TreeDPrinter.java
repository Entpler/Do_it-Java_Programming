package generics;

public class TreeDPrinter<T> {

	private T material; // Object�� ��� Ŭ������ �ֻ��� Ŭ��������
	//����ȯ�� �̷��� �� �ִ�. ����� ������ � Ÿ������ ������ Object�� ��ȯ�Ǽ� ���� �� �ִ�.

	public T getMaterial() {
		return material;
	}

	public void setMaterial(T material) {
		this.material = material;
	}

	@Override
	public String toString() {
		return material.toString();
	}
	
	
	
}
