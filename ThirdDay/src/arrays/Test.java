package arrays;

public class Test {
	public static void main(String[] args) {
		Student[] students = new Student[10];

		Student s1 = new Student(1, "name1");
		Student s2 = new Student(2, "name2");
		students[0] = s1;
		students[1] = s2;
		for (Student s : students) {
			if (s != null) {
				System.out.println("id = " + s.id + "\nname = " + s.name);
			}
		}

	}
}
