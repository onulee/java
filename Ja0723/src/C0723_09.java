import java.util.Scanner;

public class C0723_09 {

	public static void main(String[] args) {
		
		// 1-100까지 랜덤숫자를 생성해서
		// 5번을 입력해서 정답, 오답-입력숫자가 큽니다. 오답-입력숫자가 작습니다.
		// 입력된숫자 : 1 2 3 4 5
		// 정답 : 50
		Scanner scan = new Scanner(System.in);
		int rnum = (int)(Math.random()*100)+1;
		int i = 0;
		int[] input = new int[5];
		
		while(i<5) {
			System.out.println("숫자를 입력하세요.");
			input[i] = scan.nextInt();
			
			
			
			i++;
		}
		
		
		
		
//		int[] score = {10,20,5};
//		for(int i=0;i<score.length;i++) {
//			System.out.println(score[i]);
//		}
//		
//		System.out.println(score[2]);

	}

}
