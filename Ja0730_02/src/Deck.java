
public class Deck {

	Card[] c = new Card[52];
	String[] shape = {
		"SPADE","HEART",
		"DIAMOND","CLOVER"
	};
	Deck() {
		// 모양,번호부여
		for(int i=0;i<c.length;i++) {
			c[i] = new Card(i%13+1,shape[i/13]);
		}
		
	}
	//전체출력
	public void card_print() {
		for(int i=0;i<c.length;i++) {
			System.out.println(c[i]);
		}
	}
	
	// 카드섞기 메소드
	
	// 카드 5장 출력메소드
	
	// 카드 1장 뽑기메소드
	
	// 랜덤 카드 1장 뽑기메소드
	
	
	
}
