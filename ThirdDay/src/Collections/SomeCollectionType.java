package Collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SomeCollectionType {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<>();
		set.add("Pruthvi");
		set.add("is learning");
		set.add("JAVA");

		System.out.println("Using Hash Set");
		for (String s : set) {
			System.out.println(s);
		}
		LinkedHashSet<String> set1 = new LinkedHashSet<>();
		set1.add("Pruthvi");
		set1.add("is learning");
		set1.add("JAVA");

		System.out.println("\nUsing Linked Hash Set");
		for (String s : set1) {
			System.out.println(s);
		}

		TreeSet<String> set2 = new TreeSet<>();
		set2.add("Pruthvi");
		set2.add("is learning");
		set2.add("JAVA");
		System.out.println("\nUsing Tree Set");
		for (String s : set2) {
			System.out.println(s);

	}
	}
}
