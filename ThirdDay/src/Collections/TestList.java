package Collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TestList {

	public static void main(String[] args) {
		List list = new ArrayList<>();
		list.add(1);
		list.add("Pruthvi");
		list.add(true);
		list.add(345.789);

		System.out.println("This is a list of multiple data types");
		for (Object l : list) {
			System.out.println(l);
		}

		List<String> list1 = new ArrayList<>();
		list1.add("2");
		list1.add("Pruthvi");
		list1.add("true");
		list1.add("345.789");

		System.out.println("This is a list of String data type");
		for (Object l : list1) {
			System.out.println(l);
		}

		List<String> list2 = new LinkedList<>();
		list2.add("3");
		list2.add("Pruthvi");
		list2.add("true");
		list2.add("345.789");

		System.out.println("This is a LinkedList of String data type");
		for (Object l : list2) {
			System.out.println(l);
		}

	}

}
