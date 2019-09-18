public class Main {

	
	
	public static void main(String[] args) {
		GameMechanics test = new GameMechanics();
		test.createVanillaDeck();
		Card aceOfSpades = new Card();
		
		for (int i = 0; i < test.activeDeck.size(); i++) {
			if (test.activeDeck.get(i).getNumber().equals("A") && test.activeDeck.get(i).getSuit().equals("Spades")) {
				aceOfSpades = test.activeDeck.get(i);
			}
		}
		
		test.displayDeckOnApp(aceOfSpades);
		
	}

}
