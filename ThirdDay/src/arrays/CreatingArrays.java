package arrays;

public class CreatingArrays {

	public static void main(String[] args) {
		String[] names = new String[10];

		names[0] = "name1";
		names[1] = "name2";

		System.out.println("now printing using for loop");

		for (int index = 0; index < names.length; index++) {
			if (names[index] != null) { // != - not equal
				System.out.println(names[index]);
			}
		}

		System.out.println("now printing using while loop");

		int index = 0;

		while (index < names.length) {
			if (names[index] != null) { // != - not equal
				System.out.println(names[index]);
			}
			index++;
		}

		/*
		 * System.out.println("now printing using forEach loop");
		 * 
		 * for (String name : names) { if (name != null) { System.out.println(name); } }
		 */
	}
}
