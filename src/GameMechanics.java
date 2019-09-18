import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class GameMechanics {
	//Variables
	ArrayList<Card> activeDeck;
	Scanner kb = new Scanner(System.in);
	FrameRenderer mainFrame = new FrameRenderer();
	//Constructor
	
	//Private Methods
	public void createVanillaDeck() {
		ArrayList<Card> deck = new ArrayList<Card>();
		String[] values = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
		String[] suit = {"Spades", "Hearts", "Diamonds", "Clubs"};
		String[] color = {"Red", "Black"};
		
		for (int i = 0; i < color.length; i++) {
			for (int j = 0; j < suit.length; j++) {
				if ((suit[j].equals("Spades") && color[i].equals("Red")) || (suit[j].equals("Clubs") && color[i].equals("Red")) || (suit[j].equals("Diamonds") && color[i].equals("Black")) || (suit[j].equals("Hearts") && color[i].equals("Black"))) {/*bug++;System.out.println(bug);*/} 
				else {
					for (int k = 0; k < values.length; k++) {
						deck.add(new Card(values[k], suit[j], color[i]));
					}
				}
			}
		}
		activeDeck = deck;
	}
	
	
	//Public Methods
	public void shuffleDeck(ArrayList<Card> cardsToShuffle) {
		int randomNumber = (int)(Math.random() * 53.0);
		
		activeDeck = cardsToShuffle;
	}
	
	public void createRandomDeck(int size) {
		createVanillaDeck();
		ArrayList<Card> tempDeck = activeDeck;
		ArrayList<Card> randomDeck = new ArrayList<Card>();
		for (int i = 0; i < size; i++) {
			int randomNumber = (int)(Math.random() * 52.0);
			randomDeck.add(i, tempDeck.get(randomNumber));
		}
		activeDeck = randomDeck;
	}
	
	public void displayDeckOnConsole() {
		for (int i = 0; i < activeDeck.size(); i++) {
			activeDeck.get(i).displayCard();
		}
	}
	public ArrayList<Card> getActiveDeck() {
		return activeDeck;
	}
	public void displayDeckOnApp(Card cardGiven) {
		mainFrame.DisplayCard(cardGiven);
	}
	
}
