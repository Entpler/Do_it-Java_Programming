package interfaceex;

public interface sell {
void sell();
default void order() {
	System.out.println("구매하기");
}

}
