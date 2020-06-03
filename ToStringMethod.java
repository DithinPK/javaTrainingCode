class Student {

	private int id;
	private String name;

	public Student(int id, String name) {

		this.id = id;
		this.name = name;

	}

	public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(id).append(": ").append(name);
		return sb.toString();

	}
}

public class ToStringMethod {

	public static void main(String[] args) {

		Student student1 = new Student(7, "Dithin");
		String details = student1.toString();
		System.out.println(details);
	}

}
