class Person{
	String name;
	int age;
}




public class ClassesAndObejects {

	public static void main(String[] args) {

		Person person1=new Person();
		
		person1.name="Dithin";
		person1.age=29;
		
        Person person2=new Person();
		
		person2.name="Das";
		person2.age=27;
		
		System.out.println("Person1 Obejct values are");
		System.out.println(person1.name+"\n"+person1.age);
		
		System.out.println("\nPerson2 Obejct values are");
		System.out.println(person2.name+"\n"+person2.age);
		

	}

}
