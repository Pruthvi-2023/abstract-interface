package exceptionalHandling;

public class ExcHandling {

	public static void main(String[] args) {
		float result = division(10, 3);
		System.out.println("division result = " + result);
		int r = convertStringintToInt("abc");
		System.out.println(r);

	}

	private static float division(float num1, float num2) {
		float result = 0;
		try {
			result = num1 / num2;
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("division can't br performed on 0");
		}
		return result;
	}

	private static int convertStringintToInt(String n) {
		int result = 0;
		try {
			result = Integer.parseInt(n);
		} catch (NumberFormatException e) {
			System.err.println(e.getMessage());
		}
		return result;
	}

}
