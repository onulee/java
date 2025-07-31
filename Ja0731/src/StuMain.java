import java.util.ArrayList;
import java.util.Scanner;

public class StuMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList list = new ArrayList();
		String name = null;
		int count=0,no,kor,eng,math,total = 0;
		double avg = 0;
//		Stuscore[] s = new Stuscore[10];
		
		while(true) {
			System.out.println("[ 학생성적 프로그램 ]");
			System.out.println("1. 성적입력");
			System.out.println("2. 성적출력");
			System.out.println("3. 성적수정");
			System.out.println("4. 성적삭제");
			System.out.println("5. 등수처리");
			System.out.println("6. 이름정렬");
			System.out.println("0. 프로그램 종료");
			System.out.println("-------------------");
			System.out.println("원하는 번호를 입력하세요.>> ");
			int choice = scan.nextInt();
			
			switch(choice) {
			case 1: // 성적입력:이름,국어,영어,수학 -> 번호,합계,평균 자동입력
				System.out.printf("%d번째 학생이름을 입력하세요.>> \n",list.size()+1);
				name = scan.next();
				System.out.println("국어점수를 입력하세요>> ");
				kor = scan.nextInt();
				System.out.println("영어점수를 입력하세요.>> ");
				eng = scan.nextInt();
				System.out.println("수학점수를 입력하세요.>> ");
				math = scan.nextInt();
				// 컬렉션 저장
				list.add(new Stuscore(name,kor,eng,math)); 
				System.out.printf("%s 학생성적이 저장되었습니다.",name);
				System.out.println("[ 저장정보 ]");
				Stuscore s =(Stuscore)list.get(count);
				System.out.printf("%d,%s,%d \n",
						s.getNo(),s.getName(),s.getKor());
				count++;
				break;
			}
			
		}//while
		

	}//main

}
