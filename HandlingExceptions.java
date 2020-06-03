import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class HandlingExceptions {

	public static void main(String[] args) {

		File file=new File("Exception.txt");
		
		try {
			FileReader fr=new FileReader(file);			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("FileNotFound....");
		}		
		System.out.println("Finished");

	}

}
