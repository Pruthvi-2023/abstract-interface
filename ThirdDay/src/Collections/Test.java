package Collections;

import java.util.LinkedHashSet;

public class Test {

	public static void main(String[] args) {
		LinkedHashSet<Employee> employeeSet = new LinkedHashSet<>();

		Employee e1 = new Employee(1, "Pruthvi");
		Employee e2 = new Employee(1, "Pruthvi");

		employeeSet.add(e1);
		employeeSet.add(e2);

		for (Employee e : employeeSet) {
			System.out.println(e.getId() + "---" + e.getName());
		}

	}
}
