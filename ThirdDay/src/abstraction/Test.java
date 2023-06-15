package abstraction;

public class Test {

	public static void main(String[] args) {
		Calculation cal = new Calculation();

		// Using java method overloading
		System.out.println(cal.Sum(1, 2));
		System.out.println(cal.Sum(1, 2, 3));
		System.out.println(cal.Sum((float) 1, (float) 3));

		ATM atm = new HDFCATM();
		atm.withDraw();

	}
}
