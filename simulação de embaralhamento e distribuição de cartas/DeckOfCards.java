import java.security.SecureRandom;

public class DeckOfCards {

private Card[] deck;
private int currentCard;
private static final int NUMBER_OF_CARDS = 52;

private static final SecureRandom randomNumbers = new SecureRandom();

	public DeckOfCards() {
		
		String [] faces = {"Ace","Deuce","Three","Four","Five",
		"Six","Seven", "Eight", "Nine", "Ten" ,"Jack" , "Quenn" , "King"};
		
		String [] suits = {"Hearts", "Diamonds" , "Clubs" , "Spades"};
		
         deck = new Card[NUMBER_OF_CARDS];
		
		currentCard = 0;
		
		// preenche baralho com objetos Card 
		for(int counter = 0 ; counter < deck.length;counter++) {
			
			deck[counter] = new Card(faces[counter % 13] ,suits[counter /  13] );
			
			
		}
		
		}public void shuffle() {
			// a próxima chamada para o método dealCard deve começar no deck[0] novamente
			currentCard = 0;
			
			for(int first = 0 ; first < deck.length;first++) {
				
				int second = randomNumbers.nextInt(NUMBER_OF_CARDS);
				
				Card temp = deck[first];
				deck[first] =deck[second];
				deck[second] = temp;
				
			}
		
	}
		
	public Card dealCard() {
		
		// determina se ainda há Cards a serem distribuídas
		
		if(currentCard < deck.length) {
			
			return deck[currentCard++];
			
			
		}else {
			
			return null;
		}
		
	}
	
	
	
	
	
	
}
