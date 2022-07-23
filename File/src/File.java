import java.io.File;
public class File {
	public static void main(String[] args) {
		File f = new File("C:\\sololearn\\test.txt");
		if(f.exists()) {
			System.out.println("x.getName()" + "Exists!");
		} else {
			System.out.println("The file does not exists!");
			
		}
		
	}

}
