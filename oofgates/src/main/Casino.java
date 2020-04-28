package main;

import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.JFrame;

import functions.Luck;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextArea;

public class Casino {
	
	Luck l = new Luck();
	
	ArrayList<Byte> cards = new ArrayList<Byte>();
	
	//Method to sets the cards to values in array
	public void val_cards() {
		
		if(cards.size()>0) {
			for(int x=cards.size()-1;x>-1;x--)
				cards.remove(x);
		}
		
		byte num=1;
		
		for(byte x=1;x<53;x++) {
			
			cards.add(num);
			
			if(x/num==4) {
				num++;
			}
		}
		System.out.println(cards);
		
	}
	//Hit Method
	public void hit() {
		l.luckr(0, cards.size());
		
		int number = 0;
		double temp_b = Main.luck;
		String type_b;
		
		//Determines the value of the card
		for(int x=0;x<13;x++) {
			
			if(Math.floor(temp_b/x)==temp_b/x) {
				number=x;
				type_b=String.valueOf(x);
				
				//Ace Card
				if(x==1) {
					type_b ="Ace";
				}
				//Jack Card
				if(x==11) {
					type_b = "Jack";
					number=10;
				}
				//Queen Card
				if(x==12) {
					type_b = "Queen";
					number=10;
				}
				//King Card
				if(x==13) {
					type_b = "King";
					number=10;
				}
			}
		}
		
	}
	/**
	 * @wbp.parser.entryPoint
	 */
	public void casino() {
		JFrame c;
		c= new JFrame();
		c.setTitle("Le Casino");
		c.setSize(350,350);
		c.getContentPane().setLayout(null);
		
		JLabel title_lb = new JLabel("Le Casino");
		title_lb.setFont(new Font("Tahoma", Font.BOLD, 18));
		title_lb.setBounds(10, 11, 127, 25);
		c.getContentPane().add(title_lb);
		
		JTextArea welcome_lb = new JTextArea();
		welcome_lb.setLineWrap(true);
		welcome_lb.setColumns(2);
		welcome_lb.setRows(2);
		welcome_lb.setText("Welcome to the Casino, how much would you   like to bet for BlackJack?");
		welcome_lb.setFont(new Font("Tahoma", Font.PLAIN, 15));
		welcome_lb.setBounds(10, 65, 314, 52);
		c.getContentPane().add(welcome_lb);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(68, 150, 165, 39);
		c.getContentPane().add(textArea);
		c.setVisible(true);
		
		val_cards();
	}
}
