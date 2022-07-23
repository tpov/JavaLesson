import java.io.File;
public class Fle {
	public static void main(String[] args) {
		File f = new File("/home/oleg/Рабочий стол/Program/test.txt/");
		if(f.exists()) {
			System.out.println(f.getName() + "Exists!");
		} else {
			System.out.println("The file does not exists!");
			
		}
		
	}

}
