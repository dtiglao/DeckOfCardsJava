import java.awt.BorderLayout;
import java.awt.Label;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class FrameRenderer {
	//Objects.Variables
	JFrame mainFrame = new JFrame("Card Renderer");
	Label emptyLabel = new Label("Hello!");
	JPanel mainPanel = new JPanel(new BorderLayout());
	JPanel northPanel = new JPanel();
	//Constructors
	FrameRenderer() {
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		SetResolution(800,600);
	}
	FrameRenderer(int x, int y) {
		SetResolution(x,y);
	}
	
	//Private Methods
	
	//Public Methods
	public void CreateEmptyLabel() {
		mainFrame.getContentPane().add(emptyLabel, BorderLayout.CENTER);
	}
	public void DisplayRandomCard() {
		mainFrame.getContentPane().add(new JLabel(new ImageIcon("C:\\Users\\Darius\\Desktop\\DeckOfCards\\AceOfSpades.jpg")));
	}
	public void DisplayCard(Card cardToShow) {
		ImageIcon ii = new ImageIcon(cardToShow.getIcon());
		mainFrame.getContentPane().add(mainPanel);
		northPanel.add(new JLabel (ii));
		mainPanel.add(northPanel);
		
		packFrame();
		SetLocation(400,100, ii.getIconWidth() + 9, ii.getIconHeight() + 25);
		showFrame();
		
	}
	public void packFrame() {
		mainFrame.pack();
	}
	public void showFrame() {
		mainFrame.setVisible(true);
	}
	public void SetResolution(int x, int y) {
		mainFrame.setSize(x,y);
	}
	public void SetLocation(int x, int y) {
		mainFrame.setBounds(x, y, 800, 600);
	}
	public void SetLocation(int x, int y, int w, int h) {
		mainFrame.setBounds(x, y, w, h);
	}
	
	
	
}
