public class Main {

	
	
	public static void main(String[] args) {
		
		
		GameMechanics test = new GameMechanics();
		test.createVanillaDeck();
		
		for (int i = 0; i < test.activeDeck.size(); i++) {
			if (test.getActiveDeck().get(i).getSuit().equals("Clubs")) {
				test.getActiveDeck().get(i).displayCard();
				test.displayDeckOnApp(test.getActiveDeck().get(i));
			}
		}
		
		
	}

}
