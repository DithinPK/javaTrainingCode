class Language {

	String name;
	int age;

	void speakE() {

		System.out.println("Speak English");
	}

	void speakM() {

		System.out.println("Speak Malayalam");
	}
}

public class Methods {

	public static void main(String[] args) {

		Language Language1 = new Language();

		Language1.name = "Dithin";
		Language1.age = 29;

		Language Language2 = new Language();

		Language2.name = "Das";
		Language2.age = 27;

		System.out.println("Language1 Obejct values are");
		System.out.println(Language1.name + "\n" + Language1.age);
		Language1.speakE();

		System.out.println("\nPerson2 Obejct values are");
		System.out.println(Language2.name + "\n" + Language2.age);
		Language2.speakM();

	}

}
