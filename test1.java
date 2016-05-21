import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.applet.*;

public class test1 extends Applet {
	public static void main(String[] args) {
		
	}
	
	public static void post() throws FileNotFoundException {
		File f = new File("host.txt");
		PrintWriter out = new PrintWriter(f);
		out.print("Data in text file.");
		out.close();
	}

}
