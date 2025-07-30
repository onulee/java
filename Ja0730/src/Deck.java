
public class Deck {
	final int CARD_NUM = 52;
//	CARD_NUM = 53; // 상수 : 값이 한번 정해지면 수정불가
	Card[] c = new Card[52]; //52장 - 1~10,J,Q,K 13장 * 4종류 = 52장
	String[] shape = {"SPADE","HEART","DIAMOND","CLOVER"};
	
	//기본생성자
	Deck() {
		
		for(int i=0;i<52;i++) {
			
		}
	}

}
