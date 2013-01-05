
import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;
public class RandomCharacters extends JPanel
{
	public void paintColor(Graphics g)
	{
		Random randRed = new Random();
		Random randGreen = new Random();
		Random randBlue = new Random();
		Random charRand = new Random();
		String [] stringArray = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o"};
		int red = randRed.nextInt(255);
		int green= randGreen.nextInt(255);
		int blue = randBlue.nextInt(255);
		int chara = charRand.nextInt(15); 
		String currentChar = stringArray[chara];
		
		g.setColor(new Color(red, green, blue));
		g.drawString(currentChar + g.getColor(), 100, 100);
		
		
	}//paintColor
	
	public static void main (String [] args)
	{
		JFrame frame = new JFrame();
		frame.getContentPane().add(new RandomCharacters());
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 400);
		frame.setVisible(true);
		
		System.out.println("kaya");
	}
	
}//class
