import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadingFileUsingScanner {

	public static void main(String[] args) throws FileNotFoundException {

		String filenName="D:/sample.txt";
		
		File file=new File(filenName);
		
		Scanner in = new Scanner(file);
		
		while(in.hasNextLine()) {
			
			String line=in.nextLine();
			System.out.println(line);
			
		}
		in.close();

	}

}
