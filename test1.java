import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class test1 {
	public static void main(String[] args) {
		
	}
	
	public static void post() throws FileNotFoundException {
		File f = new File("hello.txt");
		PrintWriter out = new PrintWriter(f);
		out.print("Data in text file.");
		out.close();
	}

}
