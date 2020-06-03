import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class CreatingAndWritingFiles {

	public static void main(String[] args) {

		File file = new File("D:/sample.txt");
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter(file));

			bw.write("File 1");
			bw.newLine();
			bw.write("file 2");
			bw.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("File not found....." + file.toString());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Unable to read file...");
		}

	}

}
