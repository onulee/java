import java.util.Scanner;

public class C0723_10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String[] name = new String[2];
		int[] kor = new int[2]; //국어점수
		int[] eng = new int[2]; //영어점수
		int[] math = new int[2]; //수학점수
		
		for(int i=0;i<name.length;i++) {
			System.out.printf("%d번째 이름을 입력하세요.",i+1);
			name[i] = scan.next();
			System.out.printf("%d번째 국어점수를 입력하세요.",i+1);
			kor[i] = scan.nextInt();
			System.out.printf("%d번째 영어점수를 입력하세요.",i+1);
			eng[i] = scan.nextInt();
			System.out.printf("%d번째 수학점수를 입력하세요.",i+1);
			math[i] = scan.nextInt();
		}
		
		System.out.printf("이름\t국어\t영어\t수학\n");
		System.out.println("---------------------------------------------------");
		for(int i=0;i<name.length;i++) {
			System.out.printf("%s\t%d\t%d\t%d\n",name[i],kor[i],eng[i],math[i]);
		}
		
//		System.out.print("이름 : ");
//		for(int i=0;i<name.length;i++) {
//			System.out.print(name[i]+" ");
//		}
//		System.out.println();
//		
//		System.out.print("국어점수 : ");
//		for(int i=0;i<name.length;i++) {
//			System.out.print(kor[i]+" ");
//		}
//		System.out.println();
//		System.out.print("영어점수 : ");
//		for(int i=0;i<name.length;i++) {
//			System.out.print(eng[i]+" ");
//		}
//		System.out.println();
//		System.out.print("수학점수 : ");
//		for(int i=0;i<name.length;i++) {
//			System.out.print(math[i]+" ");
//		}
//		System.out.println();
//		
		
		// 이름 5명을 입력받아, 
		// 입력이름 : 홍길동 유관순 이순신 강감찬 김구
		// 국어점수 : 100 100 99 80 70
		// 영어점수 : 80 90 99 80 70
		// 수학점수 : 100 100 70 90 50

	}

}
