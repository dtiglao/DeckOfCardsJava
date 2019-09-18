public class Card {
	//1. Variables
	private String number;
	private String suit;
	private String color;
	private String icon;
	
	//2. Constructors
	Card() {
		number = "Joker";
		suit = "Spade";
		color = "black";
		setIcon("C:\\Users\\Darius\\Desktop\\DeckOfCards\\J_Club_Black.jpg");
	}

	
	Card (String number, String suit, String color) {
		this.number = number;
		this.suit = suit;
		this.color = color;
	}
	
	Card (String number, String suit, String color, String icon) {
		this.number = number;
		this.suit = suit;
		this.color = color;
		this.setIcon(icon);
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
		System.out.println("Path: " + icon);
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

}
