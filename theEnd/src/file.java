import java.io.File;
import java.util.Formatter;
import java.util.Scanner;

public class file {
	public static void main(String[] args) {
		try {
			Formatter f = new Formatter("/home/oleg/Рабочий стол/Program/test.txt");
			f.format("%s", new Object["Object"]);
			f.close();
			File file = new File("/home/oleg/Рабочий стол/Program/test.txt");
			Scanner sc = new Scanner(file);
			while(sc.hasNext()) {
				System.out.println(sc.next());
			}
		} catch (Exception e) {
			System.out.println("Error");
		}
	}
}