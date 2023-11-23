import java.security.SecureRandom;
import java.util.Scanner;

public class Card {

	
private final String face;
private final String suit;


public Card(String cardFace , String cardSuit) {
	
	this.face = cardFace;
	this.suit = cardSuit;
	
	
}public String toString() {
	return face + " Of " +suit;
}

}