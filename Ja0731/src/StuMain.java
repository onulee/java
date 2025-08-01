import java.util.ArrayList;
import java.util.Scanner;

public class StuMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList list = new ArrayList();
		StuDeck stuDeck = new StuDeck();
//		Stuscore[] s = new Stuscore[10];
		
		while(true) {
			//상단메뉴 출력메소드
			int choice = stuDeck.menu_print();
			switch(choice) {
			case 1: 
				// 학생성적입력 메소드
				stuDeck.stu_input(list);
				break;
			case 2:
				// 학생성적출력 메소드
				stuDeck.stu_output(list);
				break;
				
				
				
			}//switch
		}//while
		

	}//main

}
