package generics;

public class TreeDPrinter<T> {

	private T material; // Object는 모든 클래스의 최상위 클래스여서
	//형변환이 이뤄질 수 있다. 재료라는 변수가 어떤 타입으로 들어오건 Object로 변환되서 쓰일 수 있다.

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
