import java.util.Scanner;

public class C0723_07 {

	public static void main(String[] args) {
//		while
		Scanner scan = new Scanner(System.in);
		// 입력된 숫자에서 멈춤하는 프로그램을 구현하시오. 10
		System.out.println("출력하려는 숫자를 입력하세요.");
		int input = scan.nextInt();
		System.out.println("1) 짝수  2) 홀수  3) 모두");
		int input2 = scan.nextInt();
		//1  2,4,6,8,10
		//2  1,3,5,7,9
		//3  1,2,3,4,5,6,7,8,9,10
		
	    int i = 1;
	    while(i<=100) {
	    	if(input < i) break;
	    	
	    	if(input2==1) {
	    		if(i%2==1) {
	    			i++;
	    			continue;
	    		}
	    	}else if(input2==2) {
	    		if(i%2==0) {
	    			i++;
	    			continue;
	    		}
	    	}	    	
	    	
	    	System.out.println(i);
	    	i++;
	    }
		
		
		
		
		
		
//		Scanner scan = new Scanner(System.in);
//		//1~100까지 랜덤숫자를 출력하시오.
//		int rnum = (int)(Math.random()*100)+1;
//		
//		// 10번 이후 종료
//		// 입력 : 5    정답, 오답-입력된 숫자가 큽니다. 오답-입력된 숫자가 작습니다.
//		// 정답 : 값 
//		int i = 0;
//		int input = 0;
//		while(i>10) {
//			System.out.println("1-100사이 숫자를 입력하세요.");
//			input = scan.nextInt();
//			if (rnum==input) 
//				break;
//			else if(rnum>input) 
//				System.out.printf("입력 : %d 오답-입력된 숫자가 작습니다. \n ",input);
//			else 
//				System.out.printf("입력 : %d 오답-입력된 숫자가 큽니다. \n ",input);
//			i++;
//		}
//		
//		System.out.println("정답 : "+rnum);
		
		
		
		
//		int i = 2;
//		while(i<=9) {
//			System.out.printf("[ %d 단 ]\n",i);
//			int j = 1; //초기화
//			while(j<=9) {
//				System.out.printf("%d x %d = %d \n",i,j,i*j);
//				j++;
//			}
//			i++;
//		}
		
		
		
		
		
		// 1~100까지 합을 구하시오.
		// 500을 넘는 시점의 i, sum 출력하시오.
//		int sum = 0;
//		int i = 1;
//		while(i<=100) {
//			sum += i;
//			if(sum>=500) break;
//			i++;
//		}
//		System.out.printf("i : %d, sum : %d \n",i-1,sum-i);
//		System.out.printf("i : %d, sum : %d \n",i,sum);
		
		
		
		
//		int sum = 0;
//		int i = 1;
//		for(i=1;i<=10;i++) {
//			sum += i;
//		}
//		System.out.println("합계 : "+sum);
//		System.out.println("-------------------");
//		
//		sum = 0;
//		i = 1;
//		while(i<=10) {
//			sum += i;
//			i++;
//		}
//		System.out.println("합계 : "+sum);

	}

}
