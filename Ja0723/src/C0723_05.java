import java.util.Scanner;

public class C0723_05 {

	public static void main(String[] args) {
		
		// 1-100까지의 합을 출력하시오.
		// 1 에서 얼마까지 해야 합계가 100 넘는 시점을 출력하시오.
		// 500 넘는 시점 바로 전단계를 출력하시오.
		
		
		int sum = 0;
		int i = 0;
		for(i=1;i<=100;i++) {
			sum += i;
		    System.out.printf("i : %d, sum : %d \n",i,sum);
		    if(sum>=500) break;
		}
		
		System.out.printf("i : %d, sum : %d \n",i-1,sum-i);
		
		
		
		
//		//1-10까지 숫자의 합을 출력하시오.
//		// 두수를 입력받아, 2,7 2에서 7까지의 합을 구하시오.
//		Scanner scan = new Scanner(System.in);
//		System.out.println("숫자를 입력하세요.>> ");
//		int input = scan.nextInt();
//		System.out.println("숫자2를 입력하세요.>> ");
//		int input2 = scan.nextInt();
//		
//		//취환방법
//		int temp = 0;
//		if(input>input2) {
//			// 입력숫자를 바꿔줌.
//			temp = input;
//			input = input2;
//			input2 = temp;
//		}
//		
//		int sum = 0;
//		for(int i=input;i<=input2;i++) {
//			sum += i;
//		}
//		
//		System.out.println("합계 : "+sum);

	}

}
