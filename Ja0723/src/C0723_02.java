import java.util.Scanner;

public class C0723_02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		// 해당 월을 입력받아, 3,4,5:봄 6,7,8:여름 9,10,11:가을 그외 겨울
		System.out.println("월을 입력하세요.>> ");
		int input = scan.nextInt();
		// if,switch
		if(input==3||input==4||input==5) {
			System.out.println("봄");
		}else if(input==6||input==7||input==8) {
			System.out.println("여름");
		}else if(input==9||input==10||input==11) {
			System.out.println("가을");
		}else {
			System.out.println("겨울");
		}
		
		switch(input) {
		case 3:case 4:case 5:
			System.out.println("봄");
			break;
		case 6:case 7:case 8:
			System.out.println("여름");
			break;
		case 9:case 10:case 11:
			System.out.println("가을");
			break;
		default:
			System.out.println("겨울");
			break;
		}
		
		
		
//		// 성적을 입력받아, 90점이상 A,80점-B,70점-C,60점-D,60점미만-F 를 출력하시오.
//		Scanner scan = new Scanner(System.in);
//		System.out.println("성적을 입력하세요.>> ");
//		int score = scan.nextInt();
//		
//		if(score>=90) {
//			System.out.println("A");
//		}else if(score>=80) {
//			System.out.println("B");
//		}else if(score>=70) {
//			System.out.println("C");
//		}else if(score>=60) {
//			System.out.println("D");
//		}else{
//			System.out.println("F");
//		}

	}

}
