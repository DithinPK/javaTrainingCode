abstract class Phone{
	 public abstract void run();
	 }


public class AbstractClass extends Phone {

	public static void main(String[] args) {
     
  		Phone ph=new AbstractClass();
  		ph.run();
	}

	@Override
	public void run() {
		
		System.out.println("AbstractClass method is running...");
		
	}

}
