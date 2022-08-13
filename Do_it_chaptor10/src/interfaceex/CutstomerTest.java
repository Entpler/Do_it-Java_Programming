package interfaceex;

public class CutstomerTest {
	public static void main(String[] args) {
		Customer customer = new Customer();

		Buy buyer = customer;
		buyer.buy();

		sell seller = customer;
		seller.sell();
		
		customer.order();
		buyer.order();
		seller.order();
		

	}
}
