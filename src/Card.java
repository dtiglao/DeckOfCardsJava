
public class Card {
	//1. Variables
	private String number;
	private String suit;
	private String color;
	
	//2. Constructors
	Card() {
		number = "Joker";
		suit = "Spade";
		color = "black";
	}
	
	Card (String number, String suit, String color) {
		this.number = number;
		this.suit = suit;
		this.color = color;
	}
	//3. Private Methods
	//4. Public Methods
	
	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getSuit() {
		return suit;
	}

	public void setSuit(String suit) {
		this.suit = suit;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public void displayCard() {
		System.out.println("Number: " + number);
		System.out.println("Suit: " + suit);
		System.out.println("Color: " + color);
	}

}
