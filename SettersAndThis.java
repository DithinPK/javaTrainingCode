class Frog {
	private String name;
	private int age;

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void show() {
		System.out.println("Name: " + name + "\n" +"Age: "+ age);
	}
}

public class SettersAndThis {

	public static void main(String[] args) {
		
		Frog frog = new Frog();
		frog.setName("Crazy4");
		frog.setAge(18);
		frog.show();
	}

}
