
public class C0801_03 {

	public static void main(String[] args) {
		Student s1 = new Student(1,"홍길동");
		Student s2 = new Student(1,"홍길동");
		if(s1.equals(s2)) { //다르다
			System.out.println("같다");
		}else {
			System.out.println("다르다");
		}
		
//		if(s1 == s2) {  //다르다
//			System.out.println("같다");
//		}else {
//			System.out.println("다르다");
//		}
		
		
//		Person p1 = new Person();
//		p1.id = 199901011101111L;
//		p1.name = "홍길동";
//		p1.address = "서울";
//		Person p2 = new Person(199901011101111L,"홍길동","서울");
//		if(p1.equals(p2)) {
//			System.out.println("같다");
//		}else {
//			System.out.println("다르다");
//		}
//		System.out.println("p1 : "+p1);
//		System.out.println("p2 : "+p2);
//		
		
		
//		String str1 = new String("aaa");
//		String str2 = new String("aaa");
//		
//		if(str1==str2) { //객체변수,참조변수는 등가비교가 안됨.
//			System.out.println("같다");
//		}else {
//			System.out.println("다르다");
//		}
//		
//		if(str1.equals(str2)) { // Object 클래스 상속받아 사용
//			System.out.println("같다");
//		}else {
//			System.out.println("다르다");
//		}
		
		
		
//		int a1 = 100;
//		int a2 = 100;
//		if(a1==a2) { //기본타입 : boolean,char,byte,short,int,long,float,double
//			System.out.println("같다");
//		}else {
//			System.out.println("다르다");
//		}

	}

}
