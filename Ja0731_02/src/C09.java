import java.io.File;
import java.util.Scanner;

public class C09 {

	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    System.out.println("파일생성할 이름을 입력하세요. >>");
	    String fileName = scan.next();
	    System.out.println("c:/down/"+fileName);
	    
	    File f = new File("c:/down/"+fileName);

	}

}
