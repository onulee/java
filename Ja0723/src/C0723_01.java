import java.util.Scanner;

public class C0723_01 {

	public static void main(String[] args) {
		// 숫자입력받아
		Scanner scan = new Scanner(System.in);
		
		System.out.println("[ 덧셈 프로그램 ]");
		System.out.println("1. 21억이하 덧셈");
		System.out.println("2. 21억이상 덧셈");
		System.out.println("---------------");
		System.out.println("원하는 번호를 입력하세요.>> ");
		int choice = scan.nextInt();  //nextDouble()
		
		switch(choice) {
		case 1:
			// 21억이하 int
			System.out.println("숫자를 입력하세요.");
			int input = scan.nextInt();
			System.out.println("숫자2를 입력하세요.");
			int input2 = scan.nextInt();
			int add = input+input2;
			System.out.println("입력숫자 : "+input);
			System.out.println("입력숫자2 : "+input2);
			System.out.println("합계 : "+add);
			break;
		case 2:
			// 21억이상 long
			System.out.println("숫자를 입력하세요.");
			int input3 = scan.nextInt();
			System.out.println("숫자2를 입력하세요.");
			int input4 = scan.nextInt();
			long add2 = input3+(long)input4;
			System.out.println("입력숫자 : "+input3);
			System.out.println("입력숫자2 : "+input4);
			System.out.println("합계 : "+add2);
			break;
			
		}
		
		
		
		
//		System.out.println("숫자를 입력하세요.");
//		int input = scan.nextInt();
//		System.out.println("숫자2를 입력하세요.");
//		int input2 = scan.nextInt();
//		
//		long add = input+(long)input2;
//		
//		System.out.println("입력숫자 : "+input);
//		System.out.println("입력숫자2 : "+input2);
//		System.out.println("합계 : "+add);
		
		

	}

}
