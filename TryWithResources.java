import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResources {

	public static void main(String[] args) {
		File file=new File("D:/sample.txt");
		
		try(BufferedReader br=new BufferedReader(new FileReader(file))){
			String line;
			while ((line=br.readLine())!=null) {
				System.out.println(line);
			}
			br.close();
		}catch(FileNotFoundException e) {
			System.out.println("File Not Found...");
		}catch(IOException i) {
			System.out.println("Unable to read file...");
		}

	}

}
