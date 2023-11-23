
public class DeckOfCardsTest {

	
	public static void main (String [] args) {
		
		
		DeckOfCards myDeckOfCards = new DeckOfCards();
		myDeckOfCards.shuffle();// coloca Cards em ordem aleatória
		
		// imprime todas as 52 cartas na ordem em que elas são distribuídas
		for(int i = 1;i <=52 ; i++) {
			
			System.out.printf("%-19s", myDeckOfCards.dealCard());
			
			
			if(i % 4 == 0) {
				
				System.out.println();
				
			}
		}
	}
	
	
	
	
	
}








