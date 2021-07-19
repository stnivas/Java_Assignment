import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class filscreating10 {

	public static void main(String[] args) {
	
		try {
		
		File file =new File ("sample.txt");
		if (!file.exists()) {
			file.createNewFile();
			
		}
	
		PrintWriter create=new PrintWriter(file);
		create.println("programmatically created file");
		create.println("these words were written programmatically");
		create.println("All is Well.Be happy & enjoy the moment");
		create.close();
		System.out.println("successfully created");
	}
    catch (IOException excp) {
	excp.printStackTrace();
		

	}

	}
}
