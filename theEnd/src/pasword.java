import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class pasword {
	public static void main(String[] args) {
		try {
			File file = new File("/home/oleg/Рабочий стол/Program/test.txt");
		Scanner sc = new Scanner(file);
		while(sc.hasNext()) {
			System.out.println(sc.next());
			
		}
		sc.close();
		} catch (FileNotFoundException e) {
			System.out.println("Error");
		}
		
		
	}

}
