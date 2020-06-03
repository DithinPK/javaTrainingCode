class Persons{

	private int id;
	private String name;
	
	public Persons(int id, String name) {
		
		this.id=id;
		this.name=name;
	}
	public String toString() {
		return "Person[id="+id+", Name"+name+"]";
		
	}
}

public class EqualMethods {

	public static void main(String[] args) {

		Persons person1=new Persons(1,"Arya");
		Persons person2=new Persons(1,"Sanza");
		
		if(person1.equals(person2)) {
			System.out.println("Both Object Values are Same...");			
		}
		else {
			System.out.println("Both object Values are Not Same...");
		}
		person1.toString();
		person2.toString();

	}

}
