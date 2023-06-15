package abstraction;

public class HDFCATM implements ATM {
	@Override
	public void withDraw() {
		System.out.println("amount withdrawed");
	}
}
